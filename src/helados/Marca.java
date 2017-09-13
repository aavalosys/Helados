
package helados;


public class Marca {
    
    private int id;
    private String nombre;
    private String des;
    private String vartex;
    private int num;
    
    
    public Marca(int id, String nombre, String des, String vartex,int num){
        this.des=des;
        this.id=id;
        this.nombre=nombre;
        this.vartex=vartex;
        this.num=num;
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
     * @return the des
     */
    public String getDes() {
        return des;
    }

    /**
     * @param des the des to set
     */
    public void setDes(String des) {
        this.des = des;
    }

    /**
     * @return the vartex
     */
    public String getVartex() {
        return vartex;
    }

    /**
     * @param vartex the vartex to set
     */
    public void setVartex(String vartex) {
        this.vartex = vartex;
    }

    /**
     * @return the num
     */
    public int getNum() {
        return num;
    }

    /**
     * @param num the num to set
     */
    public void setNum(int num) {
        this.num = num;
    }
    
    public String toString()
    {
     return nombre;
    }
    
    
}
