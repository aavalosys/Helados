/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helados;


public class Rproductos {
  private int id;
  private String producto;
  private String Atributo;
  private int idR;
  private float precio;
  private int idt;
  
    /**
     * @return the id
     */
  
  public Rproductos(int id, String producto,int idR,float precio,int idt,String Atributo){
  
  this.id=id;
  this.producto=producto;
  this.idR=idR;
  this.precio=precio;
  this.Atributo=Atributo;
  this.idt=idt;
  
  
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
        
        
      if(idt==0){  
     return id+" - "+producto;
      }else{
      
      return idt+" - "+Atributo;
      }
     
     
     
    }  

    /**
     * @return the idR
     */
    public int getIdR() {
        return idR;
    }

    /**
     * @param idR the idR to set
     */
    public void setIdR(int idR) {
        this.idR = idR;
    }

    /**
     * @return the precio
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    /**
     * @return the Atributo
     */
    public String getAtributo() {
        return Atributo;
    }

    /**
     * @param Atributo the Atributo to set
     */
    public void setAtributo(String Atributo) {
        this.Atributo = Atributo;
    }
  
}
