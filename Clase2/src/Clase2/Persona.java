package Clase2;

public class Persona {
    String nombre;
    int dni;
    public String setNombre;
    public int setDni;

    public void setNombre(String nombre) {
        this.nombre = nombre;
        // System.out.println("No se puede cambiar el nombre");
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }

    public Persona copy() {
        Persona copia = new Persona();
        copia.setNombre(this.nombre);
        copia.setDni(this.dni);
        return copia;
    }
}
