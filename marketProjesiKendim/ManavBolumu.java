package marketProjesiKendim;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*/*
 * ilk programa girildiginde bizi bir menu karsilasino menude 3 secenek olsun. bu secenekler
 * 1 manav
 * 2 satkuteri
 * 3 market
 *  Basrili Market alýþ-veriþ programý.
 
 *{d,p,...l} {2.10,3.20....0.50}
 * 1. Adým: Ürünler ve fiyatlarý içeren listeleri oluþturunuz.
 * 			No 	   Ürün 		  Fiyat
		   ====	 =======	 	=========
			00	 Domates   	 	 2.10 TL
			01	 Patates   	 	 3.20 TL
			02	 Biber     	 	 1.50 TL
			03	 Soðan      	 2.30 TL
			04	 Havuç     	   	 3.10 TL
			05	 Elma      	   	 1.20 TL
			06	 Muz     	 	 1.90 TL
			07	 Çilek 	 		 6.10 TL
			08	 Kavun      	 4.30 TL
			09	 Üzüm      	 	 2.70 TL
			10	 Limon     	 	 0.50 TL

 * 2. Adým: Kullanýcýnýn ürün nosuna göre listeden ürün seçmesini isteyiniz.
 * 3. Adým: Kaç kg satýn almak istediðini sorunuz.
 * 4. Adým: Alýnacak bu ürünü sepete ekleyiniz ve Sepeti yazdýrýnýz.
 * 5. Baþka bir ürün alýp almak istemediðini sorunuz.
 * 6. Eðer devam etmek istiyorsa yeniden ürün seçme kýsmýna yönlendiriniz.
 * 7. Eðer bitirmek istiyorsa ödeme kýsmýna geçiniz ve ödeme sonrasýnda programý bitiriniz
 */

public class ManavBolumu {
	
	String secim;
	double alisverisTutari=0;
	
	
	List<String> urunler=new ArrayList<>(Arrays.asList("Domates","Patates","Biber","Sogan","Havuc","Elma","Muz","Cilek","Kavun","Uzum","Limon"));
	List<Double> fiyatlar=new ArrayList<>(Arrays.asList(2.10,3.20,1.50,2.30,3.10,1.20,1.90,6.10,4.30,2.70,0.50));
	List<String> sepettekiUrunler=new ArrayList<>();
	List<Double> sepettekiKilo=new ArrayList<>();
	List<Double> sepettekiToplam=new ArrayList<>();
	
	public void manav(){
	
	Scanner scan=new Scanner(System.in);
	do{
		urunleriListele(urunler,fiyatlar);
	double toplamTutar=0;
	
	System.out.println("almak istediginiz urun kodunu giriniz");
	int urunNo=scan.nextInt();
	System.out.println("kac kilo almak istediginizi belirtiniz");
	double kilo=scan.nextDouble();
	
	sepettekiUrunler.add(urunler.get(urunNo));
	sepettekiKilo.add(kilo);
	sepettekiToplam.add(kilo*fiyatlar.get(urunNo));
	System.out.println("=========SEPETTEKI URUNLER========================");
	for (int i = 0; i < sepettekiUrunler.size(); i++) {
	System.out.println(sepettekiUrunler.get(i)+"\t\t"+sepettekiKilo.get(i)+" kg\t\t"+sepettekiToplam.get(i)+" TL");
	toplamTutar+=sepettekiToplam.get(i);
	}
	alisverisTutari=toplamTutar;
	System.out.println("sepetteki toplam tutariniz: \t"+toplamTutar+" TL");
	System.out.println("devam etmek istiyor musunuz E/H olarak belirtiniz");
	secim=scan.next();
	}while(secim.equalsIgnoreCase("E"));
		
}
	

	public static void urunleriListele(List<String> urunler, List<Double> fiyatlar) {
		System.out.println("manava hosgeldiniz");
		System.out.println("urunNo\turunler\t\tfiyatlar");
		System.out.println("=========================================");
		for (int i = 0; i < urunler.size(); i++) {
			if(i<10) {
			System.out.println("0"+i+"\t"+urunler.get(i)+"\t\t"+fiyatlar.get(i));
			}else {
				System.out.println(i+"\t"+urunler.get(i)+"\t\t"+fiyatlar.get(i));
			}
		}
		
	}
}
