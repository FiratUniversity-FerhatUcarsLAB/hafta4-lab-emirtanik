/*
 * Ad Soyad: Muhammed Emir Tanık
 * Ogrenci No:250541089
 * Tarih:6.11.2025
 * Aciklama: Gorev 1 - Ogrenci Bilgi Sistemi
 * 
 * Bu program kullanicidan ogrenci bilgilerini alir ve
 * duzenli bir formatta ekrana yazdirir.
 * Diğer java dosyalarının başında da bu örnek formattaki gibi kısa bilgi giriniz
 */

import java.util.Scanner;

public class OgrenciBilgi {
    public static void main(String[] args) {
      		//scanner sınıfını açtım öncelikle
		Scanner scanner=new Scanner(System.in);
		
		
		//kullanıcıdan isim bilgisi almak için ekrana printle yazı çıkarttım 
		System.out.print("İSMİNİZİ GİRİNİZ:");
		String isim = scanner.nextLine();
		
		
		//burda da aynı şekilde soyad için aynı işlemi yaptım
		System.out.print("SOYADINIZI GİRİNİZ:");
		String soyad = scanner.nextLine();
		
		//sırasıyla hepsi için aynı şeyi yaptım
		System.out.print("ÖĞRENCİ NUMARANIZI GİRİNİZ:");
		int okulno=scanner.nextInt();
		System.out.print("YAŞINIZI GİRİNİZ:");
		int yasınız= scanner.nextInt();
		
		
		//gpa için double kullandım çünkü gpa genellikle tam sayı olmaz
		System.out.print("GPA'NIZI GİRİNİZ:");
		double gpa=scanner.nextDouble();
		
		
		//aldığım girdileri çıktı olarak çıkarttım.
		System.out.println("\n=== OGRENCI BILGI SISTEMI ===");
		System.out.println("İsminiz: "+ isim );
		System.out.println("Soyisminiz: "+ soyad);
		System.out.println("Okul Numaranız: "+ okulno);
		System.out.println("Yaşınız: "+yasınız);
		System.out.println("Gpanız: "+ gpa  );
		
		//scanneri kapatır bu kod
		
		scanner.close();

		

	}

}

       
        
    //ÇÖZÜM : BU KODLARI HEPSİNİ KENDİM YAZDIM GİRDİ ALIRKEN PRİNTLN YERİNE PRİNT KULLANMA SEBEBİM 
    //GİRDİYİ ALIRKEN ALTA İNMEYİP YANINA YAZMASI DAHA İYİ BİR GÖRÜNTÜ SAĞLAR

        
