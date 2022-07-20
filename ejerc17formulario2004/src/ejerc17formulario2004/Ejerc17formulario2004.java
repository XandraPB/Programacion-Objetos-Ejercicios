/*
 * Crear un programa que genere un formulario utilizando la librería swing.
Poner un titulo a el formulario y no permitir la modificación de tamaño.
 */
package ejerc17formulario2004;


public class Ejerc17formulario2004 {

    
    public static void main(String[] args) {
       
        formulario1 form = new formulario1();
               
        form.setBounds(50, 50, 400, 550); //posicion y tamano
        form.setVisible(true); //visualiza formulario
        form.setLocationRelativeTo(null); // centra formulario
        form.setResizable(false);  //edicion de tamano
        form.setTitle("Formulario ejercicio 17"); // titulo
        
        //Botones acciones
        form.setDefaultCloseOperation(formulario1.EXIT_ON_CLOSE);
        
    }
    
}
