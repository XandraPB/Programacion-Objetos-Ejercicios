/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabs2206;

/**
 *
 * @author Usuario
 */
public class persona {
   //archivo = new archivo;
    
    
    
    
    String cuil;
    String nombreyapellido;
    String telefono;
    String email;
    String tseg;
    String dominio;
    String modelo;
    String marca;
    String confra;
    String ano;
    String box1;
    String box2;
    String box3;
    String box4;
    String box5;
    
    
    String heladera;
    String lavarropa;
    String cocina;
    String notebook;
    String consolagames;
    String televisor;
    
    
    
     public persona( String cuil, String nombreyapellido, String telefono, String email,String tseg, String dominio, String marca, String confra, String ano, String box1, String box2, String box3, String box4, String box5 ){
         
         this.cuil = cuil;
         this.nombreyapellido = nombreyapellido;
         this.email = email; 
         this.tseg = tseg;
         this.telefono = telefono;
         this.dominio = dominio; 
         this.marca = marca;
         this.confra = confra;
         this.ano = ano;
         this.box1 = box1;
         this.box2 = box2;
         this.box3 = box3;
         this.box4 = box4;
         this.box5 = box5;        
     }

     public persona (String cuil, String tseg){
         this.cuil = cuil;
         this.tseg = tseg;
     }
     
     public persona (String cuil, String nombreyapellido, String telefono, String email, String tseg){
          this.cuil = cuil;
          this.nombreyapellido = nombreyapellido;
          this.telefono = telefono;
          this.email = email;
          this.tseg = tseg;
          
     }
        
    public persona (String heladera,String lavarropa, String cocina, String notebook, String consolagamer, String televisor){
        this.heladera = heladera;
        this.lavarropa = lavarropa;
        this.cocina = cocina;
        this.notebook = notebook;
        this.consolagames = consolagames;
        this.televisor = televisor;
        
    }
     
     
    public String getNombreyapellido() {
        return nombreyapellido;
    }

    public String getTseg() {
        return tseg;
    }
 
     
    public String getCuil() {
        return cuil;
    }

    public void setCuil(String cuil) {
        this.cuil = cuil;
    }


    public String getTelefono() {
        return telefono;
    }


    public String getEmail() {
        return email;
    }


    public String getDominio() {
        return dominio;
    }


    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getConfra() {
        return confra;
    }

    public String getAno() {       
        return ano;
    }

    public String getBox1() {
        return box1;
    }

    public String getBox2() {
        return box2;
    }

    public String getBox3() {
        return box3;
    }

    public String getBox4() {
        return box4;
    }

    public String getBox5() {
        return box5;
    }

    public String getHeladera() {
        return heladera;
    }

    public String getLavarropa() {
        return lavarropa;
    }

    public String getCocina() {
        return cocina;
    }

    public String getNotebook() {
        return notebook;
    }

    public String getConsolagames() {
        return consolagames;
    }

    public String getTelevisor() {
        return televisor;
    }
    
    
    
    
  String cuil(){
      throw new UnsupportedOperationException("Not supportet yet.");
  }  
    
    
}
