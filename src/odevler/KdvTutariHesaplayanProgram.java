package odevler;

import java.util.Scanner;

public class KdvTutariHesaplayanProgram {

	public static void main(String[] args) {

		double kdv1 = 0.18;
		double kdv2 = 0.08;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen para miktarını giriniz: ");

		double girilenDeger = scanner.nextDouble();

		if (girilenDeger > 0 && girilenDeger < 1000) {
			double kdvTutar1 = girilenDeger * kdv1;
			System.out.println("KDV tutarı: " + kdvTutar1 + "\nKDV'li fiyat: " + (kdvTutar1 + girilenDeger));
		} else {
			double kdvTutar2 = girilenDeger * kdv2;
			System.out.println("KDV tutarı: " + kdvTutar2 + "\nKDV'li fiyat: " + (kdvTutar2 + girilenDeger));
		}

	}
}
