package Nodos;

public class G_NodoSimple<T> {
    private T dato;
    private G_NodoSimple der;

    //Constructor
    public G_NodoSimple(T dato) {
        this.dato = dato;
        this.der = null;
    }

    //Getters y Setters
    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public G_NodoSimple getDer() {
        return der;
    }

    public void setDer(G_NodoSimple der) {
        this.der = der;
    }

    //toString() con estilo
    @Override
    public String toString() {
        return "Dato=" + dato;
    }
}
