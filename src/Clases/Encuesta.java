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
public class Encuesta extends Cliente{
    private int Atencion, Resolucion, Recomendacion;

    public Encuesta(int Atencion, int Resolucion, int Recomendacion, String Nombre, String Apellido, String ClienteNumero) {
        super(Nombre, Apellido, ClienteNumero);
        this.Atencion = Atencion;
        this.Resolucion = Resolucion;
        this.Recomendacion = Recomendacion;
    }

    public int getAtencion() {
        return Atencion;
    }
    public void setAtencion(int Atencion) {
        this.Atencion = Atencion;
    }

    public int getResolucion() {
        return Resolucion;
    }
    public void setResolucion(int Resolucion) {
        this.Resolucion = Resolucion;
    }

    public int getRecomendacion() {
        return Recomendacion;
    }

      public void setRecomendacion(int Recomendacion) {
        this.Recomendacion = Recomendacion;
    } 
    
    public double promedio(int NivelAtencion, int NivelRecomendac, int NivelResoluc) {
      Double prome = (double)(NivelAtencion + NivelRecomendac + NivelResoluc );
      prome = (prome / 3);
      
    return prome;
    
    }
    
}
