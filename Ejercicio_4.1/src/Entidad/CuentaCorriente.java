
package Entidad;
public class CuentaCorriente extends Cuenta {
     float sobregiro;

    public CuentaCorriente(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        sobregiro = 0;
    }
     
    public void RetirarDinero(float cantidad) {
        float resultado = saldo - cantidad; 
        if (resultado < 0) {
                sobregiro = sobregiro - resultado;
                saldo = 0;
            } else {
                   super.RetirarDinero(cantidad); 
}
}
    
    public void ConsignarDinero(float cantidad) {
          float residuo = sobregiro - cantidad;
           if (sobregiro > 0) {
                if ( residuo > 0) { 
                        sobregiro = 0;
                        saldo = residuo;
                } else {
                        sobregiro =- residuo;
                        saldo = 0;
                            }
           } else {
            super.ConsignarDinero(cantidad);
} }
     public void ExtractoMensual() {
           super.ExtractoMensual(); }
     
     public void Imprimir() {
        System.out.println("Saldo = $ " + saldo);
        System.out.println("Cargo mensual = $ " + comisionMensual);
        System.out.println("Numero de transacciones = " +
        (numeroConsignaciones + numeroRetiros));
        System.out.println("Valor de sogregiro = $" +
        (numeroConsignaciones + numeroRetiros));
        System.out.println();
        }
}

