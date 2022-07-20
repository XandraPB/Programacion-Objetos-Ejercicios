/*
 * Crear un programa que genere un formulario utilizando la librería swing.
Poner un titulo a el formulario y no permitir la modificación de tamaño.
 */
package ejerc17formulario2004;


import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.*;


public class formulario1 extends JFrame implements ActionListener{
   private JLabel Nombre, Apellido, Direccion;
   private JButton bot1, bot2, bot3;
   //private ActionListener 1;
   
    
    public formulario1 (){
        setLayout(null);
        
        Nombre = new JLabel ("Alexandra");
        Nombre.setBounds(60, 10, 100, 100);
        add(Nombre);
        Apellido= new JLabel ("Perez");
        Apellido.setBounds(160, 10, 100, 100);
        add(Apellido);
        Direccion = new JLabel ("Pieres 1378");
        Direccion.setBounds(260, 10, 100, 100);
        add(Direccion);
        
        
        bot1 = new JButton ("1");
        bot1.setBounds(20, 110, 90, 30);
        add(bot1);
        bot1.addActionListener(this);
        
        bot2 = new JButton ("2");
        bot2.setBounds(130, 110, 90, 30);
        add(bot2);
        //bot2.addActionListener(this);
        
        
        bot3 = new JButton ("3");
        bot3.setBounds(250, 110, 90, 30);
        add(bot3);
        //bot3.addActionListener(this);
        
        
        
        
    }
    
    public void acctionPerformed(ActionEvent e){
     if (e.getSource() == bot1) {
         Nombre.setText("boton 1");
         
     } 
     
     
     
    }
    
    
    
    
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
