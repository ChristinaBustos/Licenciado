package Objetos.Hijos;

import Objetos.Padres.A_Producto;

public class PlatoInge extends A_Producto {
    @Override
    public void indicaciones() {
        System.out.println("1- Usar solo la cuchara\n" +
                "2.- Comer de forma pausada para detectar todos los sabores\n" +
                "3.- Acompañar con rebanadas de pan");
    }

    @Override
    public void datosCuriosos() {
        System.out.println("1.- Es una crema de escencias y sabores\n" +
                "2.- Un buen plato para terminar una elegante reunión\n" +
                "3.- Todos dicen que cada que la comen descrubre nuevos sabores");
    }

    @Override
    public void ingredientes() {
        System.out.println("- Crema\n" +
                "- Calabaza\n" +
                "- Sal\n" +
                "- Mantequilla\n" +
                "- Pimienta\n" +
                "- Comino\n" +
                "- Zanahoria\n" +
                "- Brocoli\n" +
                "- Especias");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
