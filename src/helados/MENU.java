
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
import javax.swing.JOptionPane;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;


public class MENU extends javax.swing.JFrame {
  
    String tipo;
    String hacer="Modificar";
   private List<Catalogo> catalogo;
   private CatalogoTabla modelo;
   
   
   
       
    public MENU() {
        initComponents();
         
        tipoProducto.removeAllItems();
        tipo();
        catalogo=new ArrayList();
        
        //Guardo el Item Seleccionado de mi comboBox llamado tipoProducto.
        this.tipo = tipoProducto.getSelectedItem().toString();
        txtbusqueda.setText("... INGRESE PRODUCTO A BUSCAR ....");
        jButton5.setEnabled(false);
        btnguardar.setEnabled(false);
       
    }
    
    //Los Tipos de Productos quedaron Quemados a Codigo deacuerdo a los Requerimientos. 
   public void tipo(){
        // se Agregagon los Tipos de productos al ComboBox y aplica el evento itemstatechanged para cargar datos cada vez que se tena un cambio 
        
    tipoProducto.addItemListener(new ItemListener() {
    @Override
    public void itemStateChanged(ItemEvent ie) {
        cargardatos(tipoProducto.getSelectedItem().toString(),"");
        cargardatos2(tipoProducto.getSelectedItem().toString(),"");
        txtbusqueda.setText("... INGRESE PRODUCTO A BUSCAR ....");
        jButton5.setEnabled(false);
        btnguardar.setEnabled(false);
    }
       });
        
                tipoProducto.addItem("Opciones");
                tipoProducto.addItem("Tipo Producto");
                tipoProducto.addItem("Tamaño");
                tipoProducto.addItem("Marca");
           
          }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        btnconos = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btnnuevo = new javax.swing.JButton();
        txtbusqueda = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        tipoProducto = new javax.swing.JComboBox<>();
        jTabbedPane4 = new javax.swing.JTabbedPane();

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

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Pedido:"));

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.setCellSelectionEnabled(true);
        jScrollPane2.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        jButton14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton14.setText("CANCELAR");

        jButton15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton15.setText("QUITAR PRODUCTO");

        jButton27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton27.setText("OK - REGISTRO");

