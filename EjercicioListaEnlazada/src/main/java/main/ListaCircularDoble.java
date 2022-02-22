
package main;


public class ListaCircularDoble {
    
    private int cantidad;
    private Nodo inicio;

    public ListaCircularDoble() {
        cantidad = 0;
        inicio = null;
    }
    // O(1)
    public void borrar() {
        System.out.println("Pasos: 1");
        System.out.println("Datos borrados");
        inicio = null;
        cantidad = 0;
    }
    // O(1)
    public void insertarInicio(String contenido) {
        System.out.println("Pasos: 1");
        Nodo nuevo = new Nodo(contenido, null, null, cantidad);
        inicio = nuevo;
        inicio.setAnterior(inicio);
        inicio.setSiguiente(inicio);
        cantidad++;
    }
    /**
     * O(n)
     * @param contenido
     * @param nodo
     * @param paso 
     */
    public void insertarFinal(String contenido, Nodo nodo, int paso) {
        if (cantidad == 0) {
            insertarInicio(contenido);
        } else {
            if (nodo == null) {
                nodo = inicio;
            }
            if (nodo.getSiguiente() != inicio) {
                paso++;
                nodo = nodo.getSiguiente();
                insertarFinal(contenido, nodo, paso);
            } else {
                Nodo aux = new Nodo(contenido, nodo, inicio, cantidad);
                nodo.setSiguiente(aux);
                inicio.setAnterior(aux);
                cantidad++;
                paso++;
                System.out.println("Cantidad de pasos para insertar: " + paso);
            }
        }
    }
    // O(n)
    public void listarInicioFinal(Nodo nodo) {
        if (nodo == null) {
            nodo = inicio;
            listarInicioFinal(nodo);
        } else {
            if (nodo.getSiguiente() != inicio) {
                System.out.println("Nombre: " + nodo.getNombre());
                nodo = nodo.getSiguiente();
                listarInicioFinal(nodo);
            } else {
                System.out.println("Nombre: " + nodo.getNombre());
            }
        }
    }
    // O(n)
    public void listarFinalInicio(Nodo nodo) {
        if (nodo == null) {
            nodo = inicio.getAnterior();
            listarFinalInicio(nodo);
        } else {
            if (nodo.getAnterior()!= inicio) {
                System.out.println("Nombre: " + nodo.getNombre());
                nodo = nodo.getAnterior();
                listarFinalInicio(nodo);
            } else {
                System.out.println("Nombre: " + nodo.getNombre());
                System.out.println("Nombre: " + nodo.getAnterior().getNombre());
            }
        }
    }
    // O(n)
    public void buscar(String nombre, Nodo nodo) {
        int cantidad;
        if (nodo == null) {
            nodo = inicio;
            cantidad = 1;
        }
        if (nombre.equals(nodo.getNombre())) {
            System.out.println("Nodo encontrado, Posicion: " + nodo.getPosicion());
        } else {
            if (nodo.getSiguiente() != inicio) {
                nodo = nodo.getSiguiente();
                buscar(nombre, nodo);
            } else {
                System.out.println("Nodo no encontrado");
            }

        }

    }
    
}
