package J01_Primitivos;
/*
 * Inmutabilidad:
 * Los objetos de tipo String son inmutables, lo que significa que
 * una vez creados, no pueden ser modificados. Cualquier operación
 * que parezca modificar una String en realidad crea un nuevo objeto.
 *
 * Los objetos StringBuilder son mutables, lo que significa que pueden
 * ser modificados después de su creación. Esto permite realizar
 * operaciones como append, insert, delete, etc., sin crear nuevos objetos.
 * */
public class S03_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hola");

        System.out.println("Tamaño      : "+sb.length()                                 );
        System.out.println("Agregar     : "+sb.append(" amigo")                         );
        System.out.println("Insertar    : "+sb.insert(4," querido")         );
        System.out.println("Reemplazar  : "+sb.replace(0,3,"Buen dia ") );
        System.out.println("Eliminar    : "+sb.delete(0,10)                              );
        System.out.println("Reverso     : "+sb.reverse());
        System.out.println("Reverso     : "+sb.reverse());


        StringBuilder frase = new StringBuilder("Hola, cuanto tiempo?");

        System.out.println("Valor indice 2      : "+sb.charAt(2)            );
        System.out.println("Obtener sub cadena  : "+sb.substring(6)   );
        System.out.println("Obtener sub cadena  : "+sb.substring(6,10)      );
        System.out.println("Obtener posición 'a': "+sb.indexOf("a")         );

    }
}
