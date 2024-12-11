/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

//DEFINIÇÃO DAS STRINGS DE CONEXÃO

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Gerencia a conxão com o banco de dados.Possui as instruções necessários para
 * conectar ao banco.
 * @author qualifica
 */
public class MySQLConnection {

    //Define string de conexão com o banco.
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://172.16.0.30/abs_dukemarket";

    private static final String USER = "ana";
    private static final String PASS = "senai";
    

   //MÉTODO GETCONNECTION
 /**
  * Cria conexão com o banco de dados MyAQL.
  * @return 
  */
    public static Connection getConnection() {
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException ex) {
            throw new RuntimeException("Erro na Conexão com o BD. Verifique!", ex);
        } catch (ClassNotFoundException ex) {
            throw new RuntimeException("Falha na carga do Driver", ex);

        }

    }
    
   // MÉDOTODO CLOSECONNECTION (CONNECTION) 
  /**
   * Fecha a conexão com o DB.
   * @param conn Connection a ser fechada.
   */
    public static void closeConnection(Connection conn) {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(
                    MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
                        
            }
            
        }
    
    // MÉTODO CLOSECONNECTION (CONNECTION, PREPAREDSTATEMENT)
    public static void closeConnection (Connection conn, PreparedStatement stmt) {
        closeConnection(conn);
        
        try {
            if (stmt != null) {
                stmt.close ();
            }
        } catch (SQLException ex) {    
            Logger.getLogger(
                    MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    //MÉTODO CLOSECONNECTION (CONNECTION, PREPAREDSTATEMENT, RESULTSET)
    public static void closeConnection (Connection conn,
                                        PreparedStatement stmt, 
                                        ResultSet  rs) {
        closeConnection (conn, stmt);
        
        try { 
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(
                    MySQLConnection.class.getName()).log(Level.SEVERE,null, ex);
            
        }
    }
    
}

    
    
    
  