package Listas.Aplicadas;

import Listas.Genericas.G_ListaSimple;
import Nodos.G_NodoSimple;
import Objetos.Hijos.Cliente;

public class ListaSimpleClientes extends G_ListaSimple<Cliente> {

    public boolean login(String email, String pass){
        G_NodoSimple i = this.getCabeza();
        while (i != null){
            if(((Cliente)i.getDato()).getEmail().equals(email) && ((Cliente)i.getDato()).getPassword().equals(pass)){
                return true;
            }
        }
        return false;
    }
}
