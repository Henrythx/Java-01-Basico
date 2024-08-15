package J07_Arrays.E4_Matrices;

public class E04_EsSimetrico{
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3, 4, 5},
                {2, 4, 0, 5, 6},
                {3, 0, 1, 6, 7},
                {4, 5, 6, 7, 8},
                {5, 6, 7, 8, 9}
        };

        System.out.println("Es simétrico?"
                +"\n\tMétodo 1 : "+esSimetrico(matriz)
                +"\n\tMétodo 2 : "+esSimetrico2(matriz)
        );

    }


    public static boolean esSimetrico(int[][] matriz){
        filas:
        for (int i = 0; i < matriz.length; i++)
            for (int j = i+1; j < matriz[i].length; j++)    //+1, los valores de la diagonal no se comparan,

                if (matriz[i][j] != matriz[j][i])
                    return false;

        return true;
    }


    public static boolean esSimetrico2(int[][] matriz){
        int i=0, j=0;

        while (i < matriz.length){
            while (j < matriz[i].length){

                if (matriz[i][j]!=matriz[j][i])
                    return false;
                j++;
            }
            j = i+1;
            i++;
        }

        return true;
    }

}
