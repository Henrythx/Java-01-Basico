package J06_Math;

import java.util.Random;

public class E2_Random {
    public static void main(String[] args) {
        ejemplo1();
        ejemplo2();
    }

    public static void ejemplo1(){
        System.out.println("\nMétodos MATH");

        double r1 = Math.random();
        System.out.println("Random 1 : "+r1);

        r1 *= 7;//Sera cualquier numero <= 7
        System.out.println("Random 2 : "+r1);

        r1 = Math.floor(r1);
        System.out.println("Random 3 : "+r1);

        String[] dias = {"domingo","lunes","martes","miércoles","jueves","viernes","sábado"};
        System.out.println("Dia : "+dias[(int)r1]);
    }


    public static void ejemplo2(){
        Random r = new Random();

        int x1 = r.nextInt();                   //Entrega énteros aleatorios, tanto positivos como negativos

        int x2 = r.nextInt(7);          //Enteros entre el 0 y el 6

        int x3 = 15+ r.nextInt(25-15);  //Enteros entre el 15 y el 24

        System.out.println("\nMétodos Random");
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
    }
}
