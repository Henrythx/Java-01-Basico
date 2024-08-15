package J01_Primitivos;

public class S02_StringMetodos {
    public static void main(String[] args) {
        String palabra = " presidente ";
        String word = "    ";

        System.out.println("\n"+palabra
                +"\n\tTamaño                : "+palabra.length()
                +"\n\tMayúsculas            : "+palabra.toUpperCase()
                +"\n\tMinúsculas            : "+palabra.toLowerCase()
                +"\n\tComparar valor        : "+palabra.compareTo(" presidente ")
                +"\n\tSub cadena i(6)       : "+palabra.substring(6)
                +"\n\tSub cadena i(6,10)    : "+palabra.substring(0,6)
                +"\n\tReemplazar caracteres : "+palabra.replace("presid","remit")
                +"\n\tQuitar espacios       : "+palabra.trim()
                +"\n\tEsta vacío?           : "+word.isEmpty()
                +"\n\tEsta en blanco        : "+word.isBlank()
        );

        String frase = "Hola amigo, ¿Como estas?";

        System.out.println("\n"+frase
                +"\n\tVerifíca si empieza con 'Hola': "+frase.startsWith("Hola")
                +"\n\tVerifíca si termina con 'tas?': "+frase.endsWith("tas?")
                +"\n\tVerifíca si contiene 'amigo'  : "+frase.contains("amigo")
                +"\n\tValor en el indice 4          : "+frase.charAt(4)
                +"\n\tValor unicode en el indice 4  : "+frase.codePointAt(4)
                +"\n\tPrimer indice de \"a\"        : "+frase.indexOf("a")
                +"\n\tPrimer indice de \"a\" i(7)   : "+frase.indexOf("a",7)
                +"\n\tUltimo indice de \"a\"        : "+frase.lastIndexOf("a")
                +"\n\tUltimo indice de \"a\" i(15)  : "+frase.lastIndexOf("a",15)
        );
    }
}
