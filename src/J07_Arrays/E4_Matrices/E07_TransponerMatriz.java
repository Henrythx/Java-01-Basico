package J07_Arrays.E4_Matrices;

public class E07_TransponerMatriz {
    public static void main(String[] args) {
        int[][] matriz={
                {1 , 2 , 3 , 4 , 5      },
                {20, 2 , 3 , 4          },
                {30, 31, 3 , 4 , 5, 6, 7},
                {40, 41, 42, 4 , 5      },
                {50, 51, 52, 53         },
        };

        System.out.println(imprimir(matriz));
        int[][] transpuesta = transponerMatriz(matriz);
        System.out.println(imprimir(transpuesta));
    }



    public static int[][] transponerMatriz(int[][] matriz){
        int f=matriz.length;
        int c=0;
        for (int[] fila : matriz)   if (fila.length>c)  c=fila.length;

        int[][] arreglo = new int[c][f];


        for (int i = 0; i < matriz.length; i++)
            for (int j = 0; j < matriz[i].length; j++)

                arreglo[j][i] = matriz[i][j];

        return arreglo;
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
