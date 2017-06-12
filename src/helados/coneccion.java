
package helados;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JOptionPane.*;
public class coneccion {
public Connection con;
public Statement stmt;
public String servername="localhost";
public String puerto = "3306";
public String nombreBD="helados";
public String usuario ="root";
public String contra ="";
public String Url="jdbc:mysql://localhost:3306/"+nombreBD;
   
   
   public String errString;

   public coneccion(){
       
   }
   public String getconeccionUrl(){
       return Url;
       
   }
   public Connection conectar(){
       con=null;
       try{
           Class.forName("org.gjt.mm.mysql.Driver");
           con=DriverManager.getConnection(getconeccionUrl(), usuario, contra);
           stmt=con.createStatement();
           if(con!=null){
          
           } 
           }catch (Exception e){
                  errString="Error mientras se conectaba a la Base de Datos";
                
                  return null;
           }
       return con;
       
   }
   public void Desconectar(){
        try{
              stmt.close();
              con.close();
        }catch(SQLException e){
                 errString="Error mientras se conectaba a la Base de Datos";
                  
                }
 
  }
   public Statement getSmtm(){
       return this.stmt;
   }
}
   