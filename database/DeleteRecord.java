package com.zensar.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://my-database.cm6hqiqhanoc.ap-south-1.rds.amazonaws.com/batch22", "root", "ZensarRoot");

			Statement stm = con.createStatement();// pacakage import karna hai- "java.sql.Statement";
			Scanner sc = new Scanner(System.in);
			System.out.println("enter student id");
			int id = sc.nextInt();

			int count = stm.executeUpdate("DELETE FROM student WHERE studentId=" + id + "");

			// int count = stm.executeUpdate("delete from student where studentid = 2");
			if (count > 0) {
				System.out.println("Student Deleted successfuly");
			} else {
				System.out.println("Record Deletion failed");
			}

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
