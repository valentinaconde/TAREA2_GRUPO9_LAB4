package ejercicio3;

public class EdificioDeOficinas implements IEdificio {
    private double superficie;
    private int numeroDeOficinas;

    public EdificioDeOficinas(double superficie, int numeroDeOficinas) {
        this.superficie = superficie;
        this.numeroDeOficinas = numeroDeOficinas;
    }

    @Override
    public double getSuperficieEdificio() {
        return this.superficie;
    }

    public int getNumeroDeOficinas() {
        return this.numeroDeOficinas;
    }
}
