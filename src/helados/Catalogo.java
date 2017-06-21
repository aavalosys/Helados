/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helados;



public class Catalogo {
     
    private int id;
    private String nombre;
    private String detalle;
   
    
  public  Catalogo(int id, String nombre, String detalle){
      this.id=id;
      this.nombre=nombre;
      this.detalle=detalle;
      
         
    }

   
/**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the detalle
     */
    public String getDetalle() {
        return detalle;
    }

    /**
     * @param detalle the detalle to set
     */
    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
    
    
    public String toString()
    {
     return nombre;
    }   
    
    
    
}
