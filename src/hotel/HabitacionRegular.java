package hotel;

public class HabitacionRegular extends Habitacion{
    public HabitacionRegular(String numHabitacion, String estadoHabitacion, String idHabitacion) {
        super(numHabitacion, estadoHabitacion, idHabitacion);
    }

//    @Override
//    public double calcularPrecio() {
//        return super.calcularPrecio();
//    }

    @Override
    public String toString() {
        return "HabitacionRegular{" +
                super.toString() +
                '}';
    }
}
