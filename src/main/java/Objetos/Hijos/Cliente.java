package Objetos.Hijos;

import Objetos.Padres.Boleto;
import Objetos.Padres.Usuario;

public class Cliente<T> extends Usuario {
    //T porque no sabemos de que boleto será
    T boleto;

    public Cliente(T boleto){
        this.boleto = boleto;
    }

    public Cliente(){
        this.boleto = null;
    }

    public T getBoleto() {
        return boleto;
    }

    public void setBoleto(T boleto) {
        this.boleto = boleto;
    }

    @Override
    public String toString() {
        return super.toString() + "Cliente{" +
                "boleto=" + boleto +
                '}';
    }

    @Override
    public void acciones() {
        System.out.println("- Comprar\n" +
                "- Consultar Productos" +
                "- Reservar");
    }

    @Override
    public boolean createAccount(Usuario user, String Secret) {
        //Solo hacer el add
        return false;
    }
}
