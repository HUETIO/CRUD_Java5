
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud_java3.EmpleadosDAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Devel
 */
public class Empleados_Data_Acces_Layer {
    
    String strConexionDB="jdbc:sqlite:C:/Users/Devel/OneDrive/Documentos/NetBeansProjects/Stock_Java/BaseData/Base_Stock_Java.s3db";
    Connection conn = null;
    
public Empleados_Data_Acces_Layer(){
        try {
            Class.forName("org.sqlite.JDBC");
            conn=DriverManager.getConnection(strConexionDB);
            
            System.out.println("Conexion Establecida!");
            
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error de Conexion!!"+e);
        }
    }


    public int EjecutarSentenciaSQLite(String strSentenciaSQL){
        try {
                PreparedStatement pstm=conn.prepareStatement(strSentenciaSQL);
                pstm.execute();
                return 1;
            } catch (SQLException e) {
                System.out.println(e);
                return 0;
            }

    }
          
    public ResultSet ConsultarRegistros(String strSentenciaSQL){
  
            try {
                 PreparedStatement pstm=conn.prepareStatement(strSentenciaSQL);
                 ResultSet respuesta= pstm.executeQuery();
                 return respuesta;
                 
            } catch (SQLException e) {
                System.out.println(e);
                return null;
            }
        }
    
    
}
