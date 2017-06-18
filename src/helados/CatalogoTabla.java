
package helados;

import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;


public class CatalogoTabla  implements TableModel{
      
    private List<Catalogo> catalogo;
    
    public CatalogoTabla(List<Catalogo> catalogo){
            catalogo=catalogo;
    }
    
    @Override
    public int getRowCount() {
       return catalogo.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public String getColumnName(int i) {
       String titulo=null;
       switch(i){
           case 0: {
           titulo="Codigo";
           break;
           }
           case 1: {
           titulo="Nombre";
           break;
           }    
           case 2: {
           titulo="Detalle";
           break;
           }
       
       }
       return titulo;
    }

    @Override
    public Class<?> getColumnClass(int i) {
        return String.class;
    }

    @Override
    public boolean isCellEditable(int i, int i1) {
        return i!=0;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        Catalogo c= catalogo.get(i);
        String valor=null;
          switch(i){
           case 0: {
           valor=String.valueOf(c.getId());
           break;
           }
           case 1: {
           valor=c.getNombre();
           break;
           }    
           case 2: {
           valor=c.getDetalle();
           break;
           }
       
       } 
          return valor;
    }

    @Override
    public void setValueAt(Object o, int i, int i1) {
        Catalogo c= catalogo.get(i);
        
          switch(i){
           case 0: {
           c.setId(Integer.parseInt(o.toString()));
           break;
           }
           case 1: {
           c.setNombre(o.toString());
           break;
           }    
           case 2: {
           c.setDetalle(o.toString());
           break;
           }
       
       } 
    }

    @Override
    public void addTableModelListener(TableModelListener tl) {
        
    }

    @Override
    public void removeTableModelListener(TableModelListener tl) {
        
    }
    
}
