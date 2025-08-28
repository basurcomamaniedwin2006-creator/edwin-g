package org.example.encapsulamiento;

import jdk.jfr.DataAmount;

@DataAmount

public class Jugador {
    private String nombre;
    private String apellido;
    private int edad;
    private String posicion;
    private int numeroCan;

    @Override
    public String toString() {
        return "el jugador tiene lasd caracteristicas:\n" +
                "Nombre:" + nombre+"\n"+"su apellido es"+apellido+"\n"+"la edad es de "+edad+"\n"+"su posicion es de "+posicion+"\n"+"y el numero de can es"+numeroCan+"\n";
    }

}
