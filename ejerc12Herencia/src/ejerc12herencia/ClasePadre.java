/*
 * pedir datos y mostrar resultados
 */
package ejerc12herencia;

import java.util.Scanner;


public class ClasePadre {
    
    protected int valor1, valor2, resultado; //protected solo para usar por este metodo
    Scanner entrada = new Scanner (System.in);
    
    
    //Este metodo pide los valores al usuario
    public void PedirDatos (){
        System.out.println("Por favor coloque el primer dato"); 
        valor1 = entrada.nextInt();
        System.out.println("Por favor ingrese segundo valor: ");
        valor2 = entrada.nextInt();
               
    }
    
    //este muestra el resultado
    public void verResultado(){
        System.out.println("Resultado de la suma es: " + resultado);
        
    }
            
}
