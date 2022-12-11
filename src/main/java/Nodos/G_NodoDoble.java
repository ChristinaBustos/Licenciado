package Nodos;

public class G_NodoDoble<T>{
    private T dato;
    private G_NodoDoble izq;
    private G_NodoDoble der;

    //Constructor
    public G_NodoDoble(T dato) {
        this.dato = dato;
        this.izq = null;
        this.der = null;
    }

    //Getters y Setters
    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public G_NodoDoble getIzq() {
        return izq;
    }

    public void setIzq(G_NodoDoble izq) {
        this.izq = izq;
    }

    public G_NodoDoble getDer() {
        return der;
    }

    public void setDer(G_NodoDoble der) {
        this.der = der;
    }

    //toString() con estilo
    @Override
    public String toString() {
        return "Dato=" + dato;
    }
}
