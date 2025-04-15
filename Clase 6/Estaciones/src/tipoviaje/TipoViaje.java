package tipoviaje;

public class TipoViaje {
    private String tipoViaje;

    public TipoViaje(String tipoViaje) {

        if (tipoViaje == null || tipoViaje.isEmpty()) {
            throw new IllegalArgumentException("El tipo de viaje no puede ser nulo o vacío.");
        }
        if (!tipoViaje.equals("Diesel") && !tipoViaje.equals("Electrico") && !tipoViaje.equals("Alta Velocidad")) {
            throw new IllegalArgumentException("El tipo de viaje debe ser 'Diesel', 'Electrico' o 'Alta Velocidad'.");
        }
        this.tipoViaje = tipoViaje;
    }

    public String getTipoViaje() {
        return this.tipoViaje;
    }
}
