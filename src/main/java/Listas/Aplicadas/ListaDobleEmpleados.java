package Listas.Aplicadas;

import Listas.Genericas.G_ListaDoble;
import Nodos.G_NodoDoble;
import Objetos.Hijos.Empleado;

import java.util.Scanner;

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

    public void modificar(int id){
        Scanner s = new Scanner(System.in).useDelimiter("\n");
        G_NodoDoble i = this.getCabeza();
        Empleado aux;
        int opc = 0;
        while (i != null){
            if(((Empleado)i.getDato()).getId() == id){
                aux = (Empleado) i.getDato();
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
