
package pe.edu.upeu.interfas;

public class ClaseGeneral {
    public static void main(String[] args) {
        Animal a=new Lord();
        a.emitirsonido();
        a.dormir();

        a=new gato();
        a.emitirsonido();
        a.dormir();

    }
}
