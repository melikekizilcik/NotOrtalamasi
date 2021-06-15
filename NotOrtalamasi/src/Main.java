import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		//scanner sýnýfý tanýmlama:
		Scanner input = new Scanner(System.in);
		
		//deðiþkenleri tanýmlama:
		double matematik, fizik, kimya, turkce, tarih, muzik;
		
		
		//kullanýcýdan veri alma:
		System.out.print("Matemik notunuzu giriniz:");
		matematik = input.nextDouble();
		
		System.out.print("Fizik notunuzu giriniz:");
		fizik = input.nextDouble();
		
		System.out.print("Kimya notunuzu giriniz:");
		kimya = input.nextDouble();
		
		System.out.print("Türkçe notunuzu giriniz:");
		turkce = input.nextDouble();
		
		System.out.print("Tarih notunuzu giriniz:");
		tarih = input.nextDouble();
		
		System.out.print("Müzik notunuzu giriniz:");
		muzik = input.nextDouble();
		

		//ortalama bulma iþlemleri:
		double toplam = matematik + fizik + kimya + turkce + tarih + muzik;
		double ortalama = toplam / 6;
		System.out.println("Ortalamanýz:" + ortalama);
		
		//Koþul:
		boolean kosul = ortalama>=60;
		
		String str = (kosul) ? "Sýnýfý geçti" : "Sýnýfta kaldý";
		
		System.out.println(str);
	}

}
