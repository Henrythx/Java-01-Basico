package J08_ExpresionesRegulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
* Las expresiones regulares (RegEx) son cadenas de caracteres que
* actúan como modelos para encontrar y manipular patrones en textos.
* Se componen de caracteres literales y metacaracteres, que son
* símbolos que controlan la búsqueda y tienen significados especiales.
* Las expresiones regulares se utilizan para construir cadenas
* de búsqueda para búsquedas avanzadas y/o reemplazo.
* */
public class E01_ExpresionesRegulares {
    public static void main(String[] args) {
        // group()  //Muestra las coincidencias
        ejemplo1();     // find()       // Encuentra las cadenas que cumplen con el regex
        ejemplo2();     // matches()    // Verifica si cumple con el regex
        ejemplo3();     // replaceAll() // Reemplaza una cadena con el fragmento que cumple el regex
        ejemplo4();     // .split()     // Divide la cadena en un array, según el fragmento que cumpla el regex
        ejemplo5();     // .count()     // Cuenta el numero de coincidencias
    }



    public static void ejemplo1(){
        String cadena = "\nhola amigo, el mundo te dice hola y yo te digo hola..!";
        String regex = "hola";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cadena);

        boolean b = matcher.find();//verifica si encontró la cadena
        System.out.println("\nEjemplo 1, se encontró la cadena 'hola' ? : "+b);

        while (matcher.find()){
            System.out.println("\t"+matcher.group());
        }
    }



    public static void ejemplo2(){
        String cadena = "hola amigo, el mundo te dice hola y yo te digo hola..!";

        String regex = "hola";

        Pattern pat = Pattern.compile(regex);
        Matcher mat = pat.matcher(cadena);

        boolean b = mat.matches();//Cumple con el regex?, en este caso, solo tiene la cadena "hola"?
        System.out.println("\nEjemplo 2, ¿Contiene solo la cadena 'hola'? : "+b);
    }



    public static void ejemplo3(){
        String cadena = "El perro es un animal amigable, el perro es el mejor amigo del hombre, el perro es un buen perro";
        String reemplazo = "gato";

        String regex = "perro";

        Pattern pat = Pattern.compile(regex);
        Matcher mat = pat.matcher(cadena);

        String nuevaCadena = mat.replaceAll(reemplazo);//Reemplaza las cadenas
        System.out.println("\nEjemplo 3, Intercambiar 'perro' con 'gato'"
                +"\n\tCadena 1 : "+cadena
                +"\n\tCadena 2 : "+nuevaCadena
        );
    }



    public static void ejemplo4(){
        String cadena = "Hola amigo, como estas, espero que tengas un buen dia";

        String regex = "\\s+";

        String[] palabras = Pattern.compile(regex).split(cadena);

        System.out.println("\nEjemplo 4: Dividir en mas cadenas según un caracter, en este caso en espacios");
        for (String p : palabras) System.out.println("\t"+p);
    }



    public static void ejemplo5(){
        String cadena = "Hola amigo, como estas, espero que tengas un buen dia";

        Pattern pat = Pattern.compile("[aeiouAEIOU]");
        Matcher mat = pat.matcher(cadena);

        int x = (int)mat.results().count();

        System.out.println("Coincidencias : "+x);
    }



    public static void ejemplo6(){
        String EMAIL_REGEX = "\\w[a-zA-Z0-9]+@[a-zA-Z0-9]+(\\.[a-z]{2,6}){1,4}";
        String texto = "";
        boolean valido = texto.matches(EMAIL_REGEX);
    }

}
