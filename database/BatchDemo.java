package com.zensar.database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchDemo {

	public static void main(String[] args) {
		
		Connection con= null;
		Statement stm=null;
		con = ConnectionProvider.getConnection();

		
		try {
			stm=con.createStatement();
			con.setAutoCommit(false);
			stm.addBatch("insert into employee values(310,'x',10)");
			stm.addBatch("insert into employee values(320,'y',20)");
			stm.addBatch("insert into employee values(330,'z',30)");
			stm.executeBatch();
			
			con.commit();
			System.out.println("Batch executed successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
