package Objetos.Padres;

public abstract class A_Boleto {
    public double precio;

    public A_Boleto(double precio) {
        this.precio = precio;
    }

    public A_Boleto() {
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Boleto{" +
                ", precio=" + precio +
                '}';
    }

    //Metodos abstractos
    public abstract void mostrarTipo();
    public abstract void listarPrivilegios();
    public abstract double aplicarDescuento(double total);
    public abstract void vigencia();
}
