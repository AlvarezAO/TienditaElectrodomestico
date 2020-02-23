package tienda;

/**
 * Clase Lavadora.
 * @author Alvaro Alvarez
 * @version 2.0
 * @see https://github.com/AlvarezAO/TienditaElectrodomestico
 */

public class Lavadora extends Electrodomestico {

	// Constante
	private static final int CARGA_CONS = 5;
	
	//Atributo
	private int carga;
	
	/**
	 * Construcrot por defecto
	 */
	public Lavadora() {
		super();
		this.carga = CARGA_CONS;
	}

	/**
	 * Constructor con 2 parametros
	 */
	public Lavadora(double precioBase, int peso) {
		super(precioBase, peso);
		this.carga = CARGA_CONS;
	}
	
	/**
	 * Constructor con todos sus parametros Clase Padre 
	 * mas atributo hijo
	 * @param precioBase
	 * @param peso
	 * @param consumoEnergia
	 * @param color
	 * @param carga
	 */
	public Lavadora(double precioBase, int peso, char consumoEnergia, String color, int carga) {
		super(precioBase, peso, consumoEnergia, color);
		this.carga = carga;
	}
	
	public int getCarga() {
		return carga;
	}
	
	/**
	 * Metodo precio final 
	 */
	public double precioFinal() {		
		double precioLavadora = 0;
		
		if (this.carga < 30) {
			precioLavadora = 0;
		} else {
			precioLavadora = 50;
		}
		
		return super.precioFinal() + precioLavadora;
	}
	
	
}
