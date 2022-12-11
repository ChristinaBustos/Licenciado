package Menu;

import Listas.Aplicadas.ListaCircularDobleTickets;
import Listas.Aplicadas.ListaCircularProductos;
import Listas.Aplicadas.ListaDobleEmpleados;
import Listas.Aplicadas.ListaSimpleClientes;
import Objetos.Hijos.*;
import Objetos.Otros.Ticket;
import Objetos.Padres.A_Producto;
import Objetos.Padres.A_Usuario;

import java.util.Scanner;

public class Restaurante {
    public static Scanner s = new Scanner(System.in).useDelimiter("\n");
    public static void main(String[] args) {
        //Definicion de boletos
        final BPremium PREMIUM = new BPremium();
        PREMIUM.setPrecio(1500);
        final BNormal NORMAL = new BNormal();
        NORMAL.setPrecio(600);
        final BPobre POBRE = new BPobre();
        POBRE.setPrecio(50);

        //Definición de Productos
        AguaFresca agua = new AguaFresca();
        VinoHalcon vino = new VinoHalcon();
        PlatoEspecialidad especialidad = new PlatoEspecialidad();
        PlatoInge platoInge = new PlatoInge();
        PlatoLic platoLic = new PlatoLic();
        //Usar los set
        //Añadir a la lista de productos
        //Hacer el menú de compra del usuario

        //Hacer el menú del Empleado
        //Recibir clientes
        //Recibir boletos
        //Cola de clientes
        //Pila de Boletos

        //Id Automático
        int idCliente = 1, idEmpleado = 0,idTicket = 0, opcM = 0,
                opcC = 0, opcMC = 0, opcME = 0, opcB = 0;

        //Cuenta Loggeada
        Cliente loggedC;
        Empleado loggedE;

        //Log in
        String email, password, secreta;

        //Listas
        ListaSimpleClientes clientes = new ListaSimpleClientes();
        ListaDobleEmpleados empleados = new ListaDobleEmpleados();
        ListaCircularProductos productos = new ListaCircularProductos();
        ListaCircularDobleTickets historialVentas = new ListaCircularDobleTickets();

        //Cliente por default
        Cliente cliente = new Cliente();
        cliente.setId(idCliente);
        cliente.setNombre("Cliente");
        cliente.setEdad(20);
        cliente.setEmail("cliente@gmail.com");
        cliente.setPassword("cliente123");
        //cliente.setBoleto(POBRE);
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
                                    "4.- Salir");
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
                                    System.out.println("* - - COMPRAR PRODUCTOS - -*");
                                    Ticket ticket = new Ticket();
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
                                    System.out.println("Saliendo, vuelve pronto...");
                                    break;
                                default:
                                    System.err.println("Opción no existente");
                                    break;
                            }
                        }while(opcMC != 4);
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
                        System.out.println("Acciones que puedes realizar:");
                        loggedE.acciones();
                        //Menú de empleado
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
