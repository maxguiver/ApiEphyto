package com.ephyto.client;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.api.conection.SQLDatabaseConnection;

public class UpdateData {
	
	public UpdateData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public  int UpdateWS() {
		Connection cn = SQLDatabaseConnection.getConnection();
		int retorno = 0;
 		PreparedStatement stmt;
 		try {
			stmt = cn.prepareStatement("UPDATE WsEnvios set Respuesta = 1 where SolicitudNro = 71876 and SolicitudIdDistrital ='SCZ'");
			retorno = stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		return retorno;
 		
	}
	

}
