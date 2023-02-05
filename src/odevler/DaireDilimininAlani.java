package odevler;

import java.util.Scanner;

public class DaireDilimininAlani {

	public static void main(String[] args) {
		
		double pi = 3.14;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dairenin yarıçapını giriniz: ");
		double yaricap = scanner.nextDouble();
		
		System.out.println("Daire diliminin merkez açısınız giriniz: ");
		double aci = scanner.nextDouble();
		
		double alan = ((pi * (yaricap * yaricap) * aci) /360);
		
		System.out.println("Girdiğiniz değerlere sahip daire diliminin alanı: " + alan);
		
		
		
		
		
		
		
		
		
		
		

	}

}
