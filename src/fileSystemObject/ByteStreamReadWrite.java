package fileSystemObject;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteStreamReadWrite {

public static void main(String[] args) throws Throwable {
		
		FileInputStream fip  =new FileInputStream("Testing\\test.txt");
		FileOutputStream fop =new FileOutputStream("Testing\\NewTextFile.txt");
		
		int data=0;
		while((data=fip.read())!=-1) {
			fop.write(data);
		}
		
		fip.close();
		fop.close();
		System.out.println("Done");
 
	}

}
