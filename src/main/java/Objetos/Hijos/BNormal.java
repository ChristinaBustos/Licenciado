package Objetos.Hijos;

import Objetos.Padres.A_Boleto;

public class BNormal extends A_Boleto {
    @Override
    public void mostrarTipo() {
        System.out.println("Boleto Normal");
    }

    @Override
    public void listarPrivilegios() {
        System.out.println("1.- Descuento: SI\n" +
                "2.- Comprar: SI\n" +
                "3.- Máximo de productos: 5");
    }

    @Override
    public double aplicarDescuento(double total) {
        System.out.println("EL descuento de tu boleto es de 5%");
        total -= (total*.05);
        return total;
    }

    @Override
    public void vigencia() {
        System.out.println("La vigencia de tu boleto es de 1 semana.");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
