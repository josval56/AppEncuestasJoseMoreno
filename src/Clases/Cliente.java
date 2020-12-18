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
public class Cliente {
    private String Nombre;
    private String Apellido;
    private String ClienteNumero;
        


public Cliente(String Nombre, String Apellido, String ClienteNumero){
    this.Nombre = Nombre;
    this.Apellido = Apellido;
    this.ClienteNumero = ClienteNumero;
}

public String getNombre(){
    return Nombre;
}

public void setNombre(String Nombre) {
    this.Nombre = Nombre;
}

public String getApellido() {
    return Apellido;
}

public void setApellido(String Apellido){
    this.Apellido = Apellido;
}

public String getClienteNumero(){
    return ClienteNumero;
}

public void setClienteNumero(String ClienteNumero){
    this.ClienteNumero = ClienteNumero;
}
}