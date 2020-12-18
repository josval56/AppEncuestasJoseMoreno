/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Valmore
 */
public class Validadores {
    
     public Validadores() {
    }
     public String validarNombreApellido(String NomApe, int min, int max) {
        String resu="";
        NomApe=NomApe.trim().toUpperCase();
        
        if(NomApe.length() > min && NomApe.length() < max  ){
          if(!NomApe.contains("  "))
            resu=NomApe; 
        }
        if (resu=="") { 
            System.out.println("Debe Ingresar un Texto");
        }
        return resu;
    }    
     public boolean validarNumeros(String dato, int largo ){
    boolean resu=false;
    
      if(dato.matches("[0-9]*") && (dato.length() <= largo) ) 
         resu=true;
      
      return resu;  
    }
     
}
