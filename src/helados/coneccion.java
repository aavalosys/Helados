
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package helados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class coneccion {
   private static Connection cnx = null;
   
   public static Connection obtener() throws SQLException, ClassNotFoundException {
      if (cnx == null) {
         try {
            Class.forName("com.mysql.jdbc.Driver");
            cnx = DriverManager.getConnection("jdbc:mysql://localhost/venta_helados", "root", "");
         } catch (SQLException ex) {
            throw new SQLException(ex);
         } catch (ClassNotFoundException ex) {
            throw new ClassCastException(ex.getMessage());
         }
      }
      return cnx;
   }
   
   public static void cerrar() throws SQLException {
     if (cnx != null) {
            try {
                cnx.close();
            } catch (SQLException ex) {
                System.out.println("ConnectDB " + ex.getMessage());
            }
        }
   }
}
   