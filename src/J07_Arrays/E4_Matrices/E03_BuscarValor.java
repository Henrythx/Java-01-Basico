package J07_Arrays.E4_Matrices;

public class E03_BuscarValor {
    public static void main(String[] args) {
        int[][] matriz = {
                {11,12,13,14},
                {21,22},
                {31,32,33,34,35,36},
                {41,42,43}
        };

        System.out.println(buscarValor(matriz,36));
    }



    public static String buscarValor(int[][] matriz, int valor){
        String cadena   = "";

        filas:
        for (int i = 0; i < matriz.length ; i++)
            for (int j = 0; j < matriz[i].length; j++)

                if (matriz[i][j] == valor) {
                    cadena = "[" + i + "," + j + "]";
                    break filas;
                }

        return cadena;
    }
}

