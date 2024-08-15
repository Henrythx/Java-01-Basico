package J07_Arrays.E3_Ejercicios;
/*
* Detectar si el arreglo esta ordenado de forma ascendente o descendente
* */
public class E4_DetectarOrden {
    public static void main(String[] args) {
        Integer[] arreglo = {100,50,44,34,22,1};
        System.out.println(detectarOrden(arreglo));
    }


    public static String detectarOrden(Object[] arreglo){
        String orden = "Desordenado";

        int t   = arreglo.length;
        int res = 0;

        boolean asc = false;
        boolean des = false;

        for (int i = 0; i < t-1; i++) {
            res = ((Comparable)arreglo[i]).compareTo(arreglo[i+1]);
            if (res < 0) asc = true;
            if (res > 0) des = true;
        }

        if( asc && !des)    orden = "Ascendente";
        if(!asc &&  des)    orden = "Descendente";
        if(!asc && !des)    orden = "Valores semejantes";

        return orden;
    }
}
