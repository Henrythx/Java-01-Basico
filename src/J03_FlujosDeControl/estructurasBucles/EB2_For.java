package J03_FlujosDeControl.estructurasBucles;

import java.util.Scanner;

public class EB2_For {
    public static void main(String[] args) {
        ejemplo1();
    }

    //Cuantas veces se repite la palabra
    public static void ejemplo1(){
        String frase = "Había una linda persona que era muy linda, y que hacia lindas cosas, ya dije que era linda";
        String word = "linda";
        int c=0 ,   a=frase.length(),  b=word.length();

        for (int i=0; i<a-b+1; i++){
            if(frase.substring(i,i+b).equalsIgnoreCase(word)) {
                c++;
                i+=b;
            }
        }
        System.out.println(word+" se repite "+c+" veces");
    }



}
