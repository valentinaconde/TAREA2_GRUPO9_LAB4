package ejercicio3;

import java.util.ArrayList;
import java.util.ListIterator;


public class mainEjercicio3 {

	public static void main(String[] args) {
		
		ArrayList<Edificio> edificios = new ArrayList<Edificio>(5);
		
		Polideportivo poli1 = new Polideportivo(2, 5000.0, "polideportivo 1");
		Polideportivo poli2 = new Polideportivo(3, 3250.50, "polideportivo 2");
		Polideportivo poli3 = new Polideportivo(2, 8000.10, "polideportivo 3");
		
		EdificioDeOficinas oficina1 = new EdificioDeOficinas(1400, 12);
		EdificioDeOficinas oficina2 = new EdificioDeOficinas(3100.24, 31);
		
		edificios.add(poli1);
        edificios.add(poli2);
        edificios.add(poli3);
        edificios.add(oficina1);
        edificios.add(oficina2);
        
        ListIterator<Edificio> it = edificios.listIterator();
        while(it.hasNext()) {
        	Edificio edificio = it.next();
			edificio.mostrarInformacion();
			System.out.println();
		}
        
	}

}
