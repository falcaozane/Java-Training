package fileSystemObject;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteStreamReadWriteImage {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		FileInputStream fip  =new FileInputStream("C:\\Users\\zvijayfa\\Pictures\\Screenshots\\zane.png");
		FileOutputStream fop =new FileOutputStream("Testing\\NewImage.bmp");
		
		int data=0;
		while((data=fip.read())!=-1) {
			fop.write(data);
		}
		
		fip.close();
		fop.close();
		System.out.println("Done");
	}

}
