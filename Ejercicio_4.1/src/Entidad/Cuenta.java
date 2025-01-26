
package Entidad;
public class Cuenta {
   protected float saldo;
   protected int numeroConsignaciones=0;
   protected int numeroRetiros =0;
   protected float tasaAnual;
   protected float comisionMensual=0;

    public Cuenta() {
    }

    public Cuenta(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }
   
   public void ConsignarDinero(float cantidad){
       saldo = saldo + cantidad;
       numeroConsignaciones = numeroConsignaciones + 1;
       
   }
   
   public void RetirarDinero(float cantidad){
       float nuevoSaldo = saldo - cantidad;
    /* Si la cantidad a retirar no supera el saldo, el retiro no se puede
    realizar */
        if (nuevoSaldo >= 0) {
        saldo -= cantidad;
        numeroRetiros = numeroRetiros + 1;
        } else {
        System.out.println("La cantida a retirar excede el saldo actual.");
        } 
   }
   
   public void CalcularInteres(){
       float tasaMensual = tasaAnual/12;
       float interesMensual = saldo*tasaMensual;
       saldo = saldo + interesMensual;
   }
   
   public void ExtractoMensual(){
       saldo = saldo - comisionMensual;
       CalcularInteres();
   }
    
   
}
