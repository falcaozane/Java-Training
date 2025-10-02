package exceptionHandling;

import java.io.FileWriter;
import java.io.PrintWriter;

public class PrintWriterExample {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		//PrintWriter pr1 =new PrintWriter("PrintWriter.txt");
		FileWriter fw =new FileWriter("PrintWriter1.txt",true);
		fw.write(100);
		PrintWriter pr =new PrintWriter(fw);
		pr.print(100);
		pr.print(true);
		pr.println("srinivas");
		pr.println("ram");
				
		pr.close();

	}

}
