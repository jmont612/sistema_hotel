package hotel;

import com.sun.management.UnixOperatingSystemMXBean;

import java.util.Scanner;

public class Menu {
    Hotel h1 = new Hotel ("Hotel 1", "Av. Las Begonias 885, San Isidro");
    boolean salir;

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.iniciarMenu();
    }

    public void iniciarMenu(){
        imprimirCabecera();
        imprimirMenu();
        while (!salir){
            int opcion = getInput();
            ejecutarAction(opcion);
        }
    }

    private void imprimirCabecera(){
        System.out.println("****************************************");
        System.out.println("               Bienvenido");
        System.out.println("                  Menu");
        System.out.println("****************************************");
    }

    private void imprimirMenu(){
        System.out.println("\nPor favor elige una opcion:");
        System.out.println("1) Registrar cliente");
        System.out.println("2) Asignar habitacion");
        System.out.println("3) Buscar cliente");
        System.out.println("4) Lista de cLientes");
        System.out.println("5) nueva habitacion regular");
        System.out.println("6) nueva habitacion premium");
        System.out.println("7) nueva habitacion deluxe");
        System.out.println("8) Lista de habitaciones");
        System.out.println("9) Habitaciones Disponibles");
        System.out.println("0) Salir");
    }

    private int getInput(){
        Scanner kb = new Scanner(System.in);
        int opcion = -1;
        while (opcion < 0 || opcion > 7){
            try{
                System.out.printf("\nSelcciona una opcion: ");
                opcion = Integer.parseInt(kb.nextLine());
            }
            catch (NumberFormatException e){
                System.out.printf("Seleccion invalida, por favor intenta nuevamente");
            }
        }
        return opcion;
    }

    private void ejecutarAction(int opcion){
        switch (opcion){
            case 0:
                salir = true;
                System.out.println("Gracias por utilizar la aplicacion, hemos terminado");
            case 1:
                registrarCliente();
                imprimirMenu();
                break;
            case 2:
                try {
                    asignarHabitacion();
                    imprimirMenu();
                } catch (xEstadoNoDisponibleException e){
                    System.out.println("La habitacion no esta disponible");
                }
                break;
            case 3:
                buscarCliente();
                imprimirMenu();
                break;
            case 4:
                mostrarClientes();
                imprimirMenu();
                break;
            case 5:
                nuevaHabitacionRegular();
                imprimirMenu();
                break;
            case 6:
                nuevaHabitacionPremium();
                imprimirMenu();
                break;
            case 7:
                nuevaHabitacionDeluxe();
                imprimirMenu();
                break;
            case 8:
                listaHabitaciones();
                imprimirMenu();
                break;
            case 9:
                habitacionesDisponibles();
                imprimirMenu();
                break;
            default:
                System.out.printf("Error intenta nuevamente");


        }
    }

    private Cliente registrarCliente(){
        String dni;
        String nombreCompleto;
        int dias;
        Scanner data = new Scanner(System.in);

        System.out.println("Ingresa el documento de identidad del cliente");
        dni = data.nextLine();
        System.out.println("Ingresa el nombre completo del cliente");
        nombreCompleto = data.nextLine();
        System.out.println("Ingresa la cantidad de dias que permanecera en el Hotel");
        dias = data.nextInt();
        Cliente clienteAux = new Cliente(dni, nombreCompleto, dias);
        System.out.println("El cliente ha sido registrado");
        Cliente cliente = h1.registrarCliente(clienteAux);
        System.out.println(cliente);
        System.out.println("Cliente registrado, puedes visualizarlo en la lista de clientes");
        return cliente;
    }

    private Habitacion asignarHabitacion() throws xEstadoNoDisponibleException{
        Scanner data = new Scanner(System.in);
        System.out.println("Ingresa el numero de la habitacion a asignar");
        String habitacion = data.nextLine();
        System.out.println("Ingresa el documento del cliente");
        String clienteDni = data.nextLine();
        Cliente clienteAsignar = h1.buscarCliente(clienteDni);

        Habitacion habitacionAsignada = h1.asignarClienteHabitacion(habitacion, clienteAsignar);
        habitacionAsignada.setOcupante(clienteAsignar);
        System.out.println(habitacionAsignada);
        System.out.println("La habitacion" + " " + habitacion + " " + "ha sido a signada al cliente" + " " + clienteAsignar);
        return habitacionAsignada;
    }

    private Cliente[] mostrarClientes(){
        Cliente[] clientesRegistrados = h1.getClientes();
        System.out.println("Clientes registrado: ");
        for (Cliente cliente: clientesRegistrados){
            if(cliente != null){
                System.out.println(cliente);
            }
        }
        return clientesRegistrados;
    }

    private Cliente buscarCliente(){
        String dni;
        System.out.println("Ingresa el documento de identidad del cliente");
        Scanner data = new Scanner(System.in);
        dni = data.nextLine();
        Cliente buscarCliente = h1.buscarCliente(dni);
        System.out.println("Cliente encontrado");
        System.out.println(buscarCliente.getNombreCompleto());
        return buscarCliente;
    }

    private Habitacion nuevaHabitacionRegular(){
        String numHabitacion;
        String estadoHabitacion;
        String idHabitacion;
        Scanner data = new Scanner(System.in);
        System.out.println("Ingresa el numero de habitacion");
        numHabitacion = data.nextLine();
        estadoHabitacion = "Disponible";
        System.out.println("Ingresa el id de la habitacion");
        idHabitacion = data.nextLine();
        Habitacion habitacionAux = new HabitacionRegular(numHabitacion, estadoHabitacion, idHabitacion);
        Habitacion habitacion = h1.registrarHabitacion(habitacionAux);
        System.out.println("Nueva habitacion regular registrada :");
        System.out.println(habitacion);
        System.out.println("Puedes verla en la lista de habiaciones");
        return habitacion;
    }

    private Habitacion nuevaHabitacionPremium(){
        String numHabitacion;
        String estadoHabitacion;
        String idHabitacion;
        String estacionamiento;
        Scanner data = new Scanner(System.in);
        System.out.println("Ingresa el numero de habitacion");
        numHabitacion = data.nextLine();
        estadoHabitacion = "Disponible";
        System.out.println("Ingresa el id de la habitacion");
        idHabitacion = data.nextLine();
        System.out.println("Ingresa el estacionamiento seleccionado");
        estacionamiento = data.nextLine();
        Habitacion habitacionAux = new HabitacionPremium(numHabitacion, estadoHabitacion, idHabitacion, estacionamiento);
        Habitacion habitacion = h1.registrarHabitacion(habitacionAux);
        System.out.println(habitacion);
        System.out.println("Puedes verla en la lista de habiaciones");
        return habitacion;
    }

    private Habitacion nuevaHabitacionDeluxe(){
        String numHabitacion;
        String estadoHabitacion;
        String idHabitacion;
        Scanner data = new Scanner(System.in);
        System.out.println("Ingresa el numero de habitacion");
        numHabitacion = data.nextLine();
        estadoHabitacion = "Disponible";
        System.out.println("Ingresa el id de la habitacion");
        idHabitacion = data.nextLine();
        Habitacion habitacionAux = new HabitacionRegular(numHabitacion, estadoHabitacion, idHabitacion);
        Habitacion habitacion = h1.registrarHabitacion(habitacionAux);
        System.out.println(habitacion);
        System.out.println("Puedes verla en la lista de habiaciones");
        return habitacion;
    }

    private Habitacion[] listaHabitaciones(){
        Habitacion[] listaHabitaciones = h1.getHabitaciones();
        System.out.println("Las habitaciones registradas son las siguientes");
        for (Habitacion habitacion: listaHabitaciones){
            if(habitacion != null){
                System.out.println(habitacion);
            }
        }
        System.out.println("Lista de habitaciones :");
        return listaHabitaciones;
    }

    // to fix
    private Habitacion[] habitacionesDisponibles(){
        Habitacion[] habitacionesDisponibles = h1.habitacionesDisp();
        System.out.println(habitacionesDisponibles);
        System.out.println("Las habitaciones Disponibles son las siguientes");
        System.out.println(habitacionesDisponibles);
        for (Habitacion habitacion: habitacionesDisponibles){
            if(habitacion != null && habitacion.getEstadoHabitacion().equals("Disponible")){
                System.out.println(habitacion);
            }
        }
        return habitacionesDisponibles;
    }


}
