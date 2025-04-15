package viaje;

public class ViajeAltaVelocidad extends Viaje {
    public ViajeAltaVelocidad (int cantVagones, int cantPasajeros, String destino, String origen, double distancia, int cantEstaciones){
        super(cantVagones, cantPasajeros, destino, origen, distancia, cantEstaciones);
    }
    public double tiempoDeDemora() {
        return this.distancia / 10;
    }
}
