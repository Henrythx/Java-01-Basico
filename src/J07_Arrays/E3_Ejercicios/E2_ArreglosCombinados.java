package J07_Arrays.E3_Ejercicios;
/*
* Unir dos arreglos a y b
* Primero poner 2 valores de a, luego dos de b, hasta llenar ambos
* */
public class E2_ArreglosCombinados {
    public static void main(String[] args) {
        int[] a,b,c;
        a = new int[10];
        b = new int[10];
        c = new int[20];

        for (int i = 0; i < a.length; i++)      a[i] = i;
        for (int i = 0; i < b.length; i++)      b[i] = 100+i;


        int k=0;
        for (int i = 0; i < a.length; i+=2) {
            c[k++] = a[i];
            c[k++] = a[i+1];

            c[k++] = b[i];
            c[k++] = b[i+1];
        }

        System.out.println(imprimir(c));
    }


    public static String imprimir(int[] arreglo){
        StringBuilder sb = new StringBuilder();
        for (int x : arreglo)  sb.append("\nValor : ").append(x);
        return sb.toString();
    }

}
