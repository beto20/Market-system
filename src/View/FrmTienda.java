
package View;

import java.awt.Dimension;
import javax.swing.JInternalFrame;


public class FrmTienda extends javax.swing.JFrame {


    public FrmTienda() {
        initComponents();
        //Es para que aparezca en pantalla completa
        this.setExtendedState(MAXIMIZED_BOTH);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VentanaPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmVentas = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmCategorias = new javax.swing.JMenuItem();
        jmProductos = new javax.swing.JMenu();
        jmproductos = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jmClientes = new javax.swing.JMenuItem();
        jmSalir = new javax.swing.JMenu();
        jmOpciones = new javax.swing.JMenuItem();
        jmenuModoPago = new javax.swing.JMenuItem();
        jmenuSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout VentanaPrincipalLayout = new javax.swing.GroupLayout(VentanaPrincipal);
        VentanaPrincipal.setLayout(VentanaPrincipalLayout);
        VentanaPrincipalLayout.setHorizontalGroup(
            VentanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );
        VentanaPrincipalLayout.setVerticalGroup(
            VentanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        jMenu1.setText("Ventas");

        jmVentas.setText("Ver");
        jmVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmVentasActionPerformed(evt);
            }
        });
        jMenu1.add(jmVentas);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Admin de categorias");

        jmCategorias.setText("Ver");
        jmCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCategoriasActionPerformed(evt);
            }
        });
        jMenu2.add(jmCategorias);

        jMenuBar1.add(jMenu2);

        jmProductos.setText("Admin de productos");

        jmproductos.setText("Ver");
        jmproductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmproductosActionPerformed(evt);
            }
        });
        jmProductos.add(jmproductos);

        jMenuBar1.add(jmProductos);

        jMenu4.setText("Clientes");

        jmClientes.setText("Ver");
        jmClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmClientesActionPerformed(evt);
            }
        });
        jMenu4.add(jmClientes);

        jMenuBar1.add(jMenu4);

        jmSalir.setText("Opciones");

        jmOpciones.setText("Ver opciones");
        jmOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmOpcionesActionPerformed(evt);
            }
        });
        jmSalir.add(jmOpciones);

        jmenuModoPago.setText("Ver modos de pago");
        jmenuModoPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenuModoPagoActionPerformed(evt);
            }
        });
        jmSalir.add(jmenuModoPago);

        jmenuSalir.setText("Salir");
        jmenuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenuSalirActionPerformed(evt);
            }
        });
        jmSalir.add(jmenuSalir);

        jMenuBar1.add(jmSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VentanaPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VentanaPrincipal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCategoriasActionPerformed
        CategoriasInternalFrm cif = new CategoriasInternalFrm();
        Centrar(cif);
//        CategoriasInternalFrm2 cif2 = new CategoriasInternalFrm2();
//        Centrar(cif2);
    }//GEN-LAST:event_jmCategoriasActionPerformed

    private void jmenuModoPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuModoPagoActionPerformed
        ModoPagoInternalFrm mpif = new ModoPagoInternalFrm();
        Centrar(mpif);
    }//GEN-LAST:event_jmenuModoPagoActionPerformed
    //Metodo void para centrar los JInternalFrame
    public void Centrar(JInternalFrame jiframe){
        VentanaPrincipal.add(jiframe);
        Dimension dimension = VentanaPrincipal.getSize();
        Dimension dimensionFrame  = jiframe.getSize();
        jiframe.setLocation((dimension.width - dimensionFrame.width)/2,(dimension.height - dimensionFrame.height)/2);
        jiframe.show();
    }
    
    private void jmVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmVentasActionPerformed
        //Instanciar el ventasInternalFrame como si fuera una clase
        VentasInternalFrm vif = new VentasInternalFrm();
        //VentanaPrincipal.add(vif);
        //vif.setVisible(true);
        Centrar(vif);
    }//GEN-LAST:event_jmVentasActionPerformed

    private void jmproductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmproductosActionPerformed
        ProductosInternalFrm pif = new ProductosInternalFrm();
        Centrar(pif);
    }//GEN-LAST:event_jmproductosActionPerformed

    private void jmClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmClientesActionPerformed
        ClientesInternalFrm cif = new ClientesInternalFrm();
        Centrar(cif);
    }//GEN-LAST:event_jmClientesActionPerformed

    private void jmOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmOpcionesActionPerformed
        OpcionesInternalFrm oif = new OpcionesInternalFrm();
        Centrar(oif);
    }//GEN-LAST:event_jmOpcionesActionPerformed

    private void jmenuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jmenuSalirActionPerformed


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
            java.util.logging.Logger.getLogger(FrmTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmTienda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane VentanaPrincipal;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jmCategorias;
    private javax.swing.JMenuItem jmClientes;
    private javax.swing.JMenuItem jmOpciones;
    private javax.swing.JMenu jmProductos;
    private javax.swing.JMenu jmSalir;
    private javax.swing.JMenuItem jmVentas;
    private javax.swing.JMenuItem jmenuModoPago;
    private javax.swing.JMenuItem jmenuSalir;
    private javax.swing.JMenuItem jmproductos;
    // End of variables declaration//GEN-END:variables
}
