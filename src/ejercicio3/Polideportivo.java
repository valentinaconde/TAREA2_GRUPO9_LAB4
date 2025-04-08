package ejercicio3;

public class Polideportivo extends Edificio implements IInstalacionDeportiva {

	private int tipoDeInstalacion;
	private String nombre;
	
	//constructor1 
	public Polideportivo()
	{
	super();
	this.nombre="Sin nombre";
	this.tipoDeInstalacion=0;
	}	
	
	//constructor2
	public Polideportivo(int tipoDeInstalacion,double superficieEdificio,String nombre) {
		super(superficieEdificio);
		this.tipoDeInstalacion=tipoDeInstalacion;
		this.nombre=nombre;
	}
	
//getters y setters

	//Primero el que debe implementar obligatoriamente por la Interfaz.
	@Override
	public int getTipoDeInstalacion() {
		return tipoDeInstalacion;
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setTipoDeInstalacion(int tipoDeInstalacion) {
		this.tipoDeInstalacion = tipoDeInstalacion;
	}

	

	
//Metodo toString
	@Override
	public String toString() {
		return super.toString()+" nombre: "+nombre+", tipo de instalacion: "+tipoDeInstalacion;
	}
	
	public void mostrarInformacion() {
		System.out.println("Polideportivo: Superficie: " + getSuperficieEdificio() + ", Nombre: " + nombre + ", Tipo de Instalacion: " + tipoDeInstalacion);
	}

	
}
