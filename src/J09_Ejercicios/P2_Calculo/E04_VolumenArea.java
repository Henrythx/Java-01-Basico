package J09_Ejercicios.P2_Calculo;

import java.text.DecimalFormat;

public class E04_VolumenArea {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.###");

        System.out.println("Volumen"
                +"\n\tCubo,     lado 4              : "+volumenCubo     (4)
                +"\n\tPrisma,   lados 4,5,10        : "+volumenPrisma   (4,5,10)
                +"\n\tPirámide, lados 4,5 altura 9  : "+volumenPiramide (4,5,9 )
                +"\n\tCilindro, radio 5 altura 10   : "+df.format(volumenCilindro(5,10))
                +"\n\tCono,     radio 5 altura 10   : "+df.format(volumenCono    (5,10))
                +"\n\tEsfera,   radio 10            : "+df.format(volumenEsfera  (10))
                +"\n\t"
                +"\nArea"
                +"\n\tCubo,     lado 4              : "+areaCubo    (4)
                +"\n\tPrisma,   lados 4,5,10        : "+areaPrisma  (4,5,10)
                +"\n\tPirámide, lados 4,5 altura 9  : "+df.format(  areaPiramide(4,5,9 ))
                +"\n\tPirámide, lados 4 altura 9    : "+df.format(  areaPiramide(4,9 ))
                +"\n\tCilindro, radio 5 altura 10   : "+df.format(  areaCilindro(5,10) )
                +"\n\tCono,     radio 5 altura 10   : "+df.format(  areaCono    (5,10) )
                +"\n\tEsfera,   radio 10            : "+df.format(  areaEsfera  (10)         )
        );
    }

    // x³
    public static double volumenCubo(double lado){
        return Math.pow(lado, 3);
    }

    // x.y.h
    public static double volumenPrisma(double ladoX, double ladoY, double ladoZ){
        return ladoX * ladoY * ladoZ;
    }

    // x.y.h.1/3
    public static double volumenPiramide(double ladoX, double ladoY, double altura){
        return (ladoX * ladoY * altura)/3;
    }

    // π.r².h
    public static double volumenCilindro(double radio, double altura){
        return Math.pow(radio, 2) * altura * Math.PI;
    }

    // π.r².h.1/3
    public static double volumenCono(double radio, double altura){
        return (Math.pow(radio, 2) * altura * Math.PI)/3;
    }

    // π.r³.4/3
    public static double volumenEsfera(double radio){
        return (Math.pow(radio, 3) * Math.PI ) * 4/3;
    }





    // 6.x²
    public static double areaCubo(double lado){
        return Math.pow(lado, 2) * 6;
    }

    // 2.x.y + 2.x.z
    public static double areaPrisma(double ladoX, double ladoY, double ladoZ){
        return 2 * ladoX * ladoY + 2 * ladoX * ladoZ;
    }

    //x² + 2.x.g
    public static double areaPiramide(double lado, double altura){
        double b = Math.pow(lado,2);
        double g = Math.hypot(altura, lado/2);
        double t = lado * g * 1/2;

        return b + 4 * t;
    }

    public static double areaPiramide(double ladoX, double ladoY, double altura){
        double b = ladoX * ladoY;               //area de la base
        double g1 = Math.hypot(altura,ladoX/2); //hipotenusa con la cara del triangulo, ancho x
        double g2 = Math.hypot(altura,ladoY/2); //hipotenusa con la cara del triangulo, ancho y
        double t1 = ladoX * g1 * 1/2;
        double t2 = ladoY * g2 * 1/2;

        return b + 2 * (t1 + t2);
    }

    // 2.π.r(r+h)
    public static double areaCilindro(double radio, double altura){
        return 2 * Math.PI * radio * (radio + altura) ;
    }

    // π.r(r + √(r² + h²))
    public static double areaCono(double radio, double altura){
        return Math.PI * radio * (radio + Math.sqrt(Math.pow(radio,2) + Math.pow(altura,2)));
    }

    // 4.π.r²
    public static double areaEsfera(double radio){
        return Math.pow(radio,2) * 4 * Math.PI;
    }

}
