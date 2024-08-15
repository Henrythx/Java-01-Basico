package J05_Fechas.time;

import java.time.*;

/*
 * Si recién aprendes fechas, y es 2024, te recomiendo enfocarte en el paquete java.time
 *
 * VENTAJAS
 * - Modernidad y soporte:
 *   java.time es la API moderna para manejar fechas y horas en Java, introducida en Java 8.
 *   Es más intuitiva y está mejor diseñada que las clases antiguas como Date y Calendar.
 *
 * - Inmutabilidad:
 *   Las clases en java.time son inmutables, lo que significa que no pueden ser modificadas
 *   una vez creadas. Esto ayuda a evitar errores y problemas de concurrencia.
 *
 * - Claridad y simplicidad:
 *   La API de java.time es más clara y fácil de usar. Por ejemplo, LocalDate y LocalTime
 *   son mucho más intuitivos que Date y Calendar.
 *
 * - Zonas horarias:
 *   Manejar zonas horarias es mucho más sencillo y preciso con ZonedDateTime y OffsetDateTime.
 *
 * - Formateo y parsing:
 *   DateTimeFormatter facilita la conversión entre cadenas y objetos de fecha/hora.
 *
 *
 * COMPARACIÓN CON Date y Calendar
 * - Date: Es mutable y tiene varios métodos obsoletos. Además,
 *   su manejo de fechas y horas es menos intuitivo.
 *
 * - Calendar: Aunque es más flexible que Date, sigue siendo complicado y propenso a errores.
 *   También es mutable, lo que puede causar problemas en aplicaciones concurrentes.
 */
public class E1_Time {
    public static void main(String[] args) {
        LocalDate fecha   = LocalDate.now();
        LocalTime hora    = LocalTime.now();
        LocalDateTime fechaHora     = LocalDateTime.now();
        ZonedDateTime fechaHoraZona = ZonedDateTime.now(ZoneId.of("America/Lima"));

        System.out.println("Tiempo"
                +"\n\tFecha actual : "+fecha
                +"\n\tHora actual  : "+hora
                +"\n\tFecha y Hora actual       : "+fechaHora
                +"\n\tFecha y Hora actual Zona  : "+fechaHoraZona
        );
    }
}
