import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int mat, fizik, kimya, turkce, tarih, muzik;
		int toplam = 0;
		float ort;
		
		System.out.println("Matematik Dersinizin Notunu Girin: ");
		mat = scan.nextInt();
		
		System.out.println("Fizik Dersinizin Notunu Girin: ");
		fizik = scan.nextInt();
		
		System.out.println("Kimya Dersinizin Notunu Girin: ");
		kimya = scan.nextInt();
		
		System.out.println("Türkçe Dersinizin Notunu Gİrin: ");
		turkce = scan.nextInt();
		
		System.out.println("Tarih Dersinizin Notunu Girin: ");
		tarih = scan.nextInt();
		
		System.out.println("Müzik Dersinizin Notunu Girin: ");
		muzik = scan.nextInt();
		
		toplam = (mat + fizik + kimya + turkce + tarih + muzik);
		ort = toplam / 6;
		
		System.out.println("Not Ortalamanız: " + ort);
		
		if(ort > 60) {
			System.out.println("Sınıfı Geçtiniz");
		}
		else{
			System.out.println("Sınıfta Kaldınız");
		}
	}

}
