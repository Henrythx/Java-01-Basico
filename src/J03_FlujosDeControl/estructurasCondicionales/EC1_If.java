package J03_FlujosDeControl.estructurasCondicionales;

import java.util.Scanner;

public class EC1_If {
    public static void main(String[] args) {
        //ejemplo1();
        //ejemplo2();
        //ejemplo3();
        ejemplo4();
    }


    public static void ejemplo1(){
        int dato = 15;
        String mensaje = "";

        if (dato>12){
            mensaje = "La nota es aceptable";
        } else {
            mensaje = "La nota no es aceptable";
        }
        System.out.println(mensaje);
    }


    public static void ejemplo2(){
        int dato = 15;
        String mensaje = "";

        if (dato>12)    mensaje = "La nota es aceptable";
        else            mensaje = "La nota no es aceptable";

        System.out.println(mensaje);
    }


    public static void ejemplo3(){
        int dato = 15;
        String mensaje = (dato>12)  ?   "aprobado" : "desaprobado";
        System.out.println(mensaje);
    }


    public static void ejemplo4(){
        Scanner scan = new Scanner(System.in);
        int year=0,     month=0,    days=0;

        System.out.println("Ingrese el año");
        //Si el valor en consola es un número, se asigna a "year" caso contrario un 0
        year = scan.hasNextInt()    ?   scan.nextInt()  :   0;

        System.out.println("Ingrese el mes(1-12)");
        month = scan.hasNextInt()   ?   scan.nextInt()  :   0;

        if (month==1 ||month==3 ||month==5 ||month==7 ||month==8 ||month==10 ||month==12)
            days = 31;
        else if (month==4 || month==6 || month==9 || month==11)
            days = 30;
        else if (month==2){
            if((year%4==0 && year%100!=0)   ||  year%400==0)
                    days = 29;
            else    days = 28;
        }
        System.out.println("Resultados"
                +"\n\tAño   : "+year
                +"\n\tMes   : "+month
                +"\n\tDias  : "+days
        );
    }
}
