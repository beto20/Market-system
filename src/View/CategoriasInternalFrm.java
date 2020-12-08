
package View;

import Model.Categoria;
import DAO.CategoriaDAOImpl;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class CategoriasInternalFrm extends javax.swing.JInternalFrame {
    Categoria c = new Categoria();
    CategoriaDAOImpl cdaoi = new CategoriaDAOImpl(c);
    DefaultTableModel modelotabla = new DefaultTableModel();
    int id;
    public CategoriasInternalFrm() {
        initComponents();
        verTabla();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnagregarCat = new javax.swing.JButton();
        btnactualizarCat = new javax.swing.JButton();
        btneliminarCat = new javax.swing.JButton();
        btnlimpiarCat = new javax.swing.JButton();
        txtcodigoCat = new javax.swing.JTextField();
        txtnombreCat = new javax.swing.JTextField();
        txtestadoCat = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtablaCat = new javax.swing.JTable();

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 255)));

        jLabel1.setText("CODIGO:");

        jLabel2.setText("NOMBRE:");

        jLabel3.setText("ESTADO:");

        btnagregarCat.setText("Agregar");
        btnagregarCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarCatActionPerformed(evt);
            }
        });

        btnactualizarCat.setText("Actualizar");
        btnactualizarCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarCatActionPerformed(evt);
            }
        });

        btneliminarCat.setText("Eliminar");
        btneliminarCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarCatActionPerformed(evt);
            }
        });

        btnlimpiarCat.setText("Limpiar");
        btnlimpiarCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarCatActionPerformed(evt);
            }
        });

        txtcodigoCat.setEditable(false);
        txtcodigoCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigoCatActionPerformed(evt);
            }
        });

        txtnombreCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreCatActionPerformed(evt);
            }
        });
        txtnombreCat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreCatKeyTyped(evt);
            }
        });

        txtestadoCat.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtcodigoCat, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(txtnombreCat))
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtestadoCat, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnlimpiarCat)
                    .addComponent(btnactualizarCat)
                    .addComponent(btnagregarCat)
                    .addComponent(btneliminarCat))
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtcodigoCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtestadoCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnagregarCat))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnombreCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnactualizarCat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btneliminarCat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnlimpiarCat))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 255)));

        jtablaCat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "NOMBRE", "ESTADO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtablaCat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtablaCatMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtablaCat);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcodigoCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigoCatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodigoCatActionPerformed

    private void btnagregarCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarCatActionPerformed
        agregar();
        limpiarTabla();
        verTabla();
        limpiar();
    }//GEN-LAST:event_btnagregarCatActionPerformed

    private void btnactualizarCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarCatActionPerformed
        actualizar();
        limpiarTabla();
        verTabla();
        limpiar();
    }//GEN-LAST:event_btnactualizarCatActionPerformed

    private void btneliminarCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarCatActionPerformed
        eliminar();
        limpiarTabla();
        verTabla();
        limpiar();
    }//GEN-LAST:event_btneliminarCatActionPerformed

    private void btnlimpiarCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarCatActionPerformed
        limpiar();
        verTabla();
    }//GEN-LAST:event_btnlimpiarCatActionPerformed

    private void jtablaCatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtablaCatMouseClicked
        int fila = jtablaCat.getSelectedRow();
        if (fila==-1) {
            JOptionPane.showMessageDialog(this,"Debe seleccionar una fila");
        }else{
            int id = Integer.parseInt(jtablaCat.getValueAt(fila,0).toString());
            String nombre = jtablaCat.getValueAt(fila,1).toString();
            String estado = jtablaCat.getValueAt(fila,2).toString();
            txtcodigoCat.setText(jtablaCat.getValueAt(fila,0).toString());
            txtnombreCat.setText(nombre);
            txtestadoCat.setText(estado);
        }
    }//GEN-LAST:event_jtablaCatMouseClicked

    private void txtnombreCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreCatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreCatActionPerformed
    //VALIDACION
    private void txtnombreCatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreCatKeyTyped
//        char c = evt.getKeyChar();
//        if (c<='0' || c<='9') {
//            evt.consume();
//        }
        char c = evt.getKeyChar();
        if ( (c != ' ')&&(c<'a'||c>'z')&&(c<'A'||c>'Z') ) {
            evt.consume();
        }
    }//GEN-LAST:event_txtnombreCatKeyTyped
    
    public void verTabla(){
        modelotabla = (DefaultTableModel) jtablaCat.getModel();
        List<Categoria> lista = cdaoi.listarCategoria();
        Object[] obj = new Object[3];
        for (int i = 0; i < lista.size(); i++) {
            obj[0] = lista.get(i).getId();
            obj[1] = lista.get(i).getNombre();
            obj[2] = lista.get(i).getEstado();
            modelotabla.addRow(obj);
        }
        jtablaCat.setModel(modelotabla);
    }
    public void limpiarTabla(){
        for (int i = 0; i < modelotabla.getRowCount(); i++) {
            modelotabla.removeRow(i);
            i=i-1;
        }
    }
    
    
    public void agregar(){
        String nombre = txtnombreCat.getText();
        c.setNombre(nombre);
        cdaoi.agregarCategoria(c);
    }
    public void actualizar(){
        int fila = jtablaCat.getSelectedRow();
        if (fila==-1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila");
        }else{
            int id = Integer.parseInt(txtcodigoCat.getText());
            String nombre = txtnombreCat.getText();
            cdaoi.actualizarCategoria(nombre,id);   
        }
    }
    
    public void eliminar(){
        int fila = jtablaCat.getSelectedRow();
        int id = Integer.parseInt(jtablaCat.getValueAt(fila,0).toString());
        if (fila==-1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila");
        }else{
            cdaoi.eliminarCategoriaLogico(id);
        }
    }
    
    public void limpiar(){
        txtcodigoCat.setText("");
        txtnombreCat.setText("");
        txtestadoCat.setText("");
        modelotabla.getDataVector().removeAllElements();
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnactualizarCat;
    public javax.swing.JButton btnagregarCat;
    public javax.swing.JButton btneliminarCat;
    public javax.swing.JButton btnlimpiarCat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jtablaCat;
    public javax.swing.JTextField txtcodigoCat;
    public javax.swing.JTextField txtestadoCat;
    public javax.swing.JTextField txtnombreCat;
    // End of variables declaration//GEN-END:variables
}
