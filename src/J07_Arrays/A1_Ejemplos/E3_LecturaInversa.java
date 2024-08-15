package J07_Arrays.A1_Ejemplos;

public class E3_LecturaInversa {
    public static void main(String[] args) {
        int[] datos = new int[5];
        datos[0] = 10;
        datos[1] = 5;
        datos[2] = 20;
        datos[3] = 77;
        datos[4] = 18;

        ejemplo1(datos);
        ejemplo2(datos);
    }



    public static void ejemplo1(int[] arreglo) {
        System.out.println("Ejemplo 1");

        for (int i=arreglo.length-1; i>=0; i--)
            System.out.println("\titem["+i+"] : "+arreglo[i]);
    }



    public static void ejemplo2(int[] arreglo){
        System.out.println("Ejemplo 2");
        int k=0, t=arreglo.length;

        for (int i = 0; i < t; i++) {
            k=(t-1)-i;
            System.out.println("\titem["+k+"] : "+arreglo[k]);
        }
    }

}
