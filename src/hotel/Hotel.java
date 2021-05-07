package hotel;

import java.util.Arrays;

public class Hotel {
    private String nombre;
    private String direccion;

    private Habitacion[] habitaciones;
    private final static int maxHabitaciones = 50;
    private int cantHabitaciones;

    private Cliente[] clientes;
    private final static int maxClientes = 200;
    private int cantClientes;

    public Hotel() {
    }

    public Hotel(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;

        this.habitaciones = new Habitacion[maxHabitaciones];
        this.cantHabitaciones = 0;

        this.clientes = new Cliente[maxClientes];
        this.cantClientes = 0;
    }

//    HABITACIONES

    public Habitacion[] getHabitaciones(){
        return habitaciones;
    }

    public Habitacion registrarHabitacion(Habitacion habitacion){
        habitaciones[cantHabitaciones] = habitacion;
        cantHabitaciones = cantHabitaciones + 1;
        return habitacion;
    }

    public Habitacion buscarHabitacion(String numHabitacion){
        String emessage = "No hay una habitacion registrada con ese numero";
        for( Habitacion habitacion: habitaciones){
            if(habitacion != null && habitacion.getNumHabitacion().equals(numHabitacion)){
                return habitacion;
            }
        }
        return null;
    }

    public Habitacion[] habitacionesDisp(){
        Habitacion[] arregloAux = new Habitacion[cantHabitaciones];
        int posicion = 0;
        for (Habitacion habitacion: habitaciones){
            if(habitacion != null && habitacion.getEstadoHabitacion() == "Disponible"){
                arregloAux[posicion] = habitacion;
                posicion = posicion + 1;
            }
        }
        return arregloAux;
    }

    public Habitacion[] habitacionesRegularDisp(){
        Habitacion[] arregloAux = new Habitacion[cantHabitaciones];
        int posicion = 0;
        for(Habitacion habitacion: habitaciones){
            if(habitacion != null
               && habitacion instanceof HabitacionRegular
               && habitacion.getEstadoHabitacion() == "Disponible"){
                arregloAux[posicion] = habitacion;
                posicion = posicion + 1;
            }
        }
        return  arregloAux;
    }

    public Habitacion[] habitacionesPremiumDisp(){
        Habitacion[] arregloAux = new Habitacion[cantHabitaciones];
        int posicion = 0;
        for(Habitacion habitacion: habitaciones){
            if(habitacion != null
                    && habitacion instanceof HabitacionPremium
                    && habitacion.getEstadoHabitacion() == "Disponible"){
                arregloAux[posicion] = habitacion;
                posicion = posicion + 1;
            }
        }
        return  arregloAux;
    }

    public Habitacion[] habitacionesDeluxeDisp(){
        Habitacion[] arregloAux = new Habitacion[cantHabitaciones];
        int posicion = 0;
        for(Habitacion habitacion: habitaciones){
            if(habitacion != null
                    && habitacion instanceof HabitacionDeluxe
                    && habitacion.getEstadoHabitacion() == "Disponible"){
                arregloAux[posicion] = habitacion;
                posicion = posicion + 1;
            }
        }
        return  arregloAux;
    }

//    CLIENTES
    public Cliente[] getClientes(){
        return clientes;
    }

    public Cliente registrarCliente(Cliente cliente){
        clientes[cantClientes] = cliente;
        cantClientes = cantClientes + 1;
        return cliente;
    }

    public Cliente buscarCliente(String dni){
        String emessage = "El cliente no existe";
        for( Cliente cliente: clientes){
            if(cliente != null && cliente.getDni().equals(dni)){
                return cliente;
            }
        }
        return null;
    }

    // pendiente solo si la habitacion esta disponible
    public Habitacion asignarClienteHabitacion(String numHabitacion, Cliente cliente){
        Habitacion habitacion = buscarHabitacion(numHabitacion);
        habitacion.setOcupante(cliente);
        habitacion.setEstadoHabitacion("Ocupado");

        return habitacion;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", habitaciones=" + Arrays.toString(habitaciones) +
                ", cantHabitaciones=" + getHabitaciones() +
                ", cantClientes=" + getClientes() +
                '}';
    }
}
