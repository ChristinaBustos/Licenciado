package Objetos.Hijos;

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
    public boolean crearCuenta(A_Usuario user, String secret) {
        if(secret.equals("Licenciado")){
            //guardar User en lista de Admins
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
