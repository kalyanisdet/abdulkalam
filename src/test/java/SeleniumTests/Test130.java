package SeleniumTests;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.testng.annotations.Test;
public class Test130 {
	File file;
	@Test
	public void method1() throws Exception
	{
		
		//convert original file into zip file
		try {
		    // File access code here
		     file = new File("C:\\Dinesh-SFDC.doc");
		    
		} catch(Exception e) {
		   
		    e.printStackTrace();
		}
        FileInputStream fis=new FileInputStream(file);
		File zipfile=new File("C:\\Dinesh-SFDC.zip");
		FileOutputStream fos=new FileOutputStream(zipfile);
        ZipOutputStream zipOut=new ZipOutputStream(fos);
        ZipEntry zipEntry=new ZipEntry(file.getName());
        zipOut.putNextEntry(zipEntry);
        byte[] bytes=new byte[1024];
        int length;
        while((length=fis.read(bytes))>=0) 
        {
            zipOut.write(bytes, 0, length);
        }
        zipOut.close();
        fis.close();
        fos.close();
        System.out.println("Zip complete.");
        }	
}