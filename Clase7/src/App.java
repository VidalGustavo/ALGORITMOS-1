public class App {
    public static void main(String[] args) throws Exception {
        var p1 = new Punto(1, 1);
        var p2 = p1; // Esto hace que sea lo mismo, va a la misma direccion de memoria.
        var p3 = new Punto(1, 1);

        if (p1==p2) // Esto compara la referencia, no el valor. Si son el mismo objeto.
            System.out.println("p1 y p2 son iguales (mismo objeto)");
        if (p1==p3)
            System.out.println("p1 y p3 son iguales (mismo valor)");
        // if (p1.equals(p3))
            // esto en ppio no compila porque no hemos definido el método equals en la clase Punto.
        // Luego de crearlo si va a compilar
        if (p1.equals(p3)) // Esto compara el valor, no la referencia. Si tienen el mismo valor.
            System.out.println("p1 y p3 son iguales (mismo valor)");    
        }
}
