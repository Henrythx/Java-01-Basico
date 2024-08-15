package J07_Arrays.A2_Burbuja;

public class E2_Burbuja {
    public static void main(String[] args) {

        String[] productos = new String[6];
        productos[0] = "Ryzen 5 5600G";
        productos[1] = "LG UK6300";
        productos[2] = "Mouse Logitech G350";
        productos[3] = "Xiaomi Poco X3";
        productos[4] = "Casco Virtual";
        productos[5] = "Destornillador electrico";

        String[] productos2 = new String[6];
        productos2[0] = "c";
        productos2[1] = "f";
        productos2[2] = "d";
        productos2[3] = "b";
        productos2[4] = "a";
        productos2[5] = "e";

        ordenar(productos2);
        System.out.println(imprimir(productos2));
    }


    public static void ordenar(String[] arreglo){
        int t = arreglo.length;

        for (int i = 0; i < t ; i++) {
            for (int j = 0; j < t; j++) {
                if (arreglo[i].compareTo(arreglo[j])<0){
                    String x    = arreglo[i];
                    arreglo[i]  = arreglo[j];
                    arreglo[j]  = x;
                }
            }
        }
    }


    public static String imprimir(Object[] arreglo){
        StringBuilder sb = new StringBuilder();
        for (Object x : arreglo)  sb.append("\nValor : ").append(x.toString());
        return sb.toString();
    }


}
