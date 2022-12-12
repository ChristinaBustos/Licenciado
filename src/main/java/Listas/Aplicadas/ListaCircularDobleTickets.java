package Listas.Aplicadas;

import Listas.Genericas.G_ListaCircularDoble;
import Nodos.G_NodoDoble;
import Objetos.Otros.Ticket;
import Objetos.Padres.A_Boleto;

public class ListaCircularDobleTickets extends G_ListaCircularDoble<Ticket> {
    public String modificar(int index, Object boleto){
        G_NodoDoble i = this.getCabeza();
        int cont = 1;
        while (i!=null){
            if (cont == index){
                ((Ticket)i.getDato()).setBoleto(((A_Boleto)boleto));
                return "Modificación realizada";
            }
            cont++;
            i = i.getDer();
        }
        return "No se encontró coincidencia";
    }
}
