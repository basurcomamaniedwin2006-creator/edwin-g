package org.example.encapsulamiento.modelo;

public class Persona {
    public String nombre;
    protected int edad;
    private char genero;

    void saludo(){
        System.out.println("hola mi nombre es" + nombre+ "y mi edad es "+edad );

    }
}
