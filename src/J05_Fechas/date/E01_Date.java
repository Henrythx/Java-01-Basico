package J05_Fechas.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
public class E01_Date {
    public static void main(String[] args) {
        ejemplo1();
        ejemplo2();
    }


    public static void ejemplo1(){
        Date fecha = new Date();

        SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat df2 = new SimpleDateFormat("MM dd, yyyy");
        SimpleDateFormat df3 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        SimpleDateFormat df4 = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss a");

        System.out.println(fecha
                +"\n\tFormato 1 : "+df1.format(fecha)
                +"\n\tFormato 2 : "+df2.format(fecha)
                +"\n\tFormato 3 : "+df3.format(fecha)
                +"\n\tFormato 4 : "+df4.format(fecha)
        );
    }


    public static void ejemplo2(){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date fecha;

        try {
            fecha = df.parse("2020-01-24");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Fecha parseada : "+df.format(fecha));
    }
}
