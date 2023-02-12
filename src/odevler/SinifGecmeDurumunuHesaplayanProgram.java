package odevler;

import java.util.Scanner;

public class SinifGecmeDurumunuHesaplayanProgram {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Lütfen matematik notunuzu giriniz: ");
		int mat = scanner.nextInt();

		System.out.println("Lütfen fizik notunuzu giriniz: ");
		int fizik = scanner.nextInt();

		System.out.println("Lütfen türkçe notunuzu giriniz: ");
		int turkce = scanner.nextInt();

		System.out.println("Lütfen müzik notunuzu giriniz: ");
		int muzik = scanner.nextInt();

		int ortalama = 0;
		int i = 0;

		if (mat < 100 && mat > 0) {
			ortalama += mat;
			i++;
		}

		if (fizik < 100 && fizik > 0) {
			ortalama += fizik;
			i++;
		}

		if (turkce < 100 && turkce > 0) {
			ortalama += turkce;
			i++;
		}

		if (muzik < 100 && muzik > 0) {
			ortalama += muzik;
			i++;
		}

		ortalama = ortalama / i;

		if (ortalama >= 55) {
			System.out.println("Ortalamanız: " + ortalama + "\nTebrikler geçtiniz!");
		}

		else {
			System.out.println("ortalamanız: " + ortalama + "\nKaldınız!");
		}

	}

}
