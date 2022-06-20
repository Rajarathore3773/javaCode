package com.zensar.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertDemp {

	public static void main(String[] args) {
		Connection con=null;
		Statement stm=null;
		Scanner scanner=null;
		PreparedStatement pstmt= null;
		
		try {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//
//		con=DriverManager.getConnection("jdbc:mysql://my-database.cm6hqiqhanoc.ap-south-1.rds.amazonaws.com/batch22","root", "ZensarRoot");
		con=ConnectionProvider.getConnection();
		
		//Statement smt=con.createStatement();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter student id");
		int id=sc.nextInt();

		System.out.println("enter student name");
		String name=sc.next();

		System.out.println("enter student age");
		int age=sc.nextInt();

	//	int count=smt.executeUpdate("insert into student values("+id+",'"+name+"',"+age+");");
		pstmt=con.prepareStatement("insert into student values(?,?,?)");
		pstmt.setInt(1, id);
		pstmt.setString(2, name);
		pstmt.setInt(3, age);
		int count=pstmt.executeUpdate();
		if(count>0) {
		System.out.println("inserted successfully");
		}else {
		System.out.println("record insertion faild");
		}

		}  catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}finally{
		if(scanner !=null ) {
			scanner.close();
		}if(stm !=null) {
			try {
				stm.close();
			}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(con !=null) {
			try {
				con.close();
			}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	}
	}
