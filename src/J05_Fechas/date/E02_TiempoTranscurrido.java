package J05_Fechas.date;

import java.util.Date;

public class E02_TiempoTranscurrido {
    public static void main(String[] args) {
        ejemplo1();
        ejemplo2();
    }


    public static void ejemplo1(){
        Date fecha1 = new Date();
        sentencia();
        Date fecha2 = new Date();

        long t = fecha2.getTime()-fecha1.getTime();
        System.out.println("Ejemplo 1 : \n\tTiempo transcurrido : "+t+" milisegundos");
    }



    public static void ejemplo2(){
        long tiempo1 = System.currentTimeMillis();
        sentencia();
        long tiempo2 = System.currentTimeMillis();

        long t = tiempo2 - tiempo1;
        System.out.println("Ejemplo 2 : \n\tTiempo transcurrido : "+t+" milisegundos");
    }



    public static void sentencia(){
        long c = 0;
        for (long i = 0; i < 9_000_000_000L; i++)     c++;
        System.out.println(c);
    }
}
