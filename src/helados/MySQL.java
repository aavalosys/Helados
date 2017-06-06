/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helados;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class MySQL {
private static Connection Conexion;
public void MySQLConnection(String user, String pass, String db_name) throws Exception {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/" + "test", "root", "");
            JOptionPane.showMessageDialog(null, "CONEXIÓN CON LA BASE DE DATOS EXITOSA");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

public void getValues(String table_name) {
        try {
            String Query = "SELECT * FROM " + table_name;
            Statement st = Conexion.createStatement();
            java.sql.ResultSet resultSet;
            resultSet = st.executeQuery(Query);
 
           while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("edad") + " "
                        + "Nombre: " + resultSet.getInt("id_alumno") + " " + resultSet.getString("nombre"));
            }
 
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL INTENTAR CONECTARSE A LA BASE DE DATOS");
        }
    }
    
}
