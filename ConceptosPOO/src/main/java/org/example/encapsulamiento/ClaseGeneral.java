package org.example.encapsulamiento;

import org.example.encapsulamiento.modelo.Persona;

public static class ClaseGeneral {
    public static void probar() {
        Estudiante estudiante = new Estudiante();
        estudiante.setCarrera("ING.sistemas");
        estudiante.setCodigo("2024202020");
        estudiante.trabajo();
    }
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("david");
        persona.setEdad(18);
    }
}