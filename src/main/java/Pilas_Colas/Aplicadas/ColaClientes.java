package Pilas_Colas.Aplicadas;

import Nodos.G_NodoSimple;
import Objetos.Hijos.Cliente;
import Pilas_Colas.Genericas.G_Cola;

public class ColaClientes extends G_Cola<Cliente> {

    /*public void printId() {
        System.out.println(((Cliente)this.getTope().getDato()));
    }*/

    public String modificar(int id, Object boleto){
        G_NodoSimple i = this.getTope();
        while (i!=null){
            if (((Cliente)i.getDato()).getId() == id){
                i.setDato(boleto);
                return "Modificación realizada";
            }
            i = i.getDer();
        }
        return "No se encontró coincidencia";
    }
}
