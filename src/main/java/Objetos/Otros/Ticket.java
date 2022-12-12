package Objetos.Otros;

import Listas.Aplicadas.ListaCircularProductos;
import Objetos.Padres.A_Boleto;

public class Ticket {
    private int id;
    private A_Boleto boleto;
    private ListaCircularProductos compra;

    public Ticket(int id, A_Boleto boleto, ListaCircularProductos compra) {
        this.id = id;
        this.boleto = boleto;
        this.compra = compra;
    }

    public Ticket() {
        this.compra = new ListaCircularProductos();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public A_Boleto getBoleto() {
        return boleto;
    }

    public void setBoleto(A_Boleto boleto) {
        this.boleto = boleto;
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
                ", boleto=" + boleto +
                ", compra=" + compra +
                '}';
    }
}
