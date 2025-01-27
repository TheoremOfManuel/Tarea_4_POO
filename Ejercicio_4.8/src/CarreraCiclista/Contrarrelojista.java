
package CarreraCiclista;
public class Contrarrelojista extends Ciclista {
    private double velocidadMaxima;
    
    public Contrarrelojista(int identificador, String nombre, double
    velocidadMáxima) {
    super(identificador, nombre);
    this.velocidadMaxima = velocidadMaxima;
}
    protected double getVelocidadMaxima() {
    return velocidadMaxima;
}
    protected void setVelocidadMáxima(double velocidadMáxima) {
    this.velocidadMaxima = velocidadMaxima;
}
    protected void imprimir() {
    super.imprimir(); // Invoca el método imprimir de la clase padre
    System.out.println("Aceleracion promedio = " +velocidadMaxima);
}
    
    protected String imprimirTipo() {
    return "Es un constrarrelojista";
}
    
}
