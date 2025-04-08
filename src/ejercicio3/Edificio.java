package ejercicio3;

public abstract class Edificio {
	private double superficieEdificio;
	
	public Edificio() {
		this.superficieEdificio=0;
	}
	
	public Edificio(double superficieEdificio) {
		this.superficieEdificio=superficieEdificio;
	}

	public double getSuperficieEdificio() {
		return superficieEdificio;
	}

	public void setSuperficieEdificio(double superficieEdificio) {
		this.superficieEdificio = superficieEdificio;
	}

	@Override
	public String toString() {
		return "superficie de edificio=" + superficieEdificio ;
	}
	
	public abstract void mostrarInformacion();

}
