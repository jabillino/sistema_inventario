package com.mycompany.si_ge_inv.IGU;

import java.io.File;
import javax.swing.JOptionPane;
import java.util.Formatter;

public class Nuevo_producto extends javax.swing.JFrame {

    boolean txtCreado = false;
    String barra = File.separator;// "\"
    String crearUbicacion = System.getProperty("user.dir") + barra + "DATOSTXT" + barra;//+"nombre+ barar"

    public Nuevo_producto() {
        initComponents();
    }

    private void crear() {
        txtCreado = false;
        String archivo = jtxt_ID.getText() + ".txt";
        File CrearUbi = new File(crearUbicacion);
        File CrearArchi = new File(crearUbicacion + archivo);

        if (jtxt_ID.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "NO EXISTE ID");
        } else {
            try {
                if (CrearArchi.exists()) {
                    JOptionPane.showMessageDialog(rootPane, "EL ID YA SE ENCUENTRA REGISTRADO");
                } else {
                    CrearUbi.mkdirs();
                    Formatter CrearForma = new Formatter(crearUbicacion + archivo);
                    CrearForma.format("%s<->%s<->%s<->%s<->%s", jtxt_ID.getText(), jtxt_Nombre.getText(), jtxt_Cant_Stack.getText(), jtxt_Cant_Total.getText(), jtxt_Descripcion.getText());
                    CrearForma.close();

                    JOptionPane.showMessageDialog(rootPane, "REGISTRO EXITOSO");
                    txtCreado = true;

                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "REGISTRO INCORRECTO");
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        txt_nuevo_producto = new javax.swing.JLabel();
        lb_ID = new javax.swing.JLabel();
        lb_Nombre = new javax.swing.JLabel();
        lb_Descripcion = new javax.swing.JLabel();
        lb_Cant_Stack = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxt_Descripcion = new javax.swing.JTextArea();
        jtxt_ID = new javax.swing.JTextField();
        jtxt_Nombre = new javax.swing.JTextField();
        jtxt_Cant_Stack = new javax.swing.JTextField();
        btn_Cancelar = new javax.swing.JButton();
        btn_Guardar = new javax.swing.JButton();
        btn_Limpiar = new javax.swing.JButton();
        lb_Cant_Stack1 = new javax.swing.JLabel();
        jtxt_Cant_Total = new javax.swing.JTextField();

        jTextField3.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_nuevo_producto.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        txt_nuevo_producto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_nuevo_producto.setText("◄NUEVO PRODUCTO►");

        lb_ID.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lb_ID.setText("ID:");

        lb_Nombre.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lb_Nombre.setText("NOMBRE:");

        lb_Descripcion.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lb_Descripcion.setText("DESCRIPCIÓN:");

        lb_Cant_Stack.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lb_Cant_Stack.setText("CANT x STACK:");

        jtxt_Descripcion.setColumns(20);
        jtxt_Descripcion.setRows(5);
        jScrollPane1.setViewportView(jtxt_Descripcion);

        btn_Cancelar.setText("ATRAS");
        btn_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelarActionPerformed(evt);
            }
        });

        btn_Guardar.setText("GUARDAR");
        btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuardarActionPerformed(evt);
            }
        });

        btn_Limpiar.setText("LIMPIAR");
        btn_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LimpiarActionPerformed(evt);
            }
        });

        lb_Cant_Stack1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lb_Cant_Stack1.setText("CANT TOTAL:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_nuevo_producto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 128, Short.MAX_VALUE)
                .addComponent(btn_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(btn_Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(btn_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb_ID)
                    .addComponent(lb_Nombre)
                    .addComponent(lb_Cant_Stack)
                    .addComponent(lb_Descripcion)
                    .addComponent(lb_Cant_Stack1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jtxt_Cant_Stack, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxt_Nombre, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxt_ID, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                    .addComponent(jtxt_Cant_Total))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(txt_nuevo_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lb_ID)
                    .addComponent(jtxt_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_Nombre)
                    .addComponent(jtxt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_Cant_Stack)
                    .addComponent(jtxt_Cant_Stack, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_Cant_Stack1)
                    .addComponent(jtxt_Cant_Total, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_Descripcion)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_Guardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_Limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                        .addGap(4, 4, 4))
                    .addComponent(btn_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuardarActionPerformed

        crear();
        if (txtCreado) {
            jtxt_ID.setText("");
            jtxt_Nombre.setText("");
            jtxt_Cant_Stack.setText("");
            jtxt_Descripcion.setText("");
            jtxt_Cant_Total.setText("");
        }
        jtxt_ID.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_GuardarActionPerformed

    private void btn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarActionPerformed
        dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_btn_CancelarActionPerformed

    private void btn_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LimpiarActionPerformed

        jtxt_Cant_Stack.setText("");
        jtxt_Descripcion.setText("");
        jtxt_ID.setText("");
        jtxt_Nombre.setText("");
        jtxt_Cant_Total.setText("");


    }//GEN-LAST:event_btn_LimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Cancelar;
    private javax.swing.JButton btn_Guardar;
    private javax.swing.JButton btn_Limpiar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jtxt_Cant_Stack;
    private javax.swing.JTextField jtxt_Cant_Total;
    private javax.swing.JTextArea jtxt_Descripcion;
    private javax.swing.JTextField jtxt_ID;
    private javax.swing.JTextField jtxt_Nombre;
    private javax.swing.JLabel lb_Cant_Stack;
    private javax.swing.JLabel lb_Cant_Stack1;
    private javax.swing.JLabel lb_Descripcion;
    private javax.swing.JLabel lb_ID;
    private javax.swing.JLabel lb_Nombre;
    private javax.swing.JLabel txt_nuevo_producto;
    // End of variables declaration//GEN-END:variables
}
