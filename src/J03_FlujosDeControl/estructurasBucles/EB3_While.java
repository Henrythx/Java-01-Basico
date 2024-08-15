package J03_FlujosDeControl.estructurasBucles;
/*
 * El bucle while ejecuta un bloque de código mientras una condición
 * sea verdadera. Se evalúa la condición antes de cada iteración.
 *
 * El bucle do-while es similar al while, pero garantiza que el
 * bloque de código se ejecute al menos una vez, ya que la condición
 * se evalúa después de cada iteración.
 */
public class EB3_While {
    public static void main(String[] args) {
        //ejemplo1();
        //ejemplo2();
        ejemplo3();
        ejemplo4();
        ejemplo5();
    }

    //Primero verifica la condición, mientras se cumpla ejecuta la sentencia
    public static void ejemplo1(){
        int i=0;
        while (i<5){
            System.out.println("valor i:"+i);
            i++;
        }
    }

    //Primero ejecuta la sentencia, después verifica la condición para volver a iterar
    public static void ejemplo2(){
        int i=0;
        do {
            System.out.println("valor i:"+i);
            i++;
        }while (i<5);
    }


    //Bucle Infinito : Si i%2==0, hara el salto sin incrementar a i
    public static void ejemplo3(){
        int i=0;
        while (i<10){
            System.out.println(i);
            if (i%2==0) continue;
            i++;
        }
    }


    public static void ejemplo4(){
        int i=0;
        while (i < 10) {
            i++;
            if (i % 2 == 0) continue;
            System.out.println(i);
        }
    }

    //break termina el bucle
    public static void ejemplo5(){
        int i=0;
        while (i<10){
            if (i==5) break;
            System.out.println(i++);
        }
    }
}

