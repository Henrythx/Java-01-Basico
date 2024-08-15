package J07_Arrays.A1_Ejemplos;

import java.util.Arrays;

public class E1_Array {
    public static void main(String[] args) {
        ejemplo1();
        ejemplo2();
        ejemplo3();
    }

    public static void ejemplo1(){
        int[] datos = new int[4];

        datos[0] = 1;
        datos[1] = (int) 2_255L;
        datos[2] = 77;
        datos[3] = Integer.valueOf("100");

        System.out.println("Ejemplo 1");
        imprimir(datos);

        Arrays.sort(datos);//Ordena los datos

        System.out.println("\t-------------");
        imprimir(datos);
    }


    public static void ejemplo2(){
        int[] datos = {1, 2_255, 77, 255};

        int x1 = datos[0];
        int x2 = datos[1];
        int x3 = datos[2];
        int x4 = datos[3];
        //int x5 = datos[4];

        System.out.println("Ejemplo 2");
        imprimir(datos);
    }


    public static void ejemplo3(){
        String[] productos = new String[6];

        productos[0] = "Ryzen 5 5600G";
        productos[1] = "LG UK6300";
        productos[2] = "Mouse Logitech G350";
        productos[3] = "Xiaomi Poco X3";
        productos[4] = "Micrófono Maono AU903";
        productos[5] = "Xiaomi Poco X3";

        Arrays.sort(productos); //Reordena el array

        System.out.println("Ejemplo 3");
        imprimir(productos);
    }







    public static void imprimir(int[] arreglo){
        for (int i=0; i<arreglo.length; i++)
            System.out.println("\titem["+i+"] : "+arreglo[i]);
    }

    public static void imprimir(String[] arreglo){
        for (int i=0; i<arreglo.length; i++)
            System.out.println("\titem["+i+"] : "+arreglo[i]);
    }
}
