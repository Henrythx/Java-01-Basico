package J07_Arrays.E4_Matrices;

public class E08_OperacionesAritmeticas {
    public static void main(String[] args) {
        int[][] a = {
                {4 ,  10,  5 },
                {10,  14,  9 },
                {15,  12 , 20}
        };

        int[][] b = {
                {2 ,  2 ,  4 },
                {2 ,  4 ,  7 },
                {5 ,  3 ,  4 }
        };

        System.out.println("Operaciones"
                +"\n\nSumar    : "+imprimir(sumar(a,b)    )
                +"\n\nRestar   : "+imprimir(restar(a,b)   )
                +"\n\nProducto : "+imprimir(producto(a,b) )
                +"\n\nDivision : "+imprimir(division(a,b) )//Recordar, que al ser int no toma en cuenta decimales
        );
    }



    public static int[][] sumar (int[][] a, int[][] b) {
        return operar(a,b,1);
    }
    public static int[][] restar(int[][] a, int[][] b) {
        return operar(a,b,2);
    }
    public static int[][] producto(int[][] a, int[][] b) {
        return operar(a,b,3);
    }
    public static int[][] division(int[][] a, int[][] b) {
        return operar(a,b,4);
    }



    public static int[][] operar(int[][] a, int[][] b, int x) {
        if (!sonCompatibles(a, b)) return null;

        int[][] matriz = new int[a.length][];

        for (int i = 0; i < a.length; i++)
            matriz[i] = new int[a[i].length];//Le damos el tamaño a cada fila

        for (int i = 0; i < matriz.length; i++)
            for (int j = 0; j < matriz[i].length; j++) {
                switch (x){
                    case 1 ->   matriz[i][j] = a[i][j] + b[i][j];
                    case 2 ->   matriz[i][j] = a[i][j] - b[i][j];
                    case 3 ->   matriz[i][j] = a[i][j] * b[i][j];
                    case 4 ->   matriz[i][j] = a[i][j] / b[i][j];
                }
            }
        return matriz;
    }



    public static boolean sonCompatibles(int[][] a, int[][] b) {
        if (a.length != b.length) return false;//si el número de filas entre a y b no son iguales, retorna false

        for (int i = 0; i < a.length; i++) {
            if (a[i].length != b[i].length) return false;//si el tamaño de filas no coincide, retorna false
        }

        return true;
    }



    public static String imprimir(int[][] matriz){
        if (matriz == null) return "No compatibles";

        StringBuilder sb = new StringBuilder();

        for (int[] fila : matriz) {
            sb.append("\n");
            for (int x : fila)  sb.append(x).append("\t");
        }

        return sb.toString();
    }
}
