package J01_Primitivos;

public class N02_Conversiones {
    public static void main(String[] args) {
        /*CONVERSION IMPLÍCITA
        * Automático
        * Se asigna un valor de tipo de dato menor a uno mayor
        */
        byte    x1 = 100;
        short   x2 = x1;
        int     x3 = x2;
        long    x4 = x3;
        double  x5 = x4;

        System.out.println("Conversion Implícita"
                +"\n\tValor en byte     : "+x1
                +"\n\tDe byte a short   : "+x2
                +"\n\tDe short a int    : "+x3
                +"\n\tDe int a long     : "+x4
                +"\n\tDe longa a double : "+x5
        );


        /*CONVERSION EXPLÍCITA
        * Manual, es necesario castear
        * Se asigna un valor de tipo de dato mayor a uno menor
        * Puede haber perdida de datos
        */
        double  k1 = 75_987.75;
        long    k2 = (long) k1;
        int     k3 = (int) k2;
        short   k4 = (short) k3;
        byte    k5 = (byte) k4;
        System.out.println("\nConversion Explícita"
                +"\n\tValor en double   : "+k1
                +"\n\tDe double a long  : "+k2+"\t Se retira la parte decimal "
                +"\n\tDe long a int     : "+k3
                +"\n\tDe int a short    : "+k4+"\t Short solo soporta hasta 32 767"
                +"\n\tDe short a byte   : "+k5+"\t\t Byte solo soporta hasta 127"
        );


        //Extras
        int     a = 75;
        int     a1 = 75/2;
        double  a2 = a/2;           //No tomará en cuenta la parte decimal
        double  a3 = a/2.0;         //Uso de un literal de punto flotante
        double  a4 = 75.0/2;        //Uso de un literal de punto flotante
        double  a5 = (double) 75/2; //Conversión explícita
        System.out.println("\nOperaciones"
                +"\n\t 75/2 para int    : "  +a2
                +"\n\t 75/2 para double : "  +a2
                +"\n\t 75/2.0           : "  +a3
                +"\n\t 75.0/2           : "  +a4
                +"\n\t (double)75/2     : "  +a5
        );


    }
}
