/*Crear un programa que realice dos operaciones (Suma y Resta). 
Tomando la estructura de el ejercicio 11 de herencia pero aplicando metodos
de ppolimorfismo para llamar al metodo operaciones segun de que clase hija 
sea llamado.
 * 
 */
package polimorfismo;

import java.util.Scanner;


public abstract class Operacion {
    //atributos
    protected int valor1,valor2, resultado;
    Scanner leer = new Scanner(System.in);
    
    public void PedisDatos (){
        System.out.println("Primer valor: ");
        valor1 = leer.nextInt();       
        
        System.out.println("Segindo valor: ");
        valor2 = leer.nextInt();
 
    }
    
    //metodo poliformismo
    public abstract void operaciones ();
    
    public void Mostrarresultado (){
        System.out.println("El resultado es: " + resultado);
        
    }
    
}
