package J05_Fechas.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class E04_Comparar {
    public static void main(String[] args) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();

        c.set(2024,4,27);
        Date f1 = c.getTime();

        c.set(2030,6,15);
        Date f2 = c.getTime();

        System.out.println("COMPARAR FECHAS"
                +"\n\tFecha 1 : "+df.format(f1)
                +"\n\tFecha 2 : "+df.format(f2)
                +"\n\tFecha 1 es anterior a la Fecha 2  : "+f1.before(f2)
                +"\n\tFecha 1 es posterior a la Fecha 2 : "+f1.after(f2)
        );
    }
}
