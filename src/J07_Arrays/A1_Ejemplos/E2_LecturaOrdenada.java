package J07_Arrays.A1_Ejemplos;

public class E2_LecturaOrdenada {
    public static void main(String[] args) {
        int[] datos = new int[5];
        datos[0] = 10;
        datos[1] = 5;
        datos[2] = 20;
        datos[3] = 77;
        datos[4] = 18;

        ejemplo1(datos);
        ejemplo2(datos);
        ejemplo3(datos);
        ejemplo4(datos);
    }


    //Usando For
    public static void ejemplo1(int[] arreglo){
        System.out.println("Ejemplo 1");

        for(int i=0; i<arreglo.length; i++)
            System.out.println("\titem["+i+"] : "+arreglo[i]);
    }


    //Usando Foreach
    public static void ejemplo2(int[] arreglo){
        System.out.println("Ejemplo 2");

        for(int x : arreglo)    System.out.println("\t Valor : "+x);
    }


    //Usando while
    public static void ejemplo3(int[] arreglo){
        System.out.println("Ejemplo 3");
        int i=0,    t=arreglo.length;

        while (i<t)
            System.out.println("\titem["+i+"] : "+arreglo[i++]);
    }


    //Usando do while
    public static void ejemplo4(int[] arreglo){
        System.out.println("Ejemplo 4");
        int i=0,    t=arreglo.length;

        do      System.out.println("\titem["+i+"] : "+arreglo[i++]);
        while   (i<t);
    }
}
