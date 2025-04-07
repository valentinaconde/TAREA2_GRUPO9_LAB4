package ejercicio2;

public class ProductoFresco extends Producto {
	
	private String fechaEnvasado;
	private String paisOrigen;
	
	//constructor 1
	public ProductoFresco(){
	super();
	this.fechaEnvasado="Sin fecha envasado";
	this.paisOrigen="Sin país origen";
	}
	
	//constructor 2
	public ProductoFresco(String fechaCaducidad,int numeroLote,String fechaEnvasado,String paisOrigen ){
		super(fechaCaducidad,numeroLote);
		this.fechaEnvasado=fechaEnvasado;
		this.paisOrigen=paisOrigen;
	}

	//getters y setters 
	public String getFechaEnvasado() {
		return fechaEnvasado;
	}

	public void setFechaEnvasado(String fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	//método toString()
	@Override
	public String toString() {
		return "fechaEnvasado=" + fechaEnvasado + ", paisOrigen=" + paisOrigen ;
	}
	

}
