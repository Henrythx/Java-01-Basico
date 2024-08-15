package J07_Arrays.E3_Ejercicios;

public class E1_Iesimo {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length ; i++) numeros[i] = i+1;
        iesimoPares(numeros);
        System.out.println(imprimir(numeros));
    }


    public static void iesimoPares(int[] array){
        int t = array.length;
        int[] temporal = new int[t];
        System.arraycopy(array, 0, temporal, 0, array.length);

        int c=0;
        for (int i = 0; i < t/2; i++) {
            array[c++] = temporal[i];
            array[c++] = temporal[t-1-i];
        }
    }


    public static String imprimir(int[] arreglo){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arreglo.length; i+=2) {
            sb.append("\nValor [").append(arreglo[i]).append(",").append(arreglo[i+1]).append("]");
        }
        return sb.toString();
    }
}
