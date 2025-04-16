package tipoviaje;

public class ViajeConTipo {
    public int cantVagones;
    public int cantPasajeros;
    public String destino;
    public String origen;
    public double distancia;
    public int cantEstaciones;
    private TipoViaje tipoViaje;

    public ViajeConTipo (int cantVagones, int cantPasajeros, String destino, String origen, double distancia, int cantEstaciones, TipoViaje tipoViaje) {

        this.cantPasajeros = cantPasajeros;
        this.cantVagones = cantVagones;
        this.destino = destino;
        this.origen = origen;
        this.distancia = distancia;
        this.cantEstaciones = cantEstaciones;
        this.tipoViaje = tipoViaje;
    };

    public double tiempoDeDemora() {
        if (this.tipoViaje.getTipoViaje().equals("Diesel")) {
            double cantEstacionesAsDouble = this.cantEstaciones;
            double cantPasajerosAsDouble = this.cantPasajeros;
            return this.distancia * this.cantEstaciones/2+(cantEstacionesAsDouble+cantPasajerosAsDouble)/10;

        } else if (this.tipoViaje.getTipoViaje().equals("Electrico")) {
            double cantEstacionesAsDouble = this.cantEstaciones;
            return this.distancia*cantEstacionesAsDouble/2;
            
        } else if (this.tipoViaje.getTipoViaje().equals("Alta Velocidad")) {
            return this.distancia / 10;
            
        } else {
            throw new IllegalArgumentException("Tipo de viaje no válido."); //hace falta???
        }
    }

}
