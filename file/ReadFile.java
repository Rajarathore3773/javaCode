package com.zensar.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) {
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try {
			fis=new FileInputStream("abc.txt"); //-1
			fos=new FileOutputStream("pqr.text");
			
			int ch=0;
			
			while((ch=fis.read())!=-1) {
				System.out.print((char)ch);
				fos.write(ch);
			
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(fis !=null)
				fis.close();
				
				if(fos !=null)
					fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
