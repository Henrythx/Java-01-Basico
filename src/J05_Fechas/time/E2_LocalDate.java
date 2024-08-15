package J05_Fechas.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class E2_LocalDate {
    public static void main(String[] args) {
        ejemplo1();
        ejemplo2();
        ejemplo3();
    }


    public static void ejemplo1(){
        LocalDate fecha = LocalDate.now();

        System.out.println("Métodos básicos"
                +"\n\tFecha actual      : "+LocalDate.now()
                +"\n\tFecha especifica  : "+LocalDate.of(2025,10,25)
                +"\n\tFecha parseada    : "+LocalDate.parse("2025-10-25")
                +"\n\t"
                +"\n\tObtener año       : "+fecha.getYear()
                +"\n\tObtener mes       : "+fecha.getMonth()
                +"\n\tObtener mes       : "+fecha.getMonthValue()
                +"\n\tObtener dia       : "+fecha.getDayOfMonth()
                +"\n\t"
                +"\n\tFecha             : "+fecha
                +"\n\tDia de la semana  : "+fecha.getDayOfWeek()
                +"\n\tDia del año       : "+fecha.getDayOfYear()
                +"\n\tDias en el mes    : "+fecha.lengthOfMonth()
                +"\n\tDias en el año    : "+fecha.lengthOfYear()
                +"\n\t"
                +"\n\tFecha             : "+fecha
                +"\n\tFecha con dias    : "+fecha.withDayOfMonth(5)
                +"\n\tFecha con meses   : "+fecha.withMonth(3)
                +"\n\tFecha con años    : "+fecha.withYear(10)
                +"\n\tFecha con dias año: "+fecha.withDayOfYear(160)
                +"\n\t"
                +"\n\tFecha             : "+fecha
                +"\n\tFecha + dias      : "+fecha.plusDays(10)
                +"\n\tFecha + meses     : "+fecha.plusMonths(3)
                +"\n\tFecha + años      : "+fecha.plusYears(10)
                +"\n\tFecha + semanas   : "+fecha.plusWeeks(3)
                +"\n\t"
                +"\n\tFecha             : "+fecha
                +"\n\tFecha - dias      : "+fecha.minusDays(5)
                +"\n\tFecha - meses     : "+fecha.minusMonths(3)
                +"\n\tFecha - años      : "+fecha.minusYears(10)
                +"\n\tFecha - semanas   : "+fecha.plusWeeks(3)
                +"\n\t"
                +"\n\tFecha                         : "+fecha
                +"\n\t¿Es año bisiesto?             : "+fecha.isLeapYear()
                +"\n\t¿Es la misma fecha?           : "+fecha.equals(LocalDate.of(2024,8,7))
                +"\n\t¿Es anterior al 2025-01-01?   : "+fecha.isBefore(LocalDate.of(2025,1,1))
                +"\n\t¿Es posterior al 2025-01-01?  : "+fecha.isAfter (LocalDate.of(2025,1,1))
        );
    }

    //AÑADIR HORA A UNA FECHA
    public static void ejemplo2(){
        LocalDate fecha = LocalDate.now();

        LocalDateTime f1 = fecha.atStartOfDay();
        LocalDateTime f2 = fecha.atTime(10,30);
        LocalDateTime f3 = fecha.atTime(10,45,30);

        System.out.println("\nEjemplo 2 : Fecha + hora"
                +"\n\tFecha                     : "+fecha
                +"\n\tFecha con hora inicio     : "+f1
                +"\n\tFecha con hora especifica : "+f2
                +"\n\tFecha con hora especifica : "+f3
        );
    }

    //OBTENER EL PERIODO ENTRE DOS FECHAS
    public static void ejemplo3(){
        LocalDate fecha     = LocalDate.now();
        LocalDate fecha2    = LocalDate.of(2030,5,18);

        Period p = fecha.until(fecha2);
        System.out.println("\nEjemplo 3, Periodo entre 2 fechas"
                +"\n\tFecha actual      : "+fecha
                +"\n\tFecha objetivo    : "+fecha2
                +"\n\tAños              : "+p.getYears()
                +"\n\tMeses             : "+p.getMonths()
                +"\n\tDias              : "+p.getDays()
        );
    }
}
