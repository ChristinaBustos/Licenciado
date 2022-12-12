package Objetos.Hijos;

import Objetos.Padres.A_Boleto;

public class BPobre extends A_Boleto {
    @Override
    public void mostrarTipo() {
        System.out.println("Boleto Pobre");
    }

    @Override
    public void listarPrivilegios() {
        System.out.println("1.- Descuento: NO\n" +
                "2.- Comprar: SI\n" +
                "3.- Máximo de productos: 3");
    }

    @Override
    public double aplicarDescuento(double total) {
        System.out.println("Tu boleto no aplica para descuentos");
        return total;
    }

    @Override
    public void vigencia() {
        System.out.println("La vigencia de tu boleto es de 1 día");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
