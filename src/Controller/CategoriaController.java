
package Controller;

import DAO.CategoriaDAOImpl;
import Model.Categoria;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import View.CategoriasInternalFrm2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CategoriaController implements ActionListener{
    
    Categoria c = new Categoria();
    CategoriaDAOImpl cdaoi = new CategoriaDAOImpl(c);
    CategoriasInternalFrm2 cif = new CategoriasInternalFrm2();
    DefaultTableModel modelotabla = new DefaultTableModel();

    public CategoriaController(CategoriasInternalFrm2 cfrm) {
        this.cif = cfrm;
        this.cif.btnagregarCat.addActionListener(this);
        this.cif.btnactualizarCat.addActionListener(this);
        this.cif.btneliminarCat.addActionListener(this);
        this.cif.btnlimpiarCat.addActionListener(this);
    }
    
    
    
    public void verTabla(){
//        modelotabla = (DefaultTableModel) jtablaCat.getModel();
        modelotabla = (DefaultTableModel) cif.jtablaCat.getModel();
        List<Categoria> lista = cdaoi.listarCategoria();
        Object[] obj = new Object[3];
        for (int i = 0; i < lista.size(); i++) {
            obj[0] = lista.get(i).getId();
            obj[1] = lista.get(i).getNombre();
            obj[2] = lista.get(i).getEstado();
            modelotabla.addRow(obj);
        }
        cif.jtablaCat.setModel(modelotabla);
    }
    public void limpiarTabla(){
        for (int i = 0; i < modelotabla.getRowCount(); i++) {
            modelotabla.removeRow(i);
            i=i-1;
        }
    }
    
    
    public void agregar(){
        String nombre = cif.txtnombreCat.getText();
        c.setNombre(nombre);
        cdaoi.agregarCategoria(c);
    }
    public void actualizar(){
        int fila = cif.jtablaCat.getSelectedRow();
        if (fila==-1) {
            JOptionPane.showMessageDialog(cif, "Debe seleccionar una fila");
        }else{
            int id = Integer.parseInt(cif.txtcodigoCat.getText());
            String nombre = cif.txtnombreCat.getText();
            cdaoi.actualizarCategoria(nombre,id);   
        }
    }
    
    public void eliminar(){
        int fila = cif.jtablaCat.getSelectedRow();
        int id = Integer.parseInt(cif.jtablaCat.getValueAt(fila,0).toString());
        if (fila==-1) {
            JOptionPane.showMessageDialog(cif, "Debe seleccionar una fila");
        }else{
            cdaoi.eliminarCategoriaLogico(id);
        }
    }
    
    public void limpiar(){
        cif.txtcodigoCat.setText("");
        cif.txtnombreCat.setText("");
        cif.txtestadoCat.setText("");
        modelotabla.getDataVector().removeAllElements();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==cif.jtablaCat) {
            verTabla();
        }
    }
    
    
    
    
}
