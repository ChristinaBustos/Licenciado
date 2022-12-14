package Listas.Genericas;

import Interfaces.I_Lista;
import Nodos.G_NodoDoble;

public class G_ListaDoble<T> implements I_Lista {
    //Nodos para guardar el primer y el ultimo nodo
    private G_NodoDoble cabeza;
    private G_NodoDoble cola;

    //Constructor
    public G_ListaDoble() {
        this.cabeza = null;
        this.cola = null;
    }

    //Getters y Setters
    public G_NodoDoble getCabeza() {
        return cabeza;
    }

    public void setCabeza(G_NodoDoble cabeza) {
        this.cabeza = cabeza;
    }

    public G_NodoDoble getCola() {
        return cola;
    }

    public void setCola(G_NodoDoble cola) {
        this.cola = cola;
    }
    @Override
    public void add(Object dato) {
        G_NodoDoble nuevo_nodo = new G_NodoDoble(dato);
        if (this.cabeza == null) {
            this.cabeza = nuevo_nodo;
            this.cola = nuevo_nodo;
        } else {
            G_NodoDoble iterador = this.cabeza;
            while (iterador.getDer() != null) {
                iterador = iterador.getDer();
            }
            iterador.setDer(nuevo_nodo);
            nuevo_nodo.setIzq(iterador);
            this.cola = nuevo_nodo;
        }
    }

    @Override
    public void remove(int index) {
        if (this.cabeza != null) {
            if (this.cabeza == this.cola && index == 1) {
                this.cabeza = this.cola = null;
            } else if (index == 1) {
                this.cabeza = this.cabeza.getDer();
                this.cabeza.setIzq(null);
            } else if (index > 1){
                int cont = 1;
                G_NodoDoble ant, temp;
                ant = this.cabeza;
                temp = this.cabeza.getDer();
                while (temp != null && cont != index-1) {
                    ant = ant.getDer();
                    temp = temp.getDer();
                    cont++;
                }
                if (temp != null) {
                    ant.setDer(temp.getDer());
                    if (ant.getDer() != null) {
                        ant.getDer().setIzq(ant);
                    }
                    if (temp == this.cola) {
                        this.cola = ant;
                    }
                    System.out.println("Cola: " + this.cola.getDato());
                }
            }
        }
    }

    @Override
    public Object get(int index) {
        G_NodoDoble aux = this.cabeza;
        int cont = 1;
        while (aux != null) {
            if (cont == index) {
                return "" + aux.getDato();
            }
            cont++;
            aux = aux.getDer();
        }
        return null;
    }

    @Override
    public int indexOf(Object dato) {
        G_NodoDoble aux = this.cabeza;
        int cont = 1;
        while (aux != null) {
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
        G_NodoDoble actual = this.cabeza;
        int cont = 1;
        while (actual != null) {
            System.out.println("Nodo " + cont);
            System.out.println(actual + ",der: " + actual.getDer() + ", izqu: " + actual.getIzq());
            actual = actual.getDer();
            cont++;
        }
    }

    @Override
    public boolean isEmpty() {
        return this.cabeza == null;
    }

    @Override
    public void clear() {
        this.cola= this.cabeza = null;
    }

    @Override
    public int size() {
        G_NodoDoble iterador = this.cabeza;
        int tam = 0;
        while (iterador != null) {
            iterador = iterador.getDer();
            tam++;
        }
        return tam;
    }

    @Override
    public String toString() {
        return "G_ListaDoble{" +
                "cabeza=" + cabeza +
                ", cola=" + cola +
                '}';
    }
}
