package odevler;

import java.util.Scanner;

public class KullaniciGirisi {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen kullanıcı adınızı giriniz: ");

		String ad = scanner.nextLine();

		System.out.println("Lütfen şifrenizi giriniz: ");

		String sifre = scanner.nextLine();

		if (sifre.equals("232323") && ad.equals("merve")) {
			System.out.println("Başarılı giriş!");
		} else {
			System.out
					.print("Kullanıcı bilgileri hatalı.\nYeni bir şifre oluşturmak ister misiniz ?\n1-Evet\n2-Hayır\n");
			int secim;
			secim = scanner.nextInt();
			String newPassword;
			Scanner input = new Scanner(System.in);
			switch (secim) {
			case 1:
				System.out.println("Yeni şifrenizi girin : ");
				newPassword = input.nextLine();

				if (newPassword.equals("232323")) {
					System.out.println("Yeni şifre eskisiyle aynı olamaz!");
				} else {
					System.out.println("Şifre başarıyla oluşturuldu.");
				}
				break;
			case 2:
				System.out.println("İşlem iptal edildi.");
				break;
			default:
				System.out.println("Geçersiz işlem girildi.");
			}

		}

	}

}
