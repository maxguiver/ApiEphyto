package com.api.utilitarios;

import java.sql.Connection;
import java.sql.DriverManager;

public class SQLDatabaseConnection {
	private static Connection con;
	public static Connection getConnection() {
		try {
		 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
		 con=DriverManager.getConnection("jdbc:sqlserver://192.168.1.209\\MSSQLSERVER2008;databaseName=PaititiLqd","guiver.garcia","gg5642");
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			con = null;
		}
		return con;
	}

}
