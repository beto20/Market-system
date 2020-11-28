
package View;

import DAO.ModoPagoDAOImpl;
import Model.ModoPago;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ModoPagoInternalFrm extends javax.swing.JInternalFrame {
    ModoPago mp = new ModoPago();
    ModoPagoDAOImpl mpdaoi = new ModoPagoDAOImpl(mp);
    DefaultTableModel modelo = new DefaultTableModel();

    public ModoPagoInternalFrm() {
        initComponents();
        verTabla();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCodMod = new javax.swing.JTextField();
        txtTipMod = new javax.swing.JTextField();
        txtEstMod = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDetMod = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnAgregarMod = new javax.swing.JButton();
        btnActualizarMod = new javax.swing.JButton();
        btnEliminarMod = new javax.swing.JButton();
        btnLimpiarMod = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaModoPago = new javax.swing.JTable();

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 204, 204)));

        jLabel1.setText("CODIGO:");

        txtCodMod.setEditable(false);

        txtEstMod.setEditable(false);

        jLabel2.setText("ESTADO:");

        jLabel3.setText("DETALLES:");

        jLabel4.setText("TIPO:");

        btnAgregarMod.setText("AGREGAR");
        btnAgregarMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarModActionPerformed(evt);
            }
        });

        btnActualizarMod.setText("ACTUALIZAR");
        btnActualizarMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarModActionPerformed(evt);
            }
        });

        btnEliminarMod.setText("ELIMINAR");
        btnEliminarMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarModActionPerformed(evt);
            }
        });

        btnLimpiarMod.setText("LIMPIAR");
        btnLimpiarMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarModActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCodMod)
                            .addComponent(txtTipMod, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAgregarMod)
                        .addGap(39, 39, 39)
                        .addComponent(btnActualizarMod)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEliminarMod)
                        .addGap(36, 36, 36)
                        .addComponent(btnLimpiarMod))
                    .addComponent(txtDetMod, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEstMod, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEstMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTipMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtDetMod, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarMod)
                    .addComponent(btnActualizarMod)
                    .addComponent(btnEliminarMod)
                    .addComponent(btnLimpiarMod))
                .addGap(22, 22, 22))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 255, 0)));

        tablaModoPago.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "TIPO", "DETALLES", "ESTADO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaModoPago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaModoPagoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaModoPago);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void verTabla(){
        modelo = (DefaultTableModel) tablaModoPago.getModel();
        List<ModoPago> lista = mpdaoi.listarModoPago();
        Object[] obj = new Object[4];
        for (int i = 0; i < lista.size(); i++) {
            obj[0] = lista.get(i).getId();
            obj[1] = lista.get(i).getNombre();
            obj[2] = lista.get(i).getOtrosDetalles();
            obj[3] = lista.get(i).getEstado();
            modelo.addRow(obj);
        }
        tablaModoPago.setModel(modelo);
        
    }
    
    public void limpiarTabla(){
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i-1;
        }
    }
    
    public void Agregar(){
        mp.setNombre(txtTipMod.getText());
        mp.setOtrosDetalles(txtDetMod.getText());
        mp.setEstado("Activo");
        mpdaoi.agregarModoPago(mp);
        
    }
    
    public void Actualizar(){
        int fila = tablaModoPago.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showConfirmDialog(this, "Seleccione algun registro");
        }else{
            int id = Integer.parseInt(txtCodMod.getText());
            String tipo = txtTipMod.getText();
            String detalle = txtDetMod.getText();
            mpdaoi.actualizarModoPago(id, tipo, detalle);
        }
        
    }
    
    public void Eliminar(){
        int fila = tablaModoPago.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showConfirmDialog(this, "Seleccione algun registro");
        }else{
            int id = Integer.parseInt(txtCodMod.getText());
            mpdaoi.eliminarModoPagoLogico(id);
        }
    }
    
    public void Limpiar(){
        txtCodMod.setText("");
        txtDetMod.setText("");
        txtTipMod.setText("");
        txtEstMod.setText("");
        modelo.getDataVector().removeAllElements();
    }
    
    private void btnEliminarModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarModActionPerformed
        Eliminar();
        Limpiar();
        verTabla();
    }//GEN-LAST:event_btnEliminarModActionPerformed

    private void btnAgregarModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarModActionPerformed
        Agregar();
        Limpiar();
        verTabla();
    }//GEN-LAST:event_btnAgregarModActionPerformed

    private void btnActualizarModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarModActionPerformed
        Actualizar();
        Limpiar();
        verTabla();
    }//GEN-LAST:event_btnActualizarModActionPerformed

    private void btnLimpiarModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarModActionPerformed
        Limpiar();
    }//GEN-LAST:event_btnLimpiarModActionPerformed

    private void tablaModoPagoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaModoPagoMouseClicked
        int fila = tablaModoPago.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showConfirmDialog(this,"Seleccione algun registro");
        }else{
            txtCodMod.setText(tablaModoPago.getValueAt(fila, 0).toString());
            txtTipMod.setText(tablaModoPago.getValueAt(fila, 1).toString());
            txtDetMod.setText(tablaModoPago.getValueAt(fila, 2).toString());
            txtEstMod.setText(tablaModoPago.getValueAt(fila, 3).toString());
        }
    }//GEN-LAST:event_tablaModoPagoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarMod;
    private javax.swing.JButton btnAgregarMod;
    private javax.swing.JButton btnEliminarMod;
    private javax.swing.JButton btnLimpiarMod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaModoPago;
    private javax.swing.JTextField txtCodMod;
    private javax.swing.JTextField txtDetMod;
    private javax.swing.JTextField txtEstMod;
    private javax.swing.JTextField txtTipMod;
    // End of variables declaration//GEN-END:variables
}
