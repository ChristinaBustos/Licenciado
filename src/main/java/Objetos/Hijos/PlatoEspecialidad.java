package Objetos.Hijos;

import Objetos.Padres.A_Producto;

public class PlatoEspecialidad extends A_Producto {
    @Override
    public void indicaciones() {
        System.out.println("1- Usar los cuchara, tenedor y cuchillo\n" +
                "2.- Al terminar coloca los cubiertos sobre el plato");
    }

    @Override
    public void datosCuriosos() {
        System.out.println("1.- El corte de carne es traido desde Nuevo León\n" +
                "2.- La verdura es de los mejores mercados\n" +
                "3.- La verdura tiene un trato especial antes de ser servida");
    }

    @Override
    public void ingredientes() {
        System.out.println("- Carne de res\n" +
                "- Papa\n" +
                "- Chile\n" +
                "- Sal\n" +
                "- Pimienta\n" +
                "- Nopales");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
