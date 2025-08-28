package org.example;

import org.jcp.xml.dsig.internal.SignerOutputStream;

public class ClaseGeneral {
    public static void main(String[] args) {
        persona p = new persona();//p=objetivo
        //p.nombre="Juan";
        //p.edad=25;
        p.setNombre("david");//encapsulamiento
        p.setEdad(20);//encapsulamiento
        p.apellido = "MAMANI";//no se esta aplicando encapsulamiento




        Trabajador t = new Trabajador();
        t.setNombre("Juan");
        t.setApellido("MAMANI");
        t.setEdad(25);
        t.setArea ("SISTEMAS");
        t.setGenero ('m');
        System.out.println(t);


    }
}
