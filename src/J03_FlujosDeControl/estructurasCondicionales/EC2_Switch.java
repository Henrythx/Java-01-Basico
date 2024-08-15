package J03_FlujosDeControl.estructurasCondicionales;

import java.util.Scanner;

public class EC2_Switch {
    public static void main(String[] args) {
        //ejemplo1();
        //ejemplo2();
        //ejemplo3();
        //ejemplo4();
        //ejemplo5();
        //ejemplo6();
        ejemplo7();
    }


    public static void ejemplo1(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un numero (1-7)");
        int dia = scan.hasNextInt()   ?   scan.nextInt() : 0;

        switch (dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Lunes");
                break;
            case 3:
                System.out.println("Martes");
                break;
            case 4:
                System.out.println("Miércoles");
                break;
            case 5:
                System.out.println("Jueves");
                break;
            case 6:
                System.out.println("Viernes");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Fuera de rango");
        }

    }


    public static void ejemplo2(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa un rango de mes (1-12)");
        int mes = scan.hasNextInt()     ?   scan.nextInt() : 0;

        switch (mes){
            case 1,2,3:
                System.out.println("verano");
                break;
            case 4,5,6:
                System.out.println("otoño");
                break;
            case 7,8,9:
                System.out.println("primavera");
                break;
            case 10,11,12:
                System.out.println("invierno");
                break;
            default:
                System.out.println("Fuera de rango");
        }

    }


    public static void ejemplo3(){
        enum dia {
            DOMINGO, LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO
        }

        dia x = dia.MARTES;

        switch (x){
            case DOMINGO    -> System.out.println("Eligio domingo");
            case LUNES      -> System.out.println("Eligio lunes");
            case MARTES     -> System.out.println("Eligio martes");
            case MIERCOLES  -> System.out.println("Eligio miercoles");
            case JUEVES     -> System.out.println("Eligio jueves");
            case VIERNES    -> System.out.println("Eligio viernes");
            case SABADO     -> System.out.println("Eligio sabado");
            default     -> System.out.println("Fuera de rango");
        }

    }


    public static void ejemplo4(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un numero (1-3)");
        int dato = scan.hasNextInt()    ?   scan.nextInt() : 0;

        switch (dato){
            case 1->{
                System.out.println("Su nivel de autorizacion es basico");
            }
            case 2->{
                System.out.println("Su nivel de autorizacion es aceptable");
            }
            case 3->{
                System.out.println("Usted posee privilegios de administrador");
            }

            default -> {
                System.out.println("Fuera de rango");
            }
        }
    }


    public static void ejemplo5(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un dia");
        String dia = scan.nextLine();

        String tipo = switch (dia){
            case "lunes","miercoles","viernes"  -> "dia de estudio";
            case "martes","jueves"              ->"dia de trabajo";
            case "domingo"  ->"dia de planeación";
            case "sabado"   ->"dia de descanso";
            default -> "Fuera de rango";
        };

        System.out.println(tipo);
    }


    //CANTIDAD DE DIAS SEGÚN EL MES Y AÑO ESPECIFICADO
    public static void ejemplo6(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el año");
        int year = scan.hasNextInt()    ?   scan.nextInt()  : 0;

        System.out.println("Ingrese el mes");
        int month = scan.hasNextInt()   ? scan.nextInt()    : 0;

        int days = 0;

        switch (month){
            case 1,3,5,7,8,10,12-> days = 31;
            case 4,6,9,11       -> days = 30;
            case 2 -> {
                if (((year%4==0 && year%100!=0)) || year%400==0){
                        days = 29;  //Bisiesto
                } else  days = 28;  //No Bisiesto
            }
            default -> System.out.println("fuera de rango");
        }
        System.out.println("Resultados"
                +"\n\tAño   : "+year
                +"\n\tMes   : "+month
                +"\n\tDias  : "+days
        );
    }



    //CANTIDAD DE DIAS SEGÚN EL MES Y AÑO ESPECIFICADO
    public static void ejemplo7(){
        Scanner scan = new Scanner(System.in);
        int year=0, month=0, days=0;

        System.out.println("Ingrese un año");
        year    = scan.hasNextInt()    ?   scan.nextInt() : 0;

        System.out.println("Ingrese un mes(1-12)");
        month   = scan.hasNextInt()    ?   scan.nextInt() : 0;

        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
                if((year%4==0 && year%100!=0) || (year%400==0)){
                        days = 29;
                }else   days = 28;
                break;
            default:
                System.out.println("Fuera de rango");
        }
        System.out.println("Resultados"
                +"\n\tAño   : "+year
                +"\n\tMes   : "+month
                +"\n\tDias  : "+days
        );
    }
}
