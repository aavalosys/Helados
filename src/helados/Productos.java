/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helados;

/**
 *
 * @author UWAGER
 */
public class Productos {
    
    private int id;
    private String nombre;
    private int idsabor;
    private int idtamano;
    private int tipo;
    private int marca;
    private int clase;
    private int presentacion;
    private int atributo;
    
    public  Productos(int id,String nombre, int idsabor,int idtamano ,int tipo, int marca, int clase, int presentacion,int atributo){
    
        this.id=id;
        this.nombre=nombre;
        this.idsabor=idsabor;
        this.idtamano=idtamano;
        this.tipo=tipo;
        this.marca=marca;
        this.clase=clase;
        this.presentacion=presentacion;
        this.atributo=atributo;
        
        
    }
    
    public String toString()
    {
        String ids=String.valueOf(id);
    return ids; 
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
     * @return the idsabor
     */
    public int getIdsabor() {
        return idsabor;
    }

    /**
     * @param idsabor the idsabor to set
     */
    public void setIdsabor(int idsabor) {
        this.idsabor = idsabor;
    }

    /**
     * @return the idtamano
     */
    public int getIdtamano() {
        return idtamano;
    }

    /**
     * @param idtamano the idtamano to set
     */
    public void setIdtamano(int idtamano) {
        this.idtamano = idtamano;
    }

    /**
     * @return the tipo
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the marca
     */
    public int getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(int marca) {
        this.marca = marca;
    }

    /**
     * @return the clase
     */
    public int getClase() {
        return clase;
    }

    /**
     * @param clase the clase to set
     */
    public void setClase(int clase) {
        this.clase = clase;
    }

    /**
     * @return the presentacion
     */
    public int getPresentacion() {
        return presentacion;
    }

    /**
     * @param presentacion the presentacion to set
     */
    public void setPresentacion(int presentacion) {
        this.presentacion = presentacion;
    }

    /**
     * @return the atributo
     */
    public int getAtributo() {
        return atributo;
    }

    /**
     * @param atributo the atributo to set
     */
    public void setAtributo(int atributo) {
        this.atributo = atributo;
    }
     
    
}
