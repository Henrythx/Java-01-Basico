package J01_Primitivos;

public class N03_Extras {
    public static void main(String[] args) {
        //LITERALES SUBRAYADOS
        int x1 = 2_147_000_000;     //2,147 mil millones
        int x2 = 0b1010_1010;       //170 en binario
        int x3 = 0x7F_DC;        // 32700 en hexadecimal (0x)

        long tarjeta = 4750_9095_7717_8990L;
        int binario  = 0b1101_0010_0110_1001;

        double pi = 3.14_15_92;

        //DESDE JDK 10, se puede usar "var", usar con moderación
        var k1 = 127;               //Se le asigna un integer
        var k2 = 127f;              //Se le asigna un float
        var k3 = 2_147_000_000;     //Se le asigna un integer
        var k4 = 2_147_000_000L;    //Se le asigna un long
        var k5 = 25.45e-4f;         //Se le asigna un float
        var k6 = 25.45e-4;          //Se le asigna un double

        System.out.println("\nValores Var"
                +"\n"+k1
                +"\n"+k2
                +"\n"+k3
                +"\n"+k4
                +"\n"+k5
                +"\n"+k6
        );
    }
}
