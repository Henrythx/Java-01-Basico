package J05_Fechas.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class E03_Calendar {
    public static void main(String[] args) {
        ejemplo1();
        ejemplo2();
        ejemplo3();
        ejemplo4();
    }


    public static void ejemplo1(){
        Calendar c = Calendar.getInstance();
        c.set(2002,4,27,2,45);

        System.out.println("Ejemplo 1 : "+c);
    }


    public static void ejemplo2(){
        Calendar c = Calendar.getInstance();
        c.set(2002,4,27,2,45);

        Date fecha = c.getTime();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SSS a");
        System.out.println("Ejemplo 2 : "+df.format(fecha));
    }


    public static void ejemplo3(){
        Calendar c = Calendar.getInstance();

        c.set(Calendar.YEAR , 2002);
        c.set(Calendar.MONTH, 4   );
        c.set(Calendar.DAY_OF_MONTH , 27);

        c.set(Calendar.HOUR_OF_DAY  , 20);
        c.set(Calendar.MINUTE       , 20);

        Date fecha = c.getTime();
        System.out.println("Ejemplo 3 : "+fecha);
    }


    public static void ejemplo4(){
        Calendar c = Calendar.getInstance();

        c.set(Calendar.YEAR , 2020);
        c.set(Calendar.MONTH, 7);
        c.set(Calendar.DAY_OF_MONTH, 28);

        c.set(Calendar.HOUR  , 7);
        c.set(Calendar.AM_PM , Calendar.PM);
        c.set(Calendar.MINUTE, 45);
        c.set(Calendar.MILLISECOND, 20_000);

        Date fecha = c.getTime();
        System.out.println("Ejemplo 4 : "+fecha);
    }





}
