package programa;

// ECB
// ENTIDAD
class Temperatura {
    // lo unico que se me ocurre para encapsular es poner el atributo privado
    private double valor;

    /* Este y los 3 de abajo son constructores, por 2 razones,
     *  1. No tienen tipo de retorno
     *  2. Se utilizan para inicializar un objeto de la clase
     * Estos metodos se utilizan en el controlador para crear objetos de la clase
     * 
     */
    private Temperatura(double gradosC) {
        this.valor = gradosC;
    }

    /* Estos metodos estaticos son metodos de clase, el kw static se utiliza
     * para marcar metodos y atributos de clase, estos son unicos (los mismos)
     * para cada objeto de la clase, y se acceden desde la clase y no un 
     * objeto de estos.
     */
    public static Temperatura temperaturaEnGradosCelsius(double gradosC) {
        return new Temperatura(gradosC);
    }

    public static Temperatura temperaturaEnGradosFarenheit(double gradosF) {
        double temp_en_c = (gradosF - 32) * 5/9;
        return new Temperatura(temp_en_c);
    }

    public double enC() {
        return this.valor;
    }

    public double enF() {
        return this.valor * 9/5 + 32;
    }
}

// CONTROLADOR
class ConversorDeTemperaturaControlador {

    public String convertirACelsius(String temperaturaEnFahr) {
        var temp = Temperatura.temperaturaEnGradosFarenheit(Double.parseDouble(temperaturaEnFahr));
        return String.format("%.2f ºC", temp.enC());
    }

    public String convertirAFahr(String temperaturaEnCelsius) {
        var temp = Temperatura.temperaturaEnGradosCelsius(Double.parseDouble(temperaturaEnCelsius));
        return String.format("%.2f ºF", temp.enF());
    }
}

// BOUNDARY o INTERFAZ
public class ConversorFahrACelsius {

    public static void main(String[] args) {
        var controlador = new ConversorDeTemperaturaControlador();

        for (int i = 0; i < args.length ; ++i) {
            String temperaturaEnFahr = args[i];
            String temperaturaEnCelsius = controlador.convertirACelsius(temperaturaEnFahr);
            System.out.println(temperaturaEnFahr + " F son " + temperaturaEnCelsius);
        }
    }
}


/*
 * Los comentarios responden a varias preguntas del ejercicio:
 * 
 * 1_Completar el código para que corra como se indica más arriba.
 * 2_¿Se puede encapsular el entity?
 * 3_La fórmula que convierte un Farenheit a Celsius es (Tf-32)*9/5. ¿Cómo sería
 * hacer la inversa?
 * 4_¿Cuáles son métodos estáticos y para que se usan?
 * 5_¿Y cuáles son constructores y dónde se usan?
 * 6_Completar el diagrama de clases.
 * 7_Completar el diagrama de secuencia.
 * 8_¿Cómo crearíamos un programa que pase de Celsius a Fahr?
 * 
 * 
 */
