package Menu;

import Listas.Aplicadas.ListaCircularDobleTickets;
import Listas.Aplicadas.ListaCircularProductos;
import Listas.Aplicadas.ListaDobleEmpleados;
import Listas.Aplicadas.ListaSimpleClientes;
import Objetos.Hijos.*;
import Objetos.Otros.Ticket;
import Objetos.Padres.A_Producto;
import Objetos.Padres.A_Usuario;
import Pilas_Colas.Aplicadas.ColaClientes;
import Pilas_Colas.Aplicadas.PilaBoletos;

import java.util.Scanner;

public class Restaurante {
    public static Scanner s = new Scanner(System.in).useDelimiter("\n");
    public static void main(String[] args) {
        //
        PilaBoletos Pboletos = new PilaBoletos();
        ColaClientes Cclientes = new ColaClientes();

        //Definicion de boletos
        final BPremium PREMIUM = new BPremium();
        PREMIUM.setPrecio(1500);
        final BNormal NORMAL = new BNormal();
        NORMAL.setPrecio(600);
        final BPobre POBRE = new BPobre();
        POBRE.setPrecio(50);

        //Total a pagar
        double total = 0.0;

        //Id Automático
        int idCliente = 1, idEmpleado = 0,idTicket = 0, idProducto =0,
                opcM = 0, opcP = 0, opcH = 0, confirm = 0, id = 0,
                opcC = 0, opcMC = 0, opcME = 0, opcB = 0, index = 0;

        //Listas
        ListaSimpleClientes clientes = new ListaSimpleClientes();
        ListaDobleEmpleados empleados = new ListaDobleEmpleados();
        ListaCircularProductos productos = new ListaCircularProductos();
        ListaCircularDobleTickets historialVentas = new ListaCircularDobleTickets();

        //Definición de Productos
        idProducto++;
        AguaFresca agua = new AguaFresca();
        agua.setId(idProducto);
        agua.setNombre("Agua de Jamaica");
        agua.setPrecio(15);

        idProducto++;
        VinoHalcon vino = new VinoHalcon();
        vino.setId(idProducto);
        vino.setNombre("Vino el Halcon");
        vino.setPrecio(650);

        idProducto++;
        PlatoEspecialidad especialidad = new PlatoEspecialidad();
        especialidad.setId(idProducto);
        especialidad.setNombre("Especialidad");
        especialidad.setPrecio(450);

        idProducto++;
        PlatoInge platoInge = new PlatoInge();
        platoInge.setId(idProducto);
        platoInge.setNombre("Plato Ingeniero");
        platoInge.setPrecio(75);

        idProducto++;
        PlatoLic platoLic = new PlatoLic();
        platoLic.setId(idProducto);
        platoLic.setNombre("Plato Licenciado");
        platoLic.setPrecio(80);

        productos.add(agua);
        productos.add(vino);
        productos.add(especialidad);
        productos.add(platoInge);
        productos.add(platoLic);

        //Cuenta Loggeada
        Cliente loggedC;
        Empleado loggedE;

        //Log in
        String email, password, secreta;


        //Cliente por default
        Cliente cliente = new Cliente();
        cliente.setId(idCliente);
        cliente.setNombre("Cliente");
        cliente.setEdad(20);
        cliente.setEmail("cliente@gmail.com");
        cliente.setPassword("cliente123");
        clientes.add(cliente);

        //Empleado default
        Empleado empleado = new Empleado();
        empleado.setId(idEmpleado);
        empleado.setNombre("Empleado");
        empleado.setEdad(20);
        empleado.setEmail("empleado@gmail.com");
        empleado.setPassword("empleado123");
        empleados.add(empleado);

        do{
            System.out.println("***********INICIO DE SESIÓN***********");
            System.out.println("1.- Iniciar como Cliente\n" +
                    "2.- Iniciar como Empleado\n" +
                    "3.- Crear cuenta\n" +
                    "4.- Salir");
            System.out.print("> ");
            opcM = s.nextInt();

            switch (opcM){
                case 1:
                    System.out.println("++++++++++++++++CLIENTE++++++++++++++++++++");
                    System.out.print("Correo: ");
                    email = s.next();
                    System.out.print("Contraseña: ");
                    password = s.next();

                    loggedC = clientes.login(email,password);
                    if (loggedC != null){
                        System.out.println("Bienvenido a la página del Restaurante \"El Licenciado\"");
                        System.out.println("Hola de nuevo!, nuestro cliente favorito " + loggedC.getNombre());
                        do{
                            System.out.println("----------------MENÚ DE CLIENTE----------------");
                            System.out.println("1.- Información de mi Cuenta\n" +
                                    "2.- Comprar\n" +
                                    "3.- Cambiar o comprar boleto\n" +
                                    "4.- Modificar mi Cuenta\n" +
                                    "5.- Eliminar mi Cuenta\n" +
                                    "6.- Salir");
                            System.out.print("-> ");
                            opcMC = s.nextInt();
                            switch (opcMC){
                                case 1:
                                    System.out.println("*- - MI CUENTA - -*");
                                    System.out.println(loggedC);
                                    System.out.println("Acciones que puedes realizar:");
                                    loggedC.acciones();
                                    loggedC.mostrarRol();
                                    break;
                                case 2:
                                    if(loggedC.getBoleto()!=null){
                                        Ticket ticket = new Ticket();
                                        do {
                                            System.out.println("* - - COMPRAR PRODUCTOS - -*");
                                            System.out.println("1.- " + agua.getNombre());
                                            System.out.println("2.- " + vino.getNombre());
                                            System.out.println("3.- " + especialidad.getNombre());
                                            System.out.println("4.- " + platoInge.getNombre());
                                            System.out.println("5.- " + platoLic.getNombre());
                                            System.out.print("--> ");
                                            opcP = s.nextInt();

                                            switch (opcP){
                                                case 1:
                                                    System.out.println(agua.getNombre() + " Comprada");
                                                    ticket.getCompra().add(agua);
                                                    total += agua.getPrecio();
                                                    break;
                                                case 2:
                                                    System.out.println(vino.getNombre() + " Comprado");
                                                    ticket.getCompra().add(vino);
                                                    total += vino.getPrecio();
                                                    break;
                                                case 3:
                                                    System.out.println(especialidad.getNombre() + " Comprada");
                                                    ticket.getCompra().add(especialidad);
                                                    total += especialidad.getPrecio();
                                                    break;
                                                case 4:
                                                    System.out.println(platoInge.getNombre() + " Comprado");
                                                    ticket.getCompra().add(platoInge);
                                                    total += platoInge.getPrecio();
                                                    break;
                                                case 5:
                                                    System.out.println(platoLic.getNombre() + " Comprado");
                                                    ticket.getCompra().add(platoLic);
                                                    total += platoLic.getPrecio();
                                                    break;
                                                default:
                                                    System.err.println("Error");
                                            }
                                            System.out.println("Continual? 1.- Si | 0.- No");
                                            System.out.print("--> ");
                                            opcP = s.nextInt();
                                        }while(opcP != 0);
                                        if(ticket.getCompra()!= null){
                                            idTicket++;
                                            ticket.setId(idTicket);
                                            ticket.setBoleto(loggedC.getBoleto());
                                            historialVentas.add(ticket);
                                            loggedC.setTicket(ticket);
                                            System.out.println("Ticket registrado");
                                            System.out.println("Total a pagar $" + loggedC.getBoleto().aplicarDescuento(total));
                                            historialVentas.print();
                                        }else{
                                            System.out.println("No se compro nada, el ticket no se registro");
                                        }
                                    }else{
                                        System.out.println("No tienes boleto, Compra uno para poder consumir de nuestros productos");
                                    }
                                    break;
                                case 3:
                                    System.out.println("* - - COMPRAR BOLETOS - -*");
                                    System.out.println("1.- Boleto Pobre $" +  POBRE.getPrecio());
                                    System.out.println("Privilegios: ");
                                    POBRE.listarPrivilegios();
                                    System.out.println("\n2.- Boleto Normal $" +  NORMAL.getPrecio());
                                    System.out.println("Privilegios: ");
                                    NORMAL.listarPrivilegios();
                                    System.out.println("\n3.- Boleto Premium $" + PREMIUM.getPrecio());
                                    System.out.println("Privilegios: ");
                                    PREMIUM.listarPrivilegios();
                                    System.out.println("\n4.- Cancelar");
                                    System.out.print("--> ");
                                    opcB = s.nextInt();
                                    switch (opcB){
                                        case 1:
                                            loggedC.setBoleto(POBRE);
                                            System.out.println("Boleto Pobre comprado");
                                            break;
                                        case 2:
                                            loggedC.setBoleto(NORMAL);
                                            System.out.println("Boleto Normal comprado");
                                            break;
                                        case 3:
                                            loggedC.setBoleto(PREMIUM);
                                            System.out.println("Boleto Premium comprado");
                                            break;
                                        case 4:
                                            System.out.println("No se compró ningún boleto");
                                            break;
                                        default:
                                            System.err.println("Opción no existente");
                                            break;
                                    }
                                    break;
                                case 4:
                                    clientes.modificar(loggedC.getId());
                                    break;
                                case 5:
                                    System.out.println("Confirmar: 1.- Si | 0.- No");
                                    System.out.print("-> ");
                                    confirm = s.nextInt();
                                    if(confirm == 1){
                                        clientes.remove(loggedC.getId());
                                        System.out.println("Cuenta eliminada :(");
                                        clientes.print();
                                    }else {
                                        System.out.println("Cuenta no eliminada");
                                    }
                                    break;
                                case 6:
                                    System.out.println("Saliendo, vuelve pronto...");
                                    break;
                                default:
                                    System.err.println("Opción no existente");
                                    break;
                            }
                        }while(opcMC != 6 && confirm!=1);
                    }else{
                        System.out.println("Usuario no válido.");
                    }
                    break;
                case 2:
                    System.out.println("++++++++++++++++EMPLEADO++++++++++++++++++++");
                    System.out.print("Correo: ");
                    email = s.next();
                    System.out.print("Contraseña: ");
                    password = s.next();

                    loggedE = empleados.login(email,password);
                    if (loggedE != null){
                        System.out.println("Bienvenido a la página del Restaurante \"El Licenciado\"");
                        System.out.println("Hola de nuevo, nuestro próximo empleado del mes" + loggedE.getNombre());
                        do{
                            System.out.println("----------------MENÚ DE CLIENTE----------------");
                            System.out.println("1.- Información de mi Cuenta\n" +
                                    "2.- Clientes\n" +
                                    "3.- Boletos\n" +
                                    "4.- Productos\n" +
                                    "5.- Historial de ventas\n" +
                                    "6.- Modificar mi Cuenta\n" +
                                    "7.- Eliminar mi Cuenta\n" +
                                    "8.- Salir");
                            System.out.print("-> ");
                            opcME = s.nextInt();
                            switch (opcME){
                                case 1:
                                    System.out.println("*- - MI CUENTA - -*");
                                    System.out.println(loggedE);
                                    System.out.println("Acciones que puedes realizar:");
                                    loggedE.acciones();
                                    loggedE.mostrarRol();
                                    break;
                                case 2:
                                    do{
                                        System.out.println("1.- Recibir Cliente\n" +
                                                "2.- Despachar Cliente\n" +
                                                "3.- Cambiar Cliente\n" +
                                                "4.- Inspeccionar cola de Clientes");
                                        System.out.print("--> ");
                                        opcC = s.nextInt();

                                        switch (opcC){
                                            case 1:
                                                System.out.print("Id del usuario: ");
                                                id = s.nextInt();
                                                Cliente aux = (Cliente)clientes.get(id);
                                                if(aux!= null){
                                                    Cclientes.queue(aux);
                                                    System.out.println("Cliente añadido a la cola");
                                                }else{
                                                    System.out.println("Usuario no encontrado");
                                                }
                                                break;
                                            case 2:
                                                System.out.println("Cliente despachado: " + ((Cliente)Cclientes.dequeue()));
                                                break;
                                            case 3:
                                                System.out.print("Id anterior usuario: ");
                                                id = s.nextInt();
                                                System.out.print("Nuevo id: ");
                                                int id2 = s.nextInt();
                                                aux = (Cliente)clientes.get(id2);
                                                if(aux!= null){
                                                    Cclientes.modificar(id, aux);
                                                    System.out.println("Cliente modificado en la cola");
                                                }else{
                                                    System.out.println("Usuario no encontrado");
                                                }
                                                break;
                                            case 4:
                                                Cclientes.print();
                                                break;
                                            default:
                                                System.err.println("Error");
                                        }
                                        System.out.println("Continuar? 1.- Si | 0.- No");
                                        System.out.print("--> ");
                                        opcC = s.nextInt();
                                    }while(opcC != 0);
                                    break;
                                case 3:
                                    do{
                                        System.out.println("1.- Recibir boleto\n" +
                                                "2.- Sacer el boleto de arriba\n" +
                                                "3.- Modificar tipo de boleto\n" +
                                                "4.- Inspeccionar pila de boletos");
                                        System.out.print("--> ");
                                        opcB = s.nextInt();

                                        switch (opcB){
                                            case 1:
                                                System.out.print("Id del usuario: ");
                                                id = s.nextInt();
                                                Cliente aux = (Cliente)clientes.get(id);
                                                if(aux!= null){
                                                    Pboletos.push(aux.getBoleto());
                                                    System.out.println("Boleto apilado");
                                                }else{
                                                    System.out.println("Usuario no encontrado");
                                                }
                                                break;
                                            case 2:
                                                System.out.println("Boleto tope extraido");
                                                Pboletos.pop();
                                                break;
                                            case 3:
                                                System.out.println("* - - CAMBIO DE BOLETOS - -*");
                                                System.out.println("1.- Boleto Pobre $" +  POBRE.getPrecio());
                                                System.out.println("Privilegios: ");
                                                POBRE.listarPrivilegios();
                                                System.out.println("\n2.- Boleto Normal $" +  NORMAL.getPrecio());
                                                System.out.println("Privilegios: ");
                                                NORMAL.listarPrivilegios();
                                                System.out.println("\n3.- Boleto Premium $" + PREMIUM.getPrecio());
                                                System.out.println("Privilegios: ");
                                                PREMIUM.listarPrivilegios();
                                                System.out.println("\n4.- Cancelar");
                                                System.out.print("---> ");
                                                opcB = s.nextInt();
                                                System.out.print("Indice del boleto en la pila: ");
                                                id = s.nextInt();
                                                switch (opcB){
                                                    case 1:
                                                        Pboletos.modificar(id, POBRE);
                                                        System.out.println("Cambiado a Boleto Pobre");
                                                        break;
                                                    case 2:
                                                        Pboletos.modificar(id, NORMAL);
                                                        System.out.println("Cambiado a Boleto Normal");
                                                        break;
                                                    case 3:
                                                        Pboletos.modificar(id, PREMIUM);
                                                        System.out.println("Cambiado a Boleto Premium");
                                                        break;
                                                    case 4:
                                                        System.out.println("No se cambio a ningún boleto");
                                                        break;
                                                    default:
                                                        System.err.println("Opción no existente");
                                                        break;
                                                }
                                                break;
                                            case 4:
                                                Pboletos.print();
                                                break;
                                            default:
                                                System.err.println("Error");
                                        }
                                        System.out.println("Continuar? 1.- Si | 0.- No");
                                        System.out.print("--> ");
                                        opcB = s.nextInt();
                                    }while(opcB != 0);
                                    break;
                                case 4:
                                    do{
                                        System.out.println("1.- Insertar Producto\n" +
                                                "2.- Eliminar por indice\n" +
                                                "3.- Modificar producto\n" +
                                                "4.- Imprimir lista de productos");
                                        System.out.print("--> ");
                                        opcP = s.nextInt();

                                        switch (opcP){
                                            case 1:
                                                do {
                                                    System.out.println("* - - INSERTAR PRODUCTOS - -*");
                                                    System.out.println("1.- " + agua.getNombre());
                                                    System.out.println("2.- " + vino.getNombre());
                                                    System.out.println("3.- " + especialidad.getNombre());
                                                    System.out.println("4.- " + platoInge.getNombre());
                                                    System.out.println("5.- " + platoLic.getNombre());
                                                    System.out.print("---> ");
                                                    opcP = s.nextInt();

                                                    switch (opcP){
                                                        case 1:
                                                            System.out.println(agua.getNombre() + " Insetada");
                                                            productos.add(agua);
                                                            break;
                                                        case 2:
                                                            System.out.println(vino.getNombre() + " Insertado");
                                                            productos.add(vino);
                                                            break;
                                                        case 3:
                                                            System.out.println(especialidad.getNombre() + " Insertada");
                                                            productos.add(especialidad);
                                                            break;
                                                        case 4:
                                                            System.out.println(platoInge.getNombre() + " Insertado");
                                                            productos.add(platoInge);
                                                            break;
                                                        case 5:
                                                            System.out.println(platoLic.getNombre() + " Insertado");
                                                            productos.add(platoLic);
                                                            break;
                                                        default:
                                                            System.err.println("Error");
                                                    }
                                                    System.out.println("Continual? 1.- Si | 0.- No");
                                                    System.out.print("---> ");
                                                    opcP = s.nextInt();
                                                }while(opcP != 0);
                                                break;
                                            case 2:
                                                System.out.println("Indice del producto: ");
                                                index = s.nextInt();
                                                productos.remove(index);
                                                break;
                                            case 3:
                                                do {
                                                    System.out.println("* - - MODIFICAR PRODUCTOS - -*");
                                                    System.out.println("1.- " + agua.getNombre());
                                                    System.out.println("2.- " + vino.getNombre());
                                                    System.out.println("3.- " + especialidad.getNombre());
                                                    System.out.println("4.- " + platoInge.getNombre());
                                                    System.out.println("5.- " + platoLic.getNombre());
                                                    System.out.print("---> ");
                                                    opcP = s.nextInt();

                                                    System.out.print("Indice: ");
                                                    index = s.nextInt();


                                                    switch (opcP){
                                                        case 1:
                                                            System.out.println("Cambiado a " + agua.getNombre());
                                                            productos.modificar(index, agua);
                                                            break;
                                                        case 2:
                                                            System.out.println("Cambiado a " + vino.getNombre());
                                                            productos.modificar(index, vino);
                                                            break;
                                                        case 3:
                                                            System.out.println("Cambiado a " + especialidad.getNombre());
                                                            productos.modificar(index, especialidad);
                                                            break;
                                                        case 4:
                                                            System.out.println("Cambiado a " + platoInge.getNombre());
                                                            productos.modificar(index, platoInge);
                                                            break;
                                                        case 5:
                                                            System.out.println("Cambiado a " + platoLic.getNombre());
                                                            productos.modificar(index, platoLic);
                                                            break;
                                                        default:
                                                            System.err.println("Error");
                                                    }
                                                    System.out.println("Continual? 1.- Si | 0.- No");
                                                    System.out.print("---> ");
                                                    opcP = s.nextInt();
                                                }while(opcP != 0);
                                                break;
                                            case 4:
                                                productos.print();
                                                break;
                                            default:
                                                System.err.println("Error");
                                        }
                                        System.out.println("Continuar? 1.- Si | 0.- No");
                                        System.out.print("--> ");
                                        opcP = s.nextInt();
                                    }while(opcP != 0);
                                    break;
                                case 5:
                                    do{
                                        System.out.println("1.- Eliminar por indice\n" +
                                                "2.- Modificar tipo de boleto del ticket\n" +
                                                "3.- Imprimir lista de tickets");
                                        System.out.print("--> ");
                                        opcH = s.nextInt();

                                        switch (opcH){
                                            case 1:
                                                System.out.println("Indice del ticket: ");
                                                index = s.nextInt();
                                                historialVentas.remove(index);
                                                break;
                                            case 2:
                                                System.out.println("* - - CAMBIO DE BOLETOS - -*");
                                                System.out.println("1.- Boleto Pobre $" +  POBRE.getPrecio());
                                                System.out.println("Privilegios: ");
                                                POBRE.listarPrivilegios();
                                                System.out.println("\n2.- Boleto Normal $" +  NORMAL.getPrecio());
                                                System.out.println("Privilegios: ");
                                                NORMAL.listarPrivilegios();
                                                System.out.println("\n3.- Boleto Premium $" + PREMIUM.getPrecio());
                                                System.out.println("Privilegios: ");
                                                PREMIUM.listarPrivilegios();
                                                System.out.println("\n4.- Cancelar");
                                                System.out.print("---> ");
                                                opcB = s.nextInt();
                                                System.out.print("Indice del ticket en la lista: ");
                                                index = s.nextInt();
                                                switch (opcB){
                                                    case 1:
                                                        historialVentas.modificar(index, POBRE);
                                                        System.out.println("Cambiado a Boleto Pobre");
                                                        break;
                                                    case 2:
                                                        historialVentas.modificar(index, NORMAL);
                                                        System.out.println("Cambiado a Boleto Normal");
                                                        break;
                                                    case 3:
                                                        historialVentas.modificar(index, PREMIUM);
                                                        System.out.println("Cambiado a Boleto Premium");
                                                        break;
                                                    case 4:
                                                        System.out.println("No se cambio a ningún boleto");
                                                        break;
                                                    default:
                                                        System.err.println("Opción no existente");
                                                        break;
                                                }
                                                break;
                                            case 3:
                                                if(!historialVentas.isEmpty()){
                                                    historialVentas.print();
                                                }else{
                                                    System.out.println("lista vacia");
                                                }
                                                break;
                                            default:
                                                System.err.println("Error");
                                        }
                                        System.out.println("Continuar? 1.- Si | 0.- No");
                                        System.out.print("--> ");
                                        opcH = s.nextInt();
                                    }while(opcH != 0);
                                    break;
                                case 6:
                                    empleados.modificar(loggedE.getId());
                                    break;
                                case 7:
                                    System.out.println("Confirmar: 1.- Si | 0.- No");
                                    System.out.print("-> ");
                                    confirm = s.nextInt();
                                    if(confirm == 1){
                                        empleados.remove(loggedE.getId());
                                        System.out.println("Cuenta eliminada :(");
                                        empleados.print();
                                    }else {
                                        System.out.println("Cuenta no eliminada");
                                    }
                                    break;
                                case 8:
                                    System.out.println("Saliendo, vuelve pronto...");
                                    break;
                                default:
                                    System.err.println("Opción no existente");
                                    break;
                            }
                        }while(opcME != 8 && confirm!=1);
                    }else{
                        System.out.println("Usuario no válido.");
                    }
                    break;
                case 3:
                    System.out.println("#################CREAR CUENTA#################");
                    System.out.println("1.- Cuenta de Cliente\n" +
                            "2.- Cuenta de empleado\n" +
                            "3.- Salir");
                    System.out.print("-> ");
                    opcC = s.nextInt();
                    switch (opcC){
                        case 1:
                            System.out.println("#################CREAR CUENTA DE CLIENTE#################");
                            idCliente++;
                            Cliente nCliente = new Cliente();
                            nCliente.setId(idCliente);
                            System.out.print("Nombre: ");
                            nCliente.setNombre(s.next());
                            System.out.print("Edad: ");
                            nCliente.setEdad(s.nextInt());
                            System.out.print("Correo: ");
                            nCliente.setEmail(s.next());
                            System.out.print("Contraseña: ");
                            nCliente.setPassword(s.next());
                            if (nCliente.crearCuenta(nCliente, "",clientes)){
                                System.out.println("Cuenta de cliente craeda.");
                                clientes.print();
                            }else{
                                System.out.println("Cuenta de Cliente no insertada");
                            }
                            break;
                        case 2:
                            System.out.println("#################CREAR CUENTA DE EMPLEADO#################");
                            idEmpleado++;
                            Empleado nEmpleado = new Empleado();
                            nEmpleado.setId(idEmpleado);
                            System.out.print("Nombre: ");
                            nEmpleado.setNombre(s.next());
                            System.out.print("Edad: ");
                            nEmpleado.setEdad(s.nextInt());
                            System.out.print("Correo: ");
                            nEmpleado.setEmail(s.next());
                            System.out.print("Contraseña: ");
                            nEmpleado.setPassword(s.next());
                            System.out.print("Palabra secreata: ");
                            secreta = s.next();
                            if (nEmpleado.crearCuenta(nEmpleado, secreta,empleados)){
                                System.out.println("Cuenta de Empleado craeda.");
                                empleados.print();
                            }else{
                                System.out.println("Error en la palabra secreta\nCuenta de Empleado no insertada");
                            }
                            break;
                        case 3:
                            System.out.println("Saliendo...");
                            break;
                        default:
                            System.err.println("Opción no existente");
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Te esperamos");
                    break;
                default:
                    System.err.println("Opción no existente");
                    break;
            }
        }while(opcM!=4);
    }
}
