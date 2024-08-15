package J04_Wrappers;
/*
 *Cuando son números primitivos se compara el valor
 *Cuando son números Objetos se comparan la instancia
 *Hasta 127, por alguna razón directamente compara el valor
 * */
public class E3_Instancia {
    public static void main(String[] args) {
        Integer n1 = Integer.valueOf(127);
        Integer n2 = n1;

        System.out.println("Numero 1: "+n1);
        System.out.println("Numero 2: "+n2);

        System.out.println("Son el mismo objeto? : "+(n1 == n2));

        n2 = 32_756;

        System.out.println("Numero 1: "+n1);
        System.out.println("Numero 2: "+n2);
    }
}
