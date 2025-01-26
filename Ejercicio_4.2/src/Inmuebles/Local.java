
package Inmuebles;
public class Local extends Inmueble{
    protected tipo tipoLocal;
    
    public Local(int identificadorInmobiliario, int area, String direccion,
    tipo tipoLocal) {
    super(identificadorInmobiliario, area, direccion);
    this.tipoLocal = tipoLocal;
}
    void imprimir() {
super.imprimir(); // Invoca al método imprimir de la clase padre
System.out.println("Tipo de local = "+ tipoLocal);
}
    
}
