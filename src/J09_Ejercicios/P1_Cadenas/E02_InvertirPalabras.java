package J09_Ejercicios.P1_Cadenas;

public class E02_InvertirPalabras {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        System.out.println(invertirCadenas("Hola mundo"));
    }


    public static String invertirCadenas(String cadena){
        StringBuilder x = new StringBuilder();
        for (int i = cadena.length()-1; i>=0; i--) x.append(cadena.charAt(i));
        return x.toString();
    }
}
