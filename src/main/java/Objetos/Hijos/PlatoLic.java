package Objetos.Hijos;

import Objetos.Padres.A_Producto;

public class PlatoLic extends A_Producto {
    @Override
    public void indicaciones() {
        System.out.println("1.- Comer frio\n" +
                "2.- Acompañar con rebanadas de pan tostado\n" +
                "3.- Agregar Chiles en vinagre");
    }

    @Override
    public void datosCuriosos() {
        System.out.println("1.- Es una ensalada fría con sabor y forma\n" +
                "2.- Las verduras provienen de los mejores mercados\n" +
                "3.- El pollo proviene de las mejores granjas");
    }

    @Override
    public void ingredientes() {
        System.out.println("- Papa\n" +
                "- Mayonesa\n" +
                "- Zanahoria\n" +
                "- Chicharos\n" +
                "- Pollo desebreado\n" +
                "- Sal\n" +
                "- Mantequilla");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
