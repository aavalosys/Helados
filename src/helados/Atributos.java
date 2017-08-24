
package helados;


public class Atributos {
  private int id;
  private String Atributo;
   
  
   public Atributos(int id, String Atributo){
       this.id=id;
       this.Atributo=Atributo;
   
   }

   
   public String toString()
    {
        
    return Atributo; 
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
