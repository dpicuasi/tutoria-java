package practica6.ListaEnlazada;

import java.util.Scanner;

/**
 *
 * @author Kintydev
 */
public class Ejecucion {

     public void main() {
        int op = 0;
        int num;
        int indice;
        ListaEnlazada lista = new ListaEnlazada();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("===========LISTA ENLAZADA SIMPLE=================");
            System.out.println("1.- Insertar.");
            System.out.println("2.- Mostrar todos los elementos.");
            System.out.println("3.- Mostrar Tamaño de lista.");
            System.out.println("4.- Mostrar elemento: ");
            System.out.println("5.- Buscar elemento:");
            System.out.println("6.- Eliminar un elemento");
            System.out.println("7.- Salir.");
            System.out.println("Escoja una opcion [1-5]: ");
            op = sc.nextInt();
            sc.nextLine();
            switch (op) {
                case 1:
                    System.out.println("Ingrese un número :");
                    num = sc.nextInt();
                    lista.insertar(num);
                    break;
                case 2:
                    System.out.println("Los elementos de la lista son : ");
                    lista.mostrarTodo();
                    break;
                case 3:
                    System.out.println("Numeros de nodos ingresados son :" + lista.tamanio());
                    lista.tamanio();
                    break;
                case 4:
                    System.out.println("Ingrese el indice del elemento a recuperar: ");
                    indice = sc.nextInt();
                    System.out.println("El elemento de la posicion " + indice + " es: " + lista.mostrarDato(indice));
                case 5:
                    System.out.println("Ingrese el elemento a buscar: ");
                    num = sc.nextInt();
                    lista.buscar(num);
                    break;
                case 6:
                    System.out.println("Ingrese el elemento a eliminar: ");
                    indice=sc.nextInt();
                    break;
                    
            }

        } while (op != 7);
    }

}