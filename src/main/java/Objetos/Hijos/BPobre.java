package Objetos.Hijos;

import Objetos.Padres.Boleto;

public class BPobre extends Boleto {
    @Override
    public void listarPrivilegios() {

    }

    @Override
    public double aplicarDescuento() {
        return 0;
    }

    @Override
    public void vigencia() {

    }
}
