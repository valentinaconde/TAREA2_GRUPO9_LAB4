package ejercicio1;

import java.util.TreeSet;
import java.util.Iterator;

public class mainEjercicio1_b {
	public static void main(String[] args) {
        TreeSet<Profesor> profesores = new TreeSet<>();

        // Crear 5 profesores (como en el video)
        Profesor prof1 = new Profesor("Juan", 38, "Profesor Historia", 12);
        Profesor prof2 = new Profesor("Pepe", 49, "Profesor Matemáticas", 24);
        Profesor prof3 = new Profesor("Maria", 24, "Profesor Naturales", 2);
        Profesor prof4 = new Profesor("Guadalupe", 26, "Profesor Química", 4);
        Profesor prof5 = new Profesor("Luis", 29, "Profesor Ed. Física", 7);

        // Agregar al TreeSet (no permite duplicados)
        profesores.add(prof1);
        profesores.add(prof2);
        profesores.add(prof3);
        profesores.add(prof4);
        profesores.add(prof5);

        // Mostrar con iterador (ordenados)
        Iterator<Profesor> it = profesores.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }
    
	
	Profesor p1 = new Profesor("Juan", 38, "Profesor Historia", 12);
	
	Profesor p2 = new Profesor("Juan", 38, "Profesor Historia", 12);
	
	if( p1.equals(p2)) {
		System.out.println("Es el mismo profesor");
	}
	else {
		System.out.println("No es el mismo profesor");
	}
	
}
}

