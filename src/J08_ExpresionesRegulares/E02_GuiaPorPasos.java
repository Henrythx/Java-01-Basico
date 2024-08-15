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
public class E02_GuiaPorPasos {
    public static void main(String[] args) {
        ejemplo1();
        ejemplo2();
        ejemplo3();
    }


    public static void ejemplo1(){
        String r1   = "salud";      //encontrar 'salud'
        String c1   = "salud hola";

        String r2   = "salud....."; //encontrar 'salud'+ 5 caracteres
        String c2   = "salud hola";

        String r3   = "a+";         //encontrar solo 'a', pueden repetirse
        String c3   = "hola amiga mia";

        String r4   = "a+";         //encontrar solo 'a', pueden repetirse
        String c4   = "aaaa";

        String r5   = "a*";         //encuentra solo 'a', muestra la ubicación
        String c5 = "hola amiga mia";

        System.out.println("Ejemplo 3 : "
                +imprimir(r1,c1,"E1")
                +imprimir(r2,c2,"E2")
                +imprimir(r3,c3,"E3")
                +imprimir(r4,c4,"E4")
                +imprimir(r5,c5,"E5")
        );
    }



    public static void ejemplo2(){

        String r6   = "Tr";         //buscar 'Tr'
        String c6   = "tres tristes tigres en el trigal";

        String r7   = "(T|t)r";     //buscar 'Tr' o 'tr'
        String c7   = "tr";

        String r8   = "(T|t)+";         //busca 'T' o 't' admite repetidos
        String c8   = "ttTTTttTTtttTtT";

        String r9   = "(T|t)+";
        String c9   = "ttTTtttTtT hola tTttT";

        String r10  = "(T|t)+$";        //solo final, busca 'T' o 't' admite repetidos
        String c10  = "ttTTtttTtT ttTTt hola ttTt tTttT";

        String r11  = "^(T|t)+";        //solo inicio, busca 'T' o 't' admite repetidos
        String c11  = "ttTTtttTtT ttTTt hola ttTt tTttT";

        String r12  = "^(T|t)$";        //no saldra nada
        String c12  = "ttTTtttTtT ttTTt hola ttTt tTttT";

        String r13  = "((T|t)+) .... ((T|t)+)"; //funciona, respetando los caracteres aleatorios
        String c13  = "TtTtt hola ttTT";

        String r14  = "((T|t)+) .{4} ((T|t)+)"; //funciona, {x} es para cantidad
        String c14  = "TtTtt hola ttTT";

        String r15  = "((T|t)+) .{4,20} ((T|t)+)"; //funciona, {x,y} es para cantidad en rango
        String c15  = "TtTtt hola amigo ttTT";



        String r16  = "[0-9]{4,10}";        //acepta cualquier numero, entre 4 a 10 caracteres
        String c16  = "1234056780";

        String r17  = "[0-9]{4,10}";        //acepta cualquier numero, entre 4 a 10 caracteres
        String c17  = "123405678077770";

        String r18  = "[a-z]+";             //acepta cualquier caracter, se puede repetir
        String c18  = "aasdyaeradfs";

        String r19  = "[a-zA-Z0-9]+";        //acepta letras y números, se puede repetir
        String c19  = "JuanCarlos777";



        System.out.println("Ejemplo 2 : "
                +imprimir(r6,c6,"E6")
                +imprimir(r7,c7,"E7")
                +imprimir(r8,c8,"E8")
                +imprimir(r9,c9,"E9")
                +imprimir(r10,c10,"E10")
                +imprimir(r11,c11,"E11")
                +imprimir(r12,c12,"E12")
                +imprimir(r13,c13,"E13")
                +imprimir(r14,c14,"E14")
                +imprimir(r15,c15,"E15")
                +imprimir(r16,c16,"E16")
                +imprimir(r17,c17,"E17")
                +imprimir(r18,c18,"E18")
                +imprimir(r19,c19,"E19")
        );
    }



