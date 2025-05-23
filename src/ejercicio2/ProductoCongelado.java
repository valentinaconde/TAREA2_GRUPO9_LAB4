package ejercicio2;

public class ProductoCongelado extends Producto {
	private int temperaturaRecomendada;

	//constructor 1
	public ProductoCongelado(){
		super();
		this.temperaturaRecomendada=0;
	}
	//constructor 2
	public ProductoCongelado(String fechaCaducidad,int numeroLote,int temperaturaRecomendada){
		super(fechaCaducidad,numeroLote);
		this.temperaturaRecomendada=temperaturaRecomendada;	
	}
	
	//getters y setters 
	public int getTemperaturaRecomendada() {
		return temperaturaRecomendada;
	}
	public void setTemperaturaRecomendada(int temperaturaRecomendada) {
		this.temperaturaRecomendada = temperaturaRecomendada;
	}

	//método toString()
	@Override
	public String toString() {
		return "temperaturaRecomendada=" + temperaturaRecomendada;
	}
	
	
	
}
