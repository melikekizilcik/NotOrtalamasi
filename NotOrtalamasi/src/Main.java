import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		//scanner s�n�f� tan�mlama:
		Scanner input = new Scanner(System.in);
		
		//de�i�kenleri tan�mlama:
		double matematik, fizik, kimya, turkce, tarih, muzik;
		
		
		//kullan�c�dan veri alma:
		System.out.print("Matemik notunuzu giriniz:");
		matematik = input.nextDouble();
		
		System.out.print("Fizik notunuzu giriniz:");
		fizik = input.nextDouble();
		
		System.out.print("Kimya notunuzu giriniz:");
		kimya = input.nextDouble();
		
		System.out.print("T�rk�e notunuzu giriniz:");
		turkce = input.nextDouble();
		
		System.out.print("Tarih notunuzu giriniz:");
		tarih = input.nextDouble();
		
		System.out.print("M�zik notunuzu giriniz:");
		muzik = input.nextDouble();
		

		//ortalama bulma i�lemleri:
		double toplam = matematik + fizik + kimya + turkce + tarih + muzik;
		double ortalama = toplam / 6;
		System.out.println("Ortalaman�z:" + ortalama);
		
		//Ko�ul:
		boolean kosul = ortalama>=60;
		
		String str = (kosul) ? "S�n�f� ge�ti" : "S�n�fta kald�";
		
		System.out.println(str);
	}

}
