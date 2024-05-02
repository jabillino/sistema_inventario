package com.mycompany.si_ge_inv.IGU;

public class Menuprincipal extends javax.swing.JFrame {

    public Menuprincipal() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        label_SGI = new javax.swing.JLabel();
        btn_Agregar_prod = new javax.swing.JButton();
        btn_Ver_inventario = new javax.swing.JButton();
        btn_Salir = new javax.swing.JButton();
        img_Inventario = new javax.swing.JLabel();
        img_Agregar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label_SGI.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        label_SGI.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_SGI.setText(".:SISTEMA DE GESTION DE INVENTARIO:.");

        btn_Agregar_prod.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btn_Agregar_prod.setText("AGREGAR NUEVO PRODUCTO");
        btn_Agregar_prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Agregar_prodActionPerformed(evt);
            }
        });

        btn_Ver_inventario.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btn_Ver_inventario.setText("VER INVENTARIO");
        btn_Ver_inventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Ver_inventarioActionPerformed(evt);
            }
        });

        btn_Salir.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btn_Salir.setText("SALIR");
        btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirActionPerformed(evt);
            }
        });

        img_Inventario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        img_Agregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_SGI, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_Ver_inventario, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(img_Inventario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(img_Agregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Agregar_prod, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE))
                .addGap(19, 19, 19))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(273, 273, 273)
                .addComponent(btn_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(171, 171, 171))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(label_SGI)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Agregar_prod, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Ver_inventario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(img_Agregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(img_Inventario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(112, 112, 112)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                .addComponent(btn_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
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

    private void btn_Ver_inventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Ver_inventarioActionPerformed

        Ver_inventario ver_inv = new Ver_inventario();
        ver_inv.setVisible(true);
        ver_inv.setLocationRelativeTo(null);


    }//GEN-LAST:event_btn_Ver_inventarioActionPerformed

    private void btn_Agregar_prodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Agregar_prodActionPerformed

        Nuevo_producto pantalla = new Nuevo_producto();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);


    }//GEN-LAST:event_btn_Agregar_prodActionPerformed

    private void btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirActionPerformed
        System.exit(0);

    }//GEN-LAST:event_btn_SalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Agregar_prod;
    private javax.swing.JButton btn_Salir;
    private javax.swing.JButton btn_Ver_inventario;
    private javax.swing.JLabel img_Agregar;
    private javax.swing.JLabel img_Inventario;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_SGI;
    // End of variables declaration//GEN-END:variables
}
