package Controlador;

/**
 *    Fundamentos de programación orientada a eventos 750014C-01
 *    Profesor: Luis Romo Portilla 
 *
 *    Archivo:  VentanaPrincipalControlador.java
 *    Licencia: GNU-GPL 
 *    @version  1.0
 *    
 *    @author   Alejandro Guerrero Cano           (202179652-3743) {@literal <"alejandro.cano@correounivalle.edu.co">}
 *    @author   Juan David Loaiza Santiago        (202177570-3743) {@literal <"juan.loaiza.santiago@correounivalle.edu.co">}
 * 
*/

import Modelo.*;
import Vista.*;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import java.lang.NumberFormatException;
import java.util.ConcurrentModificationException;

public class VentanaPrincipalControlador {
    
    int selectedRow = 0;
    int selectedAnio = 0;
    
    VentanaPrincipalModelo modelo = new VentanaPrincipalModelo();
    VentanaPrincipalVista vista = new VentanaPrincipalVista();

    public VentanaPrincipalControlador(VentanaPrincipalModelo modelo, VentanaPrincipalVista vista) {
        
        this.modelo = modelo;
        this.vista = vista;
        
        vista.setVisible(true);
        vista.setResizable(false);
        vista.setLocationRelativeTo(null);
        vista.setResizable(false);
        
        vista.addActionAgregarAño(oyenteAgregar);
        vista.addModificarAño(oyenteModificar);
        vista.addActionBorrarAño(oyenteEliminar);
        vista.addActionNuevoPronostico(oyenteNuevoPronostico);
        vista.addActionTable1(oyenteFila);
        
    }
    
    public void cargarTabla(){
        
        vista.limpiarTabla1();
        
        for(int i = 0; i < modelo.getCantidadMisVentas(); i++){
            int x = modelo.getMiX(i);
            double y = modelo.getMiY(i);
            int x2 = modelo.getMiX2(i);
            double y2 = modelo.getMiY2(i);
            double xy = modelo.getMiXY(i);
            
            vista.nuevaFilaVentas(x, y, x2, y2, xy);
        }
    }
        
    
    public void recargarTodo(){
        cargarTabla();
        vista.limpiarCampos();
    }
    
    
    
    //              LISTENERS               //
    ActionListener oyenteAgregar = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent evt) {
            
            
            modelo.agregarAnio(Double.parseDouble(vista.getCantidadVentas()));
            recargarTodo();
            
        }
        
    };
    
    
    ActionListener oyenteModificar = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent evt) {
            //int cantidadVentas = Integer.parseInt(vista.getCantidadVentas());
            //modelo.modificarAnio(cantidadVentas);
        }
    };
    
    /**
     * El año a eliminar se seleccciona automaticamente en el oyente de filas
     */
    ActionListener oyenteEliminar = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            modelo.eliminarAnio();
        }
    };
    
    /**
     * Solo eliminar todo
     */
    ActionListener oyenteNuevoPronostico = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            modelo.eliminarTodo();
            recargarTodo();
        }
        
    };
    
    
    MouseListener oyenteFila = new MouseListener() {
        @Override
        public void mousePressed(MouseEvent Mouse_evt) {
            JTable table = (JTable) Mouse_evt.getSource();
            selectedRow = table.getSelectedRow();
            Point point = Mouse_evt.getPoint();
            int row = table.rowAtPoint(point);
            
            try {
                selectedAnio = Integer.parseInt(table.getValueAt(table.getSelectedRow(), 0).toString());
                modelo.setSelectedAnio(selectedAnio);
            } catch (NumberFormatException e) {
                
            }

            if (Mouse_evt.getClickCount() == 1) {
                
            }
        }

        @Override
        public void mouseClicked(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
    };
}
