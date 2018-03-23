import java.io.*;
public class ShapeDataBase {
	private int MAX_SHAPES_SIZE = 100;
	private Shape[] allShapes = new Shape[MAX_SHAPES_SIZE];
	private int shapescount = 0; 
	public Collection allcollections = new Collection();
	
	public int getSize() {
		return shapescount;
	}
	
	public void setSize(int size) {
		shapescount = size;
	}
	
	public Shape[] getAllShapes() {
		return allShapes;
	}
	
	public void BuildAllShapes() throws IOException
	{    
		FileReader FileStream=new FileReader("shapes.txt"); // 1. �إߤ�r��Ū������
        BufferedReader br = new BufferedReader(FileStream); // 2. �z�L BufferedReader ���ڭ�Ū���
         //Ū�����
        String data;
        do{
        	// 3. ���� �@��@�� �����Ʊq�ɮפ�Ū�X��
        	data=br.readLine();
        	// 4. ��Ū����̫�@���,
        	if(data==null)
        		break;          // Ū���ɮ׵���
        	String[] str = data.split("[,;\\s]+");
        	char k = str[0].charAt(0);
        	int x = Integer.parseInt(str[1]);
        	int y = Integer.parseInt(str[2]);
        	
        	switch(k)
        	{
        	case 'c':
		      	allShapes[shapescount] = new Circle(str[0] , x, y);
		      	break;
        	case 's':
		      	allShapes[shapescount] = new Square(str[0] , x, y);
		      	break;
        	case 't':
		      	allShapes[shapescount] = new Triangle(str[0] , x, y);
		      	break;
		     default:
		    	 System.out.println("Category cannot be found.");
		     }
		     this.setSize(this.getSize()+1);
		     allcollections.addType(str[0]);
		     
		 } while(true);   
		 br.close();    
    }


}
