/*
 * Ad Soyad: Muhammed Emir Tanık
 * Ogrenci No:250541089
 * Tarih:6.11.2025
 * Aciklama: Gorev 2 - MATEMATİKSEL HESAP
 * 
 * Bu program kullanicidan yarı çapı alıp 
 * Bunu bir dairenin alan,cevre,kürenin alanı,cevresi,ve çap hesaplamasını sağlar
*/

package algoLab;

import java.util.Scanner;

public class alan_hesaplayıcı {
	public static final double PI = 3.14159;
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
	 System.out.print("YARI ÇAPI GİRİNİZ(örn:2,0):" );
		Double yaricap=scanner.nextDouble();
		Double alan= Math.pow(yaricap, 2.0) * PI ;
		Double cevre =2.0 * PI * yaricap;
		Double cap = 2.0 * yaricap;
		Double hacim=(4.0/3.0)* PI* Math.pow(yaricap, 3);
		Double y_alan= 4.0 * PI *Math.pow(yaricap, 2);
		
		
		 System.out.printf("%n=== HESAPLAMA SONUÇLARI ===%n");
	        System.out.printf("Yarıçap     : %.2f%n", yaricap );
	        System.out.printf("Çap         : %.2f%n", cap);
	        System.out.printf("Alan        : %.2f%n", alan);
	        System.out.printf("Çevre       : %.2f%n", cevre);
	        System.out.printf("Küre Hacmi  : %.2f%n", hacim);
	        System.out.printf("Küre Yüzey Alanı : %.2f%n", y_alan);

	  
		scanner.close();
		
	}

}
