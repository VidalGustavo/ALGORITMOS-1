package viaje;

public class ViajeDiesel extends Viaje {

    public ViajeDiesel (int cantVagones, int cantPasajeros, String destino, String origen, double distancia, int cantEstaciones){
        super(cantVagones, cantPasajeros, destino, origen, distancia, cantEstaciones);
    }
    public double tiempoDeDemora (){

        double cantEstacionesAsDouble = this.cantEstaciones;
        double cantPasajerosAsDouble = this.cantPasajeros;
        return this.distancia * this.cantEstaciones/2+(cantEstacionesAsDouble+cantPasajerosAsDouble)/10;



    }
}
