package practica6.ListaEnlazada;


/**
 *
 * @author Kintydev
 */
public class ListaEnlazada {
    private Nodo inicio;
    private Nodo fin;

    public ListaEnlazada() {
        this.inicio = null;
        this.fin = null;

    }

    public boolean esVacia() {

        return this.inicio == null;

    }
    //METODO INSERTAR
    public void insertar(int numero) {
        Nodo actual;
        if (esVacia()) {
            actual = new Nodo(numero, null);
            this.inicio = actual;
            this.fin = actual;

        } else {

            actual = new Nodo(numero, null);
            fin.setSiguiente(actual);
            fin = actual;

        }

    }

    public void mostrarTodo() {
        if (esVacia()) {
            System.out.println("La lista esta vacía .");

        } else {
            Nodo temporal;
            temporal = inicio;
            while (temporal != null) {
                System.out.println(temporal.getDato());
                temporal = temporal.getSiguiente();

            }

        }
    }

    public int tamanio() {
        int tamanio = 0;
        Nodo temporal;
        temporal = inicio;
        while (temporal != null) {
            tamanio += 1;
            temporal = temporal.getSiguiente();

        }
        return tamanio;

    }

    public int mostrarDato(int indice) {
        int cont = 0;
        int dato = 0;
        Nodo temporal;
        temporal = inicio;
        if (indice < 0 || indice >= tamanio()) {
            System.out.println("Indice no valido");

        } else {
            while (temporal != null) {
                if (cont == indice) {
                    dato = temporal.getDato();
                    break;
                }
                cont++;
                temporal = temporal.getSiguiente();

            }

        }
        return dato;
    }
    //METODO MODIFICAR
    public void modificarDato(int dato, int indice) {
        
        int cont = 0;
        Nodo temporal;
        temporal = inicio;        
        
        if(indice < 0 || indice >= tamanio()){
            System.out.println("Indice no válido");
        } else {
                      
            while(temporal != null){
                
                if(cont == indice){
                    temporal.setDato(dato);
                    break;
                }
                cont++;
                temporal = temporal.getSiguiente();
            }          
        }        
    }
    //METODO BUSCAR
    public void buscar(int dato) {
        int cont = 0;
        Nodo temporal;
        temporal = inicio;
        boolean bandera = false;

        while (temporal != null) {
            if (temporal.getDato() == dato) {
                System.out.println("El elemento que busca esta en el indice: " + cont + "y es " + temporal.getDato());
                bandera = true;
                break;
            }
            cont++;
            temporal = temporal.getSiguiente();

        }
        if (!bandera) {
            System.out.println("El elemento no se encuentra en la lista. ");
        }

    }
//METODO ELIMINAR 
    public void eliminar(int indice) {
        //ELIMINAR SEGUN EL INDICE
        int cont=0;
        Nodo temporal;
        temporal=inicio;
        Nodo anterior=null;
        
        if(indice<0 || indice>=tamanio()){
            System.out.println("Indice no valido.");
        }else{
            while(temporal!=null){
                if(indice==0){
                    eliminarPrimero();
                    break;
                }else if(indice==tamanio()-1){
                    eliminarUltimo();
                    break;
                }else if(cont==indice){
                    anterior.setSiguiente(temporal.getSiguiente());
                    System.out.println("Elemento del indice "+indice+" eliminado satisfactoriamente");
                    break;
                    
                    
                            
                }
            }
            
            anterior=temporal;
            temporal=temporal.getSiguiente();
            cont++;
            
        }
    }


    public void eliminarPrimero(){
           if(esVacia()){
               System.out.println("No se puede eliminar el elemento, la lista esta vacia.");
           }else{
               if(inicio==fin){
                   inicio=null;
                   fin=null;
                   
               }else{
                   inicio=inicio.getSiguiente();
                   System.out.println("Primer elemento eliminado satisfactoriamente.");
               }
           }
       }
    private void eliminarUltimo(){
        
        Nodo temporal = null;
        Nodo anterior=null;
        
        if (esVacia()) {
            System.out.println("No se puede eliminar el elemento, la lista esta vacia.");
        }else{
            if (inicio==fin) {
                inicio=null;
                fin=null;
            }else{
                while(temporal.getSiguiente()!=null){
                    anterior=temporal;
                    temporal=temporal.getSiguiente();
                    
                }
                    anterior.setSiguiente(null);
                    fin=anterior;
                    System.out.println("Ultimo elemento eliminado correctamente.");
            }
            
        }
        
        
    }
}

    
        
            


