package J07_Arrays.E3_Ejercicios;
/*
* Ingresar un valor en la posicion especificada
* Y desplazar los valores a partir de la posicion
* */
public class E7_AgregarConPosicion {
    public static void main(String[] args) {
        int[] arreglo = {1,2,3,4,5,6,7,8,9,0};
        agregar(arreglo, 20,5);
        System.out.println(imprimir(arreglo));
    }

    public static void agregar(int[] arreglo, int valor, int p){
        int t = arreglo.length;

        for (int i = t-1; i>=p; i--)
            arreglo[i] = arreglo[i-1];

        arreglo[p] = valor;
    }

    public static String imprimir(int[] arreglo){
        StringBuilder sb = new StringBuilder();
        for (int x : arreglo)  sb.append("\nValor : ").append(x);
        return sb.toString();
    }
}
