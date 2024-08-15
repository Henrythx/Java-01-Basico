package J05_Fechas.time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class E5_DateTimeFormater {
    public static void main(String[] args) {
        ejemplo1();
    }

    /*
     * FORMATOS DE FECHA
     * yyyy-MM-dd            Año-Mes-Día                 2024-08-02
     * dd/MM/yyyy            Día/Mes/Año                 02/08/2024
     * MM/dd/yyyy            Mes/Día/Año                 08/02/2024
     * yyyy/MM/dd            Año/Mes/Día                 2024/08/02
     * dd-MMM-yyyy           Día-Mes abreviado-Año       02-Ago-2024
     * MMMM dd, yyyy         Mes completo Día, Año       Agosto 02, 2024
     *
     * FORMATOS DE HORA
     * HH:mm:ss              14:30:45                    Hora:Minutos:Segundos en formato de 24 horas
     * HH:mm:                14:30                       Hora:Minutos en formato de 24 horas
     * hh:mm a:              02:30 PM                    Hora:Minutos AM/PM en formato de 12 horas
     * HH:mm:ss.SSS:         14:30:45.123                Hora:Minutos:Segundos.Milisegundos
     * hh:mm:ss a:           02:30:45 PM                 Hora:Minutos:Segundos AM/PM en formato de 12 horas
     *
     * FORMATOS DE FECHA Y HORA
     * yyyy-MM-dd'T'HH:mm:ss         2024-08-02T14:30:45                 Fecha y hora en formato ISO
     * dd/MM/yyyy HH:mm:ss           02/08/2024 14:30:45                 Fecha y hora
     * MM/dd/yyyy hh:mm:ss a         08/02/2024 02:30:45 PM              Fecha y hora con AM/PM
     * EEEE, MMMM dd, yyyy HH:mm:ss  Viernes, Agosto 02, 2024 14:30:45   Día de la semana completo, Mes completo Día, Año Hora:Minutos:Segundos
     * yyyy-MM-dd HH:mm:ss.SSS       2024-08-02 14:30:45.123             Fecha y hora con milisegundos
     * */

    public static void ejemplo1(){
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss" );
        DateTimeFormatter   f1  = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"         );
        DateTimeFormatter   f2  = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss a"       );
        DateTimeFormatter   f3  = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy HH:mm:ss");
        DateTimeFormatter   f4  = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS"     );

        LocalDateTime fecha = LocalDateTime.now();
        System.out.println("FORMATOS"
                +"\nFecha               : "+fecha
                +"\nFecha con formato   : "+fecha.format(formato)
                +"\nFecha con formato   : "+fecha.format(f1)
                +"\nFecha con formato   : "+fecha.format(f2)
                +"\nFecha con formato   : "+fecha.format(f3)
                +"\nFecha con formato   : "+fecha.format(f4)
        );
    }
}
