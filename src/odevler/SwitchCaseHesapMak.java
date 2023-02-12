package odevler;

import java.util.Scanner;

public class SwitchCaseHesapMak {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen işlem seçiniz:" + "\n1- Toplama" + "\n2- Çıkarma" + "\n3- Çarpma" + "\n4- Bölme");
		int secim = scanner.nextInt();

		System.out.println("Lütfen ilk sayıyı giriniz: ");
		int sayi1 = scanner.nextInt();

		System.out.println("Lütfen ikinci sayıyı giriniz: ");
		int sayi2 = scanner.nextInt();

		switch (secim) {

		case 1:
			int toplam = sayi1 + sayi2;
			System.out.println("Toplam: " + toplam);

			break;

		case 2:
			int fark = sayi1 - sayi2;
			System.out.println("Fark: " + fark);
			break;

		case 3:
			int carpim = sayi1 * sayi2;
			System.out.println("Çarpım: " + carpim);
			break;

		case 4:
			int bolum = sayi1 / sayi2;
			System.out.println("Bölüm: " + bolum);
			break;

		default:
			break;
		}

	}

}
