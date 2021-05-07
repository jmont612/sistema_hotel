package hotel;

public class HabitacionPremium extends Habitacion{
    private String estacionamiento;

    public HabitacionPremium(String habitacion, String estadoHabitacion, String idHabitacion, String estacionamiento) {
        super(habitacion, estadoHabitacion, idHabitacion);
        this.estacionamiento = estacionamiento;
    }

//    @Override
//    public double calcularPrecio() {
//        int dias = getOcupante().getDias();
//        double precioFinal = 250 * dias;
//        return precioFinal;
//    }

    @Override
    public String toString() {
        return "HabitacionPremium{" +
                super.toString() +
                "estacionamiento='" + estacionamiento + '\'' +
                '}';
    }
}
