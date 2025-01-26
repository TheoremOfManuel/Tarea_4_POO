
package Entidad;

public class CuentaAhorros extends Cuenta{
    
    boolean activa;


    public CuentaAhorros( float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        activa = saldo >= 10000;
    }
    
    public void RetirarDinero(float cantidad) {
        if (activa){ 
            super.RetirarDinero(cantidad); }
}
    
    public void ConsignarDinero(float cantidad) {
        if (activa){ 
            super.ConsignarDinero(cantidad);}
}
    
public void ExtractoMensual() {
    if (numeroRetiros > 4) {
    comisionMensual += (numeroRetiros - 4) * 1000;
    }
        super.ExtractoMensual(); // Invoca al método de la clase padre
/* Si el saldo actualizado de la cuenta es menor a 10000, la
cuenta no se activa */
        if ( saldo < 10000 ){
            activa = false;}
}

public void Imprimir() {
    System.out.println("Saldo = $ " + saldo);
    System.out.println("Comision mensual = $ " +
    comisionMensual);
    System.out.println("Numero de transacciones = " +
    (numeroConsignaciones + numeroRetiros));
    System.out.println();
}
    
    
    
}
