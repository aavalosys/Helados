package helados;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class SABORES_HELADO extends javax.swing.JFrame {

    DefaultListModel modeloLista = new DefaultListModel(); 
    DefaultListModel modeloLista2 = new DefaultListModel(); 
    DefaultListModel modeloLista3 = new DefaultListModel();
    public String des ;
    public SABORES_HELADO() {
        initComponents();
        //instancia de las listas 
        modeloLista = new DefaultListModel();
        listaproducto.setModel(modeloLista);
        
        modeloLista2 = new DefaultListModel();
        listasabor.setModel(modeloLista2);
        
        modeloLista3 = new DefaultListModel();
        listatamano.setModel(modeloLista3);
        
        
      cargardatos();
      buscardatos2("vacio");
      buscardatos3("vacio");
       
  
    }
    
    int cajadetexto=0;// sirve para capturar donde estamos ingresando codigos
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton6 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton18 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        txttodo = new javax.swing.JTextArea();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        varbolas = new javax.swing.JTextField();
        jButton22 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listatamano = new javax.swing.JList();
        texto_producto = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        listasabor = new javax.swing.JList();
        texto_tamano = new javax.swing.JTextField();
        texto_sabor = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        listaproducto = new javax.swing.JList();

        jButton6.setText("PALETA");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Helados Conos"));

        jButton18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton18.setText("+HELADO");
        jButton18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton18MouseClicked(evt);
            }
        });
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        txttodo.setColumns(20);
        txttodo.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txttodo.setRows(5);
        jScrollPane4.setViewportView(txttodo);

        jButton19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton19.setText("ATRAS");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton20.setText("-HELADO");
        jButton20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton20MouseClicked(evt);
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

        jButton22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton22.setText("OK - REGRESAR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(varbolas, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                    .addComponent(jButton19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(varbolas, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

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
        jScrollPane1.setViewportView(listatamano);

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

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Teclado en Pantalla"));

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

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setText("6");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
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
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        jScrollPane3.setViewportView(listasabor);

        texto_tamano.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        texto_tamano.setText("TAMAÑO");
        texto_tamano.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                texto_tamanoMouseClicked(evt);
            }
        });

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

        listaproducto.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        listaproducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaproductoMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(listaproducto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                            .addComponent(texto_producto))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(texto_sabor, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(texto_tamano, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(texto_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(texto_sabor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(texto_tamano, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void varbolasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varbolasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_varbolasActionPerformed

    private void jButton18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton18MouseClicked
        
        int a = Integer.valueOf(varbolas.getText());
        varbolas.setText(String.valueOf(1+a));        // TODO add your handling code here:
    }//GEN-LAST:event_jButton18MouseClicked

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton18ActionPerformed

    private void varbolasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_varbolasMouseClicked
             // TODO add your handling code here:
    }//GEN-LAST:event_varbolasMouseClicked

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
     
        
    
    }//GEN-LAST:event_formFocusGained

    private void texto_productoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_texto_productoFocusGained
        texto_producto.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_texto_productoFocusGained

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
    varbolas.setText("0");        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void jButton20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton20MouseClicked
        int a = Integer.valueOf(varbolas.getText());
        varbolas.setText(String.valueOf(a-1));        // TODO add your handling code here:
    }//GEN-LAST:event_jButton20MouseClicked

    private void texto_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texto_productoActionPerformed
       
        
    }//GEN-LAST:event_texto_productoActionPerformed

    
    public void cargardatos(){
    
        //despliegue de datos en la tabla de productos
        Registrar a = new Registrar();
        String ssql="select * from venta_helados.producto";
        ResultSet rs=a.mostrardetalle(ssql);
        modeloLista.clear();
        String producto;
        int id;
       try {
           while(rs.next()){
               producto=rs.getString("nombre_producto");
               id=rs.getInt("id_producto");
               modeloLista.addElement(id+" - "+producto);       
           }
           
       } catch (SQLException ex) {
           Logger.getLogger(SABORES_HELADO.class.getName()).log(Level.SEVERE, null, ex);
       }
         
    }
    
      public void buscardatos1(String id){
          //busqueda y despliegue de datos sobre  jlist de producto
        Registrar a = new Registrar();
        String ssql="select * from venta_helados.tipo_producto where id_tipo_producto="+id;
        ResultSet rs=a.mostrardetalle(ssql);
        modeloLista.clear();
        try {
           while(rs.next()){
               modeloLista.addElement(rs.getString("nombre"));       
           }
       } catch (SQLException ex) {
           Logger.getLogger(SABORES_HELADO.class.getName()).log(Level.SEVERE, null, ex);
       }
       
        
    }
     
      public void buscardatos2(String id){
          //busqueda y despliegue de datos sobre  jlist sabores
        String ssql;
        Registrar a = new Registrar();
        if(id.equals("vacio")){//cuando los datos esten vacios nos desplega la lista de todo
        ssql="select * from venta_helados.sabor";
        }else{ // de lo contrario se filtra segun el codigo 
        ssql="select * from venta_helados.sabor where id_sabor="+id;
        }
        ResultSet rs=a.mostrardetalle(ssql);
        modeloLista2.clear();
        try {
           while(rs.next()){
               modeloLista2.addElement(rs.getString("nombre_sabor"));       
           }
       } catch (SQLException ex) {
           Logger.getLogger(SABORES_HELADO.class.getName()).log(Level.SEVERE, null, ex);
       }

    }
      
      
       public void buscardatos3(String id){
           //busqueda y despliegue de datos sobre  jlist de tamano
        String ssql;
        Registrar a = new Registrar();
        if(id.equals("vacio")){ //cuando los datos esten vacios nos desplega la lista de todo
        ssql="select * from venta_helados.tamano";
        }else{// de lo contrario se filtra segun el codigo
        ssql="select * from venta_helados.tamano where id_tamano="+id;
        }
        ResultSet rs=a.mostrardetalle(ssql);
        modeloLista3.clear();
        try {
           while(rs.next()){
               modeloLista3.addElement(rs.getString("nombre_tamano"));       
           }  
       } catch (SQLException ex) {
           Logger.getLogger(SABORES_HELADO.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
       
       
      private void capturardatos(String valor){
      
       //comprobamos de que caja de texto vienen los datos para poder hacer las busquedas
        if(cajadetexto==1){
        texto_producto.setText(texto_producto.getText()+valor);
        buscardatos1(texto_producto.getText());
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
    
      
    private void texto_productoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_texto_productoMouseClicked
      //limpiamos y le decimos en que caja de texto estamos escribiendo
        cajadetexto=1;
    }//GEN-LAST:event_texto_productoMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       //llamamos al metodo capturardatos y le decimos el numero que el usuario esta pulsando
        capturardatos("0");
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void texto_saborMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_texto_saborMouseClicked
        //limpiamos y le decimos en que caja de texto estamos escribiendo
        texto_sabor.setText("");
        cajadetexto=2;
       
    }//GEN-LAST:event_texto_saborMouseClicked

    private void texto_saborActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texto_saborActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texto_saborActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      //llamamos al metodo capturardatos y le decimos el numero que el usuario esta pulsando
       
        capturardatos("1");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      //llamamos al metodo capturardatos y le decimos el numero que el usuario esta pulsando
        capturardatos("2");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       //llamamos al metodo capturardatos y le decimos el numero que el usuario esta pulsando
       
        capturardatos("3");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       //llamamos al metodo capturardatos y le decimos el numero que el usuario esta pulsando
       
        capturardatos("4");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       capturardatos("5");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
          //llamamos al metodo capturardatos y le decimos el numero que el usuario esta pulsando
       capturardatos("6");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
          //llamamos al metodo capturardatos y le decimos el numero que el usuario esta pulsando
       capturardatos("7");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        //llamamos al metodo capturardatos y le decimos el numero que el usuario esta pulsando
        capturardatos("8");
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
         //llamamos al metodo capturardatos y le decimos el numero que el usuario esta pulsando
       capturardatos("9");
    }//GEN-LAST:event_jButton12ActionPerformed

    
    
    
    
    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
      //llamamos al metodo capturardatos y le decimos el numero que el usuario esta pulsando
        capturardatos("."); 
    }//GEN-LAST:event_jButton11ActionPerformed

    private void texto_productoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_texto_productoKeyPressed
       
    }//GEN-LAST:event_texto_productoKeyPressed

    private void listaproductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaproductoMouseClicked
        //seleccion de producto y envio al campo de texto correspondiente
        txttodo.setText(listaproducto.getSelectedValue().toString());
        
    }//GEN-LAST:event_listaproductoMouseClicked

    private void listasaborKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_listasaborKeyPressed
        // TODO add your handling code here:
        
       
        
        
    }//GEN-LAST:event_listasaborKeyPressed

    private void listasaborMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listasaborMouseClicked
        
        //seleccion de sabor y envio al campo de texto correspondiente
         txttodo.setText(txttodo.getText()+"   "+listasabor.getSelectedValue().toString());
    }//GEN-LAST:event_listasaborMouseClicked

    
    
    
    
    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
       
        
    }//GEN-LAST:event_jButton19ActionPerformed

    private void listatamanoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_listatamanoKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_listatamanoKeyPressed

    private void listatamanoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listatamanoMouseClicked
        //seleccion de tamano y envio al campo de texto correspondiente
        txttodo.setText(txttodo.getText()+"   "+listatamano.getSelectedValue().toString());
    }//GEN-LAST:event_listatamanoMouseClicked

    private void texto_tamanoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_texto_tamanoMouseClicked
        //limpiamos y le decimos en que caja de texto estamos escribiendo
        texto_tamano.setText("");
        cajadetexto=3;
    }//GEN-LAST:event_texto_tamanoMouseClicked

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
            java.util.logging.Logger.getLogger(SABORES_HELADO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SABORES_HELADO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SABORES_HELADO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SABORES_HELADO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SABORES_HELADO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JList listaproducto;
    private javax.swing.JList listasabor;
    private javax.swing.JList listatamano;
    private javax.swing.JTextField texto_producto;
    private javax.swing.JTextField texto_sabor;
    private javax.swing.JTextField texto_tamano;
    private javax.swing.JTextArea txttodo;
    private javax.swing.JTextField varbolas;
    // End of variables declaration//GEN-END:variables

    private void llenarLista() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
