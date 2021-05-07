package hotel;

public class HabitacionDeluxe extends Habitacion{
    private String estacionamiento;
    private String habitacionConVista;

    public HabitacionDeluxe(String habitacion, String estadoHabitacion, String idHabitacion, String estacionamiento, String habitacionConVista) {
        super(habitacion, estadoHabitacion, idHabitacion);
        this.estacionamiento = estacionamiento;
        this.habitacionConVista = habitacionConVista;
    }

//    @Override
//    public double calcularPrecio() {
//        int dias = getOcupante().getDias();
//        double precioFinal = 350 * dias;
//        return precioFinal;
//    }

    @Override
    public String toString() {
        return "HabitacionDeluxe{" +
                super.toString() +
                "estacionamiento='" + estacionamiento + '\'' +
                ", habitacionConVista='" + habitacionConVista + '\'' +
                '}';
    }
}
