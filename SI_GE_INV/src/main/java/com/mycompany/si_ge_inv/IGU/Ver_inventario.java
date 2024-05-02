package com.mycompany.si_ge_inv.IGU;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Ver_inventario extends javax.swing.JFrame {

    String barra = File.separator;
    String crearUbicacion = System.getProperty("user.dir") + barra + "DATOSTXT" + barra;
    
    File carpetabasededatos = new File(crearUbicacion);
    String[] cont_car_bs_datos = carpetabasededatos.list();
    
    
    
    private boolean existeid() {
        boolean existe=false;
        for (int i = 0; i < cont_car_bs_datos.length; i++) {
            if(cont_car_bs_datos[i].equals(jtxt_Buscar.getText().concat(".txt"))){
                existe=true;
            }
        }
        return existe;
    }

    public Ver_inventario() {
        initComponents();
        llenarTablaDesdeArchivos();
    }

    private void llenarTablaDesdeArchivos() {
        // Lista de nombres de archivos
        ArrayList<String> nombresArchivos = new ArrayList<>();//["hola soy yo","no ya no".....]
        for (int i = 0; i < cont_car_bs_datos.length; i++) {
            nombresArchivos.add(crearUbicacion + cont_car_bs_datos[i]);
        }
        // Agrega más nombres de archivos si es necesario
        
        // Modelo de la tabla
        DefaultTableModel model = (DefaultTableModel) tb_Inventario.getModel();

        for (String nombreArchivo : nombresArchivos) {

            // Leer el contenido del archivo
            try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    //contenidoArchivo.append(linea).append("/");
                    String[] partes = linea.split("<->");//"hola"<->"a"<->"todos soy yo"
                    // Agregar cada parte como una celda en la tabla
                    model.addRow(partes);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Salir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txt_Inventario = new javax.swing.JLabel();
        jtxt_Buscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_Inventario = new javax.swing.JTable();
        btn_Buscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_Atras = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();

        btn_Salir.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btn_Salir.setText("SALIR");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));
        jPanel1.setForeground(new java.awt.Color(255, 204, 153));

        txt_Inventario.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        txt_Inventario.setForeground(new java.awt.Color(0, 0, 0));
        txt_Inventario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_Inventario.setText("◄INVENTARIO►");

        jtxt_Buscar.setBackground(new java.awt.Color(255, 255, 255));
        jtxt_Buscar.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jtxt_Buscar.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));

        tb_Inventario.setBackground(new java.awt.Color(153, 153, 153));
        tb_Inventario.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tb_Inventario.setForeground(new java.awt.Color(255, 255, 255));
        tb_Inventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "CANT x STACK ", "CANT TOTAL", "DESCRIPCION"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_Inventario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tb_Inventario.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tb_Inventario);
        if (tb_Inventario.getColumnModel().getColumnCount() > 0) {
            tb_Inventario.getColumnModel().getColumn(0).setMinWidth(50);
            tb_Inventario.getColumnModel().getColumn(0).setPreferredWidth(50);
            tb_Inventario.getColumnModel().getColumn(0).setMaxWidth(50);
            tb_Inventario.getColumnModel().getColumn(1).setMinWidth(150);
            tb_Inventario.getColumnModel().getColumn(1).setPreferredWidth(150);
            tb_Inventario.getColumnModel().getColumn(1).setMaxWidth(150);
            tb_Inventario.getColumnModel().getColumn(2).setMinWidth(150);
            tb_Inventario.getColumnModel().getColumn(2).setPreferredWidth(150);
            tb_Inventario.getColumnModel().getColumn(2).setMaxWidth(150);
            tb_Inventario.getColumnModel().getColumn(3).setMinWidth(150);
            tb_Inventario.getColumnModel().getColumn(3).setPreferredWidth(150);
            tb_Inventario.getColumnModel().getColumn(3).setMaxWidth(150);
        }

        btn_Buscar.setBackground(new java.awt.Color(255, 153, 102));
        btn_Buscar.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btn_Buscar.setForeground(new java.awt.Color(0, 0, 0));
        btn_Buscar.setText("BUSCAR");
        btn_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("ID:");

        btn_Atras.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btn_Atras.setText("ATRAS");
        btn_Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AtrasActionPerformed(evt);
            }
        });

        btn_actualizar.setText("actualizar");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jtxt_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btn_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(txt_Inventario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btn_Atras, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_actualizar)
                .addGap(177, 177, 177))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(txt_Inventario, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Buscar, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(jtxt_Buscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Atras)
                    .addComponent(btn_actualizar))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarActionPerformed

        if (existeid()) {
            
            Producto_buscado prod_busc = new Producto_buscado(jtxt_Buscar.getText());
            prod_busc.setVisible(true);
            prod_busc.setLocationRelativeTo(null);
            
        }else{
            JOptionPane.showMessageDialog(rootPane, "ID NO ENCONTRADA");
        }


    }//GEN-LAST:event_btn_BuscarActionPerformed

    private void btn_AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AtrasActionPerformed
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_AtrasActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        

        // TODO add your handling code here:
    }//GEN-LAST:event_btn_actualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Atras;
    private javax.swing.JButton btn_Buscar;
    private javax.swing.JButton btn_Salir;
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtxt_Buscar;
    private javax.swing.JTable tb_Inventario;
    private javax.swing.JLabel txt_Inventario;
    // End of variables declaration//GEN-END:variables
}
