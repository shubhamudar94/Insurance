package com.hexaware.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	static Connection connection;

	public static Connection getConnection() {

		String path = "C:/Users/Pinkey/eclipse-workspace/Insurance/src/com/hexaware/util/db.properties";

		try {
			connection = DriverManager.getConnection(PropertyUtil.getConnectionString(path));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;

	}

	public static void main(String[] args) {
		System.out.println(getConnection());

	}

}
