package tienda;

	/**
	 * Programa Final de Modulo.
	 * Clase Electrodomestico
	 * @author Alvaro Alvarez
	 * @version 2.0
	 * @see https://github.com/AlvarezAO/TienditaElectrodomestico
	 */

public class Electrodomestico {
	
	//Constantes
	/**
	 * Creacion de constantes
	 */
	private final static double PRECIO_BASE_CONS = 100000;
	private final static int PESO_CONS = 5;
	private final static char CONSUMO_CONS = 'f';
	private final static String COLOR_CONS = "Blanco";
	
	
	
	//Atributos
	/**
	 * Creacion de atributos
	 */
	private double precioBase;
	private int peso;
	private char consumoEnergia;
	private String color;
	
	
	
	/**
	 * Constructor por defecto usando constantes
	 */
	public Electrodomestico() {				
		this.precioBase = PRECIO_BASE_CONS;
		this.peso = PESO_CONS;
		this.consumoEnergia = CONSUMO_CONS;
		this.color = COLOR_CONS;		
	}
	
	/**
	 * Constructor con 2 parametros
	 * @param precioBase
	 * @param peso
	 */
	public Electrodomestico(double precioBase, int peso) {
		this.precioBase = precioBase;
		this.peso = peso;
		this.consumoEnergia = CONSUMO_CONS;
		this.color = COLOR_CONS;
	}
	
	/**
	 * Constructor con todos sus parametros
	 * @param precioBase
	 * @param peso
	 * @param consumoEnergia
	 * @param color
	 */
	public Electrodomestico(double precioBase, int peso, char consumoEnergia, String color) {
		this.precioBase = precioBase;
		this.peso = peso;
		comprobarConsumo(consumoEnergia);
		comprobarColor(color);
	}

	//Get and Set
	public double getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public char getConsumoEnergia() {
		return consumoEnergia;
	}

	public int getPeso() {
		return peso;
	}
	
	/**
	 * Metodo donde comprueba que el consumo sea entre A y F
	 * o deja el valor por defecto
	 * @param energy
	 */
	public void comprobarConsumo(char energy) {
		if (energy == 'a' || energy == 'A'||
			energy == 'b' || energy == 'B'||
			energy == 'c' || energy == 'C'||
			energy == 'd' || energy == 'D'||
			energy == 'e' || energy == 'E'||
			energy == 'f' || energy == 'F') {
			
			this.consumoEnergia = energy;
			
		} else {
			
			this.consumoEnergia = CONSUMO_CONS;
		}
	}
	
	/**
	 * Metodo que comprueba el color ingresado sea uno correcto
	 * o deja el valor por defecto
	 * @param ingresoColor
	 */
	public void comprobarColor(String ingresoColor) {
		if (ingresoColor.equalsIgnoreCase("Negro") ||
			ingresoColor.equalsIgnoreCase("Rojo") ||
			ingresoColor.equalsIgnoreCase("Azul") ||
			ingresoColor.equalsIgnoreCase("Gris")) {
			
			this.color = ingresoColor;
			
		} else {
			
			this.color = COLOR_CONS;
		}
	}
	
	/**
	 * metodo que retorna el precio total del electrodomestico
	 * calculando el valor del consumo y el valor del peso
	 * @return total
	 */
	public double precioFinal() {
		double precioConsumo = 0;
		double precioPeso = 0;
		
		
		if (this.consumoEnergia == 'a' || this.consumoEnergia == 'A') {			
			precioConsumo = 100;
		} else if (this.consumoEnergia == 'b' || this.consumoEnergia == 'B') {			
			precioConsumo = 80;
		} else if (this.consumoEnergia == 'c' || this.consumoEnergia == 'C') {			
			precioConsumo = 60;
		} else if (this.consumoEnergia == 'd' || this.consumoEnergia == 'D') {			
			precioConsumo = 50;
		} else if (this.consumoEnergia == 'e' || this.consumoEnergia == 'E') {			
			precioConsumo = 30;
		} else {
			precioConsumo = 10;
		}
		
		if (this.peso > 0 && this.peso <= 19) {
			precioPeso = 10;
		} else if (this.peso >= 20 && this.peso <= 49) {
			precioPeso = 50;
		} else if (this.peso >= 50 && this.peso <= 79) {
			precioPeso = 80;
		} else if (this.peso >= 80) {
			precioPeso = 100;
		}
		
		double total = precioConsumo + precioPeso;
		return total;
	}
	

}
