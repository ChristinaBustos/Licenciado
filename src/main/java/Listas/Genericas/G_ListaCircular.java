package Listas.Genericas;

import Interfaces.I_Lista;
import Nodos.G_NodoDoble;
import Nodos.G_NodoSimple;

public class G_ListaCircular<T> implements I_Lista {
    //Nodos para guardar el primer y ultimo nodo
    private G_NodoSimple cabeza;
    private G_NodoSimple cola;

    //Constructor
    public G_ListaCircular() {
        this.cabeza = null;
        this.cola = null;
    }

    //Getters y Setters
    public G_NodoSimple getCabeza() {
        return cabeza;
    }

    public void setCabeza(G_NodoSimple cabeza) {
        this.cabeza = cabeza;
    }

    public G_NodoSimple getCola() {
        return cola;
    }

    public void setCola(G_NodoSimple cola) {
        this.cola = cola;
    }
    @Override
    public void add(Object dato) {
        G_NodoSimple nuevo_nodo = new G_NodoSimple(dato);
        if (this.cabeza == null) {
            this.cabeza = nuevo_nodo;
            this.cabeza.setDer(this.cabeza);
            this.cola = nuevo_nodo;
            this.cola.setDer(this.cabeza);
        } else {
            G_NodoSimple iterador = this.cabeza;
            while (iterador.getDer() != this.cabeza) {
                iterador = iterador.getDer();
            }
            iterador.setDer(nuevo_nodo);
            this.cola = nuevo_nodo;
            this.cola.setDer(this.cabeza);
        }
    }

    @Override
    public void remove(int index) {
        if (this.cabeza != null) {
            if (this.cabeza == this.cola && index == 1) {
                this.cabeza = this.cola = null;
            } else if (index == 1) {
                G_NodoSimple i = this.cabeza;
                while(i.getDer() != this.cabeza){
                    i = i.getDer();
                }
                this.cabeza = this.cabeza.getDer();
                i.setDer(this.cabeza);
            } else if (index > 1){
                int cont = 1;
                G_NodoSimple ant, temp;
                ant = this.cabeza;
                temp = this.cabeza.getDer();
                while (temp != this.cabeza && cont != index-1) {
                    ant = ant.getDer();
                    temp = temp.getDer();
                    cont++;
                }
                if (temp != null) {
                    ant.setDer(temp.getDer());
                    if (temp == this.cola) {
                        this.cola = ant;
                    }
                }
            }
        }
    }

    @Override
    public Object get(int index) {
        G_NodoSimple aux = this.cabeza;
        int cont = 1;
        while (aux != this.cabeza) {
            if (cont == index) {
                return aux.getDato();
            }
            cont++;
            aux = aux.getDer();
        }
        return null;
    }

    @Override
    public int indexOf(Object dato) {
        G_NodoSimple aux = this.cabeza;
        int cont = 1;
        while (aux != this.cabeza) {
            if (aux.getDato() == dato) {
                return cont;
            }
            cont++;
            aux = aux.getDer();
        }
        return -1;
    }

    @Override
    public void print() {
        G_NodoSimple actual = this.cabeza;
        int cont = 1;
        while (actual.getDer() != this.cabeza) {
            System.out.println("Nodo " + cont);
            System.out.println(actual + ",der: " + actual.getDer());
            actual = actual.getDer();
            cont++;
        }
        System.out.println("Nodo " + cont);
        System.out.println(actual + ",der: " + actual.getDer());
    }

    @Override
    public boolean isEmpty() {
        return this.cabeza==null ;
    }

    @Override
    public void clear() {
        this.cola=this.cabeza=null;
    }

    @Override
    public int size() {
        G_NodoSimple iterador = this.cabeza;
        int tam = 1;
        while (iterador != this.cabeza) {
            iterador = iterador.getDer();
            tam++;
        }
        return tam;
    }

    @Override
    public String toString() {
        return "G_ListaCircular{" +
                "cabeza=" + cabeza +
                ", cola=" + cola +
                '}';
    }
}