        jButton28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton28.setText("OK - FACTURAR");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton15)
                            .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton7.setText("PALETAS");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton12.setText("BEBIDAS");

        jButton16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton16.setText("PARA LA CASA");

        jButton17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton17.setText("PASTELES");

        jButton19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton19.setText("ENVASADO");

        btnconos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnconos.setText("CONOS");
        btnconos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconosActionPerformed(evt);
            }
        });

        jButton21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton21.setText("ESPECIALES");

        jButton22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton22.setText("YOGOURT");

        jButton23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton23.setText("+");

        jButton24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton24.setText("YOGOURT");

        jButton25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton25.setText("PROMOCIÓN");

        jButton26.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton26.setText("ARMAR");

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
            .addGap(0, 278, Short.MAX_VALUE)
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
                    .addContainerGap(132, Short.MAX_VALUE)))
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnconos, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 204, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnconos, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(160, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane5.addTab("VENTAS", jPanel1);

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

        btnnuevo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnnuevo.setText("NUEVO");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

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
        jLabel1.setText(" BUSCAR:");

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

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(302, Short.MAX_VALUE)
                .addComponent(btnnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(btncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(tipoProducto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(55, 55, 55)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 793, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtbusqueda)))
                .addGap(40, 40, 40))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(tipoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(372, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("BODEGA", jPanel7);
        jTabbedPane5.addTab("PRECIOS", jTabbedPane4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane5)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane5)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     public void cargardatos2(String opcion,String busqueda){
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
     
       try {
           while(rs.next()){
    modelotabla.addRow(new Object[]{rs.getString("id_marcar"),rs.getString("nombre_marca"),rs.getString("descripcion_marca")});
          
           }
          
           
       } catch (SQLException ex) {
           Logger.getLogger(SABORES_HELADO.class.getName()).log(Level.SEVERE, null, ex);
       }
       
       
       
        }
    
   
    }
     
     
     public void nuevo2(String opcion,String busqueda){
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
      modelotabla.addRow(new Object[]{"","",""});
       try {
           while(rs.next()){
    modelotabla.addRow(new Object[]{rs.getString("id_marcar"),rs.getString("nombre_marca"),rs.getString("descripcion_marca")});
          
           }
          
           
       } catch (SQLException ex) {
           Logger.getLogger(SABORES_HELADO.class.getName()).log(Level.SEVERE, null, ex);
       }
       
       
       
        }
    
   
    }
    
    public void nuevo3(String opcion,String busqueda){
        
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
       modelotabla.addRow(new Object[]{"","",""});
       try {
           while(rs.next()){
      modelotabla.addRow(new Object[]{rs.getString("id_tipo_producto"),rs.getString("nombre_producto"),rs.getString("descripcion_producto")});
           }
           
       } catch (SQLException ex) {
           Logger.getLogger(SABORES_HELADO.class.getName()).log(Level.SEVERE, null, ex);
       }
        }
    
   
    }
    
     public void cargardatos(String opcion,String busqueda){
        
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
       
       try {
           while(rs.next()){
      modelotabla.addRow(new Object[]{rs.getString("id_tipo_producto"),rs.getString("nombre_producto"),rs.getString("descripcion_producto")});
           }
           
       } catch (SQLException ex) {
           Logger.getLogger(SABORES_HELADO.class.getName()).log(Level.SEVERE, null, ex);
       }
        }
    
   
    }
    
    
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
       
       
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void txtbusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbusquedaActionPerformed
        // TODO add your handling code here:
      
        
    }//GEN-LAST:event_txtbusquedaActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        nuevo2(tipoProducto.getSelectedItem().toString(),"");
        nuevo3(tipoProducto.getSelectedItem().toString(),"");
        hacer="Nuevo";
        jButton5.setEnabled(false);
        
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void tipoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoProductoActionPerformed
        // TODO add your andling code here:
       
        
         
    }//GEN-LAST:event_tipoProductoActionPerformed

    
  
    
    private void tipoProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tipoProductoMouseClicked
        // TODO add your handling code here:
        
       
        
    }//GEN-LAST:event_tipoProductoMouseClicked

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {                                          

    }                                         

    private void btnconosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconosActionPerformed
        // TODO add your handling code here:
        this.setEnabled(true);
    }//GEN-LAST:event_btnconosActionPerformed
        
  
    
    
    private void tipoProductoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tipoProductoItemStateChanged
        
      
        
    }//GEN-LAST:event_tipoProductoItemStateChanged
        
          
    private void txtbusquedaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbusquedaKeyPressed
           
          
    }//GEN-LAST:event_txtbusquedaKeyPressed

    private void txtbusquedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtbusquedaMouseClicked
       
        
       
        
    }//GEN-LAST:event_txtbusquedaMouseClicked

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
       String resultado= registrar.Elimina(ssql);
       JOptionPane.showMessageDialog(null, resultado);
      
        cargardatos(tipoProducto.getSelectedItem().toString(),"");
        cargardatos2(tipoProducto.getSelectedItem().toString(),"");
        txtbusqueda.setText("... INGRESE PRODUCTO A BUSCAR ....");
        jButton5.setEnabled(false);
        btnguardar.setEnabled(false);
        
        }
        
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
       jButton5.setEnabled(true);
       btnguardar.setEnabled(true);
    }//GEN-LAST:event_jTable2MouseClicked

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        txtbusqueda.setText("... INGRESE PRODUCTO A BUSCAR ....");
        cargardatos(tipoProducto.getSelectedItem().toString(),"");
        cargardatos2(tipoProducto.getSelectedItem().toString(),"");
        jButton5.setEnabled(false);
        btnguardar.setEnabled(false);
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
        resultado=registrar.Modificando(ssql);
        }
        else{
           
        if(tipoProducto.getSelectedItem().toString().equals("Tipo Producto")){
        ssql="INSERT INTO `tipo_producto`(`nombre_producto`, `descripcion_producto`) VALUES ('"+nombre+"','"+descripcion+"')";
        }
        if(tipoProducto.getSelectedItem().toString().equals("Marca")){
        ssql="INSERT INTO `marca`(`nombre_marca`, `descripcion_marca`) VALUES ('"+nombre+"','"+descripcion+"')";    
        }
        resultado=registrar.R_Categoria(ssql);
        hacer="Modificar";
        }
        
         }
        else {
          
           
        } 
        JOptionPane.showMessageDialog(null, resultado);
        cargardatos(tipoProducto.getSelectedItem().toString(),"");
        cargardatos2(tipoProducto.getSelectedItem().toString(),"");
        jButton5.setEnabled(false);
        btnguardar.setEnabled(false);
        
    }//GEN-LAST:event_btnguardarActionPerformed

    private void txtbusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbusquedaKeyReleased
        // TODO add your handling code here:
        
          cargardatos(tipoProducto.getSelectedItem().toString(),txtbusqueda.getText());
          cargardatos2(tipoProducto.getSelectedItem().toString(),txtbusqueda.getText());
        
        
    }//GEN-LAST:event_txtbusquedaKeyReleased

    private void txtbusquedaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtbusquedaFocusGained
       
       txtbusqueda.setText("");
        
    }//GEN-LAST:event_txtbusquedaFocusGained

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
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btnconos;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JComboBox<String> tipoProducto;
    private javax.swing.JTextField txtbusqueda;
    // End of variables declaration//GEN-END:variables
}
