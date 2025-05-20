## Ejercicio de la Guia de Herencia:
### Estaciones: Viajes y Tipos de viaje.

La clase App, principal, crea distintos viajes y les calcula su tiempo de viaje.
Hay 2 paquetes, cada uno para cada punto del ejecicio
viaje y tipo viaje.


Dejo aca un diagrama de una solucion del ej B (que no implementamos), esta se hizo con los principios Strategy
(pero termina especializando en cada tipo, asi que no sé si es lo que se pedia realmente.):

```mermaid
---
title: Resolucion Punto B con Strategy
---
classDiagram
    Viaje~abstract~: + cantPasajeros
    Viaje: + cantVagones
    Viaje: + destino
    Viaje: + origen
    Viaje: + distancia
    Viaje: + cantEstaciones
    Viaje: - tipoViaje <TipoViaje>

    TipoViaje : + tiempoDeDemora() Double

    ViajeElectrico: +tiempoDeDemora() double
    ViajeDiesel: +tiempoDeDemora() double
    ViajeAltaVelocida: +tiempoDeDemora() double

    App: +void main(String args[])
    
    Viaje ..> TipoViaje
    TipoViaje --> ViajeElectrico
    TipoViaje --> ViajeDiesel
    TipoViaje --> ViajeAltaVelocida


**POLIMORFISMO** 
El programa presenta un solo tipo de Polimorfismo: Sobrecarga. Según el tipo de tren el método tiempoDeDemora() cambia su formula. 