    public static void ejemplo3() {
        String r20  = "https://";
        String c20  = "https://hola.com";

        String r21  = "https://\\w{4}";         //primero 'https://', (\\w) !palabra¡ de 4 carácteres
        String c21  = "https://hola.com";

        String r22  = "https://\\d{4}";         //primero 'https://', (\\d) !numeros¡ de 4 carácteres
        String c22  = "https://1234.com";

        String r23  = "https://\\d{4}";         //primero 'https://', (\\d) !numeros¡ de 4 carácteres
        String c23  = "https://1234.com";

        String r24  = "(https://|http://).+";   //primero 'https://' o 'http://' , cualquier caracter
        String c24  = "https://1234";

        String r25  = "(http(s)?://).+";        //primero 'https://' o 'http://' ( el 's' es opcional por la '?'), cualquier caracter
        String c25  = "https://1234";

        String r26  = "(https?://(www.)?|www.).+";  //primero 'http:// 's' y 'www.' opcional // o solo empezar con 'www.'
        String c26  = "http://www.google.com.pe";

        String r27  = "(https?://(www.)?|www.).+";  //primero 'http:// 's' y 'www.' opcional // o solo empezar con 'www.'
        String c27  = "www.google.com.pe";

        String r28  = "(https?://(www)?|www.).+";  //admite a pesar de que 'www' se repite por el '.+'
        String c28  = "www.google.com.pe";

        String r29  = "(https?://(www\\.)?|www\\.).+";  // '\.' representa un '.' como tal
        String c29  = "www.www.google.com";

        //'http:// 's' y 'www.' opcional // o solo empezar con 'www.'   //  (https?://(www\.)?|www\.)
        //luego cualquier palabra de 3 a mas caraceteres                //  w{3,}
        //luego un punto como tal                                       //  \\.
        //luego letras de 2 a 3 caracteres                              //  [a-z]{2,3}
        String r30  = "(https?://(www\\.)?|www\\.)\\w{3,}\\.[a-z]{2,3}";
        String c30  = "www.google.com";

        String r31  = "(https?://(www\\.)?|www\\.)\\w{3,}\\.[a-z]{2,3}";    //ahora si dara false
        String c31  = "www.www.google.com";


        String r32  = "(https?://(www\\.)?|www\\.)\\w{3,}\\.[a-z]{2,3}$";    //dara false, pero obtendra la parte final por el '$'
        String c32  = "www.www.google.com";

        String r33  = "^(https?://(www\\.)?|www\\.)\\w{3,}\\.[a-z]{2,3}$";    //verifica de inicio a fin
        String c33  = "www.google.com";

        System.out.println("Ejemplo 1 : "
                +imprimir(r20,c20,"E20")
                +imprimir(r21,c21,"E21")
                +imprimir(r22,c22,"E22")
                +imprimir(r23,c23,"E23")
                +imprimir(r24,c24,"E24")
                +imprimir(r25,c25,"E25")
                +imprimir(r26,c26,"E26")
                +imprimir(r27,c27,"E27")
                +imprimir(r28,c28,"E28")
                +imprimir(r29,c29,"E29")
                +imprimir(r30,c30,"E30")
                +imprimir(r31,c31,"E31")
                +imprimir(r32,c32,"E32")
        );
    }




    public static String imprimir(String regex, String cadena,String titulo){
        return "\n"+titulo+
                "\n\tValido     : " + verificar(regex, cadena) +
                "\n\tBúsqueda   : " + encontrar(regex, cadena) +
                "\n";
    }

    public static boolean verificar(String regex, String cadena){
        Pattern pat = Pattern.compile(regex);
        Matcher mat = pat.matcher(cadena);

        return mat.matches();
    }


    public static String encontrar(String regex, String cadena){
        Pattern pat = Pattern.compile(regex);
        Matcher mat = pat.matcher(cadena);

        StringBuilder sb = new StringBuilder();
        while (mat.find())  sb.append("[").append(mat.group()).append("] ");

        return sb.toString();
    }

}
