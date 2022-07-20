/*
 *
 */
package polimorfismo;


public class ClasePrincipal {
    
    
    public static void main(String[] args) {
        
        //objetos para llamar las clases
        Operacion suma = new Suma ();
        suma.PedisDatos();
        suma.operaciones();
        suma.Mostrarresultado();
        
        Operacion resta = new Resta ();
        resta.PedisDatos();
        resta.operaciones();
        resta.Mostrarresultado();
        
        
        
        
        
    }
    
    
}
