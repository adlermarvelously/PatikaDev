package odevler;

import java.util.Scanner;

public class DikUcgendeHipotenus {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Üçgenin birinci kenarını giriniz: ");
		double kenar1 = scanner.nextDouble();
		
		System.out.println("Üçgenin ikinci kenarını giriniz: ");
		double kenar2 = scanner.nextDouble();
		
		System.out.println("Üçgenin üçünçü kenarını giriniz: ");
		double kenar3 = scanner.nextInt();
		
		double yariCevre = (kenar1 + kenar2 + kenar3) / 2;
		
		double alan = Math.sqrt(yariCevre * (yariCevre - kenar1) * (yariCevre - kenar2) *(yariCevre - kenar3));
		
		System.out.println("Değerlerini girdiğiniz üçgenin alanı: " + alan);
	}

}
