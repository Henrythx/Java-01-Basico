package J07_Arrays.E4_Matrices;
/*
* El objetivo es intercambiar la posición de los valores
* como si fuera un espejo
* */
public class E05_TransponerMatriz {
    public static void main(String[] args) {
        int[][] matriz={
                {1 , 2 , 3 , 4 , 5},
                {20, 4 , 1 , 5 , 6},
                {30, 10, 2 , 6 , 7},
                {40, 50, 60, 7 , 8},
                {50, 60, 70, 80, 9},
        };

        System.out.println(imprimir(matriz));
        transponerMatriz(matriz);
        System.out.println(imprimir(matriz));
    }




    public static void transponerMatriz(int[][] matriz){
        int x;
        for (int i = 0; i < matriz.length ; i++)
            for (int j = i+1; j < matriz[i].length; j++) {
                x = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = x;
            }
    }




    public static String imprimir(int[][] matriz){
        StringBuilder sb = new StringBuilder();

        for (int[] fila : matriz) {
            sb.append("\n");
            for (int x : fila)  sb.append(x).append("\t");
        }

        return sb.toString();
    }
}
