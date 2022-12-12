package Listas.Aplicadas;

import Listas.Genericas.G_ListaCircular;
import Nodos.G_NodoSimple;
import Objetos.Hijos.Cliente;
import Objetos.Padres.A_Producto;

public class ListaCircularProductos extends G_ListaCircular<A_Producto> {
    public String modificar(int index, Object producto){
        G_NodoSimple i = this.getCabeza();
        int cont = 1;
        while (i!=null){
            if (cont == index){
                i.setDato(producto);
                return "Modificación realizada";
            }
            cont++;
            i = i.getDer();
        }
        return "No se encontró coincidencia";
    }
}
