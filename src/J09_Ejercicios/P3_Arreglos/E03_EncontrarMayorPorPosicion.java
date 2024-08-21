package J09_Ejercicios.P3_Arreglos;

public class E03_EncontrarMayorPorPosicion {
    public static void main(String[] args) {
        int[] arreglo = {29,7,28,4,35,10,8,21,2};
        System.out.println(getMayor(arreglo));
        System.out.println(getMenor(arreglo));
        System.out.println(getSegundoMayor(arreglo));
        System.out.println(getSegundoMenor(arreglo));
        System.out.println(getMayorPorPosicion(arreglo, 2));
        System.out.println(getMenorPorPosicion(arreglo, 2));
    }


    public static int getMayor(int[] arreglo){
        int mayor = Integer.MIN_VALUE;

        for (int x : arreglo) {
            if (x > mayor)  mayor = x;
        }

        return mayor;
    }


    public static int getMenor(int[] arreglo){
        int menor = Integer.MAX_VALUE;

        for (int x : arreglo){
            if (x < menor)  menor = x;
        }

        return menor;
    }


    public static int getSegundoMayor(int[] arreglo){
        int p1 = Integer.MIN_VALUE;
        int p2 = Integer.MIN_VALUE;

        for (int x : arreglo){
            if (x > p1){
                p2 = p1;
                p1 = x;
            }
            else if (x > p2){
                p2 = x;
            }
        }

        return p2;
    }


    public static int getSegundoMenor(int[] arreglo){
        int p1 = Integer.MAX_VALUE;
        int p2 = Integer.MAX_VALUE;

        for (int x : arreglo){
            if (x < p1){
                p2 = p1;
                p1 = x;
            }
            else if (x < p2){
                p2 = x;
            }
        }

        return p2;
    }


    public static int getMayorPorPosicion(int[] arreglo, int p){
        if(p<1) return 0;
        ordenar(arreglo);
        return arreglo[--p];
    }


    public static int getMenorPorPosicion(int[] arreglo, int p){
        if(p<1) return 0;
        int t = arreglo.length;
        ordenar(arreglo);
        return arreglo[t-p];
    }


    public static void ordenar(int[] arreglo) {
        int t = arreglo.length;

        for (int i = 0; i < t-1; i++) {
            for (int j = i; j < t; j++) {

                if(arreglo[i]<arreglo[j]){
                    int x = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = x;
                }
            }
        }
    }


    public static String imprimir(int[] arreglo){
        StringBuilder sb = new StringBuilder();
        for (int x : arreglo)   sb.append("[").append(x).append("] ");
        return sb.toString();
    }
}
