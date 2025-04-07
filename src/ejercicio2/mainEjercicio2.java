package ejercicio2;

public class mainEjercicio2 {

	public static void main(String[] args) {
		//punto 3: creo un objeto de cada tipo y muestro
		ProductoCongelado producto1 = new ProductoCongelado("10/10/2025", 5, 2);
		ProductoFresco producto2 = new ProductoFresco("10/05/2026", 10, "7/4/2025", "canada");
		ProductoRefrigerado producto3 = new ProductoRefrigerado("12/11/2027", 3, 10105);
		
		Producto[] productos = new Producto[3];
		productos[0] = producto1;
		productos[1] = producto2;
		productos[2] = producto3;
		
		for(Producto a : productos) {
			System.out.println(a.toString());
		}
	}

}
