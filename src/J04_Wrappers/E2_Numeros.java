package J04_Wrappers;

public class E2_Numeros {
    public static void main(String[] args) {
        ejemplo1();
        ejemplo2();
        ejemplo3();
    }


    public static void ejemplo1(){
        int x1 = Integer.parseInt("10");
        int x2 = Integer.valueOf("10").intValue();
        int x3 = Integer.sum(4,10);
        int x4 = Integer.max(10,20);
        int x5 = Integer.min(10,20);
        int x6 = Integer.signum(-100);       //Devuelve el signo del número: -1 si es negativo, 0 si es cero, y 1 si es positivo
        int x7 = Integer.compare(20,50);        // 1: a>b   0: a=b  -1: a<b

        Integer a = 124;
        Integer b = 3_124;
        int     x8 = a.compareTo(b);            // 1: a>b   0: a=b  -1: a<b
        boolean x9 = a.equals(b);               // Devuelve true si tienen igual valor
    }


    public static void ejemplo2(){
        //Tiene los mismos metodos del Integer
        int x1 = Double.BYTES;
        int x2 = Double.SIZE;
        int x3 = Double.MAX_EXPONENT;
        int x4 = Double.MIN_EXPONENT;
        double x5 = Double.MIN_VALUE;
        double x6 = Double.MAX_VALUE;
        double x7 = Double.NaN;
        double x8 = Double.NEGATIVE_INFINITY;
        double x9 = Double.POSITIVE_INFINITY;

        boolean b1 = Double.isFinite(3.14);

        Double  x10 = 10/0.0;
        boolean b2 = x10.isInfinite();
        boolean b3 = x10.isNaN();

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(x10);
    }


    public static void ejemplo3(){
        //Devuelve true solo si ambos valores son true.
        boolean b1 = Boolean.logicalAnd(true,false);

        //Devuelve true si al menos uno de los valores es true. Devuelve el resultado de aplicar el operador lógico OR de los valores
        boolean b2 = Boolean.logicalOr(true, false);

        //Devuelve true solo si uno de los valores es true y el otro es false.
        boolean b3 = Boolean.logicalXor(true,true);

        /*
         * 0  si ambos valores son iguales (x == y).
         * -1 si el primer valor (x) es false y el segundo (y) es true.
         * +1 si el primer valor (x) es true  y el segundo (y) es false.
         */
        int x1 = Boolean.compare(true, true);
    }
}
