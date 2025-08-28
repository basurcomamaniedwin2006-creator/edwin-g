package org.example.herencia;

public class carro extends vehiculo {
    String modelo="mustang";
    String color="pe-45263";
    String placa="gris";

    void caracteristicas(){
        System.out.println("las caracteristicas de l carro es");
        System.out.println("Color: "+color);
        System.out.println("Placa: "+placa);
        System.out.println("Marca: "+marca);

    }
    public static void main(String[] args) {
        carro carro = new carro();
        carro.caracteristicas();
        carro.sonido();
    }

}
