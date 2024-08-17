package J09_Ejercicios.P2_Calculo;

public class E02_ConversionesMetro {
    public static void main(String[] args) {
        System.out.println("Conversiones"
                +"\n\tValor : "+27
                +"\n\tMetros a Kilómetros   : "+metrosToKilometros(27)
                +"\n\tMetros a Decímetros   : "+metrosToDecimetros(27)
                +"\n\tMetros a Centímetros  : "+metrosToCentimetros(27)
                +"\n\tMetros a Milímetros   : "+metrosToMilimetros(27)
                +"\n\t"
                +"\n\tValor : "+27
                +"\n\tMetros a milla        : "+metrosToMilla(27)
                +"\n\tMetros a yarda        : "+metrosToYarda(27)
                +"\n\tMetros a pie          : "+metrosToPie(27)
                +"\n\tMetros a pulgada      : "+metrosToPulgadas(27)
                +"\n\t"
        );
    }


    public static double metrosToKilometros(double m){
        return m * 10e-4;
    }

    public static double metrosToDecimetros(double m){
        return m * Math.pow(10,1);
    }

    public static double metrosToCentimetros(double m){
        return m * Math.pow(10,2);
    }

    public static double metrosToMilimetros(double m){
        return m * Math.pow(10,3);
    }



    public static double metrosToMilla(double m){
        return m * 621_371_192e-12; //0.00062
    }

    public static double metrosToYarda(double m){
        return m * 1.0936133;       //1,0936
    }

    public static double metrosToPie(double m){
        return m * 3.2808399;       //3.28
    }

    public static double metrosToPulgadas(double m){
        return m * 39.3700787;      //39.37
    }


}
