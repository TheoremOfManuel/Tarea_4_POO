
package Inmuebles;

public class ApartamentoFamiliar extends Apartamento {
    protected static double valorArea = 2000000;
    protected int valorAdministracion;
    
    public ApartamentoFamiliar(int identificadorInmobiliario, int area,
String direccion, int numeroHabitaciones, int numeroBanos, int
valorAdministracion) {
// Invoca al constructor de la clase padre
super(identificadorInmobiliario, area, direccion,
numeroHabitaciones, numeroBanos);
this.valorAdministracion = valorAdministracion;
}
    
    void imprimir() {
super.imprimir(); 
System.out.println("Valor de la administración = $" +
valorAdministracion);
System.out.println();
}
}
