/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helados;


public class Rproductos {
  private int id;
  private String producto;

    /**
     * @return the id
     */
  
  public Rproductos(int id, String producto){
  
  this.id=id;
  this.producto=producto;
  
  }
  
  
  
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
     * @return the producto
     */
    public String getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(String producto) {
        this.producto = producto;
    }
    
    
     public String toString()
    {
     return id+" - "+producto;
    }  
  
}
