package org.example.encapsulamiento;

import org.example.encapsulamiento.modelo.Persona;

public class Estudiante {
    private String codigo;
    private String carrera;

    public void trabajo(){
        System.out.println("estudiar,investigar"+"en la carrera de"+carrera);
    }

    public static class ClaseGeneral {
        public static void main(String[] args) {
            Persona persona = new Persona();
            persona.nombre = "Juan";
            persona.edad = 18;
            persona.saludo();
        }
    }
}
