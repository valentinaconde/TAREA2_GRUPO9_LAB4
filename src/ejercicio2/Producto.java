package ejercicio2;

public class Producto {
	private String fechaCaducidad;	
	private int numeroLote;
	
	//constructor 1
	Producto(){
		this.fechaCaducidad="Sin fecha de caducidad";
		this.numeroLote=0;
	}
	
	//constructor 2
	Producto(String fechaCaducidad,int numeroLote){
		this.fechaCaducidad=fechaCaducidad;
		this.numeroLote=numeroLote;
	}

	//getters y setters
	public String getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	public int getNumeroLote() {
		return numeroLote;
	}

	public void setNumeroLote(int numeroLote) {
		this.numeroLote = numeroLote;
	}

	// método toString()
	@Override
	public String toString() {
		return "Producto [fechaCaducidad=" + fechaCaducidad + ", numeroLote=" + numeroLote + "]";
	}
	
	
}
