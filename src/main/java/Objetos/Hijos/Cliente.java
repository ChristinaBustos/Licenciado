package Objetos.Hijos;

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
                "- Consultar Productos" +
                "- Reservar");
    }

    @Override
    public boolean crearCuenta(A_Usuario user, String Secret) {
        //Solo hacer el add
        return false;
    }

    @Override
    public void mostrarRol() {
        System.out.println("Tu rol es: Cliente");
    }
}
