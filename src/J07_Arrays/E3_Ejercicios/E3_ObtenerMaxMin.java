package J07_Arrays.E3_Ejercicios;

public class E3_ObtenerMaxMin {
    public static void main(String[] args) {
        int[] arreglo = {4,38,5,2,27};

        System.out.println("Datos"
                +"\n\tValor máximo : "+getMax(arreglo)
                +"\n\tValor mínimo : "+getMin(arreglo)
        );
    }


    public static int getMax(int[] arreglo){
        int max = 0;
        int t   = arreglo.length;

        for (int i = 0; i < t; i++)     max = Math.max(max, arreglo[i]);
        return max;
    }

    public static int getMin(int[] arreglo){
        int min = Integer.MAX_VALUE;
        int t   = arreglo.length;

        for (int i = 0; i < t; i++)     min = Math.min(min, arreglo[i]);
        return min;
    }
}



