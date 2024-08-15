package J07_Arrays.E4_Matrices;

public class E02_ColumnasDesiguales {
    public static void main(String[] args) {
        ejemplo1();
    }


    public static void ejemplo1(){
        int[][] matriz = new int[4][];

        matriz[0] = new int[10];
        matriz[1] = new int[5] ;
        matriz[2] = new int[15];
        matriz[3] = new int[7] ;

        System.out.println("N° Filas : "+matriz.length);

        for (int i = 0; i < matriz.length; i++)
            System.out.println("Matriz["+i+"] tiene "+matriz[i].length+" columnas");

        System.out.println(imprimir(matriz));
    }



    public static String imprimir(int[][] matriz){
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < matriz.length; i++) {
            sb.append("\nFila[").append(i).append("] : ");
            for (int j = 0; j < matriz[i].length; j++)  sb.append(j).append("," );
        }
        return sb.toString();
    }
}
