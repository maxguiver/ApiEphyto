package com.api.conection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DatabaseMetaData;
import java.sql.CallableStatement;
public class SQLDatabaseConnection {
	private static Connection con;
	//private String procedimiento;
	//private final String statement = "select *from datos;";
	public static Connection getConnection() {
		try {
		//Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
		//con=DriverManager.getConnection("jdbc:sqlserver://192.168.1.44:1433, databaseName=PaititiLqd", "sa","123456" );
		 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
		 //con=DriverManager.getConnection("jdbc:sqlserver://192.168.1.209\\MSSQLSERVER2008;databaseName=PaititiLqd","usersissec","User_Sissec");
		 con=DriverManager.getConnection("jdbc:sqlserver://192.168.1.209\\MSSQLSERVER2008;databaseName=PaititiLqd","guiver.garcia","gg5642");
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			con = null;
		}
		return con;
	}
	/*
	public void prepareCall(String procedimiento)
	{
		this.procedimiento = procedimiento;
	}
	
	*/
	public static void main (String[] args) throws SQLException
	{
		Connection prueba = SQLDatabaseConnection.getConnection();
		System.out.println("Conectado prueba   "+prueba);
		 Connection conn = null;
		 
	        try {
	 
	            String dbURL = "jdbc:sqlserver://192.168.1.209\\MSSQLSERVER2008";
	            String user = "guiver.garcia";
	            String pass = "gg5642";
	            conn = DriverManager.getConnection(dbURL, user, pass);
	            if (conn != null) {
	                DatabaseMetaData dm = (DatabaseMetaData) conn.getMetaData();
	                System.out.println("Driver name: " + dm.getDriverName());
	                System.out.println("Driver version: " + dm.getDriverVersion());
	                System.out.println("Product name: " + dm.getDatabaseProductName());
	                System.out.println("Product version: " + dm.getDatabaseProductVersion());
	            }
	 
	        } catch (SQLException ex) {
	            ex.printStackTrace();
	        } finally {
	            try {
	                if (conn != null && !conn.isClosed()) {
	                    conn.close();
	                }
	            } catch (SQLException ex) {
	                ex.printStackTrace();
	            }
	        }
		
		if(prueba!=null)
		{
			System.out.println("Conectado");
			System.out.println(prueba);
			Statement select = prueba.createStatement();
			java.sql.ResultSet result = select.executeQuery("select *from ExpFitosanitario where SolicitudNro = 1 and SolicitudIdDistrital ='SCZ';");
            
			//Actualiza Respuesta en la base de datos
           /* Statement selectup = prueba.createStatement();
    		String sql = "update WsEnvios set Respuesta = 1 where SolicitudNro = 71876 and SolicitudIdDistrital ='SCZ';";
    		//System.out.print(sql);
    		selectup.executeQuery(sql);
    		*/
		    while (result.next()) {
		     System.out.println("Numero: " + result.getString(1) + "\n");
		     System.out.println("Solicitud Distrital: " + result.getString(2) + "\n");
		     System.out.println("Estado solicitud: " + result.getString(3) + "\n");
		    }
		}
		else {
			System.out.println("Desconectado");
		}
	}

}
