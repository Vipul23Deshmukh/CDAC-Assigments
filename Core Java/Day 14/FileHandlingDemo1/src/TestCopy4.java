import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class TestCopy4 {

	public static void main(String[] args) {
		
		//it creates object to point the file 
		File f=new File("myfilecopy.txt");
		
		FileOutputStream fos=null;
		try {
			
			if(f.exists())
			{
			//open file in append mode
				fos= new FileOutputStream("myfilecopy.txt",true);
			}
			else
			{
				//open file in write mode
				//fos is effectively final---If a variable is not final but 
				 //initialized only once in the program, then it is called as effectively final
				
				fos=new FileOutputStream("myfilecopy.txt");
						}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
		try (FileInputStream fis1=new FileInputStream("myfile.txt");
			FileOutputStream fos1=fos;)
		{
			int i=fis1.read();
			
			while(i!=-1)
			{
				fos1.write(i);
				System.out.print((char)i);
				i=fis1.read();
			}
			
		}catch(IOException e)
		{
			
		}
	}
}