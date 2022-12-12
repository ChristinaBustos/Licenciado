package Pilas_Colas.Aplicadas;

import Nodos.G_NodoSimple;
import Objetos.Padres.A_Boleto;
import Pilas_Colas.Genericas.G_Pila;

public class PilaBoletos extends G_Pila<A_Boleto> {
    public String modificar(int index, Object boleto){
        G_NodoSimple i = this.getTope();
        int cont = 1;
        while (i!=null){
            if (cont == index){
                i.setDato(boleto);
                return "Modificación realizada";
            }
            cont++;
            i = i.getDer();
        }
        return "No se encontró coincidencia";
    }
}
