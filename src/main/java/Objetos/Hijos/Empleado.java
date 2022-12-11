package Objetos.Hijos;

import Listas.Aplicadas.ListaDobleEmpleados;
import Objetos.Padres.A_Usuario;

public class Empleado extends A_Usuario {

    @Override
    public void acciones() {
        System.out.println("Eliminar Usuarios\n" +
                "- Recibir clientes\n" +
                "- Conocer el nombre de los clientes\n" +
                "- Apilar Boletes\n" +
                "- Inspeccionar Boletos");
    }

    @Override
    public boolean crearCuenta(Object user, String secret, Object lista) {
        if(secret.equals("Licenciado")){
            ((ListaDobleEmpleados)lista).add((Empleado)user);
            return true;
        }
        return false;
    }

    @Override
    public void mostrarRol() {
        System.out.println("Tu rol es: Empleado");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
