package tienda;

/**
 * Clase TiendaMostrar, imprime proyecto.
 * @author Alvaro Alvarez
 * @version 2.0
 * @see https://github.com/AlvarezAO/TienditaElectrodomestico
 */

public class TiendaMostrar {

	public static void main(String[] args) {
	
		/**
		 * Creacion Array de 10 elementos
		 */
		Electrodomestico lista[] = new Electrodomestico[10];
		
				
		lista[0] = new Lavadora(12000, 55);
		lista[1] = new Electrodomestico(50000, 20);
		lista[2] = new Televisor(210000, 20, 'c', "azul", 33, true);
		lista[3] = new Lavadora();
		lista[4] = new Televisor();
		lista[5] = new Lavadora();
		lista[6] = new Electrodomestico();
		lista[7] = new Lavadora();
		lista[8] = new Televisor();
		lista[9] = new Electrodomestico();
		
		
		/**
		 * se recorre la lista y se usa instanceof para separar la Clase
		 * televisor del Array e imprime.
		 */
		System.out.println("\nTelevisor");
		double totalTV = 0;
		for (int i = 0; i<lista.length;i++) {			
			if (lista[i] instanceof Televisor) {				
				System.out.println(lista[i].precioFinal());
				totalTV+= lista[i].precioFinal();		
			}					
		}		
		
		System.out.println("------------");
		System.out.println(totalTV);

		
		/**
		 * se recorre la lista y se usa instanceof para separar la Clase
		 * Lavadorar del Array e imprime.
		 */
		System.out.println("\nLavadora");
		double totalLavadora = 0;
		for (int i = 0; i<lista.length;i++) {
			if (lista[i] instanceof Lavadora) {
				System.out.println(lista[i].precioFinal());
				totalLavadora+= lista[i].precioFinal();
			}	
		}
		System.out.println("------------");
		System.out.println(totalLavadora);
		
		
		/**
		 * se recorre la lista y se usa instanceof para separar la Clase
		 * electrodomestico del Array e imprime.
		 * En este caso, todos los objetos del Array son electrodomesticos
		 */
		System.out.println("\nElectrodomestico");
		double totalElectro = 0;
		for (int i = 0; i<lista.length;i++) {
			if (lista[i] instanceof Electrodomestico) {				
				System.out.println(lista[i].precioFinal());
				totalElectro += lista[i].precioFinal();
			}
		}
		System.out.println("------------");
		System.out.println(totalElectro);

	}	
}
