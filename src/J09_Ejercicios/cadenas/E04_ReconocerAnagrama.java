package J09_Ejercicios.cadenas;

import java.util.Arrays;

/*
 *Un anagrama es una palabra que resulta de la transposición de todas las
 * letras de otra palabra. Dicho de otra forma, una palabra es anagrama de
 * otra si las dos tienen las mismas letras
 */
public class E04_ReconocerAnagrama {
    public static void main(String[] args) {
        System.out.println(sonAnagramas("Retener","enterre"));
        System.out.println(sonAnagramas2("Retener","enterreS"));
    }

    public static boolean sonAnagramas(String p1, String p2){
        if (p1.length() != p2.length()) return false;

        char[] array1 = p1.toLowerCase().toCharArray();
        char[] array2 = p2.toLowerCase().toCharArray();

        Arrays.sort(array1);//ordena los caracteres
        Arrays.sort(array2);

        return Arrays.equals(array1, array2);
    }


    public static boolean sonAnagramas2(String p1, String p2){
        if (p1.length() != p2.length()) return false;

        p1 = p1.toLowerCase();
        p2 = p2.toLowerCase();

        int k1, k2, t=p1.length();

        for (int i = 0; i < t; i++) {
            k1 = 0; k2 = 0;

            for (int j = 0; j < t; j++) {
                if (p1.charAt(i)==p1.charAt(j)) k1++;
                if (p1.charAt(i)==p2.charAt(j)) k2++;
            }

            System.out.println(p1.charAt(i)+":"+ k1+"-"+k2);
            if(k1 != k2) return false;
        }

        return true;
    }
}
