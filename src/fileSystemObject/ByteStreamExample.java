package fileSystemObject;


import java.io.FileInputStream;

public class ByteStreamExample {

public static void main(String[] args) throws Throwable {
		
		FileInputStream fip = new FileInputStream("Testing\\test.txt");
		
		int data;
		while((data=fip.read())!=-1) {
			System.out.print((char)data);
		}
		
		fip.close();
	}

}
