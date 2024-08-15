package J05_Fechas.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class E3_LocalTime {
    public static void main(String[] args) {
        ejemplo1();
        ejemplo2();
        ejemplo3();
    }


    public static void ejemplo1(){
        LocalTime hora = LocalTime.of(10,45);

        System.out.println("\nMétodos básicos"
                +"\n\tHora actual       : "+LocalTime.now()
                +"\n\tHora especifica   : "+LocalTime.of(14,37)
                +"\n\tHora especifica   : "+LocalTime.of(14,37,45,2_000)
                +"\n\thora parseada     : "+LocalTime.parse("15:30")
                +"\n\t"
                +"\n\tObtener hora      : "+hora.getHour()
                +"\n\tObtener minutos   : "+hora.getMinute()
                +"\n\tObtener segundos  : "+hora.getSecond()
                +"\n\tObtener nanos     : "+hora.getNano()
                +"\n\t"
                +"\n\tHora              : "+hora
                +"\n\tHora con hora     : "+hora.withHour(7)
                +"\n\tHora con minutos  : "+hora.withMinute(17)
                +"\n\tHora con segundos : "+hora.withSecond(40)
                +"\n\tHora con nanos    : "+hora.withNano(4_000)
                +"\n\t"
                +"\n\tHora              : "+hora
                +"\n\tHora + horas      : "+hora.plusHours(2)
                +"\n\tHora + minutos    : "+hora.plusMinutes(30)
                +"\n\tHora + segundos   : "+hora.plusSeconds(40)
                +"\n\tHora + nanos      : "+hora.plusNanos(10)
                +"\n\t"
                +"\n\tHora              : "+hora
                +"\n\tHora - horas      : "+hora.minusHours(3)
                +"\n\tHora - minutos    : "+hora.minusMinutes(20)
                +"\n\t"
                +"\n\t¿Son la misma hora?       : "+hora.equals(LocalTime.of(10,45))
                +"\n\t¿Es anterior a las 15:00? : "+hora.isBefore(LocalTime.of(15,0))
                +"\n\t¿Es posterior a las 15:00?: "+hora.isAfter(LocalTime.of(15,0))
        );
    }


    //AÑADIR FECHA A UNA HORA
    public static void ejemplo2(){
        LocalTime hora  = LocalTime.of(8,45);
        LocalDate fecha = LocalDate.now();

        LocalDateTime ldt1 = hora.atDate(fecha);
        LocalDateTime ldt2 = fecha.atTime(hora);

        System.out.println("\nEjemplo 2 : Fecha y hora"
                +"\n\tForma 1 : "+ldt1
                +"\n\tForma 2 : "+ldt2
        );
    }


    //AJUSTAR LA HORA DE UNA FECHA CON OTRA
    public static void ejemplo3(){
        LocalTime hora = LocalTime.of(10,45);
        LocalDateTime fecha = LocalDateTime.of(2025,4,27,2,30);

        LocalDateTime ajuste = (LocalDateTime) hora.adjustInto(fecha);

        System.out.println("\nEjemplo 3 : Ajustar horas"
                +"\n\tFecha con hora    : "+fecha
                +"\n\tHora de referencia: "+hora
                +"\n\tFecha con ajuste  : "+ajuste
        );
    }


}