package buho_transporte;
import java.util.ArrayList;
import java.util.List;

public class Ticket {
    private Pasajero pasajero;
    protected Ruta ruta;
    private List<Servicio>servicios;
    protected double costo;

    public Ticket(Pasajero pasajero, Ruta ruta) {
        this.pasajero = pasajero;
        this.ruta = ruta;
        this.servicios = new ArrayList<>();
        calcularCosto();
    }
    protected void calcularCosto() {
        if (ruta != null) {
            this.costo = ruta.getPrecio();
        }
    }

    public void agregarServicio(Servicio servicio) {
        servicios.add(servicio);
    }

    public double getCosto() {
        return costo;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public List<Servicio> getServicios() {
        return servicios;
    }



}
