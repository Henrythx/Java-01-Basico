package J09_Ejercicios.cadenas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E01_ContarCaracteres {
    public static void main(String[] args) {
        System.out.println(""
                +"\nCaracteres  :"+("hola amigo mio").length()
                +"\nVocales 1   :"+contarVocales("hola amigo mio")
                +"\nVocales 2   :"+contarVocales2("hola amigo mio")
                +"\nConsonantes 1   :"+contarConsonantes("hola amigo mio")
                +"\nConsonantes 2   :"+contarConsonantes2("hola amigo mio")
        );
    }




    public static int contarVocales2(String cadena){
        Pattern pat = Pattern.compile("[aeiouAEIOU]");
        Matcher mat = pat.matcher(cadena);
        return (int) mat.results().count();
    }


    public static int contarConsonantes2(String cadena){
        Pattern pat = Pattern.compile("[bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ]");
        Matcher mat = pat.matcher(cadena);

        return (int) mat.results().count();
    }





    public static int contarVocales(String cadena){
        cadena = cadena.toLowerCase();
        int x = 0;

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')  x++;
        }

        return x;
    }


    public static int contarConsonantes(String cadena){
        cadena = cadena.toLowerCase();
        int x = 0;

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if     (c=='b'||c=='c'||c=='d'||c=='f'||
                    c=='g'||c=='h'||c=='j'||c=='k'||
                    c=='l'||c=='m'||c=='n'||c=='p'||
                    c=='q'||c=='r'||c=='s'||c=='t'||
                    c=='v'||c=='w'||c=='x'||c=='y'||c=='z')  x++;
        }


        return x;
    }
}
