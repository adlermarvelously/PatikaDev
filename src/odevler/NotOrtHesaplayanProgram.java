package odevler;

import java.util.Scanner;

public class NotOrtHesaplayanProgram {

	public static void main(String[] args) {

		double ortalama;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Lütfen Matematik dersi notunuzu giriniz :");
		double matematik = scanner.nextDouble();

		System.out.println("Lütfen Fizik dersi notunuzu giriniz :");
		double fizik = scanner.nextDouble();

		System.out.println("Lütfen Kimya dersi notunuzu giriniz :");
		double kimya = scanner.nextDouble();

		System.out.println("Lütfen Türkçe dersi notunuzu giriniz :");
		double turkce = scanner.nextDouble();

		System.out.println("Lütfen Tarih dersi notunuzu giriniz :");
		double tarih = scanner.nextDouble();

		System.out.println("Lütfen Müzik dersi notunuzu giriniz :");
		double muzik = scanner.nextDouble();

		ortalama = (matematik + fizik + kimya + turkce + tarih + muzik) / 6;
		boolean kosul1 = (ortalama == 60);
		boolean kosul = (ortalama > 60);

		String str = kosul1 ? "Geçtiniz!" : "Kaldınız!";

		System.out.println("Ortalamanız: " + ortalama + "\n" + str);

	}

}
