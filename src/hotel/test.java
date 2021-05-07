package hotel;

public class test {
    public static void main(String[] args) {
//        nombre / direccion / Habitacion?
        Hotel h1 = new Hotel ("Hotel 1", "Av. Las Begonias 885, San Isidro");

        HabitacionRegular habitacion1 = new HabitacionRegular("A101","Disponible", "COD001");
        HabitacionRegular habitacion2 = new HabitacionRegular("A102","Ocupado", "COD002");
        HabitacionRegular habitacion3 = new HabitacionRegular("A103","Pendiente", "COD003");
        HabitacionPremium habitacion4 = new HabitacionPremium("B201", "Disponible", "COD004", "B1");
        HabitacionPremium habitacion5 = new HabitacionPremium("B202", "Ocupado", "COD005", "B2");
        HabitacionPremium habitacion6 = new HabitacionPremium("B203", "Pendiente", "COD006", "B3");
        HabitacionDeluxe habitacion7 = new HabitacionDeluxe("C301", "Disponible", "COD007", "C1", "Avenida");
        HabitacionDeluxe habitacion8 = new HabitacionDeluxe("C302", "Ocupado", "COD008", "C1", "Piscina");
        HabitacionDeluxe habitacion9 = new HabitacionDeluxe("C303", "Pendiente", "COD009", "C1", "Jardin");

        Cliente c1 = new Cliente("46789212", "Juan Flores Ramos", 3);
        Cliente c2 = new Cliente("45978412", "Ana Santiesteban Chota", 6);
        Cliente c3 = new Cliente("44752137", "Pilar Robes Solano", 9);



        h1.registrarHabitacion(habitacion1);
        h1.registrarHabitacion(habitacion2);
        h1.registrarHabitacion(habitacion3);
        h1.registrarHabitacion(habitacion4);
        h1.registrarHabitacion(habitacion5);
        h1.registrarHabitacion(habitacion6);
        h1.registrarHabitacion(habitacion7);
        h1.registrarHabitacion(habitacion8);
        h1.registrarHabitacion(habitacion9);

        h1.registrarCliente(c1);
        h1.registrarCliente(c2);
        h1.registrarCliente(c3);

//        Habitacion[] habitacionesRegistradas = h1.getHabitaciones();
//        for (Habitacion habitacion: habitacionesRegistradas){
//            if(habitacion != null){
//                System.out.println(habitacion);
//            }
//        }

//        Habitacion habitacion = h1.buscarHabitacion("A101");
//        System.out.println(habitacion);
//
//        Habitacion[] habitacionesDisponibles = h1.habitacionesDisp();
//        for (Habitacion habitacion: habitacionesDisponibles){
//            if(habitacion != null){
//                System.out.println(habitacion);
//            }
//        }
//
//        Habitacion[] habitacionesRegularDisp = h1.habitacionesRegularDisp();
//        for (Habitacion habitacion: habitacionesRegularDisp){
//            if(habitacion != null){
//                System.out.println(habitacion);
//            }
//        }
//
//        Habitacion[] habitacionesPremiumDisp = h1.habitacionesPremiumDisp();
//        for (Habitacion habitacion: habitacionesPremiumDisp){
//            if(habitacion != null){
//                System.out.println(habitacion);
//            }
//        }
//
//        Habitacion[] habitacionesDeluxeDisp = h1.habitacionesDeluxeDisp();
//        for (Habitacion habitacion: habitacionesDeluxeDisp){
//            if(habitacion != null){
//                System.out.println(habitacion);
//            }
//        }

//        Cliente[] clientesRegistrados = h1.getClientes();
//        for (Cliente cliente: clientesRegistrados){
//            if(cliente != null){
//                System.out.println(cliente);
//            }
//        }

//        Habitacion habitacionAsignada = h1.asignarClienteHabitacion("A101", c1);
//        System.out.println(habitacionAsignada);

        Cliente buscarCliente = h1.buscarCliente("46789212");
        System.out.println(buscarCliente.getNombreCompleto());


//        System.out.println(h1);
//        System.out.println(habitacion1);
//        System.out.println(habitacion2);
//        System.out.println(habitacion3);
//        System.out.println(habitacion4);
//        System.out.println(habitacion5);
//        System.out.println(habitacion6);
//        System.out.println(habitacion7);
//        System.out.println(habitacion8);
//        System.out.println(habitacion9);
//        System.out.println(a1);
//        System.out.println(m1);
//        System.out.println(m2);
//        System.out.println(m3);
    }

}
