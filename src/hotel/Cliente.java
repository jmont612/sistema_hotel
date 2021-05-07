package hotel;

public class Cliente {
    private String dni;
    private String nombreCompleto;
    private int dias;


    public Cliente(String dni, String nombreCompleto, int dias) {
        this.dni = dni;
        this.nombreCompleto = nombreCompleto;
        this.dias = dias;
    }

    public String getDni() {
        return dni;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "dni='" + dni + '\'' +
                ", nombreCompleto='" + nombreCompleto + '\'' +
                ", dias='" + dias + '\'' +
                '}';
    }
}
