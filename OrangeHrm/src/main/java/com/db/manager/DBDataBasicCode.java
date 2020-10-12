package com.db.manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DBDataBasicCode {

	public static void main(String[] args) throws Throwable {

		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "hr", "sarower");
		Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		ResultSet rs = stmt.executeQuery("select Usermane from User Management");

		List<String> columnValue = new ArrayList<String>();

		try {
			while (rs.next()) {
			columnValue.add(rs.getString(1) );

			}
		} catch (SQLException e) {

			e.printStackTrace();
		}



		System.out.println(columnValue);
	}

}
