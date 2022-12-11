package Objetos.Hijos;

import Objetos.Padres.Usuario;

public class Admin extends Usuario {

    @Override
    public void acciones() {
        System.out.println("Eliminar Usuarios\n" +
                "- Recibir clientes\n" +
                "- Conocer el nombre de los clientes\n" +
                "- Apilar Boletes\n" +
                "- Inspeccionar Boletos");
    }

    @Override
    public boolean createAccount(Usuario user, String secret) {
        if(secret.equals("Licenciado")){
            //guardar User en lista de Admins
            return true;
        }
        return false;
    }
}
