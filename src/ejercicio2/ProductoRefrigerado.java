package ejercicio2;

public class ProductoRefrigerado extends Producto {
int codigo;

	//constructor 1
	ProductoRefrigerado(){
		super();
		this.codigo=0;
	}
	//constructor 2

	ProductoRefrigerado(String fechaCaducidad,int numeroLote,int codigo){
		super(fechaCaducidad, numeroLote);
		this.codigo=codigo;
	}
	//getters y setters 

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	//método toString()
	@Override
	public String toString() {
		return "ProductoRefrigerado [codigo=" + codigo + "]";
	}
	
}
