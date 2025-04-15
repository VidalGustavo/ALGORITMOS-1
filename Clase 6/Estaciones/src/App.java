import viaje.ViajeDiesel;
import viaje.ViajeElectrico;
import viaje.ViajeAltaVelocidad;

import tipoviaje.TipoViaje;
import tipoviaje.ViajeConTipo;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio A \n");
        System.out.println("Viaje a Diesel");
        ViajeDiesel viaje1 = new ViajeDiesel(3, 100,
                                             "Buenos Aires", "CABA", 1000, 5);
        System.out.println(viaje1.tiempoDeDemora());

        System.out.println("Viaje Electrico");
        ViajeElectrico viaje2 = new ViajeElectrico(3, 100,
                                                   "Carmen de Patagones", "La Pampa",
                                                1000, 5);



        System.out.println(viaje2.tiempoDeDemora());
        System.out.println("Viaje Alta Velocidad");
        ViajeAltaVelocidad viaje3 = new ViajeAltaVelocidad(3, 100,
                                                           "Ushuaia", "La Quiaca",
                                                        1000, 5);
        System.out.println(viaje3.tiempoDeDemora());
        System.out.println("\n");

        System.out.println("Ejercicio B \n");

        TipoViaje tipoViajeDiesel = new TipoViaje("Diesel");
        TipoViaje tipoViajeElectrico = new TipoViaje("Electrico");
        TipoViaje tipoViajeAltaVelocidad = new TipoViaje("Alta Velocidad");

        System.out.println("Viaje a Diesel");
        ViajeConTipo viajeConTipo1 = new ViajeConTipo(3, 100,
                                                     "Buenos Aires", "CABA",
                                                  1000, 5, tipoViajeDiesel);
        System.out.println(viajeConTipo1.tiempoDeDemora());

        System.out.println("Viaje Electrico");
        ViajeConTipo viajeConTipo2 = new ViajeConTipo(3, 100,
                                                     "Carmen de Patagones", "La Pampa",
                                                  1000, 5, tipoViajeElectrico);
        System.out.println(viajeConTipo2.tiempoDeDemora());

        System.out.println("Viaje Alta Velocidad");
        ViajeConTipo viajeConTipo3 = new ViajeConTipo(3, 100,
                                                     "Ushuaia", "La Quiaca",
                                                  1000, 5, tipoViajeAltaVelocidad);
        System.out.println(viajeConTipo3.tiempoDeDemora());




    }

    
}

