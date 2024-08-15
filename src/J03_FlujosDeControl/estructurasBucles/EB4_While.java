package J03_FlujosDeControl.estructurasBucles;

import java.util.Random;
import java.util.Scanner;

public class EB4_While {
    public static void main(String[] args) {
        //ejemplo1();
        //ejemplo2();
        //ejemplo3();
        //ejemplo4();
        ejemplo5();
    }


    //Bucle infinito
    public static void ejemplo1(){
        int i=0;
        while (i<20){
            System.out.println("Ciclo "+i+", ¿Desea terminar? (yes)");
            if (new Scanner(System.in).nextLine().equalsIgnoreCase("yes"))
                break;
            i++;
        }
        System.out.println("Bucle terminado");
    }


    public static void ejemplo2(){
        int a=0,    b=20;

        while (a<8 && b>15){
            System.out.println("a: " + a + " ,b: " + b);
            a++;
            b--;
        }
    }


    public static void ejemplo3(){
        int a=0,    b=20;

        while (a<8 || b>15){
            System.out.println("a: " + a + " ,b: " + b);
            a++;
            b--;
        }
    }


    //Menu interactivo
    public static void ejemplo4(){
        Scanner scan = new Scanner(System.in);
        int op=0;

        do {
            System.out.println("Menu : Elige una opción"
                    + "\n\t-(1) : Opción 1 "
                    + "\n\t-(2) : Opción 2 "
                    + "\n\t-(3) : Opción 3 "
                    + "\n\t-(3) : Opción 4, Salir del sistema"
            );
            op = scan.hasNextInt()  ?   scan.nextInt() : 0;

            switch (op){
                case 1-> System.out.println("Elegiste 1");
                case 2-> System.out.println("Elegiste 2");
                case 3-> System.out.println("Elegiste 3");
                case 4-> System.out.println("Elegiste 4");
            }
        }while (op!=4);
        System.out.println("Saliste del sistema");
    }


    //Adivina el numero
    public static void ejemplo5(){
        Scanner scan = new Scanner(System.in);

        int n = new Random().nextInt(100)-1;
        int x = 0;

        do {
            System.out.println("Ingrese otro numero");
            x = scan.hasNextInt()   ?   scan.nextInt() : 0;

            if (x>n)        System.out.println("Ingresaste un numero mayor al n°");
            else if (x<n)   System.out.println("Ingresaste un numero menor al n°");
            else if (x==n)  System.out.println("Lo lograste");
        }while (n!=x);
        System.out.println("n° es "+n);
    }

}
