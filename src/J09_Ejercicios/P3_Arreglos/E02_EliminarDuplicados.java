package J09_Ejercicios.P3_Arreglos;

public class E02_EliminarDuplicados {
    public static void main(String[] args) {
        int[] arreglo = {4,1,6,10,1,5,7,1,1,6,2,5};

        System.out.println("Arreglo : "+imprimir(arreglo)
                +"\n\tvalores duplicados: "+imprimir(eliminarDuplicados(arreglo))
        );
    }


    public static int[] eliminarDuplicados(int[] arreglo){
        int x=0, t = arreglo.length;
        int[] array = new int[t];

        a:
        for (int i = 0; i < t; i++) {
            for (int j=0; j< t; j++){
                if (i==j)   continue;   //Para no comparar mismo item
                if(arreglo[i]==arreglo[j])  continue a; //Si se repite valor, saltar al siguiente item
            }
            array[x++]=arreglo[i];  //Al no repetirse el item, agregar al nuevo arreglo
        }

        int[] array2 = new int[x];
        System.arraycopy(array, 0, array2, 0,x);//Copia parte de un arreglo

        return array2;
    }


    public static String imprimir(int[] arreglo){
        StringBuilder sb = new StringBuilder();
        for (int x : arreglo)   sb.append("[").append(x).append("] ");
        return sb.toString();
    }
}
