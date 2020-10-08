import java.util.Scanner;

	public class EjercicioUNO {
		/*
		* Programa que realice la conversion de grados celsius
		* a Fahrenheit
		* Los grados celsius debe introducirlos el usuario
		*/
	
	
	private static	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Indica los grados celsius");
		double gradosCelsius= sc.nextDouble();
		double Fahrenheit = (gradosCelsius * 1.8) + 32;
		System.out.println(gradosCelsius 
				+ " grados son "
				+ Fahrenheit
				+ " grados fahrenheit");
	}

}
