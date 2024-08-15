package J07_Arrays.E4_Matrices;

public class E01_Matriz {
    public static void main(String[] args) {
        ejemplo1();
        ejemplo2();
    }


    //ENTEROS
    public static void ejemplo1() {
        int filas = 2,  columnas = 4;

        int[][] arreglo = new int[filas][columnas];

        arreglo[0][0] = 11;
        arreglo[0][1] = 12;
        arreglo[0][2] = 13;
        arreglo[0][3] = 14;

        arreglo[1][0] = 21;
        arreglo[1][1] = 22;
        arreglo[1][2] = 23;
        arreglo[1][3] = 24;

        System.out.println("\nMatrices con numeros"
                +"\n\tN° filas    : "+arreglo.length
                +"\n\tN° columnas : "+arreglo[0].length
                +"\n\tPrimer valor: "+arreglo[0][0]
                +"\n\tUltimo valor: "+arreglo[arreglo.length-1][arreglo[0].length-1]
        );
    }


    //CADENAS
    public static void ejemplo2(){
        int filas = 4,  columnas = 3;
        String[][] meses = new String[filas][columnas];

        meses[0][0] = "Enero";
        meses[0][1] = "Febrero";
        meses[0][2] = "Marzo";

        meses[1][0] = "Abril";
        meses[1][1] = "Mayo";
        meses[1][2] = "Junio";

        meses[2][0] = "Julio";
        meses[2][1] = "Agosto";
        meses[2][2] = "Setiembre";

        meses[3][0] = "Octubre";
        meses[3][1] = "Noviembre";
        meses[3][2] = "Diciembre";

        System.out.println("\nMatrices con Cadenas"
                +"\n\tN° filas    : "+meses.length
                +"\n\tN° columnas : "+meses.length
                +"\n\tPrimer valor: "+meses[0][0]
                +"\n\tUltimo valor: "+meses[meses.length-1][meses[meses.length-1].length-1]
                +"\n\t"
                +"\bLectura de arreglo Doble".concat(imprimir(meses))
        );

    }


    public static String imprimir(String[][] arreglo){
        StringBuilder sb = new StringBuilder("");

        for (String[] fila : arreglo){
            sb.append("\n");
            for (String columna : fila) sb.append(" - ").append(columna);
        }
        return sb.toString();
    }
}
