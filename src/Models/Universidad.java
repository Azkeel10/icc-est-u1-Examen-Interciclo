package Models;

public class Universidad {
    String nombre;
    int matriculados;

    public Universidad(String nombre, int matriculados) {
        this.nombre = nombre;
        this.matriculados = matriculados;
    }

    public String toString() {
        return nombre + " (" + matriculados + ")";
    }
}

