package J01_Primitivos;

import java.nio.charset.StandardCharsets;

public class S01_String {
    public static void main(String[] args) {

        String t1 = "Hola como estas";

        char[] arreglo2 = {'h','o','l','a',' ','a','m','i','g','o'};
        String t2 = new String(arreglo2);

        String t3 = new String(arreglo2,5,5);

        StringBuilder sb = new StringBuilder("Saludos");
        String t4 = new String(sb);

        StringBuffer sbf = new StringBuffer("Hola buffer");
        String t5 = new String(sbf);



        /*byte es de tipo number. Sin embargo, cuando trabajas con byte[], se puede
         * almacenar valores numéricos que representan caracteres. Siempre y cuando
         * estos valores correspondan a los códigos ASCII de caracteres. */
        byte[] arreglo6 = {'h','o','l','a',' ','a','m','i','g','o'};
        String t6 = new String(arreglo6);


        /* Un Charset (conjunto de caracteres) define un mapeo entre secuencias
         * de bytes y secuencias de caracteres. En otras palabras, especifica
         * cómo los bytes se convierten en caracteres y viceversa.
         * Algunos ejemplos comunes de Charset son UTF-8, ISO-8859-1, y US-ASCII.
         */
        byte[] arreglo7 = {72, 101, 108,108,111}; // representa "hello" en UTF-8
        String t7 = new String(arreglo7, StandardCharsets.UTF_8);


        System.out.println("Dato String"
                +"\n t1 = "+t1
                +"\n t2 = "+t2
                +"\n t3 = "+t3
                +"\n t4 = "+t4
                +"\n t5 = "+t5
                +"\n t6 = "+t6
                +"\n t7 = "+t7
        );
    }
}
