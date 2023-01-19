package Main;

/**
 *    Fundamentos de programación orientada a eventos 750014C-01
 *    Profesor: Luis Romo Portilla 
 *
 *    Archivo:  main.java
 *    Licencia: GNU-GPL 
 *    @version  1.0
 *    
 *    @author   Alejandro Guerrero Cano           (202179652-3743) {@literal <"alejandro.cano@correounivalle.edu.co">}
 *    @author   Juan David Loaiza Santiago        (202177570-3743) {@literal <"juan.loaiza.santiago@correounivalle.edu.co">}
 * 
*/

import Vista.*;
import Modelo.*;
import Controlador.*;

public class main {
    public static void main(String[] args) {
        VentanaPrincipalVista vista = new VentanaPrincipalVista();
        VentanaPrincipalModelo modelo = new VentanaPrincipalModelo();
        VentanaPrincipalControlador controlador = new VentanaPrincipalControlador(modelo,vista);
    }
  
}
