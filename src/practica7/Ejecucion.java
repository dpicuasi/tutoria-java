package practica7;

import java.util.Scanner;


/**
 *
 * @author Kintydev
 */
public class Ejecucion {

    public void main() {
        // 
        int op = 0;
        int num;
        int indice;

        String nombre;
        String autor;
        String genero;
        int anio;

        ListaLibros Lista = new ListaLibros();

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("                ======LISTA ENLAZADA SIMPLE========");
            System.out.println("-------------------------------------------------------------");
            System.out.println("| 1.- Insertar                    |  5.- Modificar elemento | ");
            System.out.println("| 2.- Mostrar                     |  6.- Buscar elemento    |");
            System.out.println("| 3.- Mostrar Tamanio de lista    |  7.- Eliminar elemento  | ");
            System.out.println("| 4.- Mostrar elemento            |  8.- Salir              |");
            System.out.println("-------------------------------------------------------------");
            System.out.println("Escoja una opcione entre [1-8]");
            op = sc.nextInt();
            sc.nextLine();
            switch (op) {
                case 1:
                    System.out.println("Nombre libro");
                    nombre = sc.nextLine();

                    System.out.println("Autor");
                    autor = sc.nextLine();

                    System.out.println("Genero");
                    genero = sc.nextLine();

                    System.out.println("Anio");
                    anio = sc.nextInt();
                    sc.nextLine();

                    Libro book = new Libro(nombre, autor, genero, anio);
                    Lista.insertar(book);
                    break;
                case 2:
                    System.out.println("**LOS LIBROS DE LA LISTA SON SON:**");
                    Lista.mostrarTodo();
                    break;
                case 3:
                    System.out.println("EL TAMAÑO DE LA LISTA ES:" + Lista.tamanio());
                    break;
                case 4:
                    System.out.println("Ingrese indice del elemento a RECUPERAR");
                    indice = sc.nextInt();
                    System.out.println("EL ELEMENTO DE LA POSICION " + indice + " ES: " + Lista.mostrarDato(indice));
                    break;
                case 5:
                    System.out.println("Ingrese el indice a modificar");
                    indice=sc.nextInt();
                    sc.nextLine();

                    System.out.println("Nombre libro");
                    nombre = sc.nextLine();

                    System.out.println("Autor");
                    autor = sc.nextLine();

                    System.out.println("Genero");
                    genero = sc.nextLine();

                    System.out.println("Anio");
                    anio = sc.nextInt();
                    sc.nextLine();

                    Libro b1 = new Libro(nombre, autor, genero, anio);
                    Lista.modificarDato(b1, indice);
                    break;
                    
                case 6:
                    System.out.println("Ingrese el nombre del Libro a BUSCAR");
                    nombre = sc.nextLine();
                    Lista.buscarPorNombreLibro(nombre);
                    break;
                case 7:
                    System.out.println("Ingrese indice del elemento a ELIMINAR");
                    indice = sc.nextInt();
                    Lista.eliminar(indice);
                    break;
            }
        } while (op != 8);

    }

}