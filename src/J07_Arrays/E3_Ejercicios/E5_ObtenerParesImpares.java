package J07_Arrays.E3_Ejercicios;
/*
* A partir de un array de enteros,
* obtener un array de los valores pares
* y otro array de los valores impares
* */
public class E5_ObtenerParesImpares {
    public static void main(String[] args) {
        Integer[] arreglo   = {8,6,7,11,4,12,13,1,5,7,9};
        Integer[] pares     = getArrayPares(arreglo);
        Integer[] impares   = getArrayImpares(arreglo);

        System.out.println("\nImprimir"+imprimir(pares));
        System.out.println("\nImprimir"+imprimir(impares));
    }


    public static Integer[] getArrayPares(Integer[] arreglo){
        int t = 0,  c = 0;

        //Obtener cantidad de pares
        for (int x : arreglo)       if(x%2==0) t++;

        //Integrar pares a la lista nueva
        Integer[] pares = new Integer[t];
        for (int i = 0; i < arreglo.length; i++)
            if(arreglo[i]%2==0) pares[c++] = arreglo[i];

        return pares;
    }


    public static Integer[] getArrayImpares(Integer[] arreglo){
        int t = 0,  c = 0;

        //Obtener cantidad de impares
        for (int x : arreglo)       if(x%2!=0) t++;

        //Integrar pares a la lista nueva
        Integer[] impares = new Integer[t];
        for (int i = 0; i < arreglo.length; i++)
            if(arreglo[i]%2!=0) impares[c++] = arreglo[i];

        return impares;
    }


    public static String imprimir(Object[] arreglo){
        StringBuilder sb = new StringBuilder();
        for (Object x : arreglo)  sb.append("\nValor : ").append(x);
        return sb.toString();
    }
}
