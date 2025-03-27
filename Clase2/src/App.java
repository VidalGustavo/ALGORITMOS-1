import Clase2.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        Persona pepa = new Persona();
        // pepa.nombre = "Pepa";
        pepa.setNombre( "Pepa");
        pepa.setDni(12345678);
        System.out.println(pepa.getNombre());
        System.out.println(pepa.getDni());

        // Persona pepa2 = pepa; // Esto por atras esta haciendo una copia de la referencia por lo tanto pepa y pepa2 apuntan al mismo objeto.
        // Esto es una copia superficial (Shallow).
        // pepa2.setNombre("Pepa2");
        // Entonces hago una copia profunda (Deep). Para esto esta bueno crear un metodo Copy.
        Persona pepa2 = new Persona();
        pepa2 = pepa.copy();
        pepa2.setNombre("Pepa2");
        System.out.println(pepa.getNombre());
        System.out.println(pepa2.getNombre());
        System.out.println(pepa2.getDni());


        System.out.println("-----Esto es un divisor-----");

        
    }
}
