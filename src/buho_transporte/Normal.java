package buho_transporte;

public class Normal extends Ticket {
    public String asiento;

    public Normal(Pasajero pasajero, Ruta ruta, String asiento) {
        super(pasajero, ruta);
        this.asiento = asiento;
    }

    public String getAsiento() {
        return asiento;
    }
}
