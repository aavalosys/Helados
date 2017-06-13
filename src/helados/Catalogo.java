/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helados;

import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Catalogo {
    java.sql.ResultSet rs;
    java.sql.Connection conex = null;
    java.sql.Statement consulta = null;
    coneccion con = new coneccion();
    
  public Catalogo(){
         
    }
    
  // Este metodo nos permite obtener el Nombre de las Marcas que Tenemos en la BD, nos retorna un dato tipo ResultSet
  
  public ResultSet Buscar_Marca(){
        conex = con.conectar();
        try {
             String Buscar;
             Buscar = "select * From marca";
           
             
            consulta = conex.createStatement();
            rs = consulta.executeQuery(Buscar);
            
                        
        } catch (Exception e) {
            e.printStackTrace();
        }
      
     return rs;
  }  
       
    
    
    public void Insertar_Product(String Nombre, String Descripcion, String Marca, String Tipo){
        conex = con.conectar();
              
        try {
         //Se Realiza la Consulta para Obtener el id que posee la Marca 
            consulta = conex.createStatement();
            String Id_Marca = "Select id_marcar from venta_helados.marca where nombre_marca = '"+Marca+"'";
            ResultSet rs1 = consulta.executeQuery(Id_Marca);
            String marca=null;
            
           if(rs1.next()){
               marca = rs1.getString("id_marcar");
               Integer.parseInt(marca);
             }
        //--------------------------------------------------------------------------------     
             
             
             
        //Se Realiza la Consulta para Obtener el id que posee el Tipo de Producto y de una vez se convierte a entero    
            String Id_producto = "Select id_tipo_producto from venta_helados.tipo_producto where nombre= '"+Tipo+"'";
            ResultSet rs2=consulta.executeQuery(Id_producto);
            String tipo = null;
            if(rs2.next()){
            tipo= rs2.getString("id_tipo_producto");
            Integer.parseInt(tipo);
             }
         //--------------------------------------------------------------------------------     
             
            
        // Realizamos la Consulta para Insertar a la BD en la Tabla Producto.    
            String insertar;
            insertar = "Insert into venta_helados.producto (nombre_producto, descripcion_producto,id_marcar,id_tipo_producto) values ('"+Nombre+"','"+Descripcion+"',"+marca+","+tipo+")";
            consulta.executeUpdate(insertar);
            JOptionPane.showMessageDialog(null,"Ingresado con Exito");
                        
        } catch (Exception e) {
            e.printStackTrace();
        }
   
       
     
  }  
}
