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
		FileReader FileStream=new FileReader("shapes.txt"); // 1. 建立文字檔讀取物件
        BufferedReader br = new BufferedReader(FileStream); // 2. 透過 BufferedReader 幫我們讀資料
         //讀取資料
        String data;
        do{
        	// 3. 接著 一行一行 的把資料從檔案中讀出來
        	data=br.readLine();
        	// 4. 當讀取到最後一行後,
        	if(data==null)
        		break;          // 讀到檔案結束
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
