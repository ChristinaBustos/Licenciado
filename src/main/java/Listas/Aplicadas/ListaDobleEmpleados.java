package Listas.Aplicadas;

import Listas.Genericas.G_ListaDoble;
import Nodos.G_NodoDoble;
import Objetos.Hijos.Empleado;

public class ListaDobleEmpleados extends G_ListaDoble<Empleado> {

    public Empleado login(String email, String pass){
        G_NodoDoble i = this.getCabeza();
        Empleado aux = new Empleado();
        while (i != null){
            if(((Empleado)i.getDato()).getEmail().equals(email) && ((Empleado)i.getDato()).getPassword().equals(pass)){
                aux = (Empleado) i.getDato();
                return aux;
            }
            i = i.getDer();
        }
        return null;
    }
}
