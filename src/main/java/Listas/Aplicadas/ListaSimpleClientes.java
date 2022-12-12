package Listas.Aplicadas;

import Listas.Genericas.G_ListaSimple;
import Nodos.G_NodoSimple;
import Objetos.Hijos.Cliente;

import java.util.Scanner;

public class ListaSimpleClientes extends G_ListaSimple<Cliente> {

    public Cliente login(String email, String pass){
        G_NodoSimple i = this.getCabeza();
        Cliente aux = new Cliente();
        while (i != null){
            if(((Cliente)i.getDato()).getEmail().equals(email) && ((Cliente)i.getDato()).getPassword().equals(pass)){
                aux = (Cliente)i.getDato();
                return aux;
            }
            i = i.getDer();
        }
        return null;
    }

    public void modificar(int id){
        Scanner s = new Scanner(System.in).useDelimiter("\n");
        G_NodoSimple i = this.getCabeza();
        Cliente aux;
        int opc = 0;
        while (i != null){
            if(((Cliente)i.getDato()).getId() == id){
                aux = (Cliente)i.getDato();
                do{
                    System.out.println("1.- Nombre\n" +
                            "2.- Edad\n" +
                            "3.- Email\n" +
                            "4.- Contraseña\n" +
                            "5.- Salir");
                    System.out.print("> ");
                    opc = s.nextInt();

                    switch (opc){
                        case 1:
                            System.out.print("Nuevo nombre: ");
                            aux.setNombre(s.next());
                            break;
                        case 2:
                            System.out.print("Edad nueva: ");
                            aux.setEdad(s.nextInt());
                            break;
                        case 3:
                            System.out.print("Email nuevo: ");
                            aux.setEmail(s.next());
                            break;
                        case 4:
                            System.out.print("Contraseña nueva: ");
                            aux.setPassword(s.next());
                            break;
                        case 5:
                            System.out.println("Saliendo");
                            break;
                        default:
                            System.err.println("Opción no valida");
                    }
                }while(opc != 5);
            }
            i = i.getDer();
        }
    }
}
