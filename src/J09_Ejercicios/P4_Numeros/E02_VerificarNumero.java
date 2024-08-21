package J09_Ejercicios.P4_Numeros;

public class E02_VerificarNumero {

    public static void main(String[] args) {
        System.out.println("947 es primo?       : "+esPrimo(947)        );
        System.out.println("28 es perfecto?     : "+esPerfecto(28)      );
        System.out.println("8028 es armstrong?  : "+esArmstrong(8028)   );
        System.out.println("8028 es armstrong?  : "+esArmstrong2(8028)  );
    }


    /*
    * número entero, por convención mayor que uno, que solo es divisible
    * por sí mismo y por la unidad; por ejemplo, 5, 7, etcétera.
    */
    public static boolean esPrimo(int x){
        if (x<=1)       return false;
        if (x%2==0)     return false;

        int raiz = (int) Math.sqrt(x);

        for (int i = 3;  i<= raiz;  i+=2)
            if(x%i==0) return false;

        return true;
    }



    /*
     * Un número perfecto es un entero positivo que es igual a la suma de sus
     * divisores excluyendo el propio número. Ejemplo: 6, 28, 4916 y 8128
     */
    public static boolean esPerfecto(int x){
        int s=1;

        for (int i = 2; i*i <= x; i++) {
            if (x%i==0){
                s += i;                     //divisor
                if (i != x/i)   s+= x/i;    //divisor opuesto, la condicional es para no poner el numero 2 veces
                System.out.println(i+" , "+x/i);
            }
        }

        return (s==x);
    }



    /*
     * Un número de Armstrong es aquel en el que la suma de sus dígitos
     * elevados a la cantidad de los mismos sea igual al número en sí mismo
     *
     * 153: (1^3 + 5^3 + 3^3 = 153)
     * 370: (3^3 + 7^3 + 0^3 = 370)
     * 371: (3^3 + 7^3 + 1^3 = 371)
     * 1634: (1^4 + 6^4 + 3^4 + 4^4 = 1634)
     * */
    public static boolean esArmstrong(int x){
        int a = x,  b = x, e= 0, k, s=0;

        while (a>0) {
            a/=10;
            e++;
        }

        while (b>0){
            k = b - (b/10) * 10;
            s += (int) Math.pow(k,e);
            b/=10;
            System.out.println(k+"("+e+")"+" "+s);
        }

        return (s==x);
    }

    public static boolean esArmstrong2(int x){
        int b = x,   s=0,   k ;
        int e = (int) Math.log10(x)+1;    //Cantidad de dígitos, Math.log10(x) devuelve el exponente en base 10

        while (b>0){
            k = b%10;               //obtener el residuo
            s += (int) Math.pow(k,e);
            b/=10;
            System.out.println(k+"("+e+")"+" "+s);
        }

        return (s==x);
    }



    public static String imprimir(int[] arreglo){
        StringBuilder sb = new StringBuilder();
        for (int x : arreglo)   sb.append("[").append(x).append("] ");
        return sb.toString();
    }
}
