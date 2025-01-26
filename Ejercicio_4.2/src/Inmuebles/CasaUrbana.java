
package Inmuebles;

public class CasaUrbana extends Casa{
    
public CasaUrbana(int identificadorInmobiliario, int area, String
direccion, int numeroHabitaciones, int numeroBaños, int
numeroPisos) {
// Invoca al constructor de la clase padre
super(identificadorInmobiliario, area, direccion,
numeroHabitaciones, numeroBaños, numeroPisos);
}

void imprimir() {
super.imprimir(); // Invoca al método imprimir de la clase padre
}
}
