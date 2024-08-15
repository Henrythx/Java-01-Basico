package J03_FlujosDeControl.estructurasBucles;

import java.util.Scanner;

public class EB1_For {
    public static void main(String[] args) {
        //ejemplo1();
        //ejemplo2();
        //ejemplo3();
        //ejemplo4();
        //ejemplo5();
        //ejemplo6();
        //ejemplo7();
        ejemplo8();
    }


    public static void ejemplo1(){
        for (int i = 0; i < 10; i++)    System.out.println("valor : "+i);
        for (int i =10; i >= 0; i--)    System.out.println("Valor : "+i);
    }


    public static void ejemplo2(){
        for (int i=0, j=10;     i<8;    i++,j--)                System.out.println("bucle 1 [i,j] = ["+i+"-"+j+"]");
        for (int i=0, j=10;     i<j;    i++,j--)                System.out.println("bucle 2 [i,j] = ["+i+"-"+j+"]");
        for (int i=0, j=10, k=20;   i<k;    i+=5,j+=10,k++)     System.out.println("bucle 3 [i,j,k] = ["+i+"-"+j+"-"+k+"]");
    }


    public static void ejemplo3(){
        boolean salto = true;
        boolean fin = false;

        for (int i=0;   i<4 && salto;   i++)    System.out.println("A bucle 1 = "+i);

        for (int i=0;   salto;  i++){           if(i>3) salto = false;
            System.out.println("BB bucle 2 = "+i);
        }

        salto = true;   //mientras se cumpla la condicion
        for (int i=0;   (fin) || !salto;    i++){   if(i>5) fin=true;
            System.out.println("C bucle 3 : "+i);
        }
    }


    public static void ejemplo4(){
        for (int i=0; i<10; i++){
            if (i%2==0) continue;
            if (i>7)    break;
            System.out.println("Valor : "+i);
        }
    }


    public static void ejemplo5(){
        int[] valores = {10,4,1,8,16,20};
        for (int x : valores) System.out.println(x);
    }


    public static void ejemplo6(){
        principal:
        for (int i=0; i<5; i++){
            secundario:
            for (int j = 0; j < 10 ; j++) {
                if(j%2==0)  continue ;
                if(i*j>20)  break    principal;
                System.out.println("valor = ["+i+"-"+j+"], P("+(i*j)+")");
            }
            System.out.println("\n");
        }
    }


    public static void ejemplo7(){
        Scanner scan = new Scanner(System.in);

        for (;;){
            System.out.println("Deseas terminar? (yes)");
            if (scan.nextLine().equalsIgnoreCase("yes"))
                break;
        }
        System.out.println("Bucle terminado");
    }


    public static void ejemplo8(){
        int i = 0;
        for (;;){
            if(i<5) System.out.println("Valor i : "+i++);
            else break;
        }
    }
}
