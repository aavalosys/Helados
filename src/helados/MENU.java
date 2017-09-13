
package helados;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import helados.Catalogo;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import static java.rmi.Naming.list;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import static java.util.Collections.list;
import java.util.List;
import javax.swing.DefaultCellEditor;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListCellRenderer;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;


public class MENU extends javax.swing.JFrame {
  
    String tipo;
    String hacer="Modificar";
    String hacer2="Modificar";
    String hacer3="Mostrar";
    int p;
    Persona provee=null;
    float sub=0;
    
   private List<Catalogo> catalogo;
  
   public static int valor=0;
    public DefaultTableModel modelotablav = new DefaultTableModel(){
    public boolean isCellEditable(int rowIndex,int columnIndex){
        return false;
     }
};
    DefaultListModel modeloLista = new DefaultListModel(); 
    DefaultListModel modeloLista2 = new DefaultListModel(); 
    DefaultListModel modeloLista3 = new DefaultListModel();
    DefaultListModel modeloLista4 = new DefaultListModel();
    DefaultListModel modeloLista5 = new DefaultListModel();
    DefaultTableModel m;
    boolean c=true;
    boolean c2=true;
    public String des ;
     int cajadetexto=0;// sirve para capturar donde estamos ingresando codigos
    
     
      
 
   
       
    public MENU() {
        initComponents();
        cargarimagenes();
        tipoProducto.removeAllItems();
        tipo();
        catalogo=new ArrayList();
        varbolas.setText("1");
        
        //Guardo el Item Seleccionado de mi comboBox llamado tipoProducto.
        this.tipo = tipoProducto.getSelectedItem().toString();
        txtbusqueda.setText("... INGRESE PRODUCTO A BUSCAR ....");
        jButton5.setEnabled(false);
      //  btneliminarp.setEnabled(false);
        btnguardar.setEnabled(false);
      //  btnguardarp.setEnabled(false);
      
       cargardatosproducto("","Mostrar");
       recibirdatos();
       Lmarca();
       Ltipo();
       Lclase();
       Latributo();
       Lpresentacion();
       cerrar();
       
        modeloLista = new DefaultListModel();
        listaproducto.setModel(modeloLista);
        
        modeloLista2 = new DefaultListModel();
        listasabor.setModel(modeloLista2);
        
        modeloLista3 = new DefaultListModel();
        listatamano.setModel(modeloLista3);
        
       
        
        txttodo.setEditable(false);
        
        btnelimina1.setEnabled(false);
        btnguardar1.setEnabled(false);
        datosatributos();
        datosatributos2();
        
        jTsabor.setEnabled(false);
        jTtamano.setEnabled(false);
        jCclase.setEnabled(false);
        jCpresentacion.setEnabled(false);
        jCatributo.setEnabled(false);
        jCtipop.setEnabled(false);
        jCmarca.setEnabled(false);
        
       
       
        des(jPap,false);
        des(jPfac,false);
       
    }
    
    
    
    
   void des(JPanel j, boolean d){
        
        
        for(Component c:j.getComponents()) {
            c.setEnabled(d);
                    }
        
        
   
   }
    
    
    
   public void recibirdatos(){
        
         String ssql=null;
        jTpedido.removeAll();
        //despliegue de datos en la tabla de productos
         DefaultTableModel modelotablav = new DefaultTableModel(){
    public boolean isCellEditable(int rowIndex,int columnIndex){
        return false;
    
    
    }
};
        jTpedido.setModel(modelotablav);  
        modelotablav.addColumn("Cantidad");
        modelotablav.addColumn("Descripcion");
        modelotablav.addColumn("Precio U");
        modelotablav.addColumn("Subtotal");
        TableColumnModel columnModelp = jTpedido.getColumnModel();
        columnModelp.getColumn(0).setPreferredWidth(10);
        columnModelp.getColumn(1).setPreferredWidth(200);
        columnModelp.getColumn(2).setPreferredWidth(10);
        columnModelp.getColumn(3).setPreferredWidth(10);
       
        jButton20.setEnabled(false);
      }

        

        public void cerrar(){
        
        try{
        jDialog1.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
            addWindowListener(new WindowAdapter(){
            
            public void windowClosing(WindowEvent e){
             cerrarcon();
            }
            
            });
            
        }catch(Exception e){
        e.printStackTrace();
        }
        
        }
  


      void cargarimagenes(){
       jButton18.setIcon(new ImageIcon("src/icon/icons8-Cancelar-50.png"));
      jButton20.setIcon(new ImageIcon("src/icon/icons8-Basura-50.png"));
      jButton23.setIcon(new ImageIcon("src/icon/icons8-Puerta abierta-50.png"));
      jButton29.setIcon(new ImageIcon("src/icon/icons8-Casilla de verificación marcada-50.png"));
      jButton31.setIcon(new ImageIcon("src/icon/icons8-Contactos-50.png"));
      jButton30.setIcon(new ImageIcon("src/icon/icons8-Guardar-50.png"));
      btnnuevo1.setIcon(new ImageIcon("src/icon/icons8-Guardar-50.png"));
      btnnuevo.setIcon(new ImageIcon("src/icon/icons8-Guardar-50.png"));
      btnelimina1.setIcon(new ImageIcon("src/icon/icons8-Basura-50.png"));
      jButton5.setIcon(new ImageIcon("src/icon/icons8-Basura-50.png"));
      btnguardar1.setIcon(new ImageIcon("src/icon/icons8-Guardar-50.png"));
      btnguardar.setIcon(new ImageIcon("src/icon/icons8-Guardar-50.png"));
      btncancelar1.setIcon(new ImageIcon("src/icon/icons8-Cancelar-50.png"));
      btncancelar.setIcon(new ImageIcon("src/icon/icons8-Cancelar-50.png"));
      btnsalir1.setIcon(new ImageIcon("src/icon/icons8-Puerta abierta-50.png"));
      btnsalir.setIcon(new ImageIcon("src/icon/icons8-Puerta abierta-50.png"));
      }

//Los Tipos de Productos quedaron Quemados a Codigo deacuerdo a los Requerimientos. 
   
    public void tipo(){
        // se Agregagon los Tipos de productos al ComboBox y aplica el evento itemstatechanged para cargar datos cada vez que se tena un cambio 
        
    tipoProducto.addItemListener(new ItemListener() {
    @Override
    public void itemStateChanged(ItemEvent ie) {
        llamada(tipoProducto.getSelectedItem().toString(),"","Mostrar");
        
        txtbusqueda.setText("... INGRESE PRODUCTO A BUSCAR ....");
        jButton5.setEnabled(false);
        btnguardar.setEnabled(false);
    }
       });
        
                tipoProducto.addItem("Opciones");
                tipoProducto.addItem("Tipo Producto");
                tipoProducto.addItem("Tipo Documento");
                tipoProducto.addItem("Atributos");
                tipoProducto.addItem("Clases");
                tipoProducto.addItem("Roll");
                tipoProducto.addItem("Marca");
                tipoProducto.addItem("Presentacion");
                tipoProducto.addItem("Tamaño");
                tipoProducto.addItem("Sabores");
                tipoProducto.addItem("Proveedores");
                
           
          }

    public void Lmarca(){
        // se Agregagon los Tipos de productos al ComboBox y aplica el evento itemstatechanged para cargar datos cada vez que se tena un cambio 
                PreparedStatement ps= null;
                Connection con = null;
                ResultSet rs =null;
                 
        try {
            
        con = coneccion.obtener();
        String query ="SELECT * FROM `marca`";
        ps = con.prepareStatement(query);
      
        rs=ps.executeQuery();
            
            
            while(rs.next()){
                Catalogo cata=new Catalogo(rs.getInt("id_marcar"),rs.getString("nombre_marca"),rs.getString("descripcion_marca"));
                jCmarca.addItem(cata);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MENU.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MENU.class.getName()).log(Level.SEVERE, null, ex);
        }
           
          }
    
