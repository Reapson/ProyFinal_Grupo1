/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyfinal_grupo1.JFrame_Forms;

/**
 *
 * @author josue
 */
public class MenuAdmin extends javax.swing.JFrame {

    /**
     * Creates new form MenuAdmin
     */
    public MenuAdmin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMenu = new javax.swing.JPanel();
        btnAdminTecnicos = new javax.swing.JButton();
        btnAdminClientes = new javax.swing.JButton();
        btnAdminProveedores = new javax.swing.JButton();
        btnAdminRepyCons = new javax.swing.JButton();
        btnAdminCasos = new javax.swing.JButton();
        btnFacturacion = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        btnAdminUsuarios = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnCerrarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Administrativo");

        pnlMenu.setBackground(new java.awt.Color(255, 255, 255));

        btnAdminTecnicos.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        btnAdminTecnicos.setText("Administración de Técnicos");
        btnAdminTecnicos.setAlignmentY(0.0F);
        btnAdminTecnicos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAdminTecnicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminTecnicosActionPerformed(evt);
            }
        });

        btnAdminClientes.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        btnAdminClientes.setText("Administración de Clientes");
        btnAdminClientes.setAlignmentY(0.0F);
        btnAdminClientes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAdminClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminClientesActionPerformed(evt);
            }
        });

        btnAdminProveedores.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        btnAdminProveedores.setText("Administración de Proveedores");
        btnAdminProveedores.setAlignmentY(0.0F);
        btnAdminProveedores.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAdminProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminProveedoresActionPerformed(evt);
            }
        });

        btnAdminRepyCons.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        btnAdminRepyCons.setText("Inventario de Repuestos y Consumibles");
        btnAdminRepyCons.setAlignmentY(0.0F);
        btnAdminRepyCons.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAdminRepyCons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminRepyConsActionPerformed(evt);
            }
        });

        btnAdminCasos.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        btnAdminCasos.setText("Administración de Casos");
        btnAdminCasos.setAlignmentY(0.0F);
        btnAdminCasos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAdminCasos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminCasosActionPerformed(evt);
            }
        });

        btnFacturacion.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        btnFacturacion.setText("Facturación");
        btnFacturacion.setAlignmentY(0.0F);
        btnFacturacion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnFacturacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturacionActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 24)); // NOI18N
        lblTitulo.setText("Carbanticona Tech Experts");

        btnAdminUsuarios.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        btnAdminUsuarios.setText("Administración de Usuarios");
        btnAdminUsuarios.setAlignmentY(0.0F);
        btnAdminUsuarios.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAdminUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminUsuariosActionPerformed(evt);
            }
        });

        btnReportes.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        btnReportes.setText("Reportes");
        btnReportes.setAlignmentY(0.0F);
        btnReportes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdminUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnFacturacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdminCasos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdminRepyCons, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdminProveedores, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdminClientes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdminTecnicos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlMenuLayout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addGap(43, 43, 43)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addComponent(btnAdminTecnicos)
                .addGap(18, 18, 18)
                .addComponent(btnAdminClientes)
                .addGap(18, 18, 18)
                .addComponent(btnAdminProveedores)
                .addGap(18, 18, 18)
                .addComponent(btnAdminRepyCons)
                .addGap(18, 18, 18)
                .addComponent(btnAdminCasos)
                .addGap(18, 18, 18)
                .addComponent(btnFacturacion)
                .addGap(18, 18, 18)
                .addComponent(btnAdminUsuarios)
                .addGap(18, 18, 18)
                .addComponent(btnReportes)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        btnCerrarSesion.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        btnCerrarSesion.setText("Cerrar Sesión");
        btnCerrarSesion.setAlignmentY(0.0F);
        btnCerrarSesion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCerrarSesion)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdminTecnicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminTecnicosActionPerformed
        AdministracionTecnicos adminTecnicos = new AdministracionTecnicos();
        this.dispose();
        adminTecnicos.setVisible(true);
    }//GEN-LAST:event_btnAdminTecnicosActionPerformed

    private void btnAdminClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminClientesActionPerformed
        AdministracionClientes adminClientes = new AdministracionClientes();
        this.dispose();
        adminClientes.setVisible(true);
    }//GEN-LAST:event_btnAdminClientesActionPerformed

    private void btnAdminProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminProveedoresActionPerformed
        AdministracionProveedores adminProveedores = new AdministracionProveedores();
        this.dispose();
        adminProveedores.setVisible(true);
    }//GEN-LAST:event_btnAdminProveedoresActionPerformed

    private void btnAdminRepyConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminRepyConsActionPerformed
        InventarioRepyCons inventario = new InventarioRepyCons();
        this.dispose();
        inventario.setVisible(true);
    }//GEN-LAST:event_btnAdminRepyConsActionPerformed

    private void btnAdminCasosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminCasosActionPerformed
        AdministracionCasos adminCasos = new AdministracionCasos();
        this.dispose();
        adminCasos.setVisible(true);
    }//GEN-LAST:event_btnAdminCasosActionPerformed

    private void btnFacturacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturacionActionPerformed
        Facturacion facturacion = new Facturacion();
        this.dispose();
        facturacion.setVisible(true);
    }//GEN-LAST:event_btnFacturacionActionPerformed

    private void btnAdminUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminUsuariosActionPerformed
        AdministracionUsuarios adminUsuarios = new AdministracionUsuarios();
        this.dispose();
        adminUsuarios.setVisible(true);
    }//GEN-LAST:event_btnAdminUsuariosActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        Inicio_Sesion inicio = new Inicio_Sesion();
        this.dispose();
        inicio.setVisible(true);
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        Reportes reportes = new Reportes();
        this.dispose();
        reportes.setVisible(true);
    }//GEN-LAST:event_btnReportesActionPerformed

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
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdminCasos;
    private javax.swing.JButton btnAdminClientes;
    private javax.swing.JButton btnAdminProveedores;
    private javax.swing.JButton btnAdminRepyCons;
    private javax.swing.JButton btnAdminTecnicos;
    private javax.swing.JButton btnAdminUsuarios;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnFacturacion;
    private javax.swing.JButton btnReportes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlMenu;
    // End of variables declaration//GEN-END:variables
}
