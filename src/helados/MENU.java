
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
import java.util.List;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;


public class MENU extends javax.swing.JFrame {
  
    String tipo;
    String hacer="Modificar";
    String hacer2="Modificar";
   private List<Catalogo> catalogo;
   private CatalogoTabla modelo;
   public static int valor=0;
   
   
   
       
    public MENU() {
        initComponents();
         
        tipoProducto.removeAllItems();
        tipo();
        catalogo=new ArrayList();
        
        //Guardo el Item Seleccionado de mi comboBox llamado tipoProducto.
        this.tipo = tipoProducto.getSelectedItem().toString();
        txtbusqueda.setText("... INGRESE PRODUCTO A BUSCAR ....");
        jButton5.setEnabled(false);
      //  btneliminarp.setEnabled(false);
        btnguardar.setEnabled(false);
      //  btnguardarp.setEnabled(false);
        cargardatosproducto("");
       
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
           
          }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btnpaletas = new javax.swing.JButton();
        btnbebidas = new javax.swing.JButton();
        btncasa = new javax.swing.JButton();
        btnpasteles = new javax.swing.JButton();
        btnenvasados = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btnconos = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jButton18 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtproductos = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        txtbusquedap = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        btnnuevop3 = new javax.swing.JButton();
        btneliminarp1 = new javax.swing.JButton();
        btnguardarp1 = new javax.swing.JButton();
        btncancelarp1 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        txtbusquedap1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        btnnuevop4 = new javax.swing.JButton();
        btneliminarp2 = new javax.swing.JButton();
        btnguardarp2 = new javax.swing.JButton();
        btncancelarp2 = new javax.swing.JButton();
        jTabbedPane4 = new javax.swing.JTabbedPane();
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

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

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

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("SUB-TOTAL:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Q");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Q");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("DESCUENTO:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("TOTAL:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Q");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addComponent(jLabel13)
                        .addComponent(jLabel10)
                        .addComponent(jLabel9))
                    .addContainerGap(305, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(13, 13, 13)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel9))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(jLabel10))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(jLabel13))
                    .addContainerGap(14, Short.MAX_VALUE)))
        );

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

        jTable4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "CANT.", "DESCRIPCIÓN", "PRECIO UNIDAD"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable4.setCellSelectionEnabled(true);
        jScrollPane5.setViewportView(jTable4);
        jTable4.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        jButton18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton18.setText("CANCELAR");

        jButton20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton20.setText("QUITAR PRODUCTO");

        jButton29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton29.setText("OK - REGISTRO");

        jButton30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton30.setText("OK - FACTURAR");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton20)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
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
            .addGap(0, 302, Short.MAX_VALUE)
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
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 302, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnpaletas, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnpasteles, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnbebidas, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncasa, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnenvasados, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnconos, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLayeredPane1)
                    .addComponent(jLayeredPane3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLayeredPane2)
                .addGap(1306, 1306, 1306)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(889, 889, 889))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
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
                                .addComponent(btnbebidas, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(btnenvasados, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLayeredPane2))))
                .addContainerGap(144, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("VENTAS", jPanel1);

        jtproductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Descripcion", "Tipo", "Marca"
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
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtbusquedap, javax.swing.GroupLayout.PREFERRED_SIZE, 857, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbusquedap, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable3);

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Controles", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        btnnuevop3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnnuevop3.setText("NUEVO");
        btnnuevop3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevop3ActionPerformed(evt);
            }
        });

        btneliminarp1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btneliminarp1.setText("ELIMINAR");
        btneliminarp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarp1ActionPerformed(evt);
            }
        });

        btnguardarp1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnguardarp1.setText("GUARDAR");
        btnguardarp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarp1ActionPerformed(evt);
            }
        });

        btncancelarp1.setText("CANCELAR");
        btncancelarp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarp1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnnuevop3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btneliminarp1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnguardarp1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncancelarp1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnnuevop3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btneliminarp1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnguardarp1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btncancelarp1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Busquedas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        txtbusquedap1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtbusquedap1.setText("... INGRESE PRODUCTO A BUSCAR ....");
        txtbusquedap1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtbusquedap1FocusGained(evt);
            }
        });
        txtbusquedap1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtbusquedap1MouseClicked(evt);
            }
        });
        txtbusquedap1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbusquedap1ActionPerformed(evt);
            }
        });
        txtbusquedap1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtbusquedap1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbusquedap1KeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Elemento a Buscar:");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(txtbusquedap1, javax.swing.GroupLayout.PREFERRED_SIZE, 857, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbusquedap1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Controles", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        btnnuevop4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnnuevop4.setText("NUEVO");
        btnnuevop4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevop4ActionPerformed(evt);
            }
        });

        btneliminarp2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btneliminarp2.setText("ELIMINAR");
        btneliminarp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarp2ActionPerformed(evt);
            }
        });

        btnguardarp2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnguardarp2.setText("GUARDAR");
        btnguardarp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarp2ActionPerformed(evt);
            }
        });

        btncancelarp2.setText("CANCELAR");
        btncancelarp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarp2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnnuevop4, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btneliminarp2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnguardarp2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btncancelarp2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnnuevop4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btneliminarp2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnguardarp2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btncancelarp2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(300, 300, 300)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("PRODUCTOS", jPanel3);

        jTabbedPane4.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jTabbedPane4ComponentAdded(evt);
            }
        });
        jTabbedPane4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTabbedPane4FocusGained(evt);
            }
        });
        jTabbedPane4.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTabbedPane4ComponentShown(evt);
            }
        });
        jTabbedPane5.addTab("PRECIOS", jTabbedPane4);

        jTable2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Detalle"
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
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable2.getColumnModel().getColumn(1).setPreferredWidth(350);
            jTable2.getColumnModel().getColumn(2).setPreferredWidth(350);
        }

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
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Controles", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        btnnuevo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnnuevo.setText("NUEVO");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setText("ELIMINAR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        btnguardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnguardar.setText("GUARDAR");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btncancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btncancelar.setText("CANCELAR");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(btncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btncancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(btnguardar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnnuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tipoProducto, 0, 310, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(tipoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(334, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("ADMIN", jPanel7);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 1239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane5)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tipoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoProductoActionPerformed
        // TODO add your andling code here:
    }//GEN-LAST:event_tipoProductoActionPerformed

    private void tipoProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tipoProductoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoProductoMouseClicked

    private void tipoProductoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tipoProductoItemStateChanged

    }//GEN-LAST:event_tipoProductoItemStateChanged

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

            String id=(String) jTable2.getValueAt(row, 0);
            String nombre=(String) jTable2.getValueAt(row, 1);
            String descripcion=(String) jTable2.getValueAt(row, 2);
            if(hacer.equals("Modificar")){
                if(tipoProducto.getSelectedItem().toString().equals("Tipo Producto")){
                    ssql="UPDATE `tipo_producto` SET nombre_producto='"+nombre+"', descripcion_producto='"+descripcion+"' WHERE id_tipo_producto="+id;}
                if(tipoProducto.getSelectedItem().toString().equals("Marca")){
                    ssql="UPDATE marca SET  nombre_marca='"+nombre+"', descripcion_marca='"+descripcion+"' WHERE id_marcar="+id;
                }
                if(tipoProducto.getSelectedItem().toString().equals("Roll")){
                    ssql="UPDATE roll SET  tag_rol='"+nombre+"', descripcion_rol='"+descripcion+"' WHERE id_rol="+id;
                }
                if(tipoProducto.getSelectedItem().toString().equals("Atributos")){
                    String tag=(String) jTable2.getValueAt(row, 3);
                    ssql="UPDATE atributo SET  nombre_atributo='"+nombre+"', descripcion_atributo='"+descripcion+"', num_atributo='"+tag+"' WHERE id_atributo="+id;
                }
                if(tipoProducto.getSelectedItem().toString().equals("Tipo Documento")){
                    String tag=(String) jTable2.getValueAt(row, 3);
                    ssql="UPDATE tipo SET  tipo='"+nombre+"', describe_tipo='"+descripcion+"', tag_tipo='"+tag+"' WHERE id_tipo="+id;
                }
                if(tipoProducto.getSelectedItem().toString().equals("Clases")){
                    String tag=(String) jTable2.getValueAt(row, 3);
                    String por=(String) jTable2.getValueAt(row, 4);
                    ssql="UPDATE clase SET  tag_clase='"+nombre+"', clase='"+descripcion+"', descripción_clase='"+tag+"', porciento_clase='"+por+"' WHERE id_clase="+id;
                }
                resultado=registrar.Modificando(ssql);
            }
            else{

                if(tipoProducto.getSelectedItem().toString().equals("Tipo Producto")){
                    ssql="INSERT INTO `tipo_producto`(`nombre_producto`, `descripcion_producto`) VALUES ('"+nombre+"','"+descripcion+"')";
                }
                if(tipoProducto.getSelectedItem().toString().equals("Marca")){
                    ssql="INSERT INTO `marca`(`nombre_marca`, `descripcion_marca`) VALUES ('"+nombre+"','"+descripcion+"')";
                }
                if(tipoProducto.getSelectedItem().toString().equals("Roll")){
                    ssql="INSERT INTO `roll`(`tag_rol`, `descripcion_rol`) VALUES ('"+nombre+"','"+descripcion+"')";
                }
                if(tipoProducto.getSelectedItem().toString().equals("Atributos")){
                    String tag=(String) jTable2.getValueAt(row, 3);
                    ssql="INSERT INTO `atributo`(`nombre_atributo`, `descripcion_atributo`,num_atributo) VALUES ('"+nombre+"','"+descripcion+"','"+tag+"')";
                }
                if(tipoProducto.getSelectedItem().toString().equals("Tipo Documento")){
                    String tag=(String) jTable2.getValueAt(row, 3);
                    ssql="INSERT INTO `tipo`(`tipo`, `describe_tipo`, `tag_tipo`) VALUES ('"+nombre+"','"+descripcion+"','"+tag+"')";
                }
                if(tipoProducto.getSelectedItem().toString().equals("Clases")){
                    String tag=(String) jTable2.getValueAt(row, 3);
                    String por=(String) jTable2.getValueAt(row, 4);
                    ssql="INSERT INTO `clase`(`tag_clase`, clase ,`descripción_clase`, `porciento_clase`) VALUES ('"+nombre+"','"+descripcion+"','"+tag+"','"+por+"')";
                }
                resultado=registrar.R_Categoria(ssql);
                hacer="Modificar";
            }

        }
        
       
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
                String resultado= registrar.Elimina(ssql);
                JOptionPane.showMessageDialog(null, resultado);

                llamada(tipoProducto.getSelectedItem().toString(),"","Mostrar");
                txtbusqueda.setText("... INGRESE PRODUCTO A BUSCAR ....");
                jButton5.setEnabled(false);
                btnguardar.setEnabled(false);

            }

        }
    }//GEN-LAST:event_jButton5ActionPerformed

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

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
       llamada(tipoProducto.getSelectedItem().toString(),"","Nuevo");
        hacer="Nuevo";
        jButton5.setEnabled(false);
        btnnuevo.setEnabled(false);
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        jButton5.setEnabled(true);
        btnguardar.setEnabled(true);
    }//GEN-LAST:event_jTable2MouseClicked

    private void btnconosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconosActionPerformed
        // TODO add your handling code here:
        this.setEnabled(true);
    }//GEN-LAST:event_btnconosActionPerformed

    private void btnpaletasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpaletasActionPerformed
       valor=1; 
       SABORES_HELADO ventana= new SABORES_HELADO();
       ventana.setVisible(true);
       this.setEnabled(false);
    }//GEN-LAST:event_btnpaletasActionPerformed

    private void txtbusquedapFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtbusquedapFocusGained
        txtbusquedap.setText("");
    }//GEN-LAST:event_txtbusquedapFocusGained

    private void txtbusquedapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtbusquedapMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbusquedapMouseClicked

    private void txtbusquedapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbusquedapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbusquedapActionPerformed

    private void txtbusquedapKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbusquedapKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbusquedapKeyPressed

    private void txtbusquedapKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbusquedapKeyReleased
       cargardatosproducto(txtbusquedap.getText());
    }//GEN-LAST:event_txtbusquedapKeyReleased

    private void jtproductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtproductosMouseClicked
        
        
       // btneliminarp.setEnabled(true);
      //  btnguardarp.setEnabled(true);
        
        
    }//GEN-LAST:event_jtproductosMouseClicked

    private void jTabbedPane4ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTabbedPane4ComponentShown
            // TODO add your handling code here:
            
    }//GEN-LAST:event_jTabbedPane4ComponentShown

    private void jTabbedPane4ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jTabbedPane4ComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane4ComponentAdded

    private void jTabbedPane4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTabbedPane4FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane4FocusGained

    private void btnnuevop3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevop3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnnuevop3ActionPerformed

    private void btneliminarp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarp1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btneliminarp1ActionPerformed

    private void btnguardarp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarp1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnguardarp1ActionPerformed

    private void btncancelarp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarp1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btncancelarp1ActionPerformed

    private void txtbusquedap1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtbusquedap1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbusquedap1FocusGained

    private void txtbusquedap1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtbusquedap1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbusquedap1MouseClicked

    private void txtbusquedap1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbusquedap1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbusquedap1ActionPerformed

    private void txtbusquedap1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbusquedap1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbusquedap1KeyPressed

    private void txtbusquedap1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbusquedap1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbusquedap1KeyReleased

    private void btnnuevop4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevop4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnnuevop4ActionPerformed

    private void btneliminarp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarp2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btneliminarp2ActionPerformed

    private void btnguardarp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarp2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnguardarp2ActionPerformed

    private void btncancelarp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarp2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btncancelarp2ActionPerformed

    private void btnpastelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpastelesActionPerformed
       valor=2; 
       SABORES_HELADO ventana= new SABORES_HELADO();
       ventana.setVisible(true);
       this.setEnabled(false);
    }//GEN-LAST:event_btnpastelesActionPerformed

    private void btncasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncasaActionPerformed
      valor=3; 
       SABORES_HELADO ventana= new SABORES_HELADO();
       ventana.setVisible(true);
       this.setEnabled(false);
    }//GEN-LAST:event_btncasaActionPerformed

    private void btnbebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbebidasActionPerformed
        valor=5; 
       SABORES_HELADO ventana= new SABORES_HELADO();
       ventana.setVisible(true);
       this.setEnabled(false);
    }//GEN-LAST:event_btnbebidasActionPerformed

    private void btnenvasadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnenvasadosActionPerformed
       valor=4; 
       SABORES_HELADO ventana= new SABORES_HELADO();
       ventana.setVisible(true);
       this.setEnabled(false);
    }//GEN-LAST:event_btnenvasadosActionPerformed

    
    private void llamada(String opcion,String busqueda,String M){
        datosTipoP(opcion,busqueda,M);
        datosMarca(opcion,busqueda,M);
        datosRoll(opcion,busqueda,M);
        datosAtri(opcion,busqueda,M);
        datosTipoD(opcion,busqueda,M);
        datosClase(opcion,busqueda,M);
    
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
        TableColumnModel columnModel = jTable2.getColumnModel();

        columnModel.getColumn(0).setPreferredWidth(75);
        columnModel.getColumn(1).setPreferredWidth(250);
        columnModel.getColumn(2).setPreferredWidth(460);
        ssql="select * from venta_helados.marca where nombre_marca LIKE '"+busqueda+"%' ";
        Registrar a = new Registrar();
        ResultSet rs=a.mostrardetalle(ssql);
      if(M.equals("Nuevo")){
        modelotabla.addRow(new Object[]{"","",""});}
       try {
           while(rs.next()){
    modelotabla.addRow(new Object[]{rs.getString("id_marcar"),rs.getString("nombre_marca"),rs.getString("descripcion_marca")});
          
           }
          
           
       } catch (SQLException ex) {
           Logger.getLogger(SABORES_HELADO.class.getName()).log(Level.SEVERE, null, ex);
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
        modelotabla.addColumn("tag");
        modelotabla.addColumn("clase");
        modelotabla.addColumn("Descripcion");
        modelotabla.addColumn("Porcentaje");
        TableColumnModel columnModel = jTable2.getColumnModel();

        ssql="select * from venta_helados.clase where tag_clase LIKE '"+busqueda+"%' ";
        Registrar a = new Registrar();
        ResultSet rs=a.mostrardetalle(ssql);
      if(M.equals("Nuevo")){
        modelotabla.addRow(new Object[]{"","","","",""});}
       try {
           while(rs.next()){
    modelotabla.addRow(new Object[]{rs.getString("id_clase"),rs.getString("tag_clase"),rs.getString("clase"),rs.getString("descripción_clase"),rs.getString("porciento_clase")});
          
           }
          
           
       } catch (SQLException ex) {
           Logger.getLogger(SABORES_HELADO.class.getName()).log(Level.SEVERE, null, ex);
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
        modelotabla.addColumn("Tipo");
        modelotabla.addColumn("Descripcion");
        modelotabla.addColumn("Tag");
        TableColumnModel columnModel = jTable2.getColumnModel();

        columnModel.getColumn(0).setPreferredWidth(75);
        columnModel.getColumn(1).setPreferredWidth(250);
        columnModel.getColumn(2).setPreferredWidth(460);
        ssql="select * from venta_helados.tipo where tag_tipo LIKE '"+busqueda+"%' ";
        Registrar a = new Registrar();
        ResultSet rs=a.mostrardetalle(ssql);
      if(M.equals("Nuevo")){
        modelotabla.addRow(new Object[]{"","","",""});}
       try {
           while(rs.next()){
    modelotabla.addRow(new Object[]{rs.getString("id_tipo"),rs.getString("tipo"),rs.getString("describe_tipo"),rs.getString("tag_tipo")});
          
           }
          
           
       } catch (SQLException ex) {
           Logger.getLogger(SABORES_HELADO.class.getName()).log(Level.SEVERE, null, ex);
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
        modelotabla.addColumn("Forma");
        modelotabla.addColumn("Descripcion");
        modelotabla.addColumn("Tipo");
        TableColumnModel columnModel = jTable2.getColumnModel();

        columnModel.getColumn(0).setPreferredWidth(75);
        columnModel.getColumn(1).setPreferredWidth(250);
        columnModel.getColumn(2).setPreferredWidth(460);
        ssql="select * from venta_helados.atributo where nombre_atributo LIKE '"+busqueda+"%' ";
        Registrar a = new Registrar();
        ResultSet rs=a.mostrardetalle(ssql);
      if(M.equals("Nuevo")){
        modelotabla.addRow(new Object[]{"","","",""});}
       try {
           while(rs.next()){
    modelotabla.addRow(new Object[]{rs.getString("id_atributo"),rs.getString("nombre_atributo"),rs.getString("descripcion_atributo"),rs.getString("num_atributo")});
          
           }
          
           
       } catch (SQLException ex) {
           Logger.getLogger(SABORES_HELADO.class.getName()).log(Level.SEVERE, null, ex);
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
        modelotabla.addColumn("Tag");
        modelotabla.addColumn("Descripcion");
        TableColumnModel columnModel = jTable2.getColumnModel();

        columnModel.getColumn(0).setPreferredWidth(75);
        columnModel.getColumn(1).setPreferredWidth(200);
        columnModel.getColumn(2).setPreferredWidth(400);
        ssql="select * from venta_helados.roll where tag_rol LIKE '"+busqueda+"%' ";
        Registrar a = new Registrar();
        ResultSet rs=a.mostrardetalle(ssql);
      if(M.equals("Nuevo")){
        modelotabla.addRow(new Object[]{"","",""});}
       try {
           while(rs.next()){
      modelotabla.addRow(new Object[]{rs.getString("id_rol"),rs.getString("tag_rol"),rs.getString("descripcion_rol")});
          
           }
          
           
       } catch (SQLException ex) {
           Logger.getLogger(SABORES_HELADO.class.getName()).log(Level.SEVERE, null, ex);
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
        TableColumnModel columnModel = jTable2.getColumnModel();

        columnModel.getColumn(0).setPreferredWidth(75);
        columnModel.getColumn(1).setPreferredWidth(250);
        columnModel.getColumn(2).setPreferredWidth(460);
        ssql="select * from venta_helados.tipo_producto where nombre_producto LIKE '"+busqueda+"%' ";
        Registrar a = new Registrar();
        ResultSet rs=a.mostrardetalle(ssql);
         if(M.equals("Nuevo")){
        modelotabla.addRow(new Object[]{"","",""});}
       
       try {
           while(rs.next()){
      modelotabla.addRow(new Object[]{rs.getString("id_tipo_producto"),rs.getString("nombre_producto"),rs.getString("descripcion_producto")});
           }
           
       } catch (SQLException ex) {
           Logger.getLogger(SABORES_HELADO.class.getName()).log(Level.SEVERE, null, ex);
       }
        }
    
   
    }
     
     
     
     public void cargardatosproducto(String busqueda){
        
         String ssql=null;
        jtproductos.removeAll();
        //despliegue de datos en la tabla de productos
        
          DefaultTableModel modelotablap = new DefaultTableModel(){
    public boolean isCellEditable(int rowIndex,int columnIndex){
        return columnIndex!=0;
    
    
    }
};
        jtproductos.setModel(modelotablap);  
        modelotablap.addColumn("Codigo");
        modelotablap.addColumn("Nombre");
        modelotablap.addColumn("Descripcion");
        modelotablap.addColumn("Tipo");
        modelotablap.addColumn("Marca");
        TableColumnModel columnModelp = jtproductos.getColumnModel();
        

        columnModelp.getColumn(0).setPreferredWidth(75);
        columnModelp.getColumn(1).setPreferredWidth(250);
        columnModelp.getColumn(2).setPreferredWidth(350);
        ssql="SELECT producto.id_producto,producto.nombre_producto, producto.descripcion_producto,tipo_producto.id_tipo_producto, tipo_producto.nombre_producto, marca.nombre_marca, marca.id_marcar FROM producto, tipo_producto, marca WHERE producto.id_tipo_producto=tipo_producto.id_tipo_producto AND marca.id_marcar=producto.id_marcar and producto.nombre_producto LIKE '"+busqueda+"%' ";
        Registrar a = new Registrar();
        ResultSet rs=a.mostrardetalle(ssql);
       
       try {
           while(rs.next()){
           Catalogo datos= new Catalogo(rs.getInt("tipo_producto.id_tipo_producto"),rs.getString("tipo_producto.nombre_producto"),"");    
           Catalogo datos2= new Catalogo(rs.getInt("marca.id_marcar"),rs.getString("marca.nombre_marca"),""); 
           modelotablap.addRow(new Object[]{rs.getString("id_producto"),rs.getString("nombre_producto"),rs.getString("descripcion_producto"), datos,datos2});
        
      
           }
           columnModelp.getColumn(3).setCellEditor(new DefaultCellEditor(generateBox()));
      columnModelp.getColumn(4).setCellEditor(new DefaultCellEditor(generateBoxm()));
           
       } catch (SQLException ex) {
           Logger.getLogger(SABORES_HELADO.class.getName()).log(Level.SEVERE, null, ex);
       }
        
    
   
    }
    
    public void cargardatosproductoN(String busqueda){
        
         String ssql=null;
        jtproductos.removeAll();
        //despliegue de datos en la tabla de productos
        
          DefaultTableModel modelotablap = new DefaultTableModel(){
    public boolean isCellEditable(int rowIndex,int columnIndex){
        return columnIndex!=0;
    
    
    }
};
        jtproductos.setModel(modelotablap);  
        modelotablap.addColumn("Codigo");
        modelotablap.addColumn("Nombre");
        modelotablap.addColumn("Descripcion");
        modelotablap.addColumn("Tipo");
        modelotablap.addColumn("Marca");
        TableColumnModel columnModelp = jtproductos.getColumnModel();
        columnModelp.getColumn(0).setPreferredWidth(75);
        columnModelp.getColumn(1).setPreferredWidth(250);
        columnModelp.getColumn(2).setPreferredWidth(350);
        ssql="SELECT producto.id_producto,producto.nombre_producto, producto.descripcion_producto,tipo_producto.id_tipo_producto, tipo_producto.nombre_producto, marca.nombre_marca, marca.id_marcar FROM producto, tipo_producto, marca WHERE producto.id_tipo_producto=tipo_producto.id_tipo_producto AND marca.id_marcar=producto.id_marcar and producto.nombre_producto LIKE '"+busqueda+"%' ";
        Registrar a = new Registrar();
        ResultSet rs=a.mostrardetalle(ssql);
        Catalogo datos= new Catalogo(0,"","");    
        Catalogo datos2;
        modelotablap.addRow(new Object[]{"","","",datos,null});
       try {
           while(rs.next()){
           datos= new Catalogo(rs.getInt("tipo_producto.id_tipo_producto"),rs.getString("tipo_producto.nombre_producto"),"");    
           datos2= new Catalogo(rs.getInt("marca.id_marcar"),rs.getString("marca.nombre_marca"),"");    
           
           modelotablap.addRow(new Object[]{rs.getString("id_producto"),rs.getString("nombre_producto"),rs.getString("descripcion_producto"), datos,datos2});
      
           }
           columnModelp.getColumn(3).setCellEditor(new DefaultCellEditor(generateBox()));
      columnModelp.getColumn(4).setCellEditor(new DefaultCellEditor(generateBoxm()));
       } catch (SQLException ex) {
           Logger.getLogger(SABORES_HELADO.class.getName()).log(Level.SEVERE, null, ex);
       }
        
    
   
    }
     
     private JComboBox generateBox()
 {
     JComboBox bx=null;
    
     try
     {
         String ssql="select * from tipo_producto";
        Registrar a = new Registrar();
        ResultSet rs=a.mostrardetalle(ssql);
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
    
      private JComboBox generateBoxm()
 {
     JComboBox bx=null;
    
     try
     {
         String ssql="select * from marca";
        Registrar a = new Registrar();
        ResultSet rs=a.mostrardetalle(ssql);
        bx=new JComboBox();
         while(rs.next()){
             Catalogo datos= new Catalogo(rs.getInt("id_marcar"),rs.getString("nombre_marca"),"");
             bx.addItem(datos);
         }
       
     }catch(Exception x)
     {
         System.out.println(x.getMessage());
     }
             return bx;

 }
  
    
    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {                                          

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
    private javax.swing.JButton btnbebidas;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btncancelarp1;
    private javax.swing.JButton btncancelarp2;
    private javax.swing.JButton btncasa;
    private javax.swing.JButton btnconos;
    private javax.swing.JButton btneliminarp1;
    private javax.swing.JButton btneliminarp2;
    private javax.swing.JButton btnenvasados;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnguardarp1;
    private javax.swing.JButton btnguardarp2;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btnnuevop3;
    private javax.swing.JButton btnnuevop4;
    private javax.swing.JButton btnpaletas;
    private javax.swing.JButton btnpasteles;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton5;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jtproductos;
    private javax.swing.JComboBox<String> tipoProducto;
    private javax.swing.JTextField txtbusqueda;
    private javax.swing.JTextField txtbusquedap;
    private javax.swing.JTextField txtbusquedap1;
    // End of variables declaration//GEN-END:variables
}
