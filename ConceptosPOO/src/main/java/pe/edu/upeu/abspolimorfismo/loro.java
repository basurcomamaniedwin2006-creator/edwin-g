package pe.edu.upeu.abspolimorfismo;

public class loro extends animal{

    @Override
    void emitirSonido() {
        System.out.println("hey... note distraigas¡");
    }
    @Override
    void dormir() {
        super.dormir();
        System.out.println( "dejame dormir " +
                "zzz zzz zzz");
    }
}
