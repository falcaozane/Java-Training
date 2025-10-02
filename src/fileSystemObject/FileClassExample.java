package fileSystemObject;

import java.io.File;

public class FileClassExample {

	public static void main(String[] args) throws Throwable {
		
		File f = new File("test.txt");
		f.createNewFile();
		File fold = new File("Testing");
		fold.mkdir();
		
		System.out.println("done");
		
		File f1 = new File("Testing/test1.txt");
		f1.createNewFile();
		System.out.println(f.exists()); //if it exist true / false
		File f2 = new File("Testing");
		System.out.println(f1.isFile()); //true
		System.out.println(f2.isFile());
		System.out.println(fold.isDirectory()); //true
		System.out.println("-------------------------------");
		String[] list = fold.list();
		System.out.println("Total files ->" +list.length);
		for(String x : list) {
			System.out.println(x);
		}
	}

}
