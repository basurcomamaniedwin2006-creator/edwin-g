package herencia;

import org.example.Trabajador;

public class carro extends vehiculo {

    public static void main(String[] args) {
        carro c = new carro();
        c.marca="toyota";
        System.out.println("marca"+c.marca);
        System.out.println("modelo"+c.modelo);

        c.sonido();

    }



    }

