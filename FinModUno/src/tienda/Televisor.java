package tienda;

/**
 * Clase Televisor.
 * @author Alvaro Alvarez
 * @version 2.0
 * @see https://github.com/AlvarezAO/TienditaElectrodomestico
 */
	public class Televisor extends Electrodomestico {
		
		//Atributos
		private int resolucion;
		private boolean TDT;
		
		public Televisor() {
			super();
			this.resolucion = 20;
			this.TDT = false;
		}
		
		public Televisor(double precioBase, int peso) {
			super(precioBase, peso);
			this.resolucion = 20;
			this.TDT = false;
		}
		
		public Televisor(double precioBase, int peso, char consumoEnergia, String color, int resolucion, boolean TDT) {
			super(precioBase, peso, consumoEnergia, color);
			this.resolucion = resolucion;
			this.TDT = TDT;
		}

		public boolean isTDT() {
			return TDT;
		}

		public int getResolucion() {
			return resolucion;
		}
		
		/**
		 * Metodo precio final, llama metodo de clase padre
		 */
		public double precioFinal() {
			double precioTV = 0;
			double precioTDT = 0;
			
			if (this.resolucion > 40) {
				precioTV = getPrecioBase() * 0.3;
			} else {
				precioTV = 0;
			}
			
			if (!isTDT()) {
				precioTDT = 0;
			} else {
				precioTDT = 50;
			}
			
			return super.precioFinal() + precioTV + precioTDT;
		}
	
	}
