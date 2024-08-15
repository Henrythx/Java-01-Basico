package J07_Arrays.A2_Burbuja;

public class E1_Burbuja {
    public static void main(String[] args) {
        int[] datos = {6,20,1,5,18,15};
        ejemplo1(datos);
        System.out.println("\n"+lista(datos));

        Object[] datos2 = {6,20,1,5,18,15};
        sortBurbuja(datos2);
        System.out.println("\n"+lista(datos2));
    }

    public static void ejemplo1(int[] arreglo){
        int t = arreglo.length, x = 0;

        for (int i=0; i<t-1; i++){
            for (int j=0; j<t-1-i; j++){
                //Si item j es mayor que el siguiente item, intercambian posiciones
                if (arreglo[j]>arreglo[j+1]){
                    x = arreglo[j];
                    arreglo[j]   = arreglo[j+1];
                    arreglo[j+1] = x;
                }
            }
        }
    }


    public static void sortBurbuja(Object[] arreglo){
        int t = arreglo.length;

        for (int i = 0; i < t; i++) {
            for (int j = 0; j < t-1-i; j++) {

                if(((Comparable) arreglo[j]).compareTo(arreglo[j+1]) > 0 ){
                    Object x     = arreglo[j];
                    arreglo[j]   = arreglo[j+1];
                    arreglo[j+1] = x;
                }
            }
        }
    }


    public static String lista(int[] arreglo){
        StringBuilder sb = new StringBuilder();
        for (int x: arreglo) sb.append("\nValor: ").append(x);
        return sb.toString();
    }

    public static String lista(Object[] arreglo){
        StringBuilder sb = new StringBuilder();

        for (Object x: arreglo) sb.append("\nValor: ").append(x);

        return sb.toString();
    }
}
