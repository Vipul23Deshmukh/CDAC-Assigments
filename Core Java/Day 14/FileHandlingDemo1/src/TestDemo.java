import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	              FileInputStream fis=new FileInputStream("myfile.txt");
	              FileOutputStream fos=new FileOutputStream("copyfile.txt");
	              
	              int i=fis.read();
	              while(i!=-1) {
	            	  fos.write(i);
	            	  System.out.print((char)i);

	            	  i=fis.read();
	              }
	              
	              fis.close();
	              fos.close();
	              System.out.println("File copied successfully.");

		} 
		 
		 catch (FileNotFoundException e) {
				System.out.println(e.getMessage());
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		 
		 catch (Exception e) {
	// TODO: handle exception
}

}
	}
