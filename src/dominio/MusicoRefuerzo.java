package dominio;


class MusicoRefuerzo extends Musico {
    private BigDecimal cantidadDinero;

    public MusicoRefuerzo(String nombre, String instrumento, BigDecimal cantidadDinero) {
        super(nombre, instrumento);
        this.cantidadDinero = cantidadDinero;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + cantidadDinero + " C";
    }
}