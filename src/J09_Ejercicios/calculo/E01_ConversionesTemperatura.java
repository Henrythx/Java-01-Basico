package J09_Ejercicios.calculo;

public class E01_ConversionesTemperatura {
    public static void main(String[] args) {
        System.out.println("Conversiones de Temperaturas"
                +"\n\t Valor celsius : "+90
                +"\n\t Celsius a Fahrenheit : "+celsiusToFahrenheit(90)
                +"\n\t Celsius a Kelvin     : "+celsiusToKelvin(90)
                +"\n\t"
                +"\n\t Valor fahrenheit : "+194
                +"\n\t Fahrenheit a Celsius : "+fahrenheitToCelsius(194)
                +"\n\t Fahrenheit a Kelvin  : "+fahrenheitToKelvin(194)
                +"\n\t"
                +"\n\t Valor kelvin: "+363.15
                +"\n\t Kelvin a Celsius     : "+kelvinToCelsius(363.15)
                +"\n\t Kelvin a Fahrenheit  : "+kelvinToFahrenheit(363.15)
        );
    }


    public static double celsiusToFahrenheit(double c){
        return 32 + c * (9/5.0);
    }

    public static double celsiusToKelvin(double c){
        return 273.15 + c;
    }


    public static double fahrenheitToCelsius(double f){
        return (f - 32) * (double)5/9;
    }

    public static double fahrenheitToKelvin(double f){
        return (f - 32) * (double)5/9 + 273.15; //primero transformas a celsius
    }


    public static double kelvinToCelsius(double k){
        return k - 273.15;
    }

    public static double kelvinToFahrenheit(double k){
        return (k - 273.15) * (double)9/5 + 32 ;
    }
}
