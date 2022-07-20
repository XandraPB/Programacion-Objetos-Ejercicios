/*Se necesita crear un programa para la compañía de seguros CFPN36.
La misma debe contener un formulario con tabs, en los cuales se le cotiza a el cliente diferentes seguros.
En el caso de esta primera etapa se solicita seguros automotor, en donde la lógica es:
-Si selecciona Terceros completo , debe seleccionarse de manera automática responsabilidad civil
-Si selecciona TR sin franquicia, debe seleccionarse Responsabilidad Civil
-Si selecciona TR con franquicia, debe seleccionarse responsabilidad Civil y habilitar el campo para seleccionar la franquicia.
-Si selecciona Granizo, debe seleccionarse todos riesgo y responsabilidad civil.

Al presionar "Contratar" debe crear el archivo y guardar los datos del cliente con lo seleccionado en el seguro
(cobertura , marca , modelo, año, ect..)
El archivo es único para la compañía y el registro debe comenzar con el nombre del seguro que contrato, 
por ejemplo en este caso seria :
Seguros Automotor;CUIL;Nombre Apellido;Telefono; ect....

 * 
 */
package tabs2206;


import java.io.*;
import javax.swing.JOptionPane;


/**
 *
 * @author Alexandra
 */
public class archivo {
    
    File archivo;
     Seguros s = new Seguros ();
     
     
            
    public void crearArchivo () {
    
            try{
                archivo = new File ("SeguroCFP.txt");
                if (archivo.createNewFile()){
                  JOptionPane.showMessageDialog(null, "El archivo fue creado con exito");    
                }
                
            } catch (IOException e){
             System.out.println(e);
            }
    }
    
    
     public void escribirEnarchivo(persona persona){
       Seguros s = new Seguros ();
         
        try{
            
            FileWriter escribir = new FileWriter(archivo, true); 
               escribir.write( persona.getTseg() + ";" + persona.getCuil() + ";" + persona.getNombreyapellido() + ";" + persona.getEmail() + ";" + persona.getTelefono() + ";" +  persona.getDominio() + ":" + persona.getMarca() + "; " + persona.getModelo() + ";" + persona.getConfra() + ";"+ persona.getAno() + ";" + persona.getBox1() + ";" + persona.getBox2() + ";" + persona.getBox3() + ";" +  persona.getBox4() + ";" + persona.getBox5() + ";" + "\r\n");
             escribir.close();
         }
     catch (IOException e){
             System.out.println(e);
         }
            
            
     }
          
}
    
    
    

