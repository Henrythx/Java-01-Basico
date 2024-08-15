package J01_Primitivos;

public class N04_SistemasNumericos {
    public static void main(String[] args) {
        int x1 = 170;
        System.out.println("Sistemas Numéricos"
                +"\n\t170 en binario    : "+Integer.toBinaryString(x1)
                +"\n\t170 en hexadecimal: "+Integer.toHexString(x1)
                +"\n\t170 en octal      : "+Integer.toOctalString(x1)
        );
    }
}
