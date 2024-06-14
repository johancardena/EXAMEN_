package buho_transporte;

public class Ruta {
    String nombre;
    double precio;

    public Ruta(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    public String getNombre() {
        return nombre;
    }
    public  double getPrecio() {
        return precio;
    }
}
