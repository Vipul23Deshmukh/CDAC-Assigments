import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestDemo3 {

	public static void main(String[] args) {
		
		//open file in autoclose resource block
		try(FileInputStream fis=new FileInputStream("myfile.txt");
			FileOutputStream fos=new FileOutputStream("myfilecopy.txt");)
		{
			int i=fis.read();
			
			while(i!=-1)
			{
				i=fis.read();
		          System.out.print((char)i);
				
			}
			System.out.println(" End of file");
			
		}catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
				
				

	}

}
