package main;

public class Main {

    public static void main(String[] args) {

        System.out.println("Lista doble: ");
        ListaDoble lista = new ListaDoble();
        lista.insertarFinal("Nodo 1", null);
        lista.insertarFinal("Nodo 2", null);
        lista.insertarFinal("Nodo 3", null);
        lista.insertarFinal("Nodo 4", null);
        lista.insertarFinal("Nodo 5", null);
        lista.insertarFinal("Nodo 6", null);
        System.out.println("Imprimir Inicio - Final");
        lista.listarInicioFinal(null);
        System.out.println("Imprimir Final - Inicio");
        lista.listarFinalInicio(null, 0);

        System.out.println("Busqueda:");
        lista.buscar("Nodo 2", null);
        lista.buscar("Nodo 6", null);
        lista.buscar("Nodo 6222", null);

        lista.borrar();
        lista.listarInicioFinal(null);

        System.out.println("Lista Circular Doble: ");
        ListaCircularDoble circular = new ListaCircularDoble();
        circular.insertarFinal("Nodo 1", null, 0);
        circular.insertarFinal("Nodo 2", null, 0);
        circular.insertarFinal("Nodo 3", null, 0);
        circular.insertarFinal("Nodo 4", null, 0);
        circular.insertarFinal("Nodo 5", null, 0);
        System.out.println("Listar inicio- final");
        circular.listarInicioFinal(null);
        System.out.println("Listar final - inicio");
        circular.listarFinalInicio(null);

        System.out.println("Busqueda:");
        circular.buscar("Nodo 3", null);
        circular.buscar("Nodo 5", null);
        circular.buscar("Nodo 36", null);
    }

}
