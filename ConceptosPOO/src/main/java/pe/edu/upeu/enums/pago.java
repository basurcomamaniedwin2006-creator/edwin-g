package pe.edu.upeu.enums;

enum TIPO_PAGO{Efectivo,Credito,Transferencia,yape};
enum MES{enero,febrero,}


public class pago {
    TIPO_PAGO tipo;
    MES mes;
    double monto;
    String cuenta;
    double impuesto;

    public static void main(String[] args) {
        pago p = new pago();
        p.tipo = TIPO_PAGO.Efectivo;
        p.mes = MES.enero;
        p.monto = 100;
        p.cuenta = "1564,487,78945";
        p.impuesto = 10;

        System.out.println("tipo de pago: "+p.tipo);
        System.out.println( "monto"+p.mes);
        System.out.println("cuenta: "+p.cuenta);
        System.out.println("impuesto: "+p.impuesto);

        for (TIPO_PAGO t : TIPO_PAGO.values()) {
            System.out.println("tipo de pago: "+t);

        }


    }

}
