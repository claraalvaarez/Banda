package dominio;
abstract class Participante {
    private String nombre;

    public Participante(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}

class Director extends Participante {
    public Director(String nombre) {
        super(nombre);
    }
}