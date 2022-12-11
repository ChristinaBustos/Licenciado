package Objetos.Padres;

public abstract class Boleto {
    private String tipo;
    public double descuento;
    public double precio;

    public Boleto(String tipo, double descuento, double precio) {
        this.tipo = tipo;
        this.descuento = descuento;
        this.precio = precio;
    }

    public Boleto() {
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
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
                "tipo='" + tipo + '\'' +
                ", descuento=" + descuento +
                ", precio=" + precio +
                '}';
    }

    //Metodos abstractos
    public abstract void listarPrivilegios();
    public abstract double aplicarDescuento();
    public abstract void vigencia();
}
