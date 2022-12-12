package Objetos.Hijos;

import Objetos.Padres.A_Producto;

public class AguaFresca extends A_Producto {

    @Override
    public void indicaciones() {
        System.out.println("1.- Beber del vaso en el que es servido\n" +
                "2.- Beber fría\n" +
                "3.- Disfrutar");
    }

    @Override
    public void datosCuriosos() {
        System.out.println("1.- Es prepada el mismo día\n" +
                "2.- Es de fruta natural\n" +
                "3.- Fruta proveniente de los mejores mercados");
    }

    @Override
    public void ingredientes() {
        System.out.println("- Frutas de temporada\n" +
                "- Azucar\n" +
                "- Agua\n" +
                "- Hielo");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
