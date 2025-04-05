package ejercicio1;

import java.util.ArrayList;
import java.util.Iterator;

public class mainEjercicio1_a {

	public static void main(String[] args) {
		
		ArrayList<Profesor> profesores = new ArrayList<>(5);
		
		// creacion de los profesores.
		Profesor prof1 = new Profesor("Juan", 38, "prof Historia", 12);
		Profesor prof2 = new Profesor("Pepe", 49, "prof Matematicas", 24);
		Profesor prof3 = new Profesor("Maria", 24, "prof Naturales", 2);
		Profesor prof4 = new Profesor("Guadalupe", 26, "prof Quimica", 4);
		Profesor prof5 = new Profesor("Luis", 29, "prof Ed. Fisica", 7);
		
		
		// agregar cada profesor al arrayList de profesores.
		profesores.add(prof1);
		profesores.add(prof2);
		profesores.add(prof3);
		profesores.add(prof4);
		profesores.add(prof5);
		
		// iterador para mostrar la informacion
		Iterator<Profesor> it = profesores.iterator();
		
		while(it.hasNext()) {
			Profesor p = (Profesor) it.next();
			System.out.println(p.toString());
			
		}
	}
}
