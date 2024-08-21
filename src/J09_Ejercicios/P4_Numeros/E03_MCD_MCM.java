package J09_Ejercicios.P4_Numeros;

public class E03_MCD_MCM {

    public static void main(String[] args) {
        System.out.println(imprimir(getFactoresPrimos(144))     +"\n");
        System.out.println(imprimir(getFactoresMCM(8,12))   +"\n");
        System.out.println(imprimir(getFactoresMCD(256,512))  +"\n");
    }


    public static int[] getFactoresMCM(int a, int b){
        if (a<=1 || b<=1)   return null;

        int x = a,  y = b,  k = 0;
        int mayor = Math.max(a, b);

        int[] arreglo = new int[mayor];

        for (int i = 2; ((x != 1) || (y != 1));) {
            if (x%i==0 || y%i==0){
                System.out.println(x+"\t"+y+"\t|"+i);
                if (x%i==0)     x/=i;
                if (y%i==0)     y/=i;
                arreglo[k++] = i;
            }
            else i++;
        }

        int[] array = new int[k];
        System.arraycopy(arreglo, 0, array, 0,k);

        return array;
    }

    /*En caso de ajustar para más números, solo incrementa, los x, y, z, etc.
    *No olvidar ajustar en caso de que el menor sea divisor de los demás números
    * Si solo fuera "i<= menor" asegurado lo resolveria, pero seria mas lento
    */
    public static int[] getFactoresMCD(int a, int b){

        if (a<=1 || b<=1)   return null;

        int x = a,  y = b,  k = 0;
        int menor = Math.min(a, b);
        int mayor = Math.max(a, b);

        int[] arreglo = new int[(int)Math.sqrt(menor)];

        for (int i = 2;  i*i <= menor;) {
            if (x%i==0  &&  y%i==0){
                System.out.println(x+"\t"+y+"\t|"+i);
                x/=i;
                y/=i;
                arreglo[k++] = i;
            }else  i++;
        }

        //por si el menor es divisor del mayor;
        if(mayor%menor==0 && (x==a || y==b))  arreglo[k++] = menor;

        int[] array = new int[k];
        System.arraycopy(arreglo, 0, array, 0,k);

        return array;
    }



    public static int[] getFactoresPrimos(int x){
        if (x<=1)   return null;

        int raiz = (int)Math.sqrt(x);
        int a = x,    k = 0;

        int[] arreglo = new int[raiz];

        for (int i = 2;     (i<=raiz) && (a!=1); ) {
            if(a%i==0)  {
                System.out.println(a+"\t|"+i);
                a/=i;
                arreglo[k++] = i;
            }
            else i++;
        }
        //por si el numero no tiene divisores, en otras palabras "primo"
        if (a!=1)   arreglo[k++] = a;

        int[] array = new int[k];
        System.arraycopy(arreglo, 0, array, 0,k);

        return array;
    }



    public static String imprimir(int[] arreglo){
        if (arreglo == null) return "es nulo";
        StringBuilder sb = new StringBuilder();
        for (int x : arreglo)   sb.append("[").append(x).append("] ");
        return sb.toString();
    }
}
