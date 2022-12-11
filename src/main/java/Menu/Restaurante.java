package Menu;

import Listas.Aplicadas.ListaCircularDobleTickets;
import Listas.Aplicadas.ListaCircularProductos;
import Listas.Aplicadas.ListaDobleEmpleados;
import Listas.Aplicadas.ListaSimpleClientes;
import Objetos.Hijos.AguaFresca;
import Objetos.Hijos.PlatoEspecialidad;
import Objetos.Padres.A_Producto;

import java.util.Scanner;

public class Restaurante {
    public static Scanner s = new Scanner(System.in).useDelimiter("\n");
    public static void main(String[] args) {
        ListaSimpleClientes clientes = new ListaSimpleClientes();
        ListaDobleEmpleados empleados = new ListaDobleEmpleados();
        ListaCircularProductos productos = new ListaCircularProductos();
        ListaCircularDobleTickets historialVentas = new ListaCircularDobleTickets();

        A_Producto p1 = new AguaFresca();
        A_Producto p2 = new PlatoEspecialidad();

        p1.indicaciones();
        p2.indicaciones();
    }
}
