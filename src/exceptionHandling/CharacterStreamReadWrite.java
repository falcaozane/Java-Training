package exceptionHandling;

import java.io.FileReader;
import java.io.FileWriter;

public class CharacterStreamReadWrite {
	
	static FileReader fr;
	static FileWriter fw;

	public static void main(String[] args) throws Throwable {
		 
		try {
			fr = new FileReader("Testing\\test.txt");
			fw = new FileWriter("Testing\\characterFile.txt");
			int data;
			while ((data = fr.read()) != -1) {
				fw.write(data);
			}
		} catch (Throwable e) {
 
		} finally {
 
			fr.close();
			fw.flush();
			fw.close();
		}
 
		// C:\Users\Shrinivas\Desktop\JavaClassNotes.txt
		// String str="Srinivas is a \"Tester\"";
		// System.out.println(str);
	}
 
}
//non static reference dont have an access in the static methods

