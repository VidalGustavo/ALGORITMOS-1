public class Punto {
    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double distOrigen() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }

    @Override
    public boolean equals(Object p) {
        if (p instanceof Punto){ // Si no es un objeto de la clase Punto, no se puede comparar.
            return this.x == ((Punto)p).getX() && this.y == ((Punto)p).getY(); // double es una clase nativa, se evalua por valor con el ==
        } else {
            throw new IllegalArgumentException("El objeto no es de la clase Punto"); // Si no es un objeto de la clase Punto, no se puede comparar.
        }
    }

}
