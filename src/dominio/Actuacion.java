package dominio;
class Actuacion {
    private LocalDate fecha;
    private List<Participante> participantes;

    public Actuacion(LocalDate fecha) {
        this.fecha = fecha;
        this.participantes = new ArrayList<>();
    }

    public void annadirParticipante(Participante participante) {
        participantes.add(participante);
    }

    @Override
    public String toString() {
        StringBuilder resultado = new StringBuilder("Fecha de actuación: " + fecha + "\n");

        for (Participante participante : participantes) {
            resultado.append(participante).append("\n");
        }

        return resultado.toString();
    }
}
