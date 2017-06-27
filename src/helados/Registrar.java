package helados;

import java.sql.*;

import java.text.ParseException;

import java.util.logging.Level;
import java.util.logging.Logger;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Registrar {
    java.sql.ResultSet resultado;
    java.sql.Connection conex = null;
    java.sql.Statement consulta = null;
    coneccion con = new coneccion();

    public Registrar() {

        conex = con.conectar();
        try {
            consulta = conex.createStatement();
          
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public String R_Categoria(String Insertar){
        con.conectar();
        String error = null; 
        try{
               consulta.executeUpdate(Insertar);
               error="Datos Guardados Con Exito";
               
            } catch(Exception e){
                error=String.valueOf(e);
                 
            }
         
         
        return error;
         
    }
 
        public String obfecha(){
            Date date = new Date();
            DateFormat hourdateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss ");
            System.out.println("Hora y fecha: "+hourdateFormat.format(date));
            String fecha=null;
            fecha=String.valueOf(hourdateFormat.format(date));
                    
      return fecha;   
       }
        
         public String guardarfecha(){
             Date date = new Date();
            DateFormat hourdateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ");
            System.out.println("Hora y fecha: "+hourdateFormat.format(date));
            String fecha=null;
            fecha=String.valueOf(hourdateFormat.format(date));
                    
      return fecha;   
       }
         
         public boolean fechamayor(String firstStr, String secondStr) throws ParseException 
         {
             boolean v;
             SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    
       Date date1 = formatter.parse(firstStr);
       Date date2 = formatter.parse(secondStr);

       v = date1.compareTo(date2)<0;
            return v;
       }
         
        
         
      
     public ResultSet mostrardetalle(String ssql){
    ResultSet rs=null;
        try {
            coneccion sql = new coneccion();
            Connection cn = sql.conectar();
            Statement st= cn.createStatement();
            rs = st.executeQuery(ssql);
            
        } catch (SQLException ex) {
            Logger.getLogger(coneccion.class.getName()).log(Level.SEVERE, null, ex);
        }
       return rs; 
       
}
     
      public String Elimina(String ssql){
       con.conectar();
       String err=null;
       try{
           
           consulta.executeUpdate(ssql);
           err="Dato Eliminado Con exito ";
           
       }
           catch(Exception ex){
           err=String.valueOf(ex);
           }
       
       return err;
           }
      
      
      
      
       public String  Modificando (String SQL){
        con.conectar();
        String error = null;
      try {
          
          consulta.executeUpdate(SQL);
          error="Datos Modificados";
         
          
      } catch (SQLException ex) {
          error=String.valueOf(ex);
      }
      return error;
        
    }
     
   
       
    /* public String nombre;
    public String apellido;
    public String carnet;
    public String direccion;
    public String correo;
    public String Roll;
    public int telefono;
    public int solvencia;
    
    
    public String getNombre(){
        return nombre;
    }*/
}
   