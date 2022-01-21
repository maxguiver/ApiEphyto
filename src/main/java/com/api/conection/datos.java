package com.api.conection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class datos {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection cn = SQLDatabaseConnection.getConnection();
		int solicitud = 71876;
		String distrital="SCZ";
       try {
         
         // Llamada al procedimiento almacenado
         CallableStatement cst = cn.prepareCall("{call Ws_Solicitudes_List_ephyto_hub (?,?)}");
             // Parametro 1 del procedimiento almacenado
             cst.setInt(1, solicitud);
             cst.setString(2, distrital);
             // Definimos los tipos de los parametros de salida del procedimiento almacenado
            // cst.registerOutParameter(1, java.sql.Types.VARCHAR);
            // cst.registerOutParameter(2, java.sql.Types.VARCHAR);
             //cst.registerOutParameter(4, java.sql.Types.VARCHAR);
             
             // Ejecuta el procedimiento almacenado
             ResultSet result = cst.executeQuery();
             while (result.next()) {
    		     System.out.println("Numero: " + result.getString(1) + "\n");
    		     System.out.println("Solicitud Distrital: " + result.getString(2) + "\n");
    		     System.out.println("Estado solicitud: " + result.getString(3) + "\n");
    		    }
             // Se obtienen la salida del procedimineto almacenado
             //String nombre = cst.getInt(1);
            // String sexo = cst.getString(2);
            // System.out.println("Nombre: " + nombre);
             //System.out.println("Sexo: " + sexo);
             
         //} while (solicitud > 0);

     } catch (SQLException ex) {
         System.out.println("Error: " + ex.getMessage());
     } finally {
         try {
             cn.close();
         } catch (SQLException ex) {
             System.out.println("Error: " + ex.getMessage());
         }
     }
	}
}
	


