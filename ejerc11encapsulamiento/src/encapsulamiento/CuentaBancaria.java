/*Encapsular la clase del ejercicio 3 y realizar los métodos getter y setter 
necesarios.
 * 
 */
package encapsulamiento;

import java.util.Scanner;


/**
 *
 * @author Alexandra
 */
public class CuentaBancaria {
    
    private String Titular; 
    private String TipoDeCuenta;
    private int monto;
    private int montoextraer;
    private int montototal;
    
    public void CuentaBancaria (int montocuenta) {
        monto = montocuenta;
    }
    
    public void Extrar () {
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Nombre del titular");
        Titular = entrada.nextLine();
        
        System.out.println("Tipo de cuenta ahorro Pesos - USD");
        TipoDeCuenta = entrada.nextLine();
        
        System.out.println("Ingrese monto a extraer");
        montoextraer = entrada.nextInt();
        
        
        
        if (montoextraer > monto){
            System.out.println("No tiene suficiente saldo para realizar esta operacion");
        }
        
        else{ montototal = montoextraer;
        
        
        
            System.out.println("Nombre del titular: " + Titular);
            System.out.println("tipo de cuanta: " + TipoDeCuenta);
            System.out.println("Su saldo es: " + montototal);
            System.out.println("Saldo extraido: " + montoextraer);
            
        }
    }
   
}
