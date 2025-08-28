package org.example;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Data
//@Getter
//@Setter
public class Trabajador {
    String nombre;
    int edad;
    String apellido;
    String area;
    char genero;

    @Override
    public String toString() {
        return "tiene las siguientes caracteristicas \n"+
                "nombre :"+nombre+"\n"+
                "Apellido :"+apellido+"\n"
                ;
    }
    }
