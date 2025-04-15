package viaje;

public abstract class Viaje {
    public int cantVagones;
    public int cantPasajeros;
    public String destino;
    public String origen;
    public double distancia;
    public int cantEstaciones;

    public Viaje (int cantVagones, int cantPasajeros, String destino, String origen, double distancia, int cantEstaciones) {

        this.cantPasajeros = cantPasajeros;
        this.cantVagones = cantVagones;
        this.destino = destino;
        this.origen = origen;
        this.distancia = distancia;
        this.cantEstaciones = cantEstaciones;
    };
}
