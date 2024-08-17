package J09_Ejercicios.P3_Arreglos;

public class E01_BuscarDuplicados {
    public static void main(String[] args) {
        int[] arreglo = {4,1,6,10,1,5,7,1,1,6,2,5};

        System.out.println("Arreglo : "+imprimir(arreglo)
                +"\n\t¿Hay duplicados?  : "+hayDuplicados(arreglo)
                +"\n\tvalores duplicados: "+imprimir(buscarDuplicados(arreglo))
        );
    }


    public static boolean hayDuplicados(int[] arreglo){
        int t = arreglo.length;

        for (int i = 0; i < t-1; i++) {
            for (int j = i+1; j < t; j++)

                if (arreglo[i] == arreglo[j])   return true;
        }

        return false;
    }


    //Hay formas mas eficientes de lograr lo mismo
    public static int[] buscarDuplicados(int[] arreglo) {
        int t = arreglo.length, t2=0;
        int k, c, x=0;
        //ORDENAR NÚMEROS DE MENOR A MAYOR
        for (int i = 0; i < t-1; i++){
            for (int j = i+1; j < t; j++)
                if (arreglo[i] > arreglo[j]) {
                    k = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = k;
                }
        }
        //CONTAR REPETIDOS
        for (int i = 0; i < t-1; i+=c+1) {
            c=0;
            for (int j = i+1; j < t; j++)
                if (arreglo[i]==arreglo[j])   c++;

            if (c!=0)   t2++;
        }

        //AGREGAR VALORES REPETIDOS EN EL ARREGLO
        int[] array = new int[t2];

        for (int i = 0; i < t-1; i+=c+1) {
            c=0;
            for (int j = i+1; j < t; j++)
                if (arreglo[i]==arreglo[j])   c++;

            if (c!=0)   array[x++] = arreglo[i];
        }

        return array;
    }


    public static String imprimir(int[] arreglo){
        StringBuilder sb = new StringBuilder();
        for (int x : arreglo)   sb.append("[").append(x).append("] ");
        return sb.toString();
    }
}
