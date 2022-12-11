package Objetos.Otros;

import Listas.Aplicadas.ListaCircularProductos;

public class Ticket {
    private int id;
    private ListaCircularProductos compra;

    public Ticket(int id,ListaCircularProductos compra) {
        this.id = id;
        this.compra = compra;
    }

    public Ticket() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ListaCircularProductos getCompra() {
        return compra;
    }

    public void setCompra(ListaCircularProductos compra) {
        this.compra = compra;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", compra=" + compra +
                '}';
    }
}
