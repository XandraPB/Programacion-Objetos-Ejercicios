


package ejerc1mascota;

import java.util.Scanner;


public class Perro {
  String nombre,raza,color;
  int edad;
  Scanner entrada = new Scanner(System.in);
  
  
 public void pedir(){
  System.out.print("Ingrese el Nombre del Perro:");
  nombre = entrada.nextLine();
  System.out.print("Ingrese el Raza del Perro:");
  raza = entrada.nextLine();
  System.out.print("Ingrese el Color del Perro:");
  color = entrada.nextLine();
  
  }
 
  public void Ficha(){
  System.out.println("---------------Veterinaria CFP36-------------------");
  System.out.println("---------------Nombre:"+ nombre + "---");
  System.out.println("----------------Raza:"  + raza + "---");
  System.out.println("----------------Color:" + color + "---");
  System.out.println("-----------------------------------------------------");
  }
  
  public void ladrar(){
  System.out.println("GUA GUA GUA");
  }

    void correr() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
} 
    
    
    

