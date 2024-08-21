package J09_Ejercicios.P4_Numeros;

public class E01_CalculosSimples {
    public static void main(String[] args) {
        System.out.println("Factorial de 10             : "+getFactorial(10)        );
        System.out.println("Sumar naturales hasta el 100: "+getSumNaturales(9)      );
        System.out.println("Sumar naturales hasta el 100: "+getSumNaturales2(9)     );
        System.out.println("Sumar dígitos de 745680    : "+getSumaDigitos(745_680) );
    }

    public static long getFactorial(int x){
        long s = 1;

        for (int i = 1; i <= x; i++)        s*=i;

        return s;
    }


    public static long getSumNaturales(int x){
        long s = 1;
        for (int i = 2; i <= x ; i++)       s+=i;

        return s;
    }

    public static long getSumNaturales2(int x){//Formula Gauss
        long s;
        if(x%2==0)  s = (long) (x+1) * (x/2);
        else        s = (long) (x+1) * (x/2) + (x+1)/2;

        return s;
    }

    public static int getSumaDigitos(int x){
        int s=0;
        while (x>0){
            s += x%10;
            x /= 10;
        }
        return s;
    }

}
