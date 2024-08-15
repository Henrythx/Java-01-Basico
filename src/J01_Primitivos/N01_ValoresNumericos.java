package J01_Primitivos;
/*
* byte      8  bits     127
* short     16 bits     32 767
* int       32 bits     2 147 453 647                   2 mil millones
* long      64 bits     9, 223 372, 036 854, 775 807    9 millones de billones
*
* float     32 bits
* double    64 bits
*/

public class N01_ValoresNumericos {
    public static void main(String[] args) {

        //ENTEROS
        byte    x1 = 127;
        short   x2 = 32767;
        int     x3 = 2_147_000_000;
        long    x4 = 9_223_000__000_000_000_000L; //Es necesario la L
        //Si no pone la "L", y está en el rango de "int" lo pasará

        //DECIMALES
        float   k1 = 1;
        float   k2 = 1.0f;  //Menor rango
        double  k3 = 4;
        double  k4 = 4.0;   //Mayor rango

        float   k5 = 45;
        float   k6 = 45e-2f;
        float   k7 = 45e2f;

        double  k8  = 8.75;
        double  k9  = 8.75e-3;
        double  k10 = 8.75e+3;


        //IMPRIMIR EN CONSOLA
        System.out.println("ENTEROS"
                +"\n\tbyte  : "+x1
                +"\n\tshort : "+x1
                +"\n\tint   : "+x1
                +"\n\tlong  : "+x1
        );

        System.out.println("Decimales"
                +"\n\t"+k1
                +"\n\t"+k2
                +"\n\t"+k3
                +"\n\t"+k4
                +"\n\t"
                +"\nFloat"
                +"\n\t45            : "+k5
                +"\n\t45 x 10^-2 : "+k6
                +"\n\t45 x 10^2"+k7
                +"\n\t"
                +"\nDouble"
                +"\n\t8.75          : "+k8
                +"\n\t8.75 x 10^-3  : "+k9
                +"\n\t8.75 x 10^3   : "+k10
        );
    }
}
