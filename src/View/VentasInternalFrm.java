
package View;

import DAO.ClienteDAOImpl;
import DAO.DetalleDAOImpl;
import DAO.ProductoDAOImpl;
import DAO.VentaDAOImpl;
import Model.Cliente;
import Model.Detalle;
import Model.Producto;
import Model.Venta;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class VentasInternalFrm extends javax.swing.JInternalFrame {
    Cliente c = new Cliente();
    ClienteDAOImpl cdaoi = new ClienteDAOImpl(c);
    Producto p = new Producto();
    ProductoDAOImpl pdaoi = new ProductoDAOImpl(p);
    Venta v = new Venta();
    VentaDAOImpl vdaoi = new VentaDAOImpl(v);
    Detalle d = new Detalle();
    DetalleDAOImpl ddaoi = new DetalleDAOImpl(d);
    
    DefaultTableModel modelo = new DefaultTableModel();
    
    int idcliente;
    int idproducto;
    double totalPagar;
    int cantidad;
    Double precio;
    
    
    public VentasInternalFrm() {
        initComponents();
        vdaoi.metodosPago(cmbModoPago);
        fecha();
        generarSerie();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNroFactura = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        txtDniCliente = new javax.swing.JTextField();
        txtCodProducto = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        txtCliente = new javax.swing.JTextField();
        txtProducto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        btnBuscarDniCli = new javax.swing.JButton();
        btnBuscarCodProd = new javax.swing.JButton();
        btnAgregarPrecio = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        cmbModoPago = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVenta = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        btnEfectuar = new javax.swing.JButton();
        txtTotal = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 0, 204)));

        jLabel2.setText("NRO. FACTURA");

        txtNroFactura.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(299, 299, 299)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNroFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNroFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 51, 255)));

        txtPrecio.setEditable(false);

        txtCliente.setEditable(false);

        txtProducto.setEditable(false);

        jLabel3.setText("DNI CLIENTE:");

        jLabel4.setText("COD. PRODUCTO:");

        jLabel5.setText("PRECIO:");

        jLabel6.setText("CANTIDAD:");

        jLabel7.setText("CLIENTE:");

        jLabel8.setText("PRODUCTO:");

        jLabel10.setText("STOCK:");

        txtStock.setEditable(false);

        btnBuscarDniCli.setText("BUSCAR");
        btnBuscarDniCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarDniCliActionPerformed(evt);
            }
        });

        btnBuscarCodProd.setText("BUSCAR");
        btnBuscarCodProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCodProdActionPerformed(evt);
            }
        });

        btnAgregarPrecio.setText("AGREGAR");
        btnAgregarPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPrecioActionPerformed(evt);
            }
        });

        jLabel12.setText("FECHA:");

        txtFecha.setEditable(false);

        jLabel13.setText("MODO DE PAGO:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtCodProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarCodProd))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtDniCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarDniCli))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbModoPago, 0, 158, Short.MAX_VALUE)
                            .addComponent(txtCantidad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregarPrecio)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel12)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                        .addComponent(txtStock, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                        .addComponent(txtFecha))
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDniCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarDniCli))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarCodProd))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarPrecio)
                    .addComponent(jLabel12)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(cmbModoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 204, 0)));

        tablaVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NRO", "CODIGO", "PRODUCTO", "CANTIDAD", "P. UNITARIO", "TOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaVenta);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 0, 51)));

        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnEfectuar.setText("EFECTUAR VENTA");
        btnEfectuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEfectuarActionPerformed(evt);
            }
        });

        txtTotal.setEditable(false);

        jLabel9.setText("TOTAL:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(293, 293, 293)
                .addComponent(btnCancelar)
                .addGap(30, 30, 30)
                .addComponent(btnEfectuar)
                .addGap(36, 36, 36)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnEfectuar)
                    .addComponent(jLabel9)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void buscarCliente(){
        String dni = txtDniCliente.getText();
        if (txtDniCliente.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el numero de DNI");
        }else{
            cdaoi.buscarCliente(dni);
            if (c.getDni()!=null) {
                txtCliente.setText(c.getNombre()+" "+c.getApellidos());
                txtCodProducto.requestFocus();
            }else{
                int r = JOptionPane.showConfirmDialog(this, "Cliente no registrado");
                if (r==0) {
                    ClientesInternalFrm cif = new ClientesInternalFrm();
                    FrmTienda.VentanaPrincipal.add(cif);
                    cif.setVisible(true);
                }
            }
        }  
    }
    
    public void buscarProducto(){
        int id  = Integer.parseInt(txtCodProducto.getText());
        if (txtCodProducto.getText().equals("")) {
            JOptionPane.showConfirmDialog(this,"Llene el campo");
        }else{
            pdaoi.listaProductoId(id);
            if (p.getId() !=0 ) {
                txtProducto.setText(p.getNombre());
                txtPrecio.setText(String.valueOf(p.getPrecio()));
                txtStock.setText(String.valueOf(p.getStock()));
            }else{
                JOptionPane.showConfirmDialog(this, "No existe");
                txtCodProducto.requestFocus();
            }
        }
    }
    
    public void agregarProducto(){
        int item = 0;
        double total = 0;
        modelo = (DefaultTableModel) tablaVenta.getModel();
        item = item + 1;
//        idcliente = c.getId();
        idproducto = p.getId();
        String nombreProducto = txtProducto.getText();
        precio = Double.parseDouble(txtPrecio.getText());
        int stock = Integer.parseInt(txtStock.getText());
        cantidad = Integer.parseInt(txtCantidad.getText());
        total = cantidad*precio;
        
        ArrayList lista = new ArrayList();
        if (stock>0) {
            lista.add(item);
            lista.add(idproducto);
            lista.add(nombreProducto);
            lista.add(cantidad);
            lista.add(precio);
            lista.add(total);
            Object[] obj = new Object[6];
            obj[0] = lista.get(0);
            obj[1] = lista.get(1);
            obj[2] = lista.get(2);
            obj[3] = lista.get(3);
            obj[4] = lista.get(4);
            obj[5] = lista.get(5);
            
            modelo.addRow(obj);
            tablaVenta.setModel(modelo);
            calcularTotal();
        }else{
            JOptionPane.showConfirmDialog(this,"No hay stock");
        }
    }
    
    public void calcularTotal(){
        totalPagar = 0;
        for (int i = 0; i < tablaVenta.getRowCount(); i++) {
            cantidad = Integer.parseInt(tablaVenta.getValueAt(i, 3).toString());
            precio = Double.parseDouble(tablaVenta.getValueAt(i, 4).toString());
            totalPagar = totalPagar + (cantidad*precio);
        }
        txtTotal.setText(String.valueOf(totalPagar));
    }
    
    public void guardarVenta(){
        idcliente = c.getId();
        int idModoPago = cmbModoPago.getSelectedIndex();       
        String fecha = txtFecha.getText();
        String estado = "Activo";
        double monto = totalPagar;
        
        v.setId_cliente(idcliente);
        v.setId_modo_pago(idModoPago);
        v.setMonto(monto);
        v.setFecha(fecha);
        v.setEstado(estado);
        
        vdaoi.guardarVentas(v);
    }
    
    public void guardarDetalle(){
        int idventa  = Integer.parseInt(vdaoi.IdVentas());
        
        for (int i = 0; i < tablaVenta.getRowCount(); i++) {
            int idproducto = Integer.parseInt(tablaVenta.getValueAt(i, 1).toString());
            int cantidad = Integer.parseInt(tablaVenta.getValueAt(i, 3).toString());
            double precio = Double.parseDouble(tablaVenta.getValueAt(i, 4).toString());  
            d.setId_factura(idventa);
            d.setId_producto(idproducto);
            d.setPrecio(precio);
            d.setCantidad(cantidad);
            d.setEstado("Activo");
            ddaoi.guardarDetalleVenta(d);
        }
    }
    
    public void fecha(){
        Calendar calendario = new GregorianCalendar();
        txtFecha.setText(""+calendario.get(Calendar.DAY_OF_MONTH)+"/"+calendario.get(Calendar.MONTH)+"/"+calendario.get(Calendar.YEAR));
    }
    
    public void generarSerie(){
        String serie = vdaoi.IdVentas();
        String c = "VNT00";
        if (serie == null) {
            txtNroFactura.setText(c);
        }else{
            int incrementar = Integer.parseInt(serie);
            incrementar = incrementar + 1;
            txtNroFactura.setText(c+incrementar);
        }
    }
    
    public void actualizarStock(){
        for (int i = 0; i < modelo.getRowCount(); i++) {
            idproducto = Integer.parseInt(tablaVenta.getValueAt(i, 1).toString());
            cantidad = Integer.parseInt(tablaVenta.getValueAt(i, 3).toString());
            p = pdaoi.listaProductoId(idproducto);
            int stockactual = p.getStock() - cantidad;
            pdaoi.actualizarStock(stockactual, idproducto);
        }
    }
    
    public void nuevo(){
        txtCantidad.setText("");
        txtCliente.setText("");
        txtCodProducto.setText("");
        txtDniCliente.setText("");
        txtFecha.setText("");
        txtNroFactura.setText("");
        txtPrecio.setText("");
        txtProducto.setText("");
        txtStock.setText("");
        txtTotal.setText("");
        limpiarTabla();
    }
    
    public void limpiarTabla(){
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i=i-1;
        }
    }
    
    private void btnBuscarDniCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarDniCliActionPerformed
        buscarCliente();
    }//GEN-LAST:event_btnBuscarDniCliActionPerformed

    private void btnBuscarCodProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCodProdActionPerformed
        buscarProducto();
    }//GEN-LAST:event_btnBuscarCodProdActionPerformed

    private void btnAgregarPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPrecioActionPerformed
        agregarProducto();
    }//GEN-LAST:event_btnAgregarPrecioActionPerformed

    private void btnEfectuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEfectuarActionPerformed
        if (txtTotal.getText().equals("")) {
            JOptionPane.showConfirmDialog(this,"Complete todos los campos");
        }else{
            guardarVenta();
            guardarDetalle();
            actualizarStock();
            nuevo();
            generarSerie();
            fecha();
            JOptionPane.showConfirmDialog(this,"Venta realizada");
        }
        
    }//GEN-LAST:event_btnEfectuarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        txtCantidad.setText("");
        txtCliente.setText("");
        txtCodProducto.setText("");
        txtDniCliente.setText("");
        txtPrecio.setText("");
        txtProducto.setText("");
        txtStock.setText("");
        txtTotal.setText("");
        limpiarTabla();
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarPrecio;
    private javax.swing.JButton btnBuscarCodProd;
    private javax.swing.JButton btnBuscarDniCli;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEfectuar;
    private javax.swing.JComboBox<String> cmbModoPago;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaVenta;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtCodProducto;
    private javax.swing.JTextField txtDniCliente;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNroFactura;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtProducto;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
