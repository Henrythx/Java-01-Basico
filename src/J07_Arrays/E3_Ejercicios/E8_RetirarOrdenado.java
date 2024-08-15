package J07_Arrays.E3_Ejercicios;

/*
* Eliminar el valor en la posicion especificada
* Luegp desplazar
* */
public class E8_RetirarOrdenado {
    public static void main(String[] args) {
        int[] arreglo = {1,2,3,4,5,6,7,8,9,10};
        retirar(arreglo, 5);
        System.out.println(imprimir(arreglo));
    }

    public static void retirar(int[] arreglo, int p){
        int t = arreglo.length;

        for (int i = p; i<t-1; i++)
            arreglo[i] = arreglo[i+1];

        arreglo[t-1] = 0;
    }

    public static String imprimir(int[] arreglo){
        StringBuilder sb = new StringBuilder();
        for (int x : arreglo)  sb.append("\nValor : ").append(x);
        return sb.toString();
    }
}
