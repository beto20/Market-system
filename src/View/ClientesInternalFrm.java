
package View;

import DAO.ClienteDAOImpl;
import Model.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ClientesInternalFrm extends javax.swing.JInternalFrame {
    Cliente c = new Cliente();
    ClienteDAOImpl cdaoi = new ClienteDAOImpl(c);
    DefaultTableModel modelotabla = new DefaultTableModel();
    int id;
    
    public ClientesInternalFrm() {
        initComponents();
        verTabla();
    }
    
    public void verTabla(){
        modelotabla = (DefaultTableModel) tablaCliente.getModel();
        List<Cliente> lista = cdaoi.listarCliente();
//        lista = cdaoi.listarCliente();
        Object[] obj = new Object[7];
        for (int i = 0; i < lista.size(); i++) {
            obj [0] = lista.get(i).getId();
            obj [1] = lista.get(i).getNombre();
            obj [2] = lista.get(i).getApellidos();
            obj [3] = lista.get(i).getCorreo();
            obj [4] = lista.get(i).getDni();
            obj [5] = lista.get(i).getDireccion();
            obj [6] = lista.get(i).getEstado();
            modelotabla.addRow(obj);
        }
        tablaCliente.setModel(modelotabla);
    }
    
    public void Agregar(){
        c.setNombre(txtNombreCli.getText());
        c.setApellidos(txtApellidosCli.getText());
        c.setCorreo(txtCorreoCli.getText());
        c.setDni(txtDniCli.getText());
        c.setDireccion(txtDireccionCli.getText());
        c.setEstado("Activo");
        cdaoi.agregarCliente(c);
    }
    public void Actualizar(){
        int fila = tablaCliente.getSelectedRow();
//        int id = Integer.parseInt(tablaCliente.getValueAt(fila,0).toString());
        if (fila==-1) {
            JOptionPane.showConfirmDialog(this,"Seleccione algun registro");
        }else{
            int id = Integer.parseInt(txtIdCli.getText());
            String nombre = txtNombreCli.getText();
            String apellidos = txtApellidosCli.getText();
            String correo = txtCorreoCli.getText();
            String dni = txtDniCli.getText();
            String direccion = txtDireccionCli.getText();
            cdaoi.actualizarCliente(id,nombre,apellidos,correo,dni,direccion);
        } 
    }
    
    public void Eliminar(){
        int fila = tablaCliente.getSelectedRow();
        int id = Integer.parseInt(tablaCliente.getValueAt(fila, 0).toString());
        if (fila == -1) {
            JOptionPane.showConfirmDialog(this, "Seleccione algun registro");
        }else{
            cdaoi.eliminarClienteLogico(id);
        }
        
    }
    
    public void Limpiar(){
        txtIdCli.setText("");
        txtNombreCli.setText("");
        txtApellidosCli.setText("");
        txtCorreoCli.setText("");
        txtDniCli.setText("");
        txtDireccionCli.setText("");
        txtEstadoCli.setText("");
        modelotabla.getDataVector().removeAllElements();
    }
    
    public void limpiarTabla(){
        for (int i = 0; i < modelotabla.getRowCount(); i++) {
            modelotabla.removeRow(i);
            i = i-1;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAgregarCli = new javax.swing.JButton();
        btnActualizarCli = new javax.swing.JButton();
        btnEliminarCli = new javax.swing.JButton();
        txtApellidosCli = new javax.swing.JTextField();
        txtNombreCli = new javax.swing.JTextField();
        txtDniCli = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtIdCli = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtEstadoCli = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDireccionCli = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCorreoCli = new javax.swing.JTextField();
        btnLimpiarCli = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCliente = new javax.swing.JTable();

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 0)));

        btnAgregarCli.setText("Agregar");
        btnAgregarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCliActionPerformed(evt);
            }
        });

        btnActualizarCli.setText("Actualizar");
        btnActualizarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarCliActionPerformed(evt);
            }
        });

        btnEliminarCli.setText("Eliminar");
        btnEliminarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCliActionPerformed(evt);
            }
        });

        jLabel1.setText("NOMBRE:");

        jLabel2.setText("APELLIDOS:");

        jLabel3.setText("CORREO:");

        txtIdCli.setEditable(false);

        jLabel4.setText("DIRECCION:");

        jLabel5.setText("DNI:");

        txtEstadoCli.setEditable(false);

        jLabel6.setText("CODIGO:");

        jLabel7.setText("ESTADO:");

        btnLimpiarCli.setText("Limpiar");
        btnLimpiarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarCliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(64, 64, 64)
                        .addComponent(txtDniCli, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombreCli, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtApellidosCli)
                            .addComponent(txtIdCli, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtEstadoCli, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDireccionCli, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                    .addComponent(txtCorreoCli))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(btnAgregarCli)
                .addGap(18, 18, 18)
                .addComponent(btnActualizarCli)
                .addGap(18, 18, 18)
                .addComponent(btnEliminarCli)
                .addGap(18, 18, 18)
                .addComponent(btnLimpiarCli)
                .addGap(0, 224, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtIdCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtEstadoCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombreCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtDireccionCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtApellidosCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtCorreoCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDniCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarCli)
                    .addComponent(btnActualizarCli)
                    .addComponent(btnEliminarCli)
                    .addComponent(btnLimpiarCli))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 0)));

        tablaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "NOMBRE", "APELLIDOS", "CORREO", "DNI", "DIRECCION", "ESTADO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaCliente);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCliActionPerformed
        Agregar();
        limpiarTabla();
        verTabla();
    }//GEN-LAST:event_btnAgregarCliActionPerformed

    private void btnActualizarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarCliActionPerformed
        Actualizar();
        limpiarTabla();
        verTabla();
    }//GEN-LAST:event_btnActualizarCliActionPerformed

    private void btnEliminarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCliActionPerformed
        Eliminar();
        limpiarTabla();
        verTabla();
    }//GEN-LAST:event_btnEliminarCliActionPerformed

    private void btnLimpiarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarCliActionPerformed
        Limpiar();
    }//GEN-LAST:event_btnLimpiarCliActionPerformed

    private void tablaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaClienteMouseClicked
        int fila = tablaCliente.getSelectedRow();
        if (fila==-1) {
         JOptionPane.showConfirmDialog(this, "Seleccione algun registro");
        }else{
            int id = Integer.parseInt(tablaCliente.getValueAt(fila,0).toString());
            txtIdCli.setText(tablaCliente.getValueAt(fila,0).toString());
            txtNombreCli.setText(tablaCliente.getValueAt(fila,1).toString());
            txtApellidosCli.setText(tablaCliente.getValueAt(fila,2).toString());
            txtCorreoCli.setText(tablaCliente.getValueAt(fila,3).toString());
            txtDniCli.setText(tablaCliente.getValueAt(fila,4).toString());
            txtDireccionCli.setText(tablaCliente.getValueAt(fila, 5).toString());
            txtEstadoCli.setText(tablaCliente.getValueAt(fila,6).toString());            
        }
    }//GEN-LAST:event_tablaClienteMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarCli;
    private javax.swing.JButton btnAgregarCli;
    private javax.swing.JButton btnEliminarCli;
    private javax.swing.JButton btnLimpiarCli;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaCliente;
    private javax.swing.JTextField txtApellidosCli;
    private javax.swing.JTextField txtCorreoCli;
    private javax.swing.JTextField txtDireccionCli;
    private javax.swing.JTextField txtDniCli;
    private javax.swing.JTextField txtEstadoCli;
    private javax.swing.JTextField txtIdCli;
    private javax.swing.JTextField txtNombreCli;
    // End of variables declaration//GEN-END:variables
}
