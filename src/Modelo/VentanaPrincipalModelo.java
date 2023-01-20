package Modelo;

/**
 *    Fundamentos de programación orientada a eventos 750014C-01
 *    Profesor: Luis Romo Portilla 
 *
 *    Archivo:  VentanaPrincipalModelo.java
 *    Licencia: GNU-GPL 
 *    @version  1.1
 *    
 *    @author   Alejandro Guerrero Cano           (202179652-3743) {@literal <"alejandro.cano@correounivalle.edu.co">}
 *    @author   Juan David Loaiza Santiago        (202177570-3743) {@literal <"juan.loaiza.santiago@correounivalle.edu.co">}
 * 
*/

public class VentanaPrincipalModelo {
    
    java.util.List<Venta> misVentas = new java.util.ArrayList<>();
    
    int selectedAnio = -1;
    
    double a;
    double b;
    double c;
    int sumatoriaX;
    double sumatoriaY;
    int sumatoriaX2;
    double sumatoriaY2;
    double sumatoriaXY;
    double n; // Numero de años
    
    /**
     * Constructor de VentanaPrincipalModelo
     */
    public VentanaPrincipalModelo(){
    }
    
    
    //              SISTEMA                //
    public void setSelectedAnio(int anio){
        selectedAnio = anio;
    }
    
    public void setAniosPronostico(int anio){
        n = anio;
        calcularTodo();
    }
    
    
    //              AGREGAR, MODIFICAR Y ELIMINAR               //
    public void agregarAnio(double cantidadVentas){
        misVentas.add(new Venta(misVentas.size()+1, cantidadVentas));
        calcularTodo();
    }
    
    public void modificarAnio(double cantidadVentas){
        for (Venta ventaActual : misVentas) {
            if (ventaActual.getX() == selectedAnio) {
                ventaActual.setY(cantidadVentas);
                break;
            }
        }
        calcularTodo();
    }
    
    public void eliminarAnio(){
        
        for(Venta ventaActual: misVentas){
            if(ventaActual.getX() == selectedAnio){
                misVentas.remove(ventaActual);
                break;
            }
        }
        
        for (int i = selectedAnio - 1; i < (misVentas.size()); i++) {
            misVentas.get(i).setX(misVentas.get(i).getX() - 1);
        }
        calcularTodo();
        
    }
    
    public void eliminarTodo(){
        misVentas.clear();
    }
    
    
    //              FUNCIONES AUXILIARES                //
    public int getCantidadMisVentas(){
        return misVentas.size();
    }
        
    public boolean existeAnio(int anio){
        
        boolean respuesta = false;
        
        for(Venta ventaActual: misVentas){
            if(ventaActual.getX() == anio){
                respuesta = true;
                break;
            }
        }
        
        return respuesta;
    }
    
    
    //              GETTERS               //
    // MIS VENTAS
    public int getMiX(int indice){
        return misVentas.get(indice).getX();
    }
    
    public double getMiY(int indice){
        return misVentas.get(indice).getY();
    }
    
    public int getMiX2(int indice){
        return misVentas.get(indice).getX2();
    }
    
    public double getMiY2(int indice){
        return misVentas.get(indice).getY2();
    }
    
    public double getMiXY(int indice){
        return misVentas.get(indice).getXY();
    }
    
    // PRONOSTICADAS
    public double getA(){
        return a;
    }
    
    public double getB(){
        return b;
    }
    
    public double getC(){
        return c;
    }
    
    // SUMATORIAS
    public int getSumatoriaX() {
        return sumatoriaX;
    }

    public double getSumatoriaY() {
        return sumatoriaY;
    }

    public int getSumatoriaX2() {
        return sumatoriaX2;
    }

    public double getSumatoriaY2() {
        return sumatoriaY2;
    }

    public double getSumatoriaXY() {
        return sumatoriaXY;
    }
    
    // AUXILIARES
    public double getCantidadVentasAnio(int anio){
        double cantidad = 0;
        
        for(Venta ventaActual: misVentas){
            if(ventaActual.getX() == anio){
                cantidad = ventaActual.getY();
            }
        }
        
        return cantidad;
    }
    
    //              CALCULOS DE ARRAY COMPLETO              //
    // CALCULOS ATAJO
    public void calcularTodo(){
        calcularSumatorias();
        calcularABC();
    }
    
    public void calcularABC(){
        calcularB();
        calcularA();
        calcularC();
    }
    
    public void calcularSumatorias(){
        calcularSumatoriaX();
        calcularSumatoriaY();
        calcularSumatoriaX2();
        calcularSumatoriaY2();
        calcularSumatoriaXY();
    }
    
    // CALCULOS INDIVIDUALES
    public void calcularSumatoriaX(){
        
        int acumulador = 0;
        
        for(Venta ventaActual: misVentas){
            acumulador += ventaActual.getX();
        }
        sumatoriaX = acumulador;
    }
    
    public void calcularSumatoriaY(){
        
        double acumulador = 0;
        
        for(Venta ventaActual: misVentas){
            acumulador += ventaActual.getY();
        }
        sumatoriaY = acumulador;
    }
    
    public void calcularSumatoriaX2(){
        
        int acumulador = 0;
        
        for(Venta ventaActual: misVentas){
            ventaActual.calcularTodo();
            acumulador += ventaActual.getX2();
        }
        
        sumatoriaX2 = acumulador;
    }
    
    public void calcularSumatoriaY2(){
        
        double acumulador = 0;
        
        for(Venta ventaActual: misVentas){
            ventaActual.calcularTodo();
            acumulador += ventaActual.getY2();
        }
        
        sumatoriaY2 = acumulador;
    }
    
    public void calcularSumatoriaXY(){
        
        double acumulador = 0;
        
        for(Venta ventaActual: misVentas){
            ventaActual.calcularTodo();
            acumulador += ventaActual.getXY();
        }
        
        sumatoriaXY = acumulador;
    }
    
    public void calcularA(){
        double numerador = sumatoriaY - (b * sumatoriaX);
        double denominador = n;
        a = Math.round(numerador / denominador * 100.0) / 100.0;
    }
    
    public void calcularB(){
        
        double numerador = (n * sumatoriaXY) - (sumatoriaX * sumatoriaY);
        double denominador = (n * sumatoriaX2 ) - (sumatoriaX * sumatoriaX);
        
        b = Math.round(numerador/denominador * 100.0) / 100.0;
    }
    
    public void calcularC(){
        
        double numerador = b*n;
        double denominador = sumatoriaY;
        
        c = Math.round(numerador/denominador * 1000.0) / 1000.0;
    }
}
