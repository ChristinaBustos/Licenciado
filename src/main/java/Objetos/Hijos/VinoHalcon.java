package Objetos.Hijos;

import Objetos.Padres.A_Producto;

public class VinoHalcon extends A_Producto {
    @Override
    public void indicaciones() {
        System.out.println("1.- Beber de forma pausada\n" +
                "2.- Catar\n" +
                "3.- Observar la textura\n" +
                "4.- Sentirse superior");
    }

    @Override
    public void datosCuriosos() {
        System.out.println("1.- Tiene añejamiento de 15 años\n" +
                "2.- Es de uva\n" +
                "3.- La uva es traída de los mejores productores de vino\n" +
                "4.- Los mejores catadores lo describen como el mejor vino local");
    }

    @Override
    public void ingredientes() {
        System.out.println("- Uva\n" +
                "- Salues\n" +
                "- Agua\n" +
                "- Glucosa\n" +
                "- Acohol Etílico\n" +
                "- Etanol\n" +
                "- Ácidos");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
