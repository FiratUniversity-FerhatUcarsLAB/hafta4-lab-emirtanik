/*
 * Ad Soyad: Muhammed Emir Tanık
 * Ogrenci No:250541089
 * Tarih:6.11.2025
 * Aciklama: Gorev 3 -Maaş Hesap Bodrosu
 * 
 * Bu yazılım bir çalışanın mesai ücreti saatlik çalışması net ücretini hesaplamaktadır
 * Yazılımın amacı kullanıcıya net ve şeffaf bir maaş çizlgesi oluşturmaktır.
 * Yazılımın çoğunu kendim yazıp bazı ufak noktalarda llm den destek aldım 
 */
import java.util.Scanner;

public class MaasHesap {
	
	public static double SGK_KESİNTİSİ=0.14;
	public static double GELİR_VERGİSİ=0.15;
	public static double DAMGA_VERGİSİ=0.00759;

	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	
	System.out.print("İSİM SOYİSİM:");
	String isim=scanner.nextLine();
	
	
	System.out.print("AYLIK BRÜT MAAŞINIZ:");
	Double maas=scanner.nextDouble();
	
	System.out.print("HAFTALIK ÇALIŞMA SAATİNİZ:");
	int saat=scanner.nextInt();
	
	System.out.print("MESAİ SAYINIZ:");
	int mesai=scanner.nextInt();
	
	// mesai ücretini hesaplayacaz burada
	Double mesai_ucreti = (maas/160) * mesai * 1.5 ;
	// toplam geliri hesaplayacaz
	Double toplam_gelir=mesai_ucreti + maas ;
	//kesintileri hesaplayacaz
	//SGK KESİNTİSİ 
	Double sgk_kesinti= toplam_gelir * SGK_KESİNTİSİ;
	//GELİR VERGİSİ
	Double gelir_vergisi=toplam_gelir* GELİR_VERGİSİ;
	//DAMGA VERGİSİ
	Double damga_vergisi=toplam_gelir * DAMGA_VERGİSİ;
	//toplam kesinti 
	Double toplam_kesinti = sgk_kesinti +gelir_vergisi +damga_vergisi;
	//net maaş 
	Double net_maas= toplam_gelir - toplam_kesinti;
	// kesinti oranı
	Double oran= (toplam_kesinti/toplam_gelir) * 100 ;
	// saatlik net kazanç hesaplaması 
	Double saatlik_net_kazanc=net_maas/(mesai *saat);
	//günlük net kazancı 
	Double gunluk_kazanc=net_maas/(mesai*2.2);
	// Bordro çıktısı
	System.out.println("\n====================================");
	System.out.println("         MAAS BORDROSU");
	System.out.println("====================================");
	System.out.printf("Calisan: %-20s%n", isim);

	
	
	System.out.println("GELIRLER:");
	System.out.printf("  Brut Maas              : %10.2f TL%n", maas);
	System.out.printf("  Mesai Ucreti (%d saat) : %10.2f TL%n", mesai, mesai_ucreti);
	System.out.println("  ------------------------");
	System.out.printf("  TOPLAM GELIR           : %10.2f TL%n", toplam_gelir);
	System.out.println();
	
	System.out.println("KESINTILER:");
	System.out.printf("  SGK Kesintisi (14.0%%)  : %10.2f TL%n", sgk_kesinti);
	System.out.printf("  Gelir Vergisi (15.0%%)  : %10.2f TL%n", gelir_vergisi);
	System.out.printf("  Damga Vergisi (0.8%%)   : %10.2f TL%n", damga_vergisi);
	System.out.println("  ------------------------");
	System.out.printf("  TOPLAM KESINTI         : %10.2f TL%n", toplam_kesinti);
	System.out.println();
	
	System.out.printf("NET MAAS                 : %10.2f TL%n", net_maas);
	System.out.println();
	System.out.println("ISTATISTIKLER:");
	System.out.printf("  Kesinti Orani          : %5.1f%%%n", oran);
	System.out.printf("  Saatlik Net Kazanc     : %8.2f TL/saat%n", saatlik_net_kazanc);
	System.out.printf("  Gunluk Net Kazanc      : %8.2f TL/gun%n", gunluk_kazanc);
	System.out.println("====================================");

	scanner.close();
	
	
	
		
		
	}

}
