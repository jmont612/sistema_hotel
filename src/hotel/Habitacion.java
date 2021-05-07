package hotel;

public class Habitacion {
    private String numHabitacion;
    private String estadoHabitacion;
    private String idHabitacion;
    private Cliente ocupante;

    public Habitacion(String numHabitacion, String estadoHabitacion, String idHabitacion) {
        this.numHabitacion = numHabitacion;
        this.estadoHabitacion = estadoHabitacion;
        this.idHabitacion = idHabitacion;
        this.ocupante = ocupante;
    }

    public String getNumHabitacion() {
        return numHabitacion;
    }

    public String getEstadoHabitacion(){
        return estadoHabitacion;
    }

    public Cliente getOcupante() {
        return ocupante;
    }

    public void setEstadoHabitacion(String estadoHabitacion) {
        this.estadoHabitacion = estadoHabitacion;
    }

    public void setOcupante(Cliente ocupante) {
        this.ocupante = ocupante;
    }

//    public double calcularPrecio(){
//        int dias = ocupante.getDias();
//        double precioFinal = 150 * dias;
//        return precioFinal;
//    }

    @Override
    public String toString() {
        return "Habitacion{" +
                "numHabitacion='" + numHabitacion + '\'' +
                ", estadoHabitacion='" + estadoHabitacion + '\'' +
                ", idHabitacion='" + idHabitacion + '\'' +
                ", ocupante='" + ocupante + '\'' +
//                ", precio='" + calcularPrecio() + '\'' +
                '}';
    }
}
