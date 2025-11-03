package com.codegnan.ioStreams;

import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterEx {

	public static void main(String[] args) {
		try(PrintWriter out=new PrintWriter("output.txt")){
		out.println("hello java");
		out.println("hai");
		out.print(10.5);
		out.println('a');
		out.println(false);
		out.println(97);
		System.out.println("data written to a file succesfully");
		}catch(IOException e) {
			e.printStackTrace();
	}

}
}