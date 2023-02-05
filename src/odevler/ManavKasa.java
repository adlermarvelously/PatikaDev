package odevler;

import java.util.Scanner;

public class ManavKasa {

	public static void main(String[] args) {

		double armut = 2.14;
		double elma = 3.67;
		double domates = 1.11;
		double muz = 0.95;
		double patlıcan = 5.00;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Kaç kilo armut aldınız? ");
		double kiloa = scanner.nextDouble();

		System.out.println("Kaç kilo elma aldınız? ");
		double kiloe = scanner.nextDouble();

		System.out.println("Kaç kilo domates aldınız? ");
		double kilod = scanner.nextDouble();

		System.out.println("Kaç kilo muz aldınız? ");
		double kilom = scanner.nextDouble();

		System.out.println("Kaç kilo patlıcan aldınız? ");
		double kilop = scanner.nextDouble();

		double tutar = armut * kiloa + elma * kiloe + domates * kilod + muz * kilom + patlıcan * kilop;

		System.out.println("Toplam tutar: " + tutar);

	}

}
