package Pilas_Colas.Genericas;

import Interfaces.I_Cola;
import Nodos.G_NodoSimple;

public class G_Cola<T> implements I_Cola {
    //Nodos de informacion
    private G_NodoSimple Tope;
    private G_NodoSimple Fondo;

    //Constructor
    public G_Cola(){
        this.Tope = null;
        this.Fondo = null;
    }

    //Getters y Setters
    public G_NodoSimple getTope() {
        return Tope;
    }

    public void setTope(G_NodoSimple Tope) {
        this.Tope = Tope;
    }

    public G_NodoSimple getFondo() {
        return Fondo;
    }

    public void setFondo(G_NodoSimple Fondo) {
        this.Fondo = Fondo;
    }
    @Override
    public void queue(Object dato) {
        G_NodoSimple nuevo = new G_NodoSimple(dato);
        if(this.Tope==null){
            this.Tope = nuevo;
            this.Fondo = nuevo;
        }else{
            this.Fondo.setDer(nuevo);;
            this.Fondo = nuevo;
        }
    }

    @Override
    public Object dequeue() {
        G_NodoSimple aux = this.Tope;
        if (this.Tope != null){
            this.Tope = this.Tope.getDer();
        }else{
            System.out.println("Cola vacia");
        }
        return aux;
    }

    @Override
    public int length() {
        G_NodoSimple i = this.Tope;
        int tam = 0;
        while (i!=null){
            i = i.getDer();
            tam++;
        }
        return tam;
    }

    @Override
    public boolean isEmpty() {
        return this.Tope==null;
    }

    @Override
    public Object peek() {
        return this.Tope;
    }

    @Override
    public void print() {
        if(this.Tope != null){
            G_NodoSimple i = this.Tope;
            while (i!=null){
                System.out.println(i);
                i = i.getDer();
            }
        }else{
            System.out.println("Cola vacía.");
        }
    }

    @Override
    public String toString() {
        return "G_Cola{" +
                "Tope=" + Tope +
                ", Fondo=" + Fondo +
                '}';
    }
}
