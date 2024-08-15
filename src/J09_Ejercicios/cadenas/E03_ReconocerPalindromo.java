package J09_Ejercicios.cadenas;

//Una palabra palíndroma es aquella que se lee igual al revés
public class E03_ReconocerPalindromo {
    public static void main(String[] args) {
        System.out.println("\"reconocer\" es una palabra palíndroma?: "+esPalindromo("reconocer"));
    }


    public static boolean esPalindromo(String cadena){
        int t = cadena.length();

        for (int i = 0; i < t/2; i++)
            if(cadena.charAt(i) != cadena.charAt(t-1-i)) return false;

        return true;
    }
}
