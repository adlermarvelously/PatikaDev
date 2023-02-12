package odevler;

import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlikOnerenProgram {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Lütfen hava sıcaklığını giriniz: ");

		int heat = scanner.nextInt();

		if (heat <= 5) {
			System.out.println("Kayağa gidebilirsiniz.");
		}

		else if (heat > 5 && heat <= 10) {
			System.out.println("Sinemaya gidebilirsiniz.");
		} else if (heat > 10 && heat <= 15) {
			System.out.println("Sinemaya ya da pikniğe gidebilirsiniz.");
		}

		else if (heat > 15 && heat <= 25) {
			System.out.println("Pikniğe gidebilirsiniz.");
		}

		else {
			System.out.println("Yüzmeye gidebilirsiniz.");
		}

	}

}
