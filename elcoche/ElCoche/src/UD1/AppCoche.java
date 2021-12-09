/**
 * 
 */
package UD1;

/**
 * @author nayra.deniz
 *
 */
public class AppCoche {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coche micoche;
		micoche = new Coche();
		micoche.cilindrada = 135;
		micoche.color = "gris";
		micoche.precio = 15000.00;
		micoche.isArrancado = false;
		
//		System.out.printf("El coche es de color %s y su precio es %.0f", 
//				micoche.color, micoche.precio);
		
		micoche.verCoche();
		micoche.arrancar();
		micoche.verCoche();
		
		
		
	}

}
