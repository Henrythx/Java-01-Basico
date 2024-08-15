package J08_ExpresionesRegulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
* HAY MÁS PERO ESTOS SON LOS MAS USADOS
*
* \s            espacio en blanco
* \S            no espacio en blanco
* \d            digito
* \D            no digito
* \w            palabra
* \W            no palabra
*
* [abc]         rango de caracteres: 'a' o 'b' o 'c'
* [a-z]         rango de caracteres de 'a' hasta 'z'
* [A-Z]         rango de caracteres de 'A' hasta 'Z'
* [0-9]         rango de números de 0 a 9
* [0-5]         rango de números de 0 a 5
* [_%?&/+-=#]   acepta los caracteres "_ % ? & / + - = #"
*
*
* (a|b)         opción "a" o opción "b", solo uno
* a?            el caracter "a" es opcional
* (a)?          contenido del paréntesis es opcional
* (a)+          contenido del paréntesis se puede repetir
* (a)*          contenido del paréntesis, muestra la posición
*
* ^a            el contenido es verificado desde el inicio de la cadena
* a$            el contenido es verificado desde el final de la cadena
*
* \.            verifica el punto como tal (.)
* \s            verifica el espacio vacío como tal ( )
*
* */
public class E03_Ejercicios {
    public static void main(String[] args) {
        ejemplo1();
        //ejemplo2();
        //ejemplo3();
        //ejemplo4();
    }


    //NORMAS
    public static void ejemplo1(){
        String r1   = "";
        String c1   = "";



        System.out.println("Ejemplo : "
                +imprimir(r1,c1,"")
        );
    }



    //CORREO
    public static void ejemplo2(){
        //[a-zA-Z0-9]+   @   [a-zA-Z]+   \.  [a-z]{2,6}
        String r1   = "[a-zA-Z0-9]+@[a-zA-Z]+\\.[a-z]{2,6}";
        String c1   = "holaCorre27@gmail.com";

        //[a-zA-Z0-9]+   @   [a-zA-Z]+   \.  [a-z]{2,6}      ( \.    [a-z]{2,6} )?
        String r2   = "[a-zA-Z0-9]+@[a-zA-Z]+\\.[a-z]{2,6}(\\.[a-z]{2,6})?";
        String c2   = "holaCorre27@gmail.com.pe";

        System.out.println("Ejemplo 2 : "
                +imprimir(r1,c1,"E1 Correo")
                +imprimir(r2,c2,"E2 Correo")
        );
    }



    //NUMERO CELULAR
    public static void ejemplo3(){
        //\d{1,3}  -  \d{1,3}  -  \d{1,3}
        String r3   = "\\d{1,3}-\\d{1,3}-\\d{1,3}";
        String c3   = "123-123-123";

        //(\d{1,2}[+]\s)?   \d{1,3}  -  \d{1,3}  -  \d{1,3}
        String r4   = "(\\d{1,2}[+]\\s)?\\d{1,3}-\\d{1,3}-\\d{1,3}";
        String c4   = "51+ 123-123-123";

        //(\d{1,2}[+]\s)?   \d{1,3}  (-|\s)?  \d{1,3}  (-|\s)?  \d{1,3}
        String r5   = "(\\d{1,2}[+]\\s)?\\d{1,3}(-|\\s)?\\d{1,3}(-|\\s)?\\d{1,3}";
        String c5   = "51+ 123 123 123";


        System.out.println("Ejemplo 3 : "
                +imprimir(r3,c3,"E3 Numero celular")
                +imprimir(r4,c4,"E4 Numero celular")
                +imprimir(r5,c5,"E5 Numero celular")
        );
    }



    //DIRECCIONES URL
    public static void ejemplo4(){
        String r6   = "(https?://).+";
        String c6   = "https://www.youtube.com";

        String r7   = "https?://(www.)?[a-z]+\\.[a-z]{2,6}";
        String c7   = "https://www.youtube.com";

        //https?://     (www)?      (\.[a-zA-Z0-9]+)+
        String r8   = "https?://(www)?(\\.[a-zA-Z0-9]+)+";
        String c8   = "https://www.utp.edu.pe.mas.menos.hola";

        //https?://     (www\.)?    [a-zA-Z0-9]+    ( \.[a-z]{2,6} ){1,3}
        String r9   = "https?://(www\\.)?[a-zA-Z0-9]+(\\.[a-z]{2,6}){1,3}/?";
        String c9   = "https://www.utp.edu.pe/";

        //https?://     (www\.)?    [a-zA-Z0-9]+    ( \.[a-z]{2,6} ){1,3}   [a-zA-Z0-9_%?&/+-=]
        String r10  = "https?://(www\\.)?[a-zA-Z0-9]+(\\.[a-z]{2,6}){1,3}[a-zA-Z0-9_%?&/+-=#]+";
        String c10  = "https://www.youtube.com/watch?v=snhdF-sfiu4&t=813s";

        String r11  = "https?://(www\\.)?[a-zA-Z0-9]+(\\.[a-z]{2,6}){1,3}[a-zA-Z0-9_%?&/+-=#]+";
        String c11  = "https://www.flaticon.es/uicons/interface-icons";

        String r12  = "https?://(www\\.)?[a-zA-Z0-9]+(\\.[a-z]{2,6}){1,3}[a-zA-Z0-9_%?&/+-=#]+";
        String c12  = "https://www.amazon.com/s?k=nvidia&i=todays-deals&__mk_es_US=%C3%85M%C3%85%C5%BD%C3%95%C3%91&crid=14SBF2B0B86RT&sprefix=nvidia%2Ctodays-deals%2C143&ref=nb_sb_noss_2";

        System.out.println("Ejemplo 4 : "
                +imprimir(r6,c6,"E6 URL, https:// o http://, mas cualquier caracter")
                +imprimir(r7,c7,"E7 URL, https:// o http://, www.(opcional), nombre, .dominio")
                +imprimir(r8,c8,"E8 URL, https:// o http://, www.(opcional), '.abc' (bucle)")
                +imprimir(r9,c9,"E9 URL, https:// o http://, www.(opcional), nombre, .dominios(bucle)")
                +imprimir(r10,c10,"E10 URL, similar al anterior, + caracteres en el formato[a-zA-Z0-9_%?&/+-=#]")
                +imprimir(r11,c11,"E11 URL, similar al anterior,")
                +imprimir(r12,c12,"E12 URL, similar al anterior,")
        );
    }




    public static String imprimir(String regex, String cadena,String titulo){
        return "\n"+titulo+
                "\n\tValido     : " + verificar(regex, cadena) +
                "\n\tBúsqueda   : " + encontrar(regex, cadena) +
                "\n";
    }

    public static boolean verificar(String regex, String cadena){
        return Pattern.matches(regex,cadena);
    }

    public static String encontrar(String regex, String cadena){
        Pattern pat = Pattern.compile(regex);
        Matcher mat = pat.matcher(cadena);

        StringBuilder sb = new StringBuilder();
        while (mat.find())  sb.append("[").append(mat.group()).append("] ");

        return sb.toString();
    }
}
