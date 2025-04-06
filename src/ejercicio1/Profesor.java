package ejercicio1;

public class Profesor extends Empleado implements Comparable<Profesor> {
	private String cargo;
	private int antiguedadDocente;
	
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public int getAntiguedadDocente() {
		return antiguedadDocente;
	}
	public void setAntiguedadDocente(int antiguedadDocente) {
		this.antiguedadDocente = antiguedadDocente;
	}
	
	//constructor 1
	public Profesor() {
		super();
		this.cargo = "sin cargo";
		this.antiguedadDocente = 0;
	}
	
	//constructor 2
	public Profesor(String nombre, int edad, String cargo, int antiguedadDocente) {
		super(nombre, edad);
		this.cargo = cargo;
		this.antiguedadDocente = antiguedadDocente;
	}
	
	//PUNTO 4 metodo tostring
	public String toString() {
		return "ID= " + getId() + ", NOMBRE= " + getNombre() +", EDAD= " + getEdad() + ", CARGO= " + cargo + ", ANTIGUEDAD= " + antiguedadDocente ;
	}
	
	
	 @Override
	    public int compareTo(Profesor otro) {
	        // Ordenar por ID (puedes cambiarlo a nombre, edad, etc.)
	        return Integer.compare(this.getId(), otro.getId());
	    }

}
