package ejercicio3;

public class EdificioDeOficinas extends Edificio {
   
    private int numeroDeOficinas;

    public EdificioDeOficinas() {
    	super();
    	this.numeroDeOficinas=0;
    }
    public EdificioDeOficinas(double superficie, int numeroDeOficinas) {
        super(superficie);
        this.numeroDeOficinas = numeroDeOficinas;
    }

  
    public int getNumeroDeOficinas() {
        return this.numeroDeOficinas;
    }

	@Override
	public String toString() {
		return super.toString() + ", numero de oficinas=" + numeroDeOficinas ;
	}
    
    
}
