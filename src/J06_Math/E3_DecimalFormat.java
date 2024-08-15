package J06_Math;

import java.text.DecimalFormat;

public class E3_DecimalFormat {
    public static void main(String[] args) {
        ejemplo1();
        ejemplo2();
    }


    public static void ejemplo1 (){
        DecimalFormat df = new DecimalFormat("#.###");
        double a = 77/9.0;

        System.out.println("Ejemplo 1: "
                +"\n\tvalor decimal : "+a
                +"\n\tvalor formato : "+df.format(a)
        );

    }


    public static void ejemplo2(){
        double a = 77,  b = 9;
        double r = a/b;

        double x = Math.round(r * 1000d) /1000d;

        System.out.println("Ejemplo 2: "
                +"\n\tvalor decimal  : "+r
                +"\n\tvalor filtrado : "+x
        );
    }
}
