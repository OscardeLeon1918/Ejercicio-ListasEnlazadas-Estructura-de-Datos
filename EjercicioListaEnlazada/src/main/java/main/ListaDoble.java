package main;

public class ListaDoble {

    private int cantidad;
    private Nodo inicio;

    public ListaDoble() {
        cantidad = 0;
        inicio = null;
    }
    // O(1)
    public void borrar() {
        System.out.println("Datos borrados");
        inicio = null;
        cantidad = 0;
    }
    // O(1)
    public void insertarInicio(String contenido) {
        Nodo nuevo = new Nodo(contenido, null, null, cantidad);
        inicio = nuevo;
        cantidad++;
    }
    // O(n)
    public void insertarFinal(String contenido, Nodo nodo) {
        if (cantidad == 0) {
            insertarInicio(contenido);
        } else {
            if (nodo == null) {
                nodo = inicio;
            }
            if (nodo.getSiguiente() != null) {
                nodo = nodo.getSiguiente();
                insertarFinal(contenido, nodo);
            } else {
                nodo.setSiguiente(new Nodo(contenido, nodo, null, cantidad));
                cantidad++;
            }
        }
    }
    // O(n)
    public void listarInicioFinal(Nodo nodo) {
        if (nodo == null) {
            nodo = inicio;
        } 
            if (nodo.getSiguiente() != null) {
                System.out.println("Nombre: " + nodo.getNombre());
                nodo = nodo.getSiguiente();
                listarInicioFinal(nodo);
            } else {
                System.out.println("Nombre: " + nodo.getNombre());
            }
        
    }

    // O(n)
    public void listarFinalInicio(Nodo nodo, int paso) {
        if (nodo == null) {
            nodo = inicio;
        }
        if (nodo.getSiguiente() != null) {
            nodo = nodo.getSiguiente();
            paso++;
            listarFinalInicio(nodo, paso);
        } else {
            imprimirFinal(nodo, paso);

        }
    }
    // O(n)
    public void imprimirFinal(Nodo nodo, int paso) {

        if (nodo.getAnterior() != null) {
            System.out.println("Nombre: " + nodo.getNombre());
            nodo = nodo.getAnterior();
            paso++;
            imprimirFinal(nodo, paso);
        } else {
            System.out.println("Nombre: " + nodo.getNombre());
            paso++;
            System.out.println("Cantidad de pasos: " + paso);
                    
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
            if (nodo.getSiguiente() != null) {
                nodo = nodo.getSiguiente();
                buscar(nombre, nodo);
            } else {
                System.out.println("Nodo no encontrado");
            }

        }

    }

}
