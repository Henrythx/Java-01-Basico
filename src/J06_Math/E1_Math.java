package J06_Math;

public class E1_Math {
    public static void main(String[] args) {
        ejemplo1();
        ejemplo2();
    }


    public static void ejemplo1(){
        int     x1  =   Math.abs    (-150);         //Devuelve el valor absoluto
        double  x2  =   Math.abs    (-150.2);       //Devuelve el valor absoluto
        double  x3  =   Math.round  (4.12);         //Redondea al entero mas cercano
        double  x4  =   Math.round  (4.67);         //Redondea al entero mas cercano

        double  x5  =   Math.ceil   (74.68);        //Devuelve el entero superior
        double  x6  =   Math.floor  (74.12);        //Devuelve el entero inferior
        double  x7  =   Math.ceil   (-74.68);       //Devuelve el entero superior (-74) por el signo
        double  x8  =   Math.floor  (-74.12);       //Devuelve el entero inferior (-75) por el signo

        double  x9  =   Math.max    (10,20);        //Devuelve el mayor
        double  x10 =   Math.min    (10,20);        //Devuelve el menor

        double  x11 =   Math.pow    (2,4);          //2 a la 4
        double  x12 =   Math.cbrt   (27);           //Raíz cubíca del argumento
        double  x13 =   Math.sqrt   (16);           //Raíz cuadrada
        double  x14 =   Math.pow    (64,1/6.0);     //Raíz sexta

        double  x15 =   Math.random ();             //Aleatoria entre 0.0 y 0.1
        double  x16 =   Math.hypot  (3,4);          //Devuelve la hipotenusa
        double  x17 =   Math.signum (-10);          //Devuelve -1.0, el signo
        double  x18 =   Math.copySign(5.0, -4.0);   //Copia el signo del segundo argumento en el primero

        double  x19 = Math.PI;                      //Valor pi
        double  x20 = Math.exp(2);                  //Constante de euler elevado a x


        System.out.println("Métodos básicos"
                +"\n\tValor absoluto de 20  : "+Math.abs    (-20)
                +"\n\tRedondear 45.7        : "+Math.round  (35.7)
                +"\n\tEntero superior 16.24 : "+Math.ceil   (16.24)
                +"\n\tEntero inferior 29.35 : "+Math.floor  (29.35)
                +"\n\t"
                +"\n\tHallar mayor (18,74)  : "+Math.max(18,74)
                +"\n\tHallar menor (18,74)  : "+Math.min(18,74)
                +"\n\t"
                +"\n\t2 elevado a 4         : "+Math.pow(2,4)
                +"\n\tRaíz cuadrada de 16   : "+Math.sqrt(16)
                +"\n\tRaíz cubica de 27     : "+Math.cbrt(27)
                +"\n\tRaíz sexta de 64      : "+Math.pow(64,1/6.0)
                +"\n\t"
                +"\n\tValor aleatorio 0-1.0 : "+Math.random()
                +"\n\tHipotenusa de 3 y 4   : "+Math.hypot(3,4)
                +"\n\tAgregar signo         : "+Math.copySign(75.75,-4)
                +"\n\t"
                +"\n\tConstante pi          : "+Math.PI
                +"\n\tConstante euler       : "+Math.E
        );
    }



     public static void ejemplo2(){
         //Si tienes (2^6 = 64 ), entonces:  log(64) en base 2 =  6
         double x1 = Math.log(64)/Math.log(2);

         //Si tienes (4^3 = 64 ), entonces:  log(64) en base 4 =  3
         double x2 = Math.log(64)/Math.log(4);

         //Logaritmo de x, en base 10
         double x3 = Math.log10(100);

         //Logaritmo natural de 8, es el exponente al que debes elevar euler (e^exp) para obtener 8
         double x4 = Math.log(8);

         System.out.println("\nLogaritmos: "
                 +"\nLogaritmo de 64 en base 2       : "+x1
                 +"\nLogaritmo de 64 en base 4       : "+x2
                 +"\nLogaritmo de 100 en base 10     : "+x3
                 +"\nLogaritmo natural de 8          : "+x4
         );
    }
}
