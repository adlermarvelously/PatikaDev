package odevler;

import java.util.Scanner;

public class BurcBulanProgram {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Kaçıncı ayda doğdunuz?\n(1 ile 12 arasında bir değer giriniz)");
		int month = scanner.nextInt();

		System.out.println("Ayın kaçıncı günü doğdunuz?\n(1 ile 30 arasında bir değer giriniz)");
		int day = scanner.nextInt();

		if (month == 1) {
			if (day < 21 && day >= 1) {
				System.out.println("Oğlak burcusunuz.");
			} else if (day >= 22 && day <= 30) {
				System.out.println("Kova burcusunuz.");
			} else
				System.out.println("Geçerli olmayan gün aralığı.\nLütfen geçerli bir değer aralığı giriniz: \n(1-30)");
		}

		else if (month == 2) {
			if (day <= 19 && day >= 1) {
				System.out.println("Kova burcusunuz.");
			} else if (day >= 20 && day <= 30) {
				System.out.println("Balık burcusunuz.");
			} else
				System.out.println("Lütfen geçerli bir değer aralığı giriniz: \n(1-30)");
		}

		else if (month == 3) {
			if (day < 21 && day >= 1) {
				System.out.println("Balık burcusunuz.");
			} else if (day >= 21 && day <= 30) {
				System.out.println("Koç burcusunuz.");
			} else
				System.out.println("Lütfen geçerli bir değer aralığı giriniz: \n(1-30)");
		}

		else if (month == 4) {
			if (day < 21 && day >= 1) {
				System.out.println("Koç burcusunuz.");
			} else if (day > 22 && day <= 30) {
				System.out.println("Boğa burcusunuz.");
			} else
				System.out.println("Lütfen geçerli bir değer aralığı giriniz: \n(1-30)");
		}

		else if (month == 5) {
			if (day < 22 && day >= 1) {
				System.out.println("Boğa burcusunuz.");
			} else if (day >= 22 && day <= 30) {
				System.out.println("İkizler burcusunuz.");
			} else
				System.out.println("Lütfen geçerli bir değer aralığı giriniz: \n(1-30)");
		}

		else if (month == 6) {
			if (day <= 22 && day >= 1) {
				System.out.println("İkizler burcusunuz.");
			} else if (day >= 23 && day <= 30) {
				System.out.println("Yengeç burcusunuz.");
			} else
				System.out.println("Lütfen geçerli bir değer aralığı giriniz: \n(1-30)");
		}

		else if (month == 7) {
			if (day <= 22 && day >= 1) {
				System.out.println("Yengeç burcusunuz.");
			} else if (day >= 23 && day <= 30) {
				System.out.println("Aslan burcusunuz.");
			} else
				System.out.println("Lütfen geçerli bir değer aralığı giriniz: \n(1-30)");
		}

		else if (month == 8) {
			if (day <= 22 && day >= 1) {
				System.out.println("Aslan burcusunuz.");
			} else if (day >= 23 && day <= 30) {
				System.out.println("Başak burcusunuz.");
			} else
				System.out.println("Lütfen geçerli bir değer aralığı giriniz: \n(1-30)");
		}

		else if (month == 9) {
			if (day <= 22 && day >= 1) {
				System.out.println("Başak burcusunuz.");
			} else if (day >= 23 && day <= 30) {
				System.out.println("Terazi burcusunuz.");
			} else
				System.out.println("Lütfen geçerli bir değer aralığı giriniz: \n(1-30)");
		}

		else if (month == 10) {
			if (day < 23 && day >= 1) {
				System.out.println("Terazi burcusunuz.");
			} else if (day >= 23 && day <= 30) {
				System.out.println("Akrep burcusunuz.");
			} else
				System.out.println("Lütfen geçerli bir değer aralığı giriniz: \n(1-30)");
		}

		else if (month == 11) {
			if (day <= 21 && day >= 1) {
				System.out.println("Akrep burcusunuz.");
			} else if (day >= 22 && day <= 30) {
				System.out.println("Yay burcusunuz.");
			} else
				System.out.println("Lütfen geçerli bir değer aralığı giriniz: \n(1-30)");
		}

		else if (month == 12) {
			if (day <= 21 && day >= 1) {
				System.out.println("Yay burcusunuz.");
			} else if (day >= 22 && day <= 31) {
				System.out.println("Oğlak burcusunuz.");
			} else
				System.out.println("Lütfen geçerli bir değer aralığı giriniz: \n(1-30)");
		}

		else {
			System.out.println("Geçerli olmayan ay aralığı.\nLütfen tekrar deneyiniz.\n(1-12)");
		}

	}

}
