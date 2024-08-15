package J01_Primitivos;

public class S04_Caracteres {
    public static void main(String[] args) {
        //caracter unicode
        char x1 = 'a';
        char x2 = '\u0040';
        char x3 = '\u00d1';
        char x4 = 'ñ';
        System.out.println("letra = "+x1);
        System.out.println("letra = "+x2);
        System.out.println("letra = "+x3);
        System.out.println("letra = "+x4);

        char x5 = 64;
        char x6 = 94;
        System.out.println("valor = "+ x5);
        System.out.println("valor = "+ x6);
        System.out.println("(x5 = x6) =" + (x5==x6) +"\n");

        char espacio    = '\u0020';
        char retroceso  = '\b';
        char tabulador  = '\t';
        char salto      = '\n';

        System.out.println("hola: "+"hola");
        System.out.println("hola: "+espacio+espacio+espacio+"hola");
        System.out.println("hola: "+retroceso+retroceso+retroceso+"hola");
        System.out.println("hola: "+tabulador+"hola");
        System.out.println("hola: "+System.lineSeparator()+"hola\n");


        System.out.println("tipo char, bytes = "+Character.BYTES);
        System.out.println("tipo char, bites = "+Character.SIZE);
        System.out.println("tipo char, mínimo = "+Character.MIN_VALUE);
        System.out.println("tipo char, máximo = "+Character.MAX_VALUE);
    }
}
