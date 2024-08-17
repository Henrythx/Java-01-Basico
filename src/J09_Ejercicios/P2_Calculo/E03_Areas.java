package J09_Ejercicios.P2_Calculo;

import java.text.DecimalFormat;

public class E03_Areas {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.###");

        System.out.println("Areas"
                +"\n\tCuadrado  , lado 2                : "+cuadrado1(4)
                +"\n\tCuadrado  , diagonal 10           : "+cuadrado2(10)
                +"\n\tRectángulo, area 4 y base 3       : "+rectangulo1(4,3)
                +"\n\tRectángulo, lado 4 y diagonal 5   : "+rectangulo2(4,5)
                +"\n\t"
                +"\n\tTriangulo rectangular, base 3 y altura 4  : "+trianguloRectangular(3,4)
                +"\n\tTriangulo equilátero, lado 5              : "+trianguloEquilatero(5)
                +"\n\tTriangulo, formula Heron, lados 5, 4 y 7  : "+df.format(trianguloHeron(5,7,4))
                +"\n\t"
                +"\n\tPolígono regular, lado 5, cantidad 5  :"+poligonoRegular(5,5)
        );
    }
    public static double cuadrado1(double lado){
        return Math.pow(lado, 2);
    }

    public static double cuadrado2(double diagonal) {
        return Math.pow(diagonal, 2) / 2;
    }

    public static double rectangulo1(double base, double altura) {
        return base * altura;
    }

    public static double rectangulo2(double lado, double diagonal) {
        double a = Math.sqrt(Math.pow(diagonal,2) - Math.pow(lado,2));
        return a * lado;
    }

    public static double trianguloRectangular(double base, double altura){
        return base * altura * 1/2;
    }

    public static double trianguloEquilatero(double lado){
        return lado * lado * Math.sqrt(3) * 1/4;
    }

    public static double trianguloHeron(double a, double b, double c){
        double s = (a+b+c)/2;
        return Math.sqrt(s * (s-a) * (s-b) * (s-c));
    }

    public static double poligonoRegular(double lado, double cantidad){// perimetro * apotema /2
        double angulo   = 360/(2*cantidad);
        double apotema  = lado/(2*Math.tan(Math.toRadians(angulo)));
        System.out.println("Apotema : "+apotema);
        double perimetro= lado*cantidad;
        return perimetro * apotema / 2;
    }

}


