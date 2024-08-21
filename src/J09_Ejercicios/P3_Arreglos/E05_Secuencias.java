package J09_Ejercicios.P3_Arreglos;

public class E05_Secuencias {
    public static void main(String[] args) {
        System.out.println("Valor según posición (P)"
                +"\n\tPell        (P)=5  : " + getPell(5)
                +"\n\tPadovan     (P)=15 : " + getPadovan(15)
                +"\n\tFibonacci   (P)=12 : " + getFibonacci(12)
                +"\n\tTribonacci  (P)=10 : " + getTribonacci(10)
                +"\nSecuencia hasta la posición (P)"
                +"\n\tPell        (P)=4  : " + imprimir(getSecuenciaPell(5))
                +"\n\tPadovan     (P)=15 : " + imprimir(getSecuenciaPadovan(15))
                +"\n\tPell        (P)=12 : " + imprimir(getSecuenciaFibonacci(12))
                +"\n\tPadovan     (P)=10 : " + imprimir(getSecuenciaTribonacci(10))
        );
    }


    /* Secuencia Pell
     * a  x     1   3   7   17  41  Numerador de la fracción
     * b  y     1   2   5   12  29  Denominador de la fracción = Número de Pell */
    public static int getPell(int p){
        if(p<2) return p;

        int x=1,    y=1;
        int a,b=0;

        for (int i = 1; i < p; i++) {
            b=x+y;
            a=b+y;
            x=a;    //Numero de Pell-Lucas
            y=b;    //Numero de Pell
        }
        return b;
    }


    /*  Secuencia Padovan
     *   1, 1, 1, 2, 2, 3, 4, 5, 7, 9, 12, 16, 21, 28, 37, 49, 65, 86, 114
     *   p4 = p1 + p2            */
    public static int getPadovan(int p){
        if (p<1) return p;
        if (p<4) return 1;

        int p1 = 1,     p2 = 1,     p3 = 1;
        int p4 = 0;

        for (int i = 4; i <= p; i++) {
            p4 = p1 + p2;
            p1 = p2;
            p2 = p3;
            p3 = p4;
        }

        return p4;
    }


    /*  Secuencia Fibonacci
    *   0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
    *   p3 = p1 + p2                */
    public static int getFibonacci(int p){
        if (p<0)    return p;
        if (p<3)    return p-1;

        int p1 = 0,     p2 = 1;
        int p3 = 0;
        // for (int i = 3; i <= p; i++) {
        for (int i = 2; i < p; i++) {
            p3 = p1 + p2;
            p1 = p2;
            p2 = p3;
        }

        return p3;
    }


    /*  Secuencia Tribonacci
     *   0 , 0 , 1 , 1 , 2 , 4 , 7 , 13 , 24 , 44 , 81 , 149
     *   p4 = p1 + p2 + p3          */
    public static int getTribonacci(int p){
        if (p<1)    return p;
        if (p<3)    return 0;
        if (p==3)   return 1;

        int p1 = 0,     p2 = 0,     p3 = 1;
        int p4 = 0;

        for (int i = 4; i <= p; i++) {
            p4 = p1+p2+p3;
            p1 = p2;
            p2 = p3;
            p3 = p4;
        }

        return p4;
    }








    /* Secuencia Pell
     * a  x     1   3   7   17  41  Numerador de la fracción
     * b  y     1   2   5   12  29  Denominador de la fracción = Número de Pell */
    public static int[] getSecuenciaPell(int p){
        int[] arreglo = new int[p];

        int x=1,    y=1;
        int a,b;

        for (int i = 0; i < p; i++) {
            arreglo[i] = y;
            b=x+y;
            a=b+y;
            x=a;    //Numero de Pell-Lucas
            y=b;    //Numero de Pell
        }
        return arreglo;
    }

    /*  Secuencia Padovan
     *   1, 1, 1, 2, 2, 3, 4, 5, 7, 9, 12, 16, 21, 28, 37, 49, 65, 86, 114
     *   p4 = p1 + p2            */
    public static int[] getSecuenciaPadovan(int p){
        if (p<4)    p=3;

        int p1 = 1,     p2 = 1,     p3 = 1,     p4;

        int[] arreglo = new int[p];
        arreglo[0] = p1;
        arreglo[1] = p2;
        arreglo[2] = p3;

        for (int i = 3; i < p; i++) {
            p4 = p1 + p2;
            p1 = p2;
            p2 = p3;
            p3 = p4;
            arreglo[i] = p4;
        }

        return arreglo;
    }


    /*  Secuencia Fibonacci
     *   0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
     *   p3 = p1 + p2                */
    public static int[] getSecuenciaFibonacci(int p){
        if (p<3)    p=3;

        int p1 = 0,     p2 = 1,     p3;

        int[] arreglo = new int[p];
        arreglo[0] = p1;
        arreglo[1] = p2;

        for (int i = 2; i < p; i++) {
            p3 = p1 + p2;
            p1 = p2;
            p2 = p3;
            arreglo[i] = p3;
        }

        return arreglo;
    }


    /*  Secuencia Tribonacci
     *   0 , 0 , 1 , 1 , 2 , 4 , 7 , 13 , 24 , 44 , 81 , 149
     *   p4 = p1 + p2 + p3          */
    public static int[] getSecuenciaTribonacci(int p){
        if (p<3)    p=3;

        int p1 = 0,     p2 = 0,     p3 = 1,     p4;

        int[] arreglo = new int[p];
        arreglo[0] = p1;
        arreglo[1] = p2;
        arreglo[2] = p3;

        for (int i = 3; i < p; i++) {
            p4 = p1+p2+p3;
            p1 = p2;
            p2 = p3;
            p3 = p4;
            arreglo[i] = p4;
        }

        return arreglo;
    }


    public static String imprimir(int[] arreglo){
        StringBuilder sb = new StringBuilder();
        for (int x : arreglo)   sb.append("[").append(x).append("] ");
        return sb.toString();
    }
}
