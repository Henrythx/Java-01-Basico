package J04_Wrappers;
/*
 * Wrapper, también conocidas como clases envolventes, son clases que
 * encapsulan tipos de datos primitivos para tratarlos como objetos.
 * Esto es útil en situaciones donde se requiere trabajar con objetos
 * en lugar de tipos primitivos, como en colecciones que solo aceptan objetos.
 */
public class E1_Wrappers {
    public static void main(String[] args) {
        ejemplo1();
        //ejemplo2();
        //ejemplo3();
        //ejemplo4();
    }


    public static void ejemplo1(){
        //Integer ob1 = new Integer(10);//obsoleto
        Integer ob2 = Integer.valueOf(32_768);
        Integer ob3 = Integer.valueOf("32768");

        Double  ob4 = Double.valueOf(4.75);
        Double  ob5 = Double.valueOf("4.75");

        Float   ob6 = Float.valueOf(1.57f);
        Float   ob7 = Float.valueOf("1.57f");

        Boolean ob8 = Boolean.valueOf(true);
        Boolean ob9 = Boolean.valueOf("true");

        System.out.println("\n"+ob2+"\n"+ob3+"\n"+ob4+"\n"+ob5+"\n"+ob6+"\n"+ob7+"\n"+ob8+"\n"+ob9);
    }

    public static void ejemplo2(){
        Long ob = Long.valueOf(256L);

        String  x1 = ob.toString();
        int     x2 = ob.intValue();
        short   x3 = ob.shortValue();
        float   x4 = ob.floatValue();
        double  x5 = ob.doubleValue();
        long    x6 = ob.longValue();

        System.out.println("\n"+x1+"\n"+x2+"\n"+x3+"\n"+x4+"\n"+x5+"\n"+x6);
    }

    public static void ejemplo3(){
        Integer[] numeros = {1,2,3,4,5};

        for (Integer n : numeros){
            if ( n%2 == 0 )             //Forma implícita
                System.out.println(n);
        }

        for (Integer n: numeros){
            if ( n.intValue()%2 == 0)   //Forma explicita
                System.out.println(n);
        }
    }

    public static void ejemplo4(){
        /*
         *Autoboxing
         *Es el proceso automático de convertir un tipo de dato primitivo en su
         *correspondiente objeto de clase envolvente.
         *Por ejemplo, convertir un int en un Integer.
         *
         *Unboxing
         *Es el proceso inverso, donde un objeto de clase envolvente se convierte
         *automáticamente en su correspondiente tipo de dato primitivo.
         *Por ejemplo, convertir un Integer en un int.
         */

        int x1 = 10;
        Integer ob1 = x1;   // Autoboxing       //Convierte primitivo a objeto

        Integer ob2 = Integer.valueOf(100);
        int x2 = ob2;       // Unboxing         //Convierte objeto a primitivo

        System.out.println("objeto 1    = "+ob1 );
        System.out.println("primitivo 2 = "+x2  );
    }
}
