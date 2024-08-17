package J09_Ejercicios.P3_Arreglos;
/* PARA HALLAR LOS DIVISORES DE UN NUMERO
 * Si un número tiene un factor mayor que su raíz cuadrada,
 * entonces su factor complementario (el otro factor necesario
 * para multiplicarse y obtener el número) debe ser menor que la raíz cuadrada.
 *
 * Ejemplo 144,
 * (12*12) es el mayor valor posible necesario de divisor
 * si el primer valor aumentara, los opuestos disminuirian
 * por lo que se hallaría el menor valor y basándonos en este
 * se hallarían los complementos
 * 1    2   3   4   6   8   9   12
 * 144  72  48  36  24  18  16  12
 */
public class E04_EncontrarDivisores {
    public static void main(String[] args) {
        System.out.println(imprimir(buscarDivisores(24760)));
    }

    public static int[] buscarDivisores(int x){
        int raiz = (int) Math.sqrt(x);
        int t=0, c=0;

        for (int i = 1; i <= raiz; i++) {
            if(x%i==0)  t+=2;
        }

        int[] divisores = new int[t];

        for (int i = 1; i*i < x; i++) {
            if(x%i==0){
                divisores[c++] = i;
                divisores[t-c] = x/i;
            }
        }

        return divisores;
    }


    public static String imprimir(int[] arreglo){
        StringBuilder sb = new StringBuilder();
        for (int x : arreglo)   sb.append("[").append(x).append("] ");
        return sb.toString();
    }
}
