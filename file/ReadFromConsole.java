package com.zensar.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReadFromConsole {

	public static void main(String[] args) {
		FileOutputStream fos=null;
		Scanner sc= new Scanner(System.in);
		System.out.println("please enter your bname");
		String name =sc.next();
		
		try {
			fos=new FileOutputStream("pqr.tex");
			byte[] bytes =name.getBytes();
			fos.write(bytes);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(fos !=null) {
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(sc !=null) {
				sc.close();
			}
		}
		
	}
}
