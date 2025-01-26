
package Inmuebles;
public class LocalComercial extends Local{
    protected static double valorArea = 3000000;
    protected String centroComercial;
    
    public LocalComercial(int identificadorInmobiliario, int area, String
     direccion, tipo tipoLocal, String centroComercial) {
    super(identificadorInmobiliario, area, direccion, tipoLocal);
    this.centroComercial = centroComercial;
}
    
    void imprimir() {
    super.imprimir(); // Invoca al método imprimir de la clase padre
    System.out.println("Centro comercial = " + centroComercial);
    System.out.println();
    }
}
