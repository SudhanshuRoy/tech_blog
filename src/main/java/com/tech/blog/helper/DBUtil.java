package com.tech.blog.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	private static Connection connection;

	public static Connection getConnection() {

		if (connection == null) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

			try {
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/techblog", "root", "root");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return connection;
	}

}
