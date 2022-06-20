package com.zensar.database;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {
	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection(
					"jdbc:mysql://my-database.cm6hqiqhanoc.ap-south-1.rds.amazonaws.com/batch22", "root", "ZensarRoot");
			
			DatabaseMetaData databaseMetaData =con.getMetaData();
			System.out.println(databaseMetaData.getSQLKeywords());
			System.out.println(databaseMetaData.getDatabaseProductVersion());
			//System.out.println(databaseMetaData.);
			System.out.println(databaseMetaData.getDatabaseProductName());
			
			Statement stm = con.createStatement();// pacakage import karna hai ;java.sql.Statement";

			ResultSet rs = stm.executeQuery("select * from student");
			
			//Perform ResulSetMetaData Method Of ResultSet
			ResultSetMetaData rsmd=rs.getMetaData();
			
			for(int i=1;i<rsmd.getColumnCount();i++) {
				System.out.println("Column ColumnDisplaySize :"+rsmd.getColumnDisplaySize(i));
				System.out.println("Column Name :"+rsmd.getColumnName(i));
				System.out.println("Column Type :"+rsmd.getColumnTypeName(i));
				System.out.println("Column ClassName :"+rsmd.getColumnClassName(i));//Doubt
				System.out.println("Column ColumnLable :"+rsmd.getColumnLabel(i));//Doubt
				System.out.println("Column ColumnCount :"+rsmd.getColumnCount());
				
			}
			
			while (rs.next()) {
				//System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
				System.out.println(rs.getInt("studentId") + " " + rs.getString("studentName") + " " + rs.getInt("studentage"));
			}
			System.out.println("Connected !!!");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
