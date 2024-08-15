package J07_Arrays.E3_Ejercicios;
/*
* Obtener la posicion del valor en su array respectivo
* En case de no estar en el arreglo, devolver -1
* */
public class E6_BuscarValor {
    public static void main(String[] args) {
        int[]     numeros   = {1,84,15,78,15,10,27,20};
        String[]  palabras  = {"Naranaja","Mango","Fresa","Papaya","Platano","Manzana","Pera"};
        Integer[] datos     = {1,84,15,78,15,10,27,20};

        System.out.println("Busqueda de posicion"
                +"\n\t"+getIndexValor(84,numeros)
                +"\n\t"+getIndexValor("Mango",palabras)
                +"\n\t"+getIndexValor(10,datos)
        );
    }


    public static int getIndexValor(int x, int[] arreglo){
        int index = -1;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i]==x) {
                index = i;
                break;
            }
        }
        return index;
    }


    public static int getIndexValor(String x, String[] arreglo){
        int index = -1;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i].equals(x)) {
                index = i;
                break;
            }
        }
        return index;
    }


    public static int getIndexValor(Object x, Object[] arreglo){
        int index = -1;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i].equals(x)) {
                index = i;
                break;
            }
        }
        return index;
    }
}
