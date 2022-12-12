package Objetos.Hijos;

import Listas.Aplicadas.ListaSimpleClientes;
import Objetos.Otros.Ticket;
import Objetos.Padres.A_Boleto;
import Objetos.Padres.A_Usuario;

public class Cliente extends A_Usuario {
    A_Boleto boleto;
    Ticket ticket;

    public Cliente(A_Boleto boleto, Ticket ticket) {
        super();
        this.boleto = boleto;
        this.ticket = ticket;
    }

    public Cliente(){
        this.boleto = null;
        ticket = null;
    }

    public A_Boleto getBoleto() {
        return boleto;
    }

    public void setBoleto(A_Boleto boleto) {
        this.boleto = boleto;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public String toString() {
        return "Cliente{" + super.toString() +
                "boleto=" + boleto +
                ", ticket=" + ticket +
                '}';
    }

    @Override
    public void acciones() {
        System.out.println("- Comprar\n" +
                "- Consultar Productos\n" +
                "- Reservar");
    }

    @Override
    public boolean crearCuenta(Object user, String Secret, Object lista) {
        ((ListaSimpleClientes)lista).add((Cliente)user);
        return true;
    }

    @Override
    public void mostrarRol() {
        System.out.println("Tu rol es: Cliente");
    }
}
