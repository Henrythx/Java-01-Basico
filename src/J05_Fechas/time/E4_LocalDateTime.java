package J05_Fechas.time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class E4_LocalDateTime {
    public static void main(String[] args) {
        ejemplo1();
        ejemplo2();
    }


    public static void ejemplo1(){
        LocalDateTime fecha = LocalDateTime.of(2027,4,27,2,30);
        LocalDateTime f2 = LocalDateTime.now();
        LocalDateTime f3 = LocalDateTime.parse("2027-4-27T2:30");

        System.out.println("Métodos básicos"
                +"\n\tFecha actual          : "+f2
                +"\n\tFecha especifica      : "+f3
                +"\n\tFecha parseada        : "+fecha
                +"\n\t"
                +"\n\tObtener fecha     : "+fecha.toLocalDate()
                +"\n\tObtener Año       : "+fecha.getYear()
                +"\n\tObtener mes       : "+fecha.getMonth()
                +"\n\tObtener dias      : "+fecha.getDayOfMonth()
                +"\n\t"
                +"\n\tObtener hora      : "+fecha.toLocalTime()
                +"\n\tObtener horas     : "+fecha.getHour()
                +"\n\tObtener minutos   : "+fecha.getMinute()
                +"\n\tObtener segundos  : "+fecha.getSecond()
                +"\n\t"
                +"\n\tIncluye todos los métodos de LocalDate y LocalTime"
        );
    }


    //OTRA FORMA DE OBTENER DATOS
    public static void ejemplo2(){
        LocalDateTime fecha = LocalDateTime.of(2002,4,27,10,30);

        System.out.println("\nObtener el valor de campo especifico"
                +"\nObtener año         : "+fecha.get(ChronoField.YEAR)
                +"\nObtener mes         : "+fecha.get(ChronoField.MONTH_OF_YEAR)
                +"\nObtener dia         : "+fecha.get(ChronoField.DAY_OF_MONTH)
                +"\nObtener hora        : "+fecha.get(ChronoField.HOUR_OF_DAY)
                +"\nObtener minutos     : "+fecha.get(ChronoField.MINUTE_OF_HOUR)
        );
    }


}
