package buho_transporte;

import java.util.ArrayList;
import java.util.List;

public class VIP extends Ticket {
    private List<String> serviciosAdicionales;

    public VIP(Pasajero pasajero, Ruta ruta) {
        super(pasajero, ruta);
        this.serviciosAdicionales = new ArrayList<>();
        if (ruta != null) {
            calcularCosto();
        }
    }

    @Override
    protected void calcularCosto() {
        if (ruta != null) {
            this.costo = ruta.getPrecio() * 1.3;
        }
    }
    public void agregarServicioAdicional(String servicio) {
        serviciosAdicionales.add(servicio);
    }

    public List<String> getServiciosAdicionales() {
        return serviciosAdicionales;
    }
}

