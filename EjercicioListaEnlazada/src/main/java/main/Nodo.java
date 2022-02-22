
package main;


public class Nodo {
    
    private String nombre;
    private Nodo anterior;
    private Nodo siguiente;
    private int posicion;

    public Nodo(String nombre, Nodo anterior, Nodo siguiente, int posicion) {
        this.nombre = nombre;
        this.anterior = anterior;
        this.siguiente = siguiente;
        this.posicion = posicion;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    
   
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
}
