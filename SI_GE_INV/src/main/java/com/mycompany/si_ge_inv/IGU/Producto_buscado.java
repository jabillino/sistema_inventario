package com.mycompany.si_ge_inv.IGU;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Producto_buscado extends javax.swing.JFrame {

    //buscador de archivos de base de datos
    String barra = File.separator;
    String crearUbicacion = System.getProperty("user.dir") + barra + "DATOSTXT" + barra;

    public Producto_buscado(String text) {

        initComponents();
        mostrarencontrado(text);

    }

    public void mostrarencontrado(String text) {

        try (BufferedReader br = new BufferedReader(new FileReader(crearUbicacion + text.concat(".txt")))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                //contenidoArchivo.append(linea).append("/");
                String[] partes = linea.split("<->");
                jtxt_id.setText(partes[0]);
                jtxt_nombre.setText(partes[1]);
                jtxt_cant_stack.setText(partes[2]);
                jtxt_cant_total.setText(partes[3]);
                jtxt_descripcion.setText(partes[4]);                
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_Atras = new javax.swing.JButton();
        txt_nuevo_producto = new javax.swing.JLabel();
        lb_Nombre = new javax.swing.JLabel();
        lb_Cant_Stack = new javax.swing.JLabel();
        lb_Descripcion = new javax.swing.JLabel();
        lb_Nombre1 = new javax.swing.JLabel();
        jtxt_id = new javax.swing.JTextField();
        jtxt_nombre = new javax.swing.JTextField();
        jtxt_cant_stack = new javax.swing.JTextField();
        jtxt_cant_total = new javax.swing.JTextField();
        lb_Descripcion1 = new javax.swing.JLabel();
        jtxt_descripcion = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_Atras.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btn_Atras.setText("ATRAS");
        btn_Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AtrasActionPerformed(evt);
            }
        });

        txt_nuevo_producto.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        txt_nuevo_producto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_nuevo_producto.setText("◄PRODUCTO ENCONTRADO►");

        lb_Nombre.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        lb_Nombre.setText("NOMBRE:");

        lb_Cant_Stack.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        lb_Cant_Stack.setText("CANT x STACK:");

        lb_Descripcion.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        lb_Descripcion.setText("CANT TOTAL:");

        lb_Nombre1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        lb_Nombre1.setText("ID:");

        jtxt_id.setEditable(false);
        jtxt_id.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        jtxt_nombre.setEditable(false);
        jtxt_nombre.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        jtxt_cant_stack.setEditable(false);
        jtxt_cant_stack.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        jtxt_cant_total.setEditable(false);
        jtxt_cant_total.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        lb_Descripcion1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        lb_Descripcion1.setText("DESCRIPCIÓN:");

        jtxt_descripcion.setEditable(false);
        jtxt_descripcion.setColumns(20);
        jtxt_descripcion.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jtxt_descripcion.setRows(5);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Atras, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lb_Nombre)
                            .addComponent(lb_Cant_Stack)
                            .addComponent(lb_Descripcion)
                            .addComponent(lb_Nombre1)
                            .addComponent(lb_Descripcion1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtxt_nombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxt_cant_stack, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxt_cant_total, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxt_id, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxt_descripcion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE))))
                .addGap(31, 31, 31))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_nuevo_producto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(txt_nuevo_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_Nombre1)
                    .addComponent(jtxt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_Nombre)
                    .addComponent(jtxt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_Cant_Stack)
                    .addComponent(jtxt_cant_stack, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_Descripcion)
                    .addComponent(jtxt_cant_total, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_Descripcion1)
                    .addComponent(jtxt_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Atras)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AtrasActionPerformed
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_AtrasActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Atras;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jtxt_cant_stack;
    private javax.swing.JTextField jtxt_cant_total;
    private javax.swing.JTextArea jtxt_descripcion;
    private javax.swing.JTextField jtxt_id;
    private javax.swing.JTextField jtxt_nombre;
    private javax.swing.JLabel lb_Cant_Stack;
    private javax.swing.JLabel lb_Descripcion;
    private javax.swing.JLabel lb_Descripcion1;
    private javax.swing.JLabel lb_Nombre;
    private javax.swing.JLabel lb_Nombre1;
    private javax.swing.JLabel txt_nuevo_producto;
    // End of variables declaration//GEN-END:variables
}
