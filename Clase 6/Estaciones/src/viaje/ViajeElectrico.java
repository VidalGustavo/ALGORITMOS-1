package viaje;

public class ViajeElectrico extends Viaje {
    public ViajeElectrico (int cantVagones, int cantPasajeros, String destino, String origen, double distancia, int cantEstaciones){
        super(cantVagones, cantPasajeros, destino, origen, distancia, cantEstaciones);
    }
    public double tiempoDeDemora (){
        double cantEstacionesAsDouble = this.cantEstaciones;

        return this.distancia*cantEstacionesAsDouble/2;

    }
}