    public void Lclase(){
        PreparedStatement ps= null;
        Connection con = null;
        ResultSet rs =null;
        
   
              //  Registrar registrar= new Registrar();
                //ResultSet rs= registrar.mostrardetalle(ssql);
        try {
        con = coneccion.obtener();
        String query = "SELECT * FROM `clase`";
        ps = con.prepareStatement(query);
        rs=ps.executeQuery();
            
            
            while(rs.next()){
                Catalogo cata2=new Catalogo(rs.getInt("id_clase"),rs.getString("descripción_clase"),rs.getString("clase"));
                jCclase.addItem(cata2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MENU.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MENU.class.getName()).log(Level.SEVERE, null, ex);
        }
                
           
          }
    
     public void Latributo(){
        PreparedStatement ps= null;
        Connection con = null;
        ResultSet rs =null;
                //String ssql="SELECT * FROM `atributo`";
                //Registrar registrar= new Registrar();
                //ResultSet rs= registrar.mostrardetalle(ssql);
        try {
            con = coneccion.obtener();
        String query = "SELECT * FROM `atributo`";
        ps = con.prepareStatement(query);
        rs=ps.executeQuery();
            while(rs.next()){
        
                Catalogo cata2=new Catalogo(rs.getInt("id_atributo"),rs.getString("nombre_atributo"),"");
                jCatributo.addItem(cata2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MENU.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MENU.class.getName()).log(Level.SEVERE, null, ex);
        }
                
           
          }
     
     
     public ResultSet sqlmostrardatos(String query){
       ResultSet rs2 =null;
         try {
            PreparedStatement ps= null;
            Connection con = null;
            ResultSet rs =null;
            con = coneccion.obtener();
            ps = con.prepareStatement(query);
            rs=ps.executeQuery();
            rs2=rs;
            
           } catch (SQLException ex) {
            Logger.getLogger(MENU.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MENU.class.getName()).log(Level.SEVERE, null, ex);
        }
         
          return rs2;
          
     }
     
     
     public String sqlinsertardatos(String query){
     String error=null;
         
        try {
            
            Connection con = null;
            Statement consulta = null;
            con = coneccion.obtener();
            consulta= con.createStatement();
           consulta.executeUpdate(query);
           error="Datos Insertados Correctamente";
           
           } catch (SQLException ex) {
            error="error al insertar datos";
            Logger.getLogger(MENU.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            error="error al insertar datos";
            Logger.getLogger(MENU.class.getName()).log(Level.SEVERE, null, ex);
        }
        return error;
     }
    
     public void Lpresentacion(){
                 
                 String ssql="SELECT * FROM `presentacion`";
                ResultSet rs=sqlmostrardatos(ssql);
                 //Registrar registrar= new Registrar();
                //ResultSet rs= registrar.mostrardetalle(ssql);
        try {
            while(rs.next()){
                Catalogo cata2=new Catalogo(rs.getInt("id_presentacion"),rs.getString("presentacion"),"");
                jCpresentacion.addItem(cata2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MENU.class.getName()).log(Level.SEVERE, null, ex);
        }
                
           
          }
    
    
    public void Ltipo(){
       
        
                 String ssql="SELECT * FROM `tipo_producto`";
                  ResultSet rs=sqlmostrardatos(ssql);
                 // Registrar registrar= new Registrar();
                //ResultSet rs= registrar.mostrardetalle(ssql);
        try {
            while(rs.next()){
                Catalogo cata2=new Catalogo(rs.getInt("id_tipo_producto"),rs.getString("nombre_producto"),"");
                jCtipop.addItem(cata2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MENU.class.getName()).log(Level.SEVERE, null, ex);
        }
                
           
          }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        texto_producto = new javax.swing.JTextField();
        listaproducto = new javax.swing.JList();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        listasabor = new javax.swing.JList();
        texto_sabor = new javax.swing.JTextField();
        texto_tamano = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        listatamano = new javax.swing.JList();
        jPanel14 = new javax.swing.JPanel();
        jButton19 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        txttodo = new javax.swing.JTextArea();
        btncance = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        varbolas = new javax.swing.JTextField();
        btnaceptar = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jDialog2 = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btnpaletas = new javax.swing.JButton();
        btnbebidas = new javax.swing.JButton();
        btncasa = new javax.swing.JButton();
        btnpasteles = new javax.swing.JButton();
        btnenvasados = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        btnconos = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTpedido = new javax.swing.JTable();
        jButton20 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        lblsubt = new javax.swing.JLabel();
        lbldes = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lbltotal = new javax.swing.JLabel();
        jButton18 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        tipoProducto = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        txtbusqueda = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        btnnuevo = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtproductos = new javax.swing.JTable();
        jPanel13 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTtamano = new javax.swing.JTable();
        jPanel18 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTsabor = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        txtbusquedap = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        btnnuevo1 = new javax.swing.JButton();
        btnelimina1 = new javax.swing.JButton();
        btnguardar1 = new javax.swing.JButton();
        btncancelar1 = new javax.swing.JButton();
        btnsalir1 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jCmarca = new javax.swing.JComboBox();
        jCtipop = new javax.swing.JComboBox();
        jCclase = new javax.swing.JComboBox();
        jCpresentacion = new javax.swing.JComboBox();
        jCatributo = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTbodega = new javax.swing.JTable();
        jPanel20 = new javax.swing.JPanel();
        txtbusqueda1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        btnguardar2 = new javax.swing.JButton();
        btncancelar2 = new javax.swing.JButton();
        btnsalir2 = new javax.swing.JButton();
        btnfac = new javax.swing.JButton();
        jPap = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtcanc = new javax.swing.JTextField();
        txtprecioc = new javax.swing.JTextField();
        txtcop = new javax.swing.JTextField();
        btnnuevo2 = new javax.swing.JButton();
        jPfac = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        txtnit = new javax.swing.JTextField();
        txtproveedor = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        txtserief = new javax.swing.JTextField();
        txtfechaf = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtnofac = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();

        texto_producto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        texto_producto.setText("CODIGO DEL PRODUCTO");
        texto_producto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                texto_productoFocusGained(evt);
            }
        });
        texto_producto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                texto_productoMouseClicked(evt);
            }
        });
        texto_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto_productoActionPerformed(evt);
            }
        });
        texto_producto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                texto_productoKeyPressed(evt);
            }
        });

        listaproducto.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        listaproducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaproductoMouseClicked(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Teclado en Pantalla"));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("0");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setText("5");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton6.setText("6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton7.setText("7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton8.setText("3");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton9.setText("4");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton10.setText("8");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton11.setText(".");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton12.setText("9");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        listasabor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        listasabor.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        listasabor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listasaborMouseClicked(evt);
            }
        });
        listasabor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                listasaborKeyPressed(evt);
            }
        });
        jScrollPane6.setViewportView(listasabor);

        texto_sabor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        texto_sabor.setText("SABOR ");
        texto_sabor.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        texto_sabor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                texto_saborMouseClicked(evt);
            }
        });
        texto_sabor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto_saborActionPerformed(evt);
            }
        });

        texto_tamano.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        texto_tamano.setText("TAMAÑO");
        texto_tamano.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                texto_tamanoMouseClicked(evt);
            }
        });

        listatamano.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        listatamano.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        listatamano.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listatamanoMouseClicked(evt);
            }
        });
        listatamano.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                listatamanoKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(listatamano);

        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder("Helados Conos"));

        jButton19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton19.setText("+HELADO");
        jButton19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton19MouseClicked(evt);
            }
        });
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        txttodo.setColumns(20);
        txttodo.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txttodo.setRows(5);
        jScrollPane7.setViewportView(txttodo);

        btncance.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btncance.setText("CANCELAR");
        btncance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncanceActionPerformed(evt);
            }
        });

        jButton22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton22.setText("-HELADO");
        jButton22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton22MouseClicked(evt);
            }
        });
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        varbolas.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        varbolas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                varbolasMouseClicked(evt);
            }
        });
        varbolas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varbolasActionPerformed(evt);
            }
        });

        btnaceptar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnaceptar.setText("OK - REGRESAR");
        btnaceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 218, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(varbolas, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                    .addComponent(btncance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnaceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(varbolas, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(btncance, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnaceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(texto_producto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                            .addComponent(listaproducto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(texto_sabor, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(texto_tamano, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDialog1Layout.createSequentialGroup()
                                .addComponent(texto_tamano, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2))
                            .addGroup(jDialog1Layout.createSequentialGroup()
                                .addComponent(texto_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(listaproducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jDialog1Layout.createSequentialGroup()
                                .addComponent(texto_sabor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(17, 17, 17)))
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setText("PRODUCTOS");

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog2Layout.createSequentialGroup()
                .addGap(469, 469, 469)
                .addComponent(jLabel3)
                .addContainerGap(559, Short.MAX_VALUE))
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel3)
                .addContainerGap(747, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTabbedPane5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane5MouseClicked(evt);
            }
        });

        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });

        btnpaletas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnpaletas.setText("PALETAS");
        btnpaletas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpaletasActionPerformed(evt);
            }
        });

        btnbebidas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnbebidas.setText("BEBIDAS");
        btnbebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbebidasActionPerformed(evt);
            }
        });

        btncasa.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btncasa.setText("PARA LA CASA");
        btncasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncasaActionPerformed(evt);
            }
        });

        btnpasteles.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnpasteles.setText("PASTELES");
        btnpasteles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpastelesActionPerformed(evt);
            }
        });

        btnenvasados.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnenvasados.setText("ENVASADO");
        btnenvasados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnenvasadosActionPerformed(evt);
            }
        });

        jButton25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton25.setText("PROMOCIÓN");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        btnconos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnconos.setText("CONOS");
        btnconos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconosActionPerformed(evt);
            }
        });

        jButton21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton21.setText("ESPECIALES");

        jButton24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton24.setText("YOGOURT");

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Pedido:"));

        jTpedido.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTpedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CANTIDAD", "DESCRIPCIÓN", "UNIDAD", "SUB-TOTAL"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTpedido.setCellSelectionEnabled(true);
        jTpedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTpedidoMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTpedido);
        jTpedido.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        jButton20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton20.setText("PRODUCTO");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton30.setText("FACTURAR");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("SUB-TOTAL:");

        lblsubt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblsubt.setText("Q");

        lbldes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbldes.setText("Q");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("DESCUENTO:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("TOTAL:");

        lbltotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbltotal.setText("Q");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel8)))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbltotal)
                    .addComponent(lbldes)
                    .addComponent(lblsubt))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblsubt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(lbldes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(lbltotal))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton18.setText("CANCELAR");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton29.setText("REGISTRO");

        jButton23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton23.setText("SALIR");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton31.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton31.setText("CAMBIAR");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 251, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 284, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLayeredPane3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 251, Short.MAX_VALUE)
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );

        jLabel4.setText("Usuario Registrado");

        jLabel5.setText("Fecha - Hora - Sistema");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnpaletas, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnpasteles, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnbebidas, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btncasa, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnconos, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnenvasados, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jLayeredPane2)
                .addGap(1306, 1306, 1306)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(889, 889, 889))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(385, 385, 385)
                        .addComponent(jLayeredPane2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btnpaletas, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnconos, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btnpasteles, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(13, 13, 13)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btncasa, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btnbebidas, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnenvasados, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(115, 115, 115))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("VENTAS", jPanel1);

        jTable2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable2.setRowHeight(26);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable2);

        tipoProducto.setBackground(new java.awt.Color(240, 240, 240));
        tipoProducto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tipoProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo" }));
        tipoProducto.setToolTipText("");
        tipoProducto.setAutoscrolls(true);
        tipoProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tipoProducto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tipoProductoItemStateChanged(evt);
            }
        });
        tipoProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tipoProductoMouseClicked(evt);
            }
        });
        tipoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoProductoActionPerformed(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Busquedas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        txtbusqueda.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtbusqueda.setText("... INGRESE PRODUCTO A BUSCAR ....");
        txtbusqueda.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtbusquedaFocusGained(evt);
            }
        });
        txtbusqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtbusquedaMouseClicked(evt);
            }
        });
        txtbusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbusquedaActionPerformed(evt);
            }
        });
        txtbusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtbusquedaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbusquedaKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Elemento a Buscar:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtbusqueda)
                .addGap(20, 20, 20))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Controles", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        btnnuevo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnnuevo.setText("Nuevo");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setText("Eliminar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        btnguardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btncancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        btnsalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addGap(18, 18, 18)
                .addComponent(btnguardar)
                .addGap(18, 18, 18)
                .addComponent(btncancelar)
                .addGap(18, 18, 18)
                .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnnuevo)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnguardar)
                    .addComponent(btncancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnsalir))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(tipoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(28, 28, 28))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(tipoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(200, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("ADMIN", jPanel7);

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto"));

        jtproductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre del Producto", "Descripcion", "NumeroP", "TextoP", "Codigo Interno", "Activo/Bloqueado", "Imagen"
            }
        ));
        jtproductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtproductosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jtproductos);
        if (jtproductos.getColumnModel().getColumnCount() > 0) {
            jtproductos.getColumnModel().getColumn(0).setPreferredWidth(10);
        }

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1267, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder("Imagen"));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 245, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tamaños del Producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jTtamano.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "seleccion", "Atributos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTtamano.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTtamanoMouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(jTtamano);
        if (jTtamano.getColumnModel().getColumnCount() > 0) {
            jTtamano.getColumnModel().getColumn(0).setPreferredWidth(10);
            jTtamano.getColumnModel().getColumn(1).setPreferredWidth(200);
        }

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sabores del Producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jTsabor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "seleccion", "Atributos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTsabor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTsaborMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(jTsabor);
        if (jTsabor.getColumnModel().getColumnCount() > 0) {
            jTsabor.getColumnModel().getColumn(0).setPreferredWidth(10);
            jTsabor.getColumnModel().getColumn(1).setPreferredWidth(200);
        }

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Busquedas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        txtbusquedap.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtbusquedap.setText("... INGRESE PRODUCTO A BUSCAR ....");
        txtbusquedap.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtbusquedapFocusGained(evt);
            }
        });
        txtbusquedap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtbusquedapMouseClicked(evt);
            }
        });
        txtbusquedap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbusquedapActionPerformed(evt);
            }
        });
        txtbusquedap.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtbusquedapKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbusquedapKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Elemento a Buscar:");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtbusquedap, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(928, 928, 928))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbusquedap, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Controles", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        btnnuevo1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnnuevo1.setText("Nuevo");
        btnnuevo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevo1ActionPerformed(evt);
            }
        });

        btnelimina1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnelimina1.setText("Eliminar");
        btnelimina1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnelimina1ActionPerformed(evt);
            }
        });

        btnguardar1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnguardar1.setText("Guardar");
        btnguardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardar1ActionPerformed(evt);
            }
        });

        btncancelar1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btncancelar1.setText("Cancelar");
        btncancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelar1ActionPerformed(evt);
            }
        });

        btnsalir1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnsalir1.setText("Salir");
        btnsalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalir1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnnuevo1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnelimina1)
                .addGap(32, 32, 32)
                .addComponent(btnguardar1)
                .addGap(18, 18, 18)
                .addComponent(btncancelar1)
                .addGap(18, 18, 18)
                .addComponent(btnsalir1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnnuevo1)
                    .addComponent(btnelimina1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnguardar1)
                    .addComponent(btncancelar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnsalir1))
                .addContainerGap())
        );

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del procuto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jCmarca.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Marca" }));

        jCtipop.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tipo de Producto" }));

        jCclase.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Clase" }));

        jCpresentacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Presentacion" }));
        jCpresentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCpresentacionActionPerformed(evt);
            }
        });

        jCatributo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Atributo" }));
        jCatributo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCatributoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCmarca, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCtipop, 0, 316, Short.MAX_VALUE)
                    .addComponent(jCclase, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCpresentacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCatributo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jCmarca, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jCtipop, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jCclase, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jCatributo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jCpresentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setText("Usuario Logueado");

        jLabel7.setText("Fecha - Hora - Sistema");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 19, Short.MAX_VALUE))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(948, 948, 948)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
        );

        jPanel11.getAccessibleContext().setAccessibleDescription("");

        jTabbedPane5.addTab("PRODUCTOS", jPanel3);

        jTbodega.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTbodega.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTbodega.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTbodega.setRowHeight(26);
        jTbodega.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTbodegaMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTbodega);

        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Busquedas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        txtbusqueda1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtbusqueda1.setText("... INGRESE PRODUCTO A BUSCAR ....");
        txtbusqueda1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtbusqueda1FocusGained(evt);
            }
        });
        txtbusqueda1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtbusqueda1MouseClicked(evt);
            }
        });
        txtbusqueda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbusqueda1ActionPerformed(evt);
            }
        });
        txtbusqueda1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtbusqueda1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbusqueda1KeyReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Elemento a Buscar:");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtbusqueda1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbusqueda1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Controles", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        btnguardar2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnguardar2.setText("Guardar");
        btnguardar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardar2ActionPerformed(evt);
            }
        });

        btncancelar2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btncancelar2.setText("Cancelar");
        btncancelar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelar2ActionPerformed(evt);
            }
        });

        btnsalir2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnsalir2.setText("Salir");
        btnsalir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalir2ActionPerformed(evt);
            }
        });

        btnfac.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnfac.setText("Factura");
        btnfac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfacActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(btnguardar2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(btncancelar2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnsalir2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel21Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(btnfac, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(491, Short.MAX_VALUE)))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnsalir2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btncancelar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnguardar2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel21Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnfac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPap.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Agregar Productos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Código:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Cantidad:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Precio Compra: Q. ");

        txtcanc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txtprecioc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txtcop.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtcop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcopActionPerformed(evt);
            }
        });

        btnnuevo2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnnuevo2.setText("Siguiente");
        btnnuevo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevo2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPapLayout = new javax.swing.GroupLayout(jPap);
        jPap.setLayout(jPapLayout);
        jPapLayout.setHorizontalGroup(
            jPapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPapLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtcop)
                    .addGroup(jPapLayout.createSequentialGroup()
                        .addGroup(jPapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcanc, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtprecioc, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addComponent(btnnuevo2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPapLayout.setVerticalGroup(
            jPapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPapLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcop, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(12, 12, 12)
                .addGroup(jPapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcanc, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGroup(jPapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPapLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtprecioc, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)))
                    .addGroup(jPapLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnnuevo2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        jPfac.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Agregar Productos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Serie Factura:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Nit. Proveedor:");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Proveedor:");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("Fecha Factura:");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("Direccion / Telefono: ");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("Total Factura:");

        txttotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txtnit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtnit.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtnitFocusLost(evt);
            }
        });
        txtnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnitActionPerformed(evt);
            }
        });

        txtproveedor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txtdireccion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txtserief.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txtfechaf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setText("No. Factura:");

        txtnofac.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPfacLayout = new javax.swing.GroupLayout(jPfac);
        jPfac.setLayout(jPfacLayout);
        jPfacLayout.setHorizontalGroup(
            jPfacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPfacLayout.createSequentialGroup()
                .addGroup(jPfacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20)
                    .addGroup(jPfacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel21)
                        .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPfacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtnit)
                    .addGroup(jPfacLayout.createSequentialGroup()
                        .addComponent(txtfechaf, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txttotal))
                    .addGroup(jPfacLayout.createSequentialGroup()
                        .addGroup(jPfacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPfacLayout.createSequentialGroup()
                                .addComponent(txtserief, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnofac, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 64, Short.MAX_VALUE))))
        );
        jPfacLayout.setVerticalGroup(
            jPfacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPfacLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPfacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPfacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel24)
                        .addComponent(txtnofac, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPfacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(txtserief, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addGroup(jPfacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtnit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPfacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPfacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPfacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(txtfechaf, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel19.setText("Usuario Logueado");

        jLabel23.setText("Fecha - Hora - Sistema");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(455, 455, 455)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))
                    .addComponent(jScrollPane4)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPfac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(125, 125, 125))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPfac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        jPap.getAccessibleContext().setAccessibleName("Busqueda");
        jPap.getAccessibleContext().setAccessibleDescription("");

        jTabbedPane5.addTab("BODEGA", jPanel19);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 1333, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 767, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    
    public void jpanel1(boolean a){
    
    setEnableContainer(jPanel1, a);
    
    }
    
    
    
    
    private void texto_productoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_texto_productoFocusGained
        texto_producto.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_texto_productoFocusGained

    private void texto_productoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_texto_productoMouseClicked
        //limpiamos y le decimos en que caja de texto estamos escribiendo
        cajadetexto=1;
    }//GEN-LAST:event_texto_productoMouseClicked

    private void texto_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texto_productoActionPerformed

    }//GEN-LAST:event_texto_productoActionPerformed

    private void texto_productoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_texto_productoKeyPressed

    }//GEN-LAST:event_texto_productoKeyPressed

    private void listaproductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaproductoMouseClicked
        //seleccion de producto y envio al campo de texto correspondiente
        Rproductos dato=(Rproductos) listaproducto.getSelectedValue();
        listasabor.setEnabled(true);
        listatamano.setEnabled(true);
        buscardatos2("vacio");
       
        txttodo.setText(listaproducto.getSelectedValue().toString());
        c=true;
        c2=true;
    }//GEN-LAST:event_listaproductoMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //llamamos al metodo capturardatos y le decimos el numero que el usuario esta pulsando

        capturardatos("1");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //llamamos al metodo capturardatos y le decimos el numero que el usuario esta pulsando
        capturardatos("2");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //llamamos al metodo capturardatos y le decimos el numero que el usuario esta pulsando
        capturardatos("0");

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        capturardatos("5");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        //llamamos al metodo capturardatos y le decimos el numero que el usuario esta pulsando
        capturardatos("6");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        //llamamos al metodo capturardatos y le decimos el numero que el usuario esta pulsando
        capturardatos("7");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        //llamamos al metodo capturardatos y le decimos el numero que el usuario esta pulsando

        capturardatos("3");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        //llamamos al metodo capturardatos y le decimos el numero que el usuario esta pulsando

        capturardatos("4");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        //llamamos al metodo capturardatos y le decimos el numero que el usuario esta pulsando
        capturardatos("8");
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        //llamamos al metodo capturardatos y le decimos el numero que el usuario esta pulsando
        capturardatos(".");
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        //llamamos al metodo capturardatos y le decimos el numero que el usuario esta pulsando
        capturardatos("9");
    }//GEN-LAST:event_jButton12ActionPerformed

    private void listasaborMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listasaborMouseClicked

        //seleccion de sabor y envio al campo de texto correspondiente
        
        if(c){
            txttodo.setText(txttodo.getText()+"   "+listasabor.getSelectedValue().toString());
            listasabor.setEnabled(false);}
        buscardatos3("vacio");
        c=false;
         
    }//GEN-LAST:event_listasaborMouseClicked

    private void listasaborKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_listasaborKeyPressed
        // TODO add your handling code here:
   
    }//GEN-LAST:event_listasaborKeyPressed

    private void texto_saborMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_texto_saborMouseClicked
        //limpiamos y le decimos en que caja de texto estamos escribiendo

        texto_sabor.setText("");
        cajadetexto=2;
        Rproductos dato=(Rproductos) listaproducto.getSelectedValue();
        buscardatos2("vacio");

    }//GEN-LAST:event_texto_saborMouseClicked

    private void texto_saborActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texto_saborActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texto_saborActionPerformed

    private void texto_tamanoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_texto_tamanoMouseClicked
        //limpiamos y le decimos en que caja de texto estamos escribiendo
        texto_tamano.setText("");
        cajadetexto=3;
    }//GEN-LAST:event_texto_tamanoMouseClicked

    private void listatamanoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listatamanoMouseClicked
        //seleccion de tamano y envio al campo de texto correspondiente
        if(c2){
            txttodo.setText(txttodo.getText()+"   "+listatamano.getSelectedValue().toString());
            listatamano.setEnabled(false);}
        c2=false;
    }//GEN-LAST:event_listatamanoMouseClicked

    private void listatamanoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_listatamanoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_listatamanoKeyPressed

    private void jButton19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton19MouseClicked

        int a = Integer.valueOf(varbolas.getText());
        int total=a+1;
        varbolas.setText(String.valueOf(total));        // TODO add your handling code here:
    }//GEN-LAST:event_jButton19MouseClicked

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton19ActionPerformed

    private void btncanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncanceActionPerformed
        // TODO add your handling code here:
       jpanel1(true);
       jDialog1.dispose();
       

    }//GEN-LAST:event_btncanceActionPerformed

    private void jButton22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton22MouseClicked
        int a = Integer.valueOf(varbolas.getText());
        varbolas.setText(String.valueOf(a-1));        // TODO add your handling code here:
    }//GEN-LAST:event_jButton22MouseClicked

    private void varbolasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_varbolasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_varbolasMouseClicked

    private void varbolasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varbolasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_varbolasActionPerformed

    private void btnaceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaceptarActionPerformed

        
        Rproductos dato=(Rproductos) listatamano.getSelectedValue();
        m= (DefaultTableModel)jTpedido.getModel();
        float subtt=dato.getPrecio()*Float.valueOf(varbolas.getText());
        String datos2[]={varbolas.getText(),dato.getAtributo()+"-"+dato.getProducto(),String.valueOf(dato.getPrecio()),String.valueOf(subtt)};
        m.addRow(datos2);
        int filas=jTpedido.getRowCount();
        filas-=1;
        float desc=0;
        float sub=0;
        float total = 0;
        
        double sumatoria1=0.0;
        
        for(int i=0;i<=filas;i++){
             double sumatoria= Double.parseDouble(String.valueOf(jTpedido.getValueAt(i,3)));
            sumatoria1=sumatoria1+sumatoria;
        }
        lblsubt.setText("Q. "+sumatoria1);
        lbldes.setText("Q. 0.00");
        total=(float) (sumatoria1-desc);
        lbltotal.setText("Q. "+sumatoria1);
        
        
        cerrarr();
        jButton20.setEnabled(false);

    }//GEN-LAST:event_btnaceptarActionPerformed

    void cerrarr(){
    modeloLista.clear();
    modeloLista2.clear();
    modeloLista3.clear();
    varbolas.setText("1");
    texto_tamano.setText("TAMAÑO");
    texto_sabor.setText("SABOR");
    texto_producto.setText("CODIGO DEL PRODUCTO");
    txttodo.setText("");
    jpanel1(true);
    jDialog1.dispose();
    }
    
    
    void cerrarcon(){
    int reply = JOptionPane.showConfirmDialog(null, "Desea Salir Sin Guardar Cambios?", "Advertencia", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
        cerrarr();
        }
    
    }
    
    
    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton22ActionPerformed

    private void btnsalir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalir2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsalir2ActionPerformed

    private void btncancelar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btncancelar2ActionPerformed

    private void btnguardar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardar2ActionPerformed
        // TODO add your handling code here:
        des(jPfac,false);
        Registrar regis= new Registrar();
         String ssql= "INSERT INTO `venta_helados`.`documento` (`id_tipo`,`id_persona`,`descripcion_doc`,`no_doc`,`serie_doc`,`fecha_doc`,estado_doc,total_doc)VALUES ('2','"+provee.getId()+"','por compra de mercaderia','"+txtnofac.getText()+"','"+txtserief.getText()+"','"+regis.guardarfecha()+"','PROCESO','"+txttotal.getText()+"');";
         String resultado=sqlinsertardatos(ssql);
         JOptionPane.showMessageDialog(null, resultado);
        des(jPap,true);
        
        
    }//GEN-LAST:event_btnguardar2ActionPerformed

    private void btnnuevo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevo2ActionPerformed
        // TODO add your handling code here:
        
         sub=sub+(Float.parseFloat(txtprecioc.getText())*Float.parseFloat(txtcanc.getText()));
         float total=Float.parseFloat(txttotal.getText());
        if(sub<=total){
        String query="select * from documento where id_persona='"+provee.getId()+"' and estado_doc='PROCESO'";
        ResultSet rs=sqlmostrardatos(query);
        
         String query2="select * from marca_proveedor where id_persona='"+provee.getId()+"'";
        ResultSet rs2=sqlmostrardatos(query2);
        String idmarp="";
        Registrar regis=new Registrar();
        try {
            if(rs2.next()){
            idmarp=rs2.getString("id_registro_prov");
            if(rs.next()){
              String ssql="INSERT INTO `venta_helados`.`opera_producto` (`id_tipo`, `id_producto`, `id_registro_prov`, `id_doc`, `cantidad_compra`,  `precio_compra`, `usuario`, `fecha`) VALUES ('2','"+txtcop.getText()+"','"+idmarp+"','"+rs.getString("id_doc")+"','"+txtcanc.getText()+"','"+txtprecioc.getText()+"','german','"+regis.guardarfecha()+"');";
              sqlinsertardatos(ssql);  
              
              String ssql2="update producto set existencia_producto= existencia_producto+"+txtcanc.getText()+" where id_producto="+txtcop.getText();
             String resultado= sqlinsertardatos(ssql2); 
              bodegas("");
             
              txtcanc.setText("");
              txtcop.setText("");
              txtprecioc.setText("");
              JOptionPane.showMessageDialog(null, resultado);
              int reply = JOptionPane.showConfirmDialog(null, "Desea Seguir ingresando Datos A Esta Factura", "Advertencia", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
        
        }else{
        des(jPfac,false);
        des(jPap,false);
        txtserief.setText("");
        txtnofac.setText("");
        txtnit.setText("");
        txtproveedor.setText("");
        txtdireccion.setText("");
        txtfechaf.setText("");
        txttotal.setText("");
        btnguardar2.setEnabled(false);
        }
            }
            }
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(MENU.class.getName()).log(Level.SEVERE, null, ex);
        }
        }else{
        JOptionPane.showMessageDialog(null, "error revise datos de factura sumatoria de datos es mayor al total ");
        sub=sub-(Float.parseFloat(txtprecioc.getText())*Float.parseFloat(txtcanc.getText()));
        }
        
        
    }//GEN-LAST:event_btnnuevo2ActionPerformed

    private void txtbusqueda1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbusqueda1KeyReleased
        // TODO add your handling code here:
        bodegas(txtbusqueda1.getText());
    }//GEN-LAST:event_txtbusqueda1KeyReleased

    private void txtbusqueda1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbusqueda1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbusqueda1KeyPressed

    private void txtbusqueda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbusqueda1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbusqueda1ActionPerformed

    private void txtbusqueda1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtbusqueda1MouseClicked
        // TODO add your handling code here:
        txtbusqueda1.setText("");
        
    }//GEN-LAST:event_txtbusqueda1MouseClicked

    private void txtbusqueda1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtbusqueda1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbusqueda1FocusGained

    private void jTbodegaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTbodegaMouseClicked
        // TODO add your handling code here:
        
        int row= jTbodega.getSelectedRow();
        int n= (int)jTbodega.getValueAt(row, 0);
        txtcop.setText(String.valueOf(n));
        
    }//GEN-LAST:event_jTbodegaMouseClicked

    private void jCatributoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCatributoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCatributoActionPerformed

    private void jCpresentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCpresentacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCpresentacionActionPerformed

    private void btnsalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalir1ActionPerformed
        int reply = JOptionPane.showConfirmDialog(null, "Desea Cerrar El Programa?", "Advertencia", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            jDialog2.dispose();

            btnelimina1.setEnabled(false);
            btnguardar1.setEnabled(false);
        }
    }//GEN-LAST:event_btnsalir1ActionPerformed

    private void btncancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelar1ActionPerformed

        int reply = JOptionPane.showConfirmDialog(null, "Desea Canselar La Operacion?", "Advertencia", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {

            cargardatosproducto("","Mostrar");
            jCtipop.setSelectedIndex(0);
            jCmarca.setSelectedIndex(0);
            jCclase.setSelectedIndex(0);
            jCatributo.setSelectedIndex(0);
            jCpresentacion.setSelectedIndex(0);

            modeloLista4.clear();
            modeloLista5.clear();
            hacer3="Mostrar";

            int contar=jTsabor.getRowCount();
            for(int i=0;i<contar;i++){
                jTsabor.setValueAt(false, i, 0);
            }
            int contar2=jTtamano.getRowCount();
            for(int i=0;i<contar2;i++){
                jTtamano.setValueAt(false, i, 0);
            }

            jTsabor.setEnabled(false);
            jTtamano.setEnabled(false);
            jCclase.setEnabled(false);
            jCpresentacion.setEnabled(false);
            jCatributo.setEnabled(false);
            jCtipop.setEnabled(false);
            jCmarca.setEnabled(false);

        }

    }//GEN-LAST:event_btncancelar1ActionPerformed

    private void btnguardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardar1ActionPerformed
        int reply = JOptionPane.showConfirmDialog(null, "Desea Realizar los Cambios?", "Advertencia", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {

            Registrar registrar=new Registrar();
            String resultado="";
            String ssql=null;
            int row= jtproductos.getSelectedRow();

            String nombre= (String)jtproductos.getValueAt(row, 1);
            String desc=(String) jtproductos.getValueAt(row, 2);
            String sabor2=(String) jtproductos.getValueAt(row, 3);
            String tamano2=(String) jtproductos.getValueAt(row, 4);
            String codigoi=(String) jtproductos.getValueAt(row, 5);
            String activo=(String) jtproductos.getValueAt(row, 6);
            String rate=(String) jtproductos.getValueAt(row, 7);
            String existencia=(String) jtproductos.getValueAt(row, 8);
            String precio=(String) jtproductos.getValueAt(row, 9);
            String fecha=(String) jtproductos.getValueAt(row, 10);
            Catalogo tipo=(Catalogo) jCtipop.getSelectedItem();
            Catalogo marca=(Catalogo) jCmarca.getSelectedItem();
            Catalogo clases= (Catalogo) jCclase.getSelectedItem();
            Catalogo Atri= (Catalogo) jCatributo.getSelectedItem();
            Catalogo presentacion= (Catalogo) jCpresentacion.getSelectedItem();

            if(hacer3.equals("Nuevo")){
                int contador=jTsabor.getRowCount();
                int contador2=jTtamano.getRowCount();
                Atributos tamano;
                Atributos sabor;
                for(int i=0;i<contador2;i++){
                    boolean atributo=(boolean) jTtamano.getValueAt(i, 0);
                    if(atributo){
                        tamano= (Atributos) jTsabor.getValueAt(i, 1);
                        for(int j=0;j<contador;j++){
                            boolean  atributo2=(boolean) jTsabor.getValueAt(j, 0);
                            if(atributo2){
                                sabor= (Atributos) jTsabor.getValueAt(j, 1);
                                ssql="INSERT INTO `producto`(`id_marcar`, `id_tipo_producto`, `id_sabor`, `id_clase`, `id_presentacion`, `id_atributo`, `id_tamano`, `nombre_producto`, `descripcion_producto`, `num_producto`, `text_producto`, `imagen_producto`, `codigo_producto`, `producto_activo`, `rate`, `existencia_producto`, `precio_venta`, `fecha_creacion`, `codigo_barras`) VALUES ('"+marca.getId()+"','"+tipo.getId()+"','"+sabor.getId()+"','"+clases.getId()+"','"+presentacion.getId()+"','"+Atri.getId()+"','"+tamano.getId()+"','"+nombre+"','"+desc+"','0','0','null','"+codigoi+"','"+activo+"','"+rate+"','"+existencia+"','"+precio+"','"+registrar.guardarfecha()+"','0')";
                                resultado=sqlinsertardatos(ssql);
                                //resultado=registrar.R_Categoria(ssql);
                            }
                        }}

                    }

                }

                if(hacer3.equals("Mostrar")){
                    Productos id=(Productos) jtproductos.getValueAt(row, 0);
                    ssql="UPDATE `producto` SET `id_marcar`='"+marca.getId()+"' ,`id_tipo_producto`='"+tipo.getId()+"', `id_clase`='"+clases.getId()+"', `id_presentacion`='"+presentacion.getId()+"', `id_atributo`='"+Atri.getId()+"', `nombre_producto`='"+nombre+"', `descripcion_producto`='"+desc+"' ,`codigo_producto`='"+codigoi+"', `producto_activo`='"+activo+"', `rate`='"+rate+"', `existencia_producto`='"+existencia+"', `precio_venta`='"+precio+"' WHERE id_producto="+id.getId();
                    //resultado=registrar.Modificando(ssql);
                    resultado=sqlinsertardatos(ssql);
                }

                JOptionPane.showMessageDialog(null, resultado);
                cargardatosproducto("","Mostrar");

            }

            //desmarca todas los checkbox de sabores y tamano
            int contar=jTsabor.getRowCount();
            for(int i=0;i<contar;i++){
                jTsabor.setValueAt(false, i, 0);
            }
            int contar2=jTtamano.getRowCount();
            for(int i=0;i<contar2;i++){
                jTtamano.setValueAt(false, i, 0);
            }
            jTtamano.setEnabled(false);
            jTsabor.setEnabled(false);
            btnelimina1.setEnabled(false);
            btnguardar1.setEnabled(false);
    }//GEN-LAST:event_btnguardar1ActionPerformed

    private void btnelimina1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnelimina1ActionPerformed
        int reply = JOptionPane.showConfirmDialog(null, "Desea Eliminar El Dato Seleccionado?", "Advertencia", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {

            int row= jtproductos.getSelectedRow();
            Registrar registrar=new Registrar();

            Catalogo id=(Catalogo) jtproductos.getValueAt(row, 0);
            String ssql="DELETE FROM `producto` WHERE id_producto="+id.getNombre();
            //String resultado= registrar.Elimina(ssql);
           String resultado= sqlinsertardatos(ssql);
            JOptionPane.showMessageDialog(null, resultado);
            cargardatosproducto("","Mostrar");
            btnelimina1.setEnabled(false);
            btnguardar1.setEnabled(false);
        }

    }//GEN-LAST:event_btnelimina1ActionPerformed

    private void btnnuevo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevo1ActionPerformed
        nuevop();
        hacer3="Nuevo";
        int contar=jTsabor.getRowCount();
        for(int i=0;i<contar;i++){
            jTsabor.setValueAt(false, i, 0);
        }

        jTsabor.setEnabled(true);
        jTtamano.setEnabled(true);
        jCclase.setEnabled(true);
        jCpresentacion.setEnabled(true);
        jCatributo.setEnabled(true);
        jCtipop.setEnabled(true);
        jCmarca.setEnabled(true);

        modeloLista4.clear();
        modeloLista5.clear();
        btnelimina1.setEnabled(false);
    }//GEN-LAST:event_btnnuevo1ActionPerformed

    private void txtbusquedapKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbusquedapKeyReleased
        cargardatosproducto(txtbusquedap.getText(),"Mostrar");
    }//GEN-LAST:event_txtbusquedapKeyReleased

    private void txtbusquedapKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbusquedapKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbusquedapKeyPressed

    private void txtbusquedapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbusquedapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbusquedapActionPerformed

    private void txtbusquedapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtbusquedapMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbusquedapMouseClicked

    private void txtbusquedapFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtbusquedapFocusGained
        txtbusquedap.setText("");
    }//GEN-LAST:event_txtbusquedapFocusGained

    private void jTsaborMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTsaborMouseClicked

    }//GEN-LAST:event_jTsaborMouseClicked

    private void jTtamanoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTtamanoMouseClicked

    }//GEN-LAST:event_jTtamanoMouseClicked

    private void jtproductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtproductosMouseClicked

        btnguardar1.setEnabled(true);

        if(hacer3.equals("Mostrar")|| hacer3.equals("Atributo")){
            btnelimina1.setEnabled(true);
            int row= jtproductos.getSelectedRow();
            Productos dato=(Productos)jtproductos.getValueAt(row, 0);

            for (int i = 1; i < jCmarca.getModel().getSize(); i++) {
                Catalogo object = (Catalogo)jCmarca.getItemAt(i);
                if(object.getId()==dato.getMarca()){
                    jCmarca.setSelectedIndex(i);
                }
            }

            for (int i = 1; i < jCtipop.getModel().getSize(); i++) {
                Catalogo object = (Catalogo)jCtipop.getItemAt(i);
                if(object.getId()==dato.getTipo()){
                    jCtipop.setSelectedIndex(i);
                }
            }

            for (int i = 1; i < jCclase.getModel().getSize(); i++) {
                Catalogo object = (Catalogo)jCclase.getItemAt(i);
                if(object.getId()==dato.getClase()){
                    jCclase.setSelectedIndex(i);
                }
            }

            for (int i = 1; i < jCpresentacion.getModel().getSize(); i++) {
                Catalogo object = (Catalogo)jCpresentacion.getItemAt(i);
                if(object.getId()==dato.getPresentacion()){
                    jCpresentacion.setSelectedIndex(i);
                }
            }

            for (int i = 1; i < jCatributo.getModel().getSize(); i++) {
                Catalogo object = (Catalogo)jCatributo.getItemAt(i);
                if(object.getId()==dato.getAtributo()){
                    jCatributo.setSelectedIndex(i);
                }
            }

            jCclase.setEnabled(true);
            jCpresentacion.setEnabled(true);
            jCatributo.setEnabled(true);
            jCtipop.setEnabled(true);
            jCmarca.setEnabled(true);

        }
    }//GEN-LAST:event_jtproductosMouseClicked

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        int reply = JOptionPane.showConfirmDialog(null, "Desea Cerrar El Programa?", "Advertencia", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            this.dispose();
        }

    }//GEN-LAST:event_btnsalirActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        txtbusqueda.setText("... INGRESE PRODUCTO A BUSCAR ....");
        llamada(tipoProducto.getSelectedItem().toString(),"","Mostrar");
        jButton5.setEnabled(false);
        btnguardar.setEnabled(false);
        btnnuevo.setEnabled(true);
        hacer="Modificar";
    }//GEN-LAST:event_btncancelarActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        // TODO add your handling code here:
        String resultado = null;
        int reply = JOptionPane.showConfirmDialog(null, "Desea Guardar Los Cambios?", "Advertencia", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            Registrar registrar= new Registrar();
            String ssql=null;
            int row=0;
            if(hacer.equals("Modificar")){
                row=jTable2.getSelectedRow();}else{
                row=0;
            }

            String campo1=(String) jTable2.getValueAt(row, 0);
            
            String campo4 = null;
            String campo3 = null;
            String campo2 = null;
            if(tipoProducto.getSelectedItem().toString().equals("Proveedores")){
            }else{
                campo2=(String) jTable2.getValueAt(row, 1);
                campo3=(String) jTable2.getValueAt(row, 2);
                }
              campo4=(String) jTable2.getValueAt(row, 3);
            String campo5=(String) jTable2.getValueAt(row, 4);

            if(hacer.equals("Modificar")){
                
                if(tipoProducto.getSelectedItem().toString().equals("Tipo Producto")){
                    String campo6=(String) jTable2.getValueAt(row, 5);
                    ssql="UPDATE `tipo_producto` SET `nombre_producto`='"+campo2+"',`descripcion_producto`='"+campo3+"',`vartext_producto`='"+campo4+"',`varnum_producto`='"+campo5+"',`tag_producto`='"+campo6+"' WHERE id_tipo_producto="+campo1;}
                
                if(tipoProducto.getSelectedItem().toString().equals("Marca")){
                    ssql="UPDATE `marca` SET `nombre_marca`='"+campo2+"',`descripcion_marca`='"+campo3+"',`vartex_marca`='"+campo4+"',`varnum_marca`='"+campo5+"' WHERE id_marcar="+campo1;
                }
                if(tipoProducto.getSelectedItem().toString().equals("Roll")){
                    String campo6=(String) jTable2.getValueAt(row, 5);
                    ssql="UPDATE `roll` SET `descripcion_rol`='"+campo2+"',`text_rol`='"+campo3+"',`textdos_rol`='"+campo4+"',`num_text`='"+campo5+"',`tag_rol`='"+campo6+"' WHERE id_rol="+campo1;
                }
                if(tipoProducto.getSelectedItem().toString().equals("Atributos")){
                    ssql="UPDATE `atributo` SET `nombre_atributo`='"+campo2+"',`descripcion_atributo`='"+campo3+"',`texto_atributo`='"+campo4+"',`num_atributo`='"+campo5+"' WHERE id_atributo="+campo1;
                }
                if(tipoProducto.getSelectedItem().toString().equals("Tipo Documento")){
                    String campo6=(String) jTable2.getValueAt(row, 5);
                    ssql="UPDATE `tipo` SET `tipo`='"+campo2+"',`describe_tipo`='"+campo3+"',`tag_tipo`='"+campo4+"',`text_tipo`='"+campo5+"',`num_tipo`='"+campo6+"' WHERE id_tipo="+campo1;
                }
                if(tipoProducto.getSelectedItem().toString().equals("Clases")){
                    ssql="UPDATE `clase` SET `descripción_clase`='"+campo2+"',`clase`='"+campo3+"',`porciento_clase`='"+campo4+"',`tag_clase`='"+campo5+"' WHERE id_clase="+campo1;
                }
                //aqui comense de nuevo

                if(tipoProducto.getSelectedItem().toString().equals("Proveedores")){
                    Persona persona=(Persona) jTable2.getValueAt(row, 1);
                    Marca marca =(Marca) jTable2.getValueAt(row, 2);
                    String campo6=(String) jTable2.getValueAt(row, 5);
                    ssql="UPDATE `marca_proveedor` SET `id_persona`='"+persona.getId()+"',`id_marcar`='"+marca.getId()+"',`text_marca`='"+campo4+"',tag_marca='"+campo6+"',`num_marca`='"+campo5+"' WHERE id_registro_prov="+campo1;
                }
                if(tipoProducto.getSelectedItem().toString().equals("Sabores")){
                    String campo6=(String) jTable2.getValueAt(row, 5);

                    ssql="UPDATE `sabor` SET `descripcion_sabor`='"+campo2+"',`sabor`='"+campo3+"',`descripcion`='"+campo4+"',`texto_sabor`='"+campo5+"',`numero_sabor`='"+campo6+"' WHERE id_sabor="+campo1;
                }
                if(tipoProducto.getSelectedItem().toString().equals("Tamaño")){
                    ssql="UPDATE `tamano` SET `tamaño`='"+campo2+"',`descripcion`='"+campo3+"',`numero_tamano`='"+campo5+"',`texto_tamano`='"+campo4+"' WHERE id_tamano="+campo1;
                }

                if(tipoProducto.getSelectedItem().toString().equals("Presentacion")){
                    ssql="UPDATE `presentacion` SET `presentacion`='"+campo2+"',`descripcion_presenta`='"+campo3+"',`numero_pres`='"+campo5+"',`texto_pres`='"+campo4+"' WHERE id_presentacion="+campo1;
                }

                //resultado=registrar.Modificando(ssql);
                resultado=sqlinsertardatos(ssql);
            }
            else{

                if(tipoProducto.getSelectedItem().toString().equals("Tipo Producto")){
                    String campo6=(String) jTable2.getValueAt(row, 5);
                    ssql="INSERT INTO `tipo_producto`(`nombre_producto`, `descripcion_producto`, `vartext_producto`, `varnum_producto`, `tag_producto`) VALUES ('"+campo2+"','"+campo3+"','"+campo4+"','"+campo5+"','"+campo6+"')";
                }
                if(tipoProducto.getSelectedItem().toString().equals("Marca")){
                  ssql="INSERT INTO `marca`(`nombre_marca`, `descripcion_marca`,`vartex_marca`, `varnum_marca`) VALUES ('"+campo2+"','"+campo3+"','"+campo4+"','"+campo5+"')";
                }
                if(tipoProducto.getSelectedItem().toString().equals("Roll")){
                    String campo6=(String) jTable2.getValueAt(row, 5);
                    ssql="INSERT INTO `roll`(`descripcion_rol`, `text_rol`, `textdos_rol`, `num_text`, `tag_rol`) VALUES ('"+campo2+"','"+campo3+"','"+campo4+"','"+campo5+"','"+campo6+"')";
                }
                if(tipoProducto.getSelectedItem().toString().equals("Atributos")){
                    ssql="INSERT INTO `atributo`(`nombre_atributo`, `descripcion_atributo`, `texto_atributo`, `num_atributo`) VALUES ('"+campo2+"','"+campo3+"','"+campo4+"','"+campo5+"')";
                }
                if(tipoProducto.getSelectedItem().toString().equals("Tipo Documento")){
                    String campo6=(String) jTable2.getValueAt(row, 5);
                    ssql="INSERT INTO `tipo`(`tipo`, `describe_tipo`, `tag_tipo`, `text_tipo`, `num_tipo`) VALUES ('"+campo2+"','"+campo3+"','"+campo4+"','"+campo5+"','"+campo6+"')";
                }
                if(tipoProducto.getSelectedItem().toString().equals("Clases")){

                    ssql="INSERT INTO `clase`(`descripción_clase`, `clase`, `porciento_clase`, `tag_clase`) VALUES ('"+campo2+"','"+campo3+"','"+campo4+"','"+campo5+"')";
                }
                //aqui comence de nuevo

                if(tipoProducto.getSelectedItem().toString().equals("Proveedores")){
                    String campo6=(String) jTable2.getValueAt(row, 5);
                    Persona persona=(Persona) jTable2.getValueAt(row, 1);
                    Marca marca =(Marca) jTable2.getValueAt(row, 2);
                    ssql="INSERT INTO `marca_proveedor`(`id_persona`, `id_marcar`,`text_marca`, `num_marca`,tag_marca) VALUES ('"+persona.getId()+"','"+marca.getId()+"','"+campo4+"','"+campo5+"','"+campo6+"')";
                }
                if(tipoProducto.getSelectedItem().toString().equals("Sabores")){
                    String campo6=(String) jTable2.getValueAt(row, 5);

                    ssql="INSERT INTO `sabor`(`descripcion_sabor`, `sabor`, `descripcion`, `texto_sabor`, `numero_sabor`) VALUES ('"+campo2+"','"+campo3+"','"+campo4+"','"+campo5+"','"+campo6+"')";
                }

                if(tipoProducto.getSelectedItem().toString().equals("Tamaño")){
                    ssql="INSERT INTO `tamano`(`tamaño`, `descripcion`, `numero_tamano`, `texto_tamano`) VALUES ('"+campo2+"','"+campo3+"','"+campo5+"','"+campo4+"')";
                }

                if(tipoProducto.getSelectedItem().toString().equals("Presentacion")){
                    ssql="INSERT INTO `presentacion`(`presentacion`, `descripcion_presenta`, `numero_pres`, `texto_pres`) VALUES ('"+campo2+"','"+campo3+"','"+campo5+"','"+campo4+"')";
                }
                //resultado=registrar.R_Categoria(ssql);
                resultado= sqlinsertardatos(ssql);
                hacer="Modificar";
            }

        }

        datosatributos();
        datosatributos2();
        JOptionPane.showMessageDialog(null, resultado);
        llamada(tipoProducto.getSelectedItem().toString(),"","Mostrar");
        jButton5.setEnabled(false);
        btnguardar.setEnabled(false);
        btnnuevo.setEnabled(true);
    }//GEN-LAST:event_btnguardarActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        int row=jTable2.getSelectedRow();
        String id=(String) jTable2.getValueAt(row, 0);
        String ssql=null;
        int reply = JOptionPane.showConfirmDialog(null, "Desea Eliminar El dato Seleccionado?", "Advertencia", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            if(id!=null){
                Registrar registrar= new Registrar();
                if(tipoProducto.getSelectedItem().toString().equals("Tipo Producto")){
                    ssql="DELETE FROM tipo_producto WHERE id_tipo_producto="+id;}
                if(tipoProducto.getSelectedItem().toString().equals("Marca")){
                    ssql="DELETE FROM `marca` WHERE id_marcar="+id;
                }
                if(tipoProducto.getSelectedItem().toString().equals("Clases")){
                    ssql="DELETE FROM `clase` WHERE id_clase="+id;
                }
                if(tipoProducto.getSelectedItem().toString().equals("Tipo Documento")){
                    ssql="DELETE FROM `tipo` WHERE id_tipo="+id;
                }
                if(tipoProducto.getSelectedItem().toString().equals("Atributos")){
                    ssql="DELETE FROM `atributo` WHERE id_atributo="+id;
                }
                if(tipoProducto.getSelectedItem().toString().equals("Roll")){
                    ssql="DELETE FROM `roll` WHERE id_rol="+id;
                }

                //aqui comence de nuevo
                if(tipoProducto.getSelectedItem().toString().equals("Proveedores")){
                    ssql="DELETE FROM `proveedor` WHERE id_provee="+id;
                }
                if(tipoProducto.getSelectedItem().toString().equals("Sabores")){
                    ssql="DELETE FROM `sabor` WHERE id_sabor="+id;
                }
                if(tipoProducto.getSelectedItem().toString().equals("Tamaño")){
                    ssql="DELETE FROM `tamano` WHERE id_tamano="+id;
                }

                if(tipoProducto.getSelectedItem().toString().equals("Presentacion")){
                    ssql="DELETE FROM `presentacion` WHERE id_presentacion="+id;
                }

                //String resultado= registrar.Elimina(ssql);
                String resultado=sqlinsertardatos(ssql);
                JOptionPane.showMessageDialog(null, resultado);

                llamada(tipoProducto.getSelectedItem().toString(),"","Mostrar");
                txtbusqueda.setText("... INGRESE PRODUCTO A BUSCAR ....");
                jButton5.setEnabled(false);
                btnguardar.setEnabled(false);

            }

        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        llamada(tipoProducto.getSelectedItem().toString(),"","Nuevo");
        hacer="Nuevo";
        jButton5.setEnabled(false);
        btnnuevo.setEnabled(false);
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void txtbusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbusquedaKeyReleased
        // TODO add your handling code here:
        llamada(tipoProducto.getSelectedItem().toString(),txtbusqueda.getText(),"Mostrar");
    }//GEN-LAST:event_txtbusquedaKeyReleased

    private void txtbusquedaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbusquedaKeyPressed

    }//GEN-LAST:event_txtbusquedaKeyPressed

    private void txtbusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbusquedaActionPerformed

    private void txtbusquedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtbusquedaMouseClicked

    }//GEN-LAST:event_txtbusquedaMouseClicked

    private void txtbusquedaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtbusquedaFocusGained

        txtbusqueda.setText("");
    }//GEN-LAST:event_txtbusquedaFocusGained

    private void tipoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoProductoActionPerformed
        // TODO add your andling code here:
    }//GEN-LAST:event_tipoProductoActionPerformed

    private void tipoProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tipoProductoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoProductoMouseClicked

    private void tipoProductoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tipoProductoItemStateChanged

    }//GEN-LAST:event_tipoProductoItemStateChanged

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        jButton5.setEnabled(true);
        btnguardar.setEnabled(true);
    }//GEN-LAST:event_jTable2MouseClicked

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved
        // TODO add your handling code here:

    }//GEN-LAST:event_jPanel1MouseMoved

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        int reply = JOptionPane.showConfirmDialog(null, "Desea Cerrar El Programa?", "Advertencia", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
        recibirdatos();
        lblsubt.setText("Q. 0.00");
        lbltotal.setText("Q. 0.00");
        lbldes.setText("Q. 0.00");
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed

    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here
        int reply = JOptionPane.showConfirmDialog(null, "Desea Salir Sin Guardar Cambios?", "Advertencia", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {

            int row= jTpedido.getSelectedRow();

            float desc=0;
            float sub=0;
            float total = 0;
            int canti=Integer.valueOf(jTpedido.getValueAt(row, 0).toString());
            float precios=Float.valueOf(jTpedido.getValueAt(row, 2).toString());
            float t=canti*precios;
            double sumatoria1=0.0;
            DefaultTableModel  x= (DefaultTableModel) jTpedido.getModel();

            x.removeRow(row);
            int filas=jTpedido.getRowCount();
            filas-=1;
            for(int i=0;i<=filas;i++){
                double sumatoria= Double.parseDouble(String.valueOf(jTpedido.getValueAt(i,3)));
                sumatoria1=sumatoria1+sumatoria;
            }
            sumatoria1=sumatoria1-total;
            lblsubt.setText("Q. "+sumatoria1);
            lbldes.setText("Q. "+desc);
            total=(float) (sumatoria1-desc);
            lbltotal.setText("Q. "+sumatoria1);

            jButton20.setEnabled(false);
        }
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jTpedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTpedidoMouseClicked
        // TODO add your handling code here:

        jButton20.setEnabled(true);
    }//GEN-LAST:event_jTpedidoMouseClicked

    private void btnconosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconosActionPerformed
        // TODO add your handling code here:
        this.setEnabled(true);
    }//GEN-LAST:event_btnconosActionPerformed

    private void btnenvasadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnenvasadosActionPerformed
        valor=4;
        p=4;
        buscardatos1("vacio",4);
        jpanel1(false);

        jDialog1.setSize(1300,725);

        jDialog1.setVisible(true);
    }//GEN-LAST:event_btnenvasadosActionPerformed

    private void btnpastelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpastelesActionPerformed
        valor=2;
        p=2;
        buscardatos1("vacio",2);
        jpanel1(false);
        jDialog1.setSize(1300,725);

        jDialog1.setVisible(true);
    }//GEN-LAST:event_btnpastelesActionPerformed

    private void btncasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncasaActionPerformed
        valor=3;
        p=3;
        buscardatos1("vacio",3);
        jpanel1(false);
        jDialog1.setSize(1300,725);

        jDialog1.setVisible(true);
    }//GEN-LAST:event_btncasaActionPerformed

    private void btnbebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbebidasActionPerformed
        valor=5;
        p=5;
        buscardatos1("vacio",5);
        jpanel1(false);
        jDialog1.setSize(1300,725);

        jDialog1.setVisible(true);
    }//GEN-LAST:event_btnbebidasActionPerformed

    private void btnpaletasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpaletasActionPerformed
        valor=1;
        p=1;
        buscardatos1("vacio",1);
        jpanel1(false);
        jDialog1.setSize(1300,725);

        jDialog1.setVisible(true);

    }//GEN-LAST:event_btnpaletasActionPerformed

    private void btnfacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfacActionPerformed
      des(jPfac,true);
      btnguardar2.setEnabled(true);
    }//GEN-LAST:event_btnfacActionPerformed

    private void txtcopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcopActionPerformed

    private void txtnitFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnitFocusLost
        // TODO add your handling code here:
        
        buscarproveedor(txtnit.getText());
        
        
    }//GEN-LAST:event_txtnitFocusLost

    private void txtnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnitActionPerformed

    private void jTabbedPane5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane5MouseClicked
        // TODO add your handling code here:
        bodegas("");
    }//GEN-LAST:event_jTabbedPane5MouseClicked

    
    
    
    
    

    
    
    
    
    
    private void llamada(String opcion,String busqueda,String M){
        datosTipoP(opcion,busqueda,M);
        datosMarca(opcion,busqueda,M);
        datosRoll(opcion,busqueda,M);
        datosAtri(opcion,busqueda,M);
        datosTipoD(opcion,busqueda,M);
        datosClase(opcion,busqueda,M);
        datosproveedores(opcion,busqueda,M);
        datossabor(opcion,busqueda,M);
        datostamano(opcion,busqueda,M);
        datospresentacion(opcion,busqueda,M); 
    
    }
    
    
     public void datosMarca(String opcion,String busqueda,String M){
        String ssql=null;
       jTable2.removeAll();
        //despliegue de datos en la tabla de productos
        if(opcion.equals("Marca")){
        DefaultTableModel modelotabla = new DefaultTableModel(){
    public boolean isCellEditable(int rowIndex,int columnIndex){
        return columnIndex!=0;
    
    
    }
};
        jTable2.setModel(modelotabla);  
        modelotabla.addColumn("Codigo");
        modelotabla.addColumn("Nombre");
        modelotabla.addColumn("Descripcion");
        modelotabla.addColumn("vartex_marca");
        modelotabla.addColumn("vernum_marca");
        TableColumnModel columnModel = jTable2.getColumnModel();

        columnModel.getColumn(0).setPreferredWidth(75);
        columnModel.getColumn(1).setPreferredWidth(300);
        columnModel.getColumn(2).setPreferredWidth(360);
        columnModel.getColumn(3).setPreferredWidth(250);
        columnModel.getColumn(4).setPreferredWidth(190);
        ssql="select * from venta_helados.marca where nombre_marca LIKE '"+busqueda+"%' order by id_marcar DESC ";
        Registrar a = new Registrar();
        //ResultSet rs=a.mostrardetalle(ssql);
        ResultSet rs=sqlmostrardatos(ssql);
      if(M.equals("Nuevo")){
        modelotabla.addRow(new Object[]{"","","","",""});}
       try {
           while(rs.next()){
    
    modelotabla.addRow(new Object[]{rs.getString("id_marcar"),rs.getString("nombre_marca"),rs.getString("descripcion_marca"),rs.getString("vartex_marca"),rs.getString("varnum_marca")});
          
           }
         
           
       } catch (SQLException ex) {
           Logger.getLogger(MENU.class.getName()).log(Level.SEVERE, null, ex);
       }
       
       
       
        }
    
   
    }
     
     public void datosClase(String opcion,String busqueda,String M){
        String ssql=null;
       jTable2.removeAll();
        //despliegue de datos en la tabla de productos
        if(opcion.equals("Clases")){
        DefaultTableModel modelotabla = new DefaultTableModel(){
    public boolean isCellEditable(int rowIndex,int columnIndex){
        return columnIndex!=0;
    
    
    }
};
        jTable2.setModel(modelotabla);  
        modelotabla.addColumn("Codigo");
        modelotabla.addColumn("Descripcion");
        modelotabla.addColumn("clase");
        modelotabla.addColumn("Porciento");
        modelotabla.addColumn("Tag_Clase");
        
         TableColumnModel columnModel = jTable2.getColumnModel();

        columnModel.getColumn(0).setPreferredWidth(100);
        columnModel.getColumn(1).setPreferredWidth(790);
        columnModel.getColumn(2).setPreferredWidth(100);
        columnModel.getColumn(3).setPreferredWidth(95);
        columnModel.getColumn(4).setPreferredWidth(100);
        

        ssql="select * from venta_helados.clase where tag_clase LIKE '"+busqueda+"%' order by id_clase DESC ";
        Registrar a = new Registrar();
        //ResultSet rs=a.mostrardetalle(ssql);
        ResultSet rs=sqlmostrardatos(ssql);
      if(M.equals("Nuevo")){
        modelotabla.addRow(new Object[]{"","","","",""});}
       try {
           while(rs.next()){
    modelotabla.addRow(new Object[]{rs.getString("id_clase"),rs.getString("descripción_clase"),rs.getString("clase"),rs.getString("porciento_clase"),rs.getString("tag_clase")});
          
           }
          
           
       } catch (SQLException ex) {
           Logger.getLogger(MENU.class.getName()).log(Level.SEVERE, null, ex);
       }
       
       
       
        }
    
   
    } 
     
     public void datostamano(String opcion,String busqueda,String M){
        String ssql=null;
       jTable2.removeAll();
        //despliegue de datos en la tabla de productos
        if(opcion.equals("Tamaño")){
        DefaultTableModel modelotabla = new DefaultTableModel(){
    public boolean isCellEditable(int rowIndex,int columnIndex){
        return columnIndex!=0;
    
    
    }
};
        jTable2.setModel(modelotabla);  
        modelotabla.addColumn("Codigo");
        modelotabla.addColumn("Tamaño");
        modelotabla.addColumn("Descripcion");
        modelotabla.addColumn("Texto_tamano");
        modelotabla.addColumn("Numero_tamano");
        
         TableColumnModel columnModel = jTable2.getColumnModel();

        columnModel.getColumn(0).setPreferredWidth(100);
        columnModel.getColumn(1).setPreferredWidth(290);
        columnModel.getColumn(2).setPreferredWidth(450);
        columnModel.getColumn(3).setPreferredWidth(170);
        columnModel.getColumn(4).setPreferredWidth(170);
        

        ssql="select * from venta_helados.tamano where tamaño LIKE '"+busqueda+"%' order by id_tamano DESC ";
        Registrar a = new Registrar();
        //ResultSet rs=a.mostrardetalle(ssql);
        ResultSet rs=sqlmostrardatos(ssql);
      if(M.equals("Nuevo")){
        modelotabla.addRow(new Object[]{"","","","",""});}
       try {
           while(rs.next()){
    modelotabla.addRow(new Object[]{rs.getString("id_tamano"),rs.getString("tamaño"),rs.getString("descripcion"),rs.getString("texto_tamano"),rs.getString("numero_tamano")});
          
           }
          
           
       } catch (SQLException ex) {
           Logger.getLogger(MENU.class.getName()).log(Level.SEVERE, null, ex);
       }
       
       
       
        }
    
   
    }
     
     public void datospresentacion(String opcion,String busqueda,String M){
        String ssql=null;
       jTable2.removeAll();
        //despliegue de datos en la tabla de productos
        if(opcion.equals("Presentacion")){
        DefaultTableModel modelotabla = new DefaultTableModel(){
    public boolean isCellEditable(int rowIndex,int columnIndex){
        return columnIndex!=0;
    
    
    }
};
        jTable2.setModel(modelotabla);  
        modelotabla.addColumn("Codigo");
        modelotabla.addColumn("Presentacion");
        modelotabla.addColumn("Descripcion");
        modelotabla.addColumn("Texto_Pres");
        modelotabla.addColumn("Numero_pres");
        
         TableColumnModel columnModel = jTable2.getColumnModel();

        columnModel.getColumn(0).setPreferredWidth(100);
        columnModel.getColumn(1).setPreferredWidth(290);
        columnModel.getColumn(2).setPreferredWidth(450);
        columnModel.getColumn(3).setPreferredWidth(170);
        columnModel.getColumn(4).setPreferredWidth(170);
        

        ssql="select * from venta_helados.presentacion where presentacion LIKE '"+busqueda+"%' order by id_presentacion DESC ";
        Registrar a = new Registrar();
        //ResultSet rs=a.mostrardetalle(ssql);
        ResultSet rs=sqlmostrardatos(ssql);
      if(M.equals("Nuevo")){
        modelotabla.addRow(new Object[]{"","","","",""});}
       try {
           while(rs.next()){
    modelotabla.addRow(new Object[]{rs.getString("id_presentacion"),rs.getString("presentacion"),rs.getString("descripcion_presenta"),rs.getString("texto_pres"),rs.getString("numero_pres")});
          
           }
          
           
       } catch (SQLException ex) {
           Logger.getLogger(MENU.class.getName()).log(Level.SEVERE, null, ex);
       }
       
       
       
        }
    
   
    } 
     
     
    public void datosproveedores(String opcion,String busqueda,String M){
        String ssql=null;
       jTable2.removeAll();
        //despliegue de datos en la tabla de productos
        if(opcion.equals("Proveedores")){
        DefaultTableModel modelotabla = new DefaultTableModel(){
    public boolean isCellEditable(int rowIndex,int columnIndex){
        return columnIndex!=0;
    
    
    }
};
        jTable2.setModel(modelotabla);  
        modelotabla.addColumn("Codigo");
        modelotabla.addColumn("Nombre");
        modelotabla.addColumn("Marca");
        modelotabla.addColumn("Texto_provee");
        modelotabla.addColumn("Num_provee");
        modelotabla.addColumn("tag_prove");
        
       
        TableColumnModel columnModel = jTable2.getColumnModel();

        columnModel.getColumn(0).setPreferredWidth(75);
        columnModel.getColumn(1).setPreferredWidth(200);
        columnModel.getColumn(2).setPreferredWidth(300);
        columnModel.getColumn(3).setPreferredWidth(308);
        columnModel.getColumn(4).setPreferredWidth(150);
        columnModel.getColumn(5).setPreferredWidth(150);

        ssql="select * from venta_helados.marca_proveedor, persona, marca where marca_proveedor.id_persona=persona.id_persona and marca_proveedor.id_marcar=marca.id_marcar and nombre_persona LIKE '"+busqueda+"%' order by id_registro_prov DESC ";
        Registrar a = new Registrar();
        //ResultSet rs=a.mostrardetalle(ssql);
        ResultSet rs=sqlmostrardatos(ssql);
      if(M.equals("Nuevo")){
        modelotabla.addRow(new Object[]{"","","","","",""});}
       try {
           while(rs.next()){
        Marca marca= new Marca(rs.getInt("id_marcar"),rs.getString("nombre_marca"),rs.getString("descripcion_marca"),rs.getString("vartex_marca"),rs.getInt("varnum_marca"));
        Persona persona= new Persona(rs.getInt("id_persona"),rs.getString("nombre_persona"),rs.getString("nombredos_persona"),rs.getString("nombretres_persona"),rs.getString("apellidouno_persona"),rs.getString("apellidodos_persona"),rs.getString("nit"),rs.getString("telefono"),rs.getString("email"),rs.getString("identifacacion"),rs.getString("text_persona"),rs.getInt("num_persona"),rs.getString("textdos_persona"),rs.getInt("numdos_persona"),rs.getString("direccion_persona"),rs.getString("identificador_text"),rs.getInt("identifica_num"));
        modelotabla.addRow(new Object[]{rs.getString("id_registro_prov"),persona,marca,rs.getString("text_marca"),rs.getString("num_marca"),rs.getString("tag_marca")});
          }
           
           TableColumn col = jTable2.getColumnModel().getColumn(1);
           JComboBox combo = persona();
          col.setCellEditor(new DefaultCellEditor(combo));
          
          TableColumn cola = jTable2.getColumnModel().getColumn(2);
           JComboBox combo2 = Marca();
          cola.setCellEditor(new DefaultCellEditor(combo2)); 
          
       } catch (SQLException ex) {
           Logger.getLogger(MENU.class.getName()).log(Level.SEVERE, null, ex);
       }
       
       
       
        }
    
   
    } 
     
     public void datosTipoD(String opcion,String busqueda,String M){
        String ssql=null;
       jTable2.removeAll();
        //despliegue de datos en la tabla de productos
        if(opcion.equals("Tipo Documento")){
        DefaultTableModel modelotabla = new DefaultTableModel(){
    public boolean isCellEditable(int rowIndex,int columnIndex){
        return columnIndex!=0;
    
    
    }
};
        jTable2.setModel(modelotabla);  
        modelotabla.addColumn("Codigo");
        modelotabla.addColumn("Identificador");
        modelotabla.addColumn("Descripcion");
        modelotabla.addColumn("Observacion");
        modelotabla.addColumn("Filtro");
        modelotabla.addColumn("Estado");
        TableColumnModel columnModel = jTable2.getColumnModel();

        columnModel.getColumn(0).setPreferredWidth(75);
        columnModel.getColumn(1).setPreferredWidth(350);
        columnModel.getColumn(2).setPreferredWidth(460);
        columnModel.getColumn(3).setPreferredWidth(95);
        columnModel.getColumn(4).setPreferredWidth(100);
        columnModel.getColumn(5).setPreferredWidth(100);
        ssql="select * from venta_helados.tipo where tag_tipo LIKE '"+busqueda+"%' order by id_tipo DESC ";
        Registrar a = new Registrar();
        //ResultSet rs=a.mostrardetalle(ssql);
        ResultSet rs=sqlmostrardatos(ssql);
      if(M.equals("Nuevo")){
        modelotabla.addRow(new Object[]{"","","","","",""});}
       try {
           while(rs.next()){
    modelotabla.addRow(new Object[]{rs.getString("id_tipo"),rs.getString("tipo"),rs.getString("describe_tipo"),rs.getString("tag_tipo"),rs.getString("text_tipo"),rs.getString("num_tipo")});
          
           }
          
           
       } catch (SQLException ex) {
           Logger.getLogger(MENU.class.getName()).log(Level.SEVERE, null, ex);
       }
       
       
       
        }
    
   
    }
     
     
     
     public void datosAtri(String opcion,String busqueda,String M){
        
        String ssql=null;
       jTable2.removeAll();
        //despliegue de datos en la tabla de productos
        if(opcion.equals("Atributos")){
        DefaultTableModel modelotabla = new DefaultTableModel(){
    public boolean isCellEditable(int rowIndex,int columnIndex){
        return columnIndex!=0;
    
    
    }
};
        jTable2.setModel(modelotabla);  
        modelotabla.addColumn("Codigo");
        modelotabla.addColumn("Atributo");
        modelotabla.addColumn("Descripcion");
        modelotabla.addColumn("Observacion");
        modelotabla.addColumn("Iipo-Numero");
        TableColumnModel columnModel = jTable2.getColumnModel();

        columnModel.getColumn(0).setPreferredWidth(95);
        columnModel.getColumn(1).setPreferredWidth(350);
        columnModel.getColumn(2).setPreferredWidth(550);
        columnModel.getColumn(3).setPreferredWidth(75);
        columnModel.getColumn(4).setPreferredWidth(100);
        
        ssql="select * from venta_helados.atributo where nombre_atributo LIKE '"+busqueda+"%'  order by id_atributo DESC ";
        Registrar a = new Registrar();
        //ResultSet rs=a.mostrardetalle(ssql);
        ResultSet rs=sqlmostrardatos(ssql);
      if(M.equals("Nuevo")){
        modelotabla.addRow(new Object[]{"","","","",""});}
       try {
           while(rs.next()){
    modelotabla.addRow(new Object[]{rs.getString("id_atributo"),rs.getString("nombre_atributo"),rs.getString("descripcion_atributo"),rs.getString("texto_atributo"),rs.getString("num_atributo")});
          
           }
          
           
       } catch (SQLException ex) {
           Logger.getLogger(MENU.class.getName()).log(Level.SEVERE, null, ex);
       }
       
        }
       
        
    
   
    }
     
     
      public void datossabor(String opcion,String busqueda,String M){
        
        String ssql=null;
       jTable2.removeAll();
        //despliegue de datos en la tabla de productos
        if(opcion.equals("Sabores")){
        DefaultTableModel modelotabla = new DefaultTableModel(){
    public boolean isCellEditable(int rowIndex,int columnIndex){
        return columnIndex!=0;
    
    
    }
};
        jTable2.setModel(modelotabla);  
        modelotabla.addColumn("Codigo");
        modelotabla.addColumn("Descripcion");
        modelotabla.addColumn("Sabor");
        modelotabla.addColumn("Descripcion_sabor");
        modelotabla.addColumn("texto_sabor");
        modelotabla.addColumn("numero_sabor");
        
        TableColumnModel columnModel = jTable2.getColumnModel();

        columnModel.getColumn(0).setPreferredWidth(95);
        columnModel.getColumn(1).setPreferredWidth(250);
        columnModel.getColumn(2).setPreferredWidth(300);
        columnModel.getColumn(3).setPreferredWidth(300);
        columnModel.getColumn(4).setPreferredWidth(120);
        columnModel.getColumn(5).setPreferredWidth(120);
        ssql="select * from venta_helados.sabor where sabor LIKE '"+busqueda+"%'  order by id_sabor DESC ";
        Registrar a = new Registrar();
        //ResultSet rs=a.mostrardetalle(ssql);
        ResultSet rs=sqlmostrardatos(ssql);
      if(M.equals("Nuevo")){
        modelotabla.addRow(new Object[]{"","","","","",""});}
       try {
           while(rs.next()){
    modelotabla.addRow(new Object[]{rs.getString("id_sabor"),rs.getString("descripcion_sabor"),rs.getString("sabor"),rs.getString("descripcion"),rs.getString("texto_sabor"),rs.getString("numero_sabor")});
          
           }
          
           
       } catch (SQLException ex) {
           Logger.getLogger(MENU.class.getName()).log(Level.SEVERE, null, ex);
       }
       
        }
       
        
    
   
    }
     
     public void datosRoll(String opcion,String busqueda,String M){
        String ssql=null;
       jTable2.removeAll();
        //despliegue de datos en la tabla de productos
        if(opcion.equals("Roll")){
        DefaultTableModel modelotabla = new DefaultTableModel(){
    public boolean isCellEditable(int rowIndex,int columnIndex){
        return columnIndex!=0;
    
    
    }
};
        jTable2.setModel(modelotabla);  
        modelotabla.addColumn("Codigo");
        modelotabla.addColumn("Descripcion");
        modelotabla.addColumn("Password");
        modelotabla.addColumn("Hash");
        modelotabla.addColumn("Estado");
        modelotabla.addColumn("Clasificador");
        TableColumnModel columnModel = jTable2.getColumnModel();

        columnModel.getColumn(0).setPreferredWidth(75);
        columnModel.getColumn(1).setPreferredWidth(350);
        columnModel.getColumn(2).setPreferredWidth(460);
        columnModel.getColumn(3).setPreferredWidth(95);
        columnModel.getColumn(4).setPreferredWidth(100);
        columnModel.getColumn(5).setPreferredWidth(100);
        ssql="select * from venta_helados.roll where tag_rol LIKE '"+busqueda+"%' order by id_rol DESC ";
        Registrar a = new Registrar();
        //ResultSet rs=a.mostrardetalle(ssql);
        ResultSet rs=sqlmostrardatos(ssql);
      if(M.equals("Nuevo")){
        modelotabla.addRow(new Object[]{"","","","","",""});}
       try {
           while(rs.next()){
      modelotabla.addRow(new Object[]{rs.getString("id_rol"),rs.getString("descripcion_rol"),rs.getString("text_rol"),rs.getString("textdos_rol"),rs.getString("num_text"),rs.getString("tag_rol")});
          
           }
          
           
       } catch (SQLException ex) {
           Logger.getLogger(MENU.class.getName()).log(Level.SEVERE, null, ex);
       }
       
       
       
        }
    
   
    }
     
     
    
    
     public void datosTipoP(String opcion,String busqueda,String M){
        
         String ssql=null;
        jTable2.removeAll();
        //despliegue de datos en la tabla de productos
        if(opcion.equals("Tipo Producto")){
          DefaultTableModel modelotabla = new DefaultTableModel(){
                public boolean isCellEditable(int rowIndex,int columnIndex){
                    return columnIndex!=0;


                }
        };
        jTable2.setModel(modelotabla);  
        modelotabla.addColumn("Codigo");
        modelotabla.addColumn("Nombre");
        modelotabla.addColumn("Descripcion");
        modelotabla.addColumn("Vartext_producto");
        modelotabla.addColumn("Varnum_producto");
        modelotabla.addColumn("Tag_producto");
       
        
        TableColumnModel columnModel = jTable2.getColumnModel();

        columnModel.getColumn(0).setPreferredWidth(75);
        columnModel.getColumn(1).setPreferredWidth(350);
        columnModel.getColumn(2).setPreferredWidth(460);
        columnModel.getColumn(3).setPreferredWidth(95);
        columnModel.getColumn(4).setPreferredWidth(100);
        columnModel.getColumn(5).setPreferredWidth(100);
        ssql="select * from venta_helados.tipo_producto where nombre_producto LIKE '"+busqueda+"%' order by id_tipo_producto DESC  ";
        Registrar a = new Registrar();
        //ResultSet rs=a.mostrardetalle(ssql);
        ResultSet rs=sqlmostrardatos(ssql);
         if(M.equals("Nuevo")){
        modelotabla.addRow(new Object[]{"","","","","",""});}
       
       try {
           while(rs.next()){
      modelotabla.addRow(new Object[]{rs.getString("id_tipo_producto"),rs.getString("nombre_producto"),rs.getString("descripcion_producto"),rs.getString("vartext_producto"),rs.getString("varnum_producto"),rs.getString("tag_producto")});
           }
           
       } catch (SQLException ex) {
           Logger.getLogger(MENU.class.getName()).log(Level.SEVERE, null, ex);
       }
        }
    
   
    }
     
     public void nuevop(){
         
         
       jtproductos.removeAll();
       
        DefaultTableModel modelotablap = new DefaultTableModel(){
    public boolean isCellEditable(int rowIndex,int columnIndex){
        
        
        return columnIndex!=0 && columnIndex!=3 && columnIndex!=4 && columnIndex!=5 && columnIndex!=6 && columnIndex!=7 && columnIndex!=8 && columnIndex!=9 && columnIndex!=10;
        
     }
};
        jtproductos.setModel(modelotablap);  
        modelotablap.addColumn("Codigo");
        modelotablap.addColumn("Nombre De Producto");
        modelotablap.addColumn("Descripcion");
        modelotablap.addColumn("Sabor");
        modelotablap.addColumn("Tamano");
        modelotablap.addColumn("Codigo Interno");
        modelotablap.addColumn("Activo/Bloqueado");
        
        modelotablap.addColumn("Rate");
        modelotablap.addColumn("Existencia");
        modelotablap.addColumn("precio");
        modelotablap.addColumn("Fecha");
        Registrar a = new Registrar();
        String fecha=a.obfecha();
        
        modelotablap.addRow(new Object[]{"","","","","","0","1","0","0","0",fecha});
       
     
     }
     
     
     
     public void cargardatosproducto(String busqueda,String N){
        
         String ssql=null;
        jtproductos.removeAll();
        //despliegue de datos en la tabla de productos en la pestana productos 
        
          DefaultTableModel modelotablap = new DefaultTableModel(){
    public boolean isCellEditable(int rowIndex,int columnIndex){
        return columnIndex!=0 && columnIndex!=3 && columnIndex!=4;
     }
};
        jtproductos.setModel(modelotablap);  
        modelotablap.addColumn("Codigo");
        modelotablap.addColumn("Nombre De Producto");
        modelotablap.addColumn("Descripcion");
        modelotablap.addColumn("Sabor");
        modelotablap.addColumn("Tamano");
        modelotablap.addColumn("Codigo Interno");
        modelotablap.addColumn("Activo/Bloqueado");
        
        modelotablap.addColumn("Rate");
        modelotablap.addColumn("Existencia");
        modelotablap.addColumn("precio");
        modelotablap.addColumn("Fecha");
        
        ssql="select * from venta_helados.producto, sabor, tamano where nombre_producto LIKE '"+busqueda+"%' and producto.id_tamano=tamano.id_tamano and producto.id_sabor=sabor.id_sabor order by id_producto DESC";
        Registrar a = new Registrar();
        //ResultSet rs=a.mostrardetalle(ssql);
        ResultSet rs=sqlmostrardatos(ssql);
       
       try {
           while(rs.next()){
               
          Productos ids=new Productos(rs.getInt("id_producto"),rs.getString("nombre_producto"),rs.getInt("id_sabor"),rs.getInt("id_tamano"),rs.getInt("id_tipo_producto"),rs.getInt("id_marcar"),rs.getInt("id_clase"),rs.getInt("id_presentacion"),rs.getInt("id_atributo"));
          modelotablap.addRow(new Object[]{ids,rs.getString("nombre_producto"),rs.getString("descripcion_producto"),rs.getString("sabor"),rs.getString("tamaño"),rs.getString("codigo_producto"),rs.getString("producto_activo"),rs.getString("rate"),rs.getString("existencia_producto"),rs.getString("precio_venta"),rs.getString("fecha_creacion"),rs.getString("codigo_barras")});
           }
          
           
       } catch (SQLException ex) {
           Logger.getLogger(MENU.class.getName()).log(Level.SEVERE, null, ex);
       }
        
    
   
    }
    
    public void bodegas(String busqueda){
        
         String ssql=null;
        jTbodega.removeAll();
        //despliegue de datos en la tabla de productos en la pestana productos 
        
          DefaultTableModel modelotablap = new DefaultTableModel(){
    public boolean isCellEditable(int rowIndex,int columnIndex){
        return columnIndex==10;
     }
};
        jTbodega.setModel(modelotablap);  
        modelotablap.addColumn("Codigo");
        modelotablap.addColumn("Nombre De Producto");
        modelotablap.addColumn("Descripcion");
        modelotablap.addColumn("Sabor");
        modelotablap.addColumn("Tamano");
        modelotablap.addColumn("Activo/Bloqueado");
        modelotablap.addColumn("Existencia");
        modelotablap.addColumn("precio");
        
        
         TableColumnModel columnModel = jTbodega.getColumnModel();

        columnModel.getColumn(0).setPreferredWidth(75);
        columnModel.getColumn(1).setPreferredWidth(350);
        columnModel.getColumn(2).setPreferredWidth(360);
        columnModel.getColumn(3).setPreferredWidth(95);
        columnModel.getColumn(4).setPreferredWidth(100);
        columnModel.getColumn(5).setPreferredWidth(100);
        columnModel.getColumn(6).setPreferredWidth(100);
        columnModel.getColumn(7).setPreferredWidth(100);
        
        ssql="select * from venta_helados.producto, sabor, tamano where nombre_producto LIKE '"+busqueda+"%' and producto.id_tamano=tamano.id_tamano and producto.id_sabor=sabor.id_sabor order by id_producto DESC";
        Registrar a = new Registrar();
        ResultSet rs=sqlmostrardatos(ssql);
       
       try {
           while(rs.next()){
          modelotablap.addRow(new Object[]{rs.getInt("id_producto"),rs.getString("nombre_producto"),rs.getString("descripcion_producto"),rs.getString("sabor"),rs.getString("tamaño"),rs.getString("producto_activo"),rs.getString("existencia_producto"),rs.getString("precio_venta")});
           }
          
           
       } catch (SQLException ex) {
           Logger.getLogger(MENU.class.getName()).log(Level.SEVERE, null, ex);
       }
        
    
   
    }
     
     private JComboBox generateBox()
 {
     JComboBox bx=null;
    
     try
     {
         String ssql="select * from tipo_producto";
        Registrar a = new Registrar();
        //ResultSet rs=a.mostrardetalle(ssql);
        ResultSet rs=sqlmostrardatos(ssql);
        bx=new JComboBox();
         while(rs.next()){
             Catalogo datos= new Catalogo(rs.getInt("id_tipo_producto"),rs.getString("nombre_producto"),"");
             bx.addItem(datos);
         }
       
     }catch(Exception x)
     {
         System.out.println(x.getMessage());
     }
             return bx;

 }
     
     private JComboBox Marca()
 {
     JComboBox bx=null;
    
     try
     {
         String ssql="select * from marca";
        Registrar a = new Registrar();
        //ResultSet rs=a.mostrardetalle(ssql);
        ResultSet rs=sqlmostrardatos(ssql);
        bx=new JComboBox();
         while(rs.next()){
             Marca marca= new Marca(rs.getInt("id_marcar"),rs.getString("nombre_marca"),rs.getString("descripcion_marca"),rs.getString("vartex_marca"),rs.getInt("varnum_marca"));
       bx.addItem(marca);
         }
       
     }catch(Exception x)
     {
         System.out.println(x.getMessage());
     }
             return bx;

 }
     
     
     
    
      private JComboBox persona()
 {
     JComboBox bx=null;
    
     try
     {
         String ssql="select * from persona";
        Registrar a = new Registrar();
        //ResultSet rs=a.mostrardetalle(ssql);
        ResultSet rs=sqlmostrardatos(ssql);
        bx=new JComboBox();
         while(rs.next()){
            Persona persona= new Persona(rs.getInt("id_persona"),rs.getString("nombre_persona"),rs.getString("nombredos_persona"),rs.getString("nombretres_persona"),rs.getString("apellidouno_persona"),rs.getString("apellidodos_persona"),rs.getString("nit"),rs.getString("telefono"),rs.getString("email"),rs.getString("identifacacion"),rs.getString("text_persona"),rs.getInt("num_persona"),rs.getString("textdos_persona"),rs.getInt("numdos_persona"),rs.getString("direccion_persona"),rs.getString("identificador_text"),rs.getInt("identifica_num"));
             bx.addItem(persona);
         }
       
     }catch(Exception x)
     {
         System.out.println(x.getMessage());
     }
             return bx;

 }
      
      
      public void buscarproveedor(String nombre)
 {     try
     {
        String ssql="select * from persona where nit='"+nombre+"' and num_persona=3";
        Registrar a = new Registrar();
        ResultSet rs=sqlmostrardatos(ssql);
      
         if(rs.next()){
            Persona persona= new Persona(rs.getInt("id_persona"),rs.getString("nombre_persona"),rs.getString("nombredos_persona"),rs.getString("nombretres_persona"),rs.getString("apellidouno_persona"),rs.getString("apellidodos_persona"),rs.getString("nit"),rs.getString("telefono"),rs.getString("email"),rs.getString("identifacacion"),rs.getString("text_persona"),rs.getInt("num_persona"),rs.getString("textdos_persona"),rs.getInt("numdos_persona"),rs.getString("direccion_persona"),rs.getString("identificador_text"),rs.getInt("identifica_num"));
         provee=persona;
            txtproveedor.setText(persona.toString());
         txtdireccion.setText(persona.getTelefono());
         }else{
         System.out.println("no se encontraron datos");
         }
       
     }catch(Exception x)
     {
         System.out.println(x.getMessage());
     }
            

 }
      
      
      public static void setEnableContainer(Container c, boolean band) {
         
 Component[] components = c.getComponents();
 c.setEnabled(band);
 for(int i = 0; i < components.length; i++){            
  components[i].setEnabled(band);
   
  if(components[i] instanceof Container){
   setEnableContainer((Container)components[i], band);
  }
   
 }        
}
  
    
    
   
     public void buscardatos1(String id2,int va){
    
        //despliegue de datos en la tabla de productos
        Registrar a = new Registrar();
        String ssql;
        if(id2.equals("vacio")){
       ssql="SELECT producto.nombre_producto, producto.id_producto FROM `producto` WHERE producto.id_tipo_producto='"+va+"' GROUP BY nombre_producto";}
        else{
         ssql="SELECT producto.nombre_producto, producto.id_producto FROM `producto` WHERE producto.id_tipo_producto='"+va+"' and id_producto='"+id2+"' GROUP BY nombre_producto";
        }
        //ResultSet rs=a.mostrardetalle(ssql);
        ResultSet rs=sqlmostrardatos(ssql);
        modeloLista.clear();
        String producto;
        int id;
       try {
           while(rs.next()){
               Rproductos datos= new Rproductos(rs.getInt("id_producto"),rs.getString("producto.nombre_producto"),0,0,0,"");
             modeloLista.addElement(datos);       
           }
           
       } catch (SQLException ex) {
           Logger.getLogger(MENU.class.getName()).log(Level.SEVERE, null, ex);
       }
         
    }
     
        
  public void buscardatos2(String idb){
          //busqueda y despliegue de datos sobre  jlist sabores
        String ssql;
        Registrar a = new Registrar();
        
        Rproductos dato=(Rproductos) listaproducto.getSelectedValue();
        if(idb.equals("vacio")){
        ssql="SELECT * FROM `producto`,sabor WHERE nombre_producto='"+dato.getProducto()+"' AND producto.id_sabor=sabor.id_sabor";
        }else{
        ssql="SELECT * FROM `producto`,sabor WHERE nombre_producto='"+dato.getProducto()+"' AND producto.id_sabor=sabor.id_sabor and id_producto LIKE '"+idb+"%'";
        }
        
        //ResultSet rs=a.mostrardetalle(ssql);
        ResultSet rs=sqlmostrardatos(ssql);
        modeloLista2.clear();
        try {
            String ssql2;
            
           while(rs.next()){
             
              
              Rproductos datos= new Rproductos(rs.getInt("id_sabor"),rs.getString("sabor"),0,0,0,"");
              modeloLista2.addElement(datos); 
               
           } 
            
       } catch (SQLException ex) {
           Logger.getLogger(MENU.class.getName()).log(Level.SEVERE, null, ex);
       }

    }
  
   public void buscardatos3(String idb){
          //busqueda y despliegue de datos sobre  jlist sabores
        String ssql;
        Registrar a = new Registrar();
        
        Rproductos dato=(Rproductos) listaproducto.getSelectedValue();
        Rproductos dato2=(Rproductos) listasabor.getSelectedValue();
        if(idb.equals("vacio")){
        ssql="SELECT * FROM `producto`,tamano WHERE nombre_producto='"+dato.getProducto()+"' AND producto.id_tamano=tamano.id_tamano and id_sabor='"+dato2.getId()+"'";
        }else{
        ssql="SELECT * FROM `producto`,tamano WHERE nombre_producto='"+dato.getProducto()+"' AND producto.id_tamano=tamano.id_tamano and  id_sabor='"+dato2.getId()+"' and id_producto LIKE '"+idb+"%'";
        }
        
        //ResultSet rs=a.mostrardetalle(ssql);
        ResultSet rs=sqlmostrardatos(ssql);
        modeloLista3.clear();
        try {
            String ssql2;
            
           while(rs.next()){
             
              
              Rproductos datos= new Rproductos(rs.getInt("id_tamano"),rs.getString("tamaño"),0,rs.getFloat("precio_venta"),rs.getInt("id_producto"),rs.getString("nombre_producto")+"-"+dato2.getProducto());
              modeloLista3.addElement(datos); 
               
           } 
            
       } catch (SQLException ex) {
           Logger.getLogger(MENU.class.getName()).log(Level.SEVERE, null, ex);
       }

    }
      
     
      
      
      private void capturardatos(String valor){
      
       //comprobamos de que caja de texto vienen los datos para poder hacer las busquedas
        if(cajadetexto==1){
        texto_producto.setText(texto_producto.getText()+valor);
        buscardatos1(texto_producto.getText(),p);
        }
        if(cajadetexto==2){
         texto_sabor.setText(texto_sabor.getText()+valor);
        buscardatos2(texto_sabor.getText());
        
        }
        if(cajadetexto==3){
         texto_tamano.setText(texto_tamano.getText()+valor);
       
         buscardatos3(texto_tamano.getText());
         
        }
      
      }
      
      
      
      public void datosatributos(){
        
          m=(DefaultTableModel) jTsabor.getModel();
        for (int i = 0; i < jTsabor.getRowCount(); i++) {
           m.removeRow(i);
           i-=1;
       } 
        int cuantos=jTsabor.getRowCount();
        if(cuantos==0){
        String ssql=null;
        
        
        jTsabor.setModel(m);  
        
       
        ssql="SELECT * FROM Sabor";
        Registrar a = new Registrar();
        //ResultSet rs=a.mostrardetalle(ssql);
        ResultSet rs=sqlmostrardatos(ssql);
        
        
       
       try {
           while(rs.next()){
                Atributos po= new Atributos(rs.getInt("id_sabor"),rs.getString("sabor"));
               m.addRow(new Object[]{false,po});
           }
           
       } catch (SQLException ex) {
           Logger.getLogger(MENU.class.getName()).log(Level.SEVERE, null, ex);
       }
        }
        
         }
      
      public void datosatributos2(){
          //en este metodo se carga la tabla se jTtamano que se encuentra en la pestana de productos
         m=(DefaultTableModel) jTtamano.getModel();
        for (int i = 0; i < jTtamano.getRowCount(); i++) {
           m.removeRow(i);
           i-=1;
       }
        String ssql=null;
       jTtamano.setModel(m);  
        ssql="SELECT * FROM tamano";
        Registrar a = new Registrar();
        //ResultSet rs=a.mostrardetalle(ssql);
        ResultSet rs=sqlmostrardatos(ssql);
        try {
           while(rs.next()){
                Atributos po= new Atributos(rs.getInt("id_tamano"),rs.getString("tamaño"));
               m.addRow(new Object[]{false,po});
           }
           
       } catch (SQLException ex) {
           Logger.getLogger(MENU.class.getName()).log(Level.SEVERE, null, ex);
       }
        
        
         }
      
      
   
      
      
            
          
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MENU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaceptar;
    private javax.swing.JButton btnbebidas;
    private javax.swing.JButton btncance;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btncancelar1;
    private javax.swing.JButton btncancelar2;
    private javax.swing.JButton btncasa;
    private javax.swing.JButton btnconos;
    private javax.swing.JButton btnelimina1;
    private javax.swing.JButton btnenvasados;
    private javax.swing.JButton btnfac;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnguardar1;
    private javax.swing.JButton btnguardar2;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btnnuevo1;
    private javax.swing.JButton btnnuevo2;
    private javax.swing.JButton btnpaletas;
    private javax.swing.JButton btnpasteles;
    private javax.swing.JButton btnsalir;
    private javax.swing.JButton btnsalir1;
    private javax.swing.JButton btnsalir2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox jCatributo;
    private javax.swing.JComboBox jCclase;
    private javax.swing.JComboBox jCmarca;
    private javax.swing.JComboBox jCpresentacion;
    private javax.swing.JComboBox jCtipop;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPap;
    private javax.swing.JPanel jPfac;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTbodega;
    public javax.swing.JTable jTpedido;
    private javax.swing.JTable jTsabor;
    private javax.swing.JTable jTtamano;
    private javax.swing.JTable jtproductos;
    private javax.swing.JLabel lbldes;
    private javax.swing.JLabel lblsubt;
    private javax.swing.JLabel lbltotal;
    private javax.swing.JList listaproducto;
    private javax.swing.JList listasabor;
    private javax.swing.JList listatamano;
    private javax.swing.JTextField texto_producto;
    private javax.swing.JTextField texto_sabor;
    private javax.swing.JTextField texto_tamano;
    private javax.swing.JComboBox<String> tipoProducto;
    private javax.swing.JTextField txtbusqueda;
    private javax.swing.JTextField txtbusqueda1;
    private javax.swing.JTextField txtbusquedap;
    private javax.swing.JTextField txtcanc;
    private javax.swing.JTextField txtcop;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtfechaf;
    private javax.swing.JTextField txtnit;
    private javax.swing.JTextField txtnofac;
    private javax.swing.JTextField txtprecioc;
    private javax.swing.JTextField txtproveedor;
    private javax.swing.JTextField txtserief;
    private javax.swing.JTextArea txttodo;
    private javax.swing.JTextField txttotal;
    private javax.swing.JTextField varbolas;
    // End of variables declaration//GEN-END:variables
}
