package com.zensar.file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyFileReader {
public static void main(String[] args) {
	FileReader reader=null;
	
	try {
		reader = new FileReader("abc.txt");
		int ch=0;
		while((ch=reader.read())!=-1) {
			System.out.print((char)ch);
		}
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		if(reader !=null) {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
}
