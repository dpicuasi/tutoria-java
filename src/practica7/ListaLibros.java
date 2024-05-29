package practica7;


/**
 *
 * @author Kintydev
 */
public class ListaLibros {
    
    private Nodo inicio;
    private Nodo fin;
    
//constructores
    public ListaLibros(Nodo inicio, Nodo fin) {
        this.inicio = inicio;
        this.fin = fin;
    }

    public ListaLibros() {
        this.inicio = null;
        this.fin = null;
    }
    //operaciones de la lista

    //metodo verificar si la lista esta vacio
    public boolean esVacia() {
        return this.inicio == null;
    }

    public void insertar(Libro book) {
        Nodo actual;
        if (esVacia()) {//cuando esta vacioa pongo el nodo q acabo de crear 
            actual = new Nodo(book, null);//esto es un nodo
            this.inicio = actual;
            this.fin = actual;
        } else {
            actual = new Nodo(book, null); //si hay un dato esxistente
            fin.setSiguiente(actual);
            fin = actual;
        }

    }

    public void mostrarTodo() {
        if (esVacia()) {
            System.out.println("La lista esta vacia.");
        } else {
            Nodo temporal;
            temporal = inicio;
            while (temporal != null) {
                System.out.println(temporal.getLibro().toString());//tostring = tare lode 
                System.out.println("=================================================");
                temporal = temporal.getSiguiente();
            }
        }
    }

    public int tamanio() {
        int cont = 0;//

        Nodo temporal;
        temporal = inicio;
        while (temporal != null) {
            cont = cont + 1;
            // cont+=1; //otra forma de hacer= es igual a cont=cont+1;
            temporal = temporal.getSiguiente();
        }
        return cont;
    }

    public Libro mostrarDato(int indice) {
        int contador = 0;
        Libro libro = null;
        Nodo temporal;
        temporal = inicio;

        if (indice < 0 || indice >= tamanio()) {
            System.out.println("INDICE NO VALIDO");
        } else {
            while (temporal != null) {
                if (contador == indice) {
                    libro = temporal.getLibro();
                    break;
                }
                contador++;//para q el contador suba
                temporal = temporal.getSiguiente();
            }
        }
        return libro;

    }

    public void modificarDato(Libro book, int indice) {
       int contador = 0;
        Nodo temporal;
        temporal = inicio;

        if (indice < 0 || indice >= tamanio()) {
            System.out.println("INDICE NO VALIDO");
        } else {
            while (temporal != null) {
                if (contador == indice) {
                    temporal.setLibro(book);
                    System.out.println("Libro modificado con exito!!");
                    break;
                }
                contador++;//para q el contador suba
                temporal = temporal.getSiguiente();
            }
        }
    }

    public void buscarPorNombreLibro(String nombre) {
        //buscar elemneto ingresado
        Nodo temporal;
        int cont = 0;
        temporal = inicio;
        boolean bandera = false;

        while (temporal != null) {
            if (temporal.getLibro().getNombre().equals(nombre)) {
                System.out.println("EL ELEMENTO QUE BUSCA ESTA EN EL INDICE " + cont + " Y EL CUAL ES: " + temporal.getLibro().getNombre());
                bandera = true;
                break;
            }
            cont++;
            temporal = temporal.getSiguiente();
        }
        if (!bandera) {
            System.out.println("EL ELEMENTO DE LA LISTA NO SE ENCUENTRA");

        }
    }

    public void eliminar(int indice) {
        int cont = 0;
        Nodo temporal;
        temporal = inicio;
        Nodo anterior = null;

        if (indice < 0 || indice >= tamanio()) {
            System.out.println("Indice no valido.");
        } else {
            while (temporal != null) {
                if (indice == 0) {
                    eliminarPrimero();
                    break;
                } else if (indice == tamanio() - 1) {
                    eliminarUltimo();
                    break;
                } else if (cont == indice) {
                    anterior.setSiguiente(temporal.getSiguiente());
                    System.out.println("ELEMENTO DEL " + indice + " SE HA ELIMINADO SATISFACTORIAMENTE");
                    break;
                }
                anterior = temporal;
                temporal = temporal.getSiguiente();
                cont++;
            }

        }

    }

    public void eliminarPrimero() {
        if (esVacia()) {//esta vacia la lista?
            System.out.println("No se puede eliminar elemento, la lista esta VACIA");
        } else {
            if (inicio == fin) { //condicion=cuando lista tiene 1 solo elemento
                inicio = null;
                fin = null;
            } else {//condicion = lista tiene mas de un elemento
                inicio = inicio.getSiguiente();
                System.out.println("PRIMER ELEMENTO ELIMINADO SATISFACTORIAMENTE");
            }
        }
    }

    private void eliminarUltimo() {
        Nodo temporal;
        temporal = inicio;
        Nodo anterior = null;

        if (esVacia()) {
            System.out.println("No se puede eliminar elemento, la lista esta VACIA");
        } else {
            if (inicio == fin) {
                inicio = null;
                fin = null;
            } else {//cuando nodo es igual a null =es el final dela lista
                while (temporal.getSiguiente() != null) {//se recorre lista para identificar nodo anterior al final
                    anterior = temporal;
                    temporal = temporal.getSiguiente();
                }
                anterior.setSiguiente(null);
                fin = anterior;
                System.out.println("ULTIMO ELEMENTO ELIMINADO SATISFACTORIAMENTE");
            }
        }
    }
}

    
        
            


