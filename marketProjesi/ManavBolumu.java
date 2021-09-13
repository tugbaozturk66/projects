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
 *  Basrili Market al��-veri� program�.
 
 *{d,p,...l} {2.10,3.20....0.50}
 * 1. Ad�m: �r�nler ve fiyatlar� i�eren listeleri olu�turunuz.
 * 			No 	   �r�n 		  Fiyat
		   ====	 =======	 	=========
			00	 Domates   	 	 2.10 TL
			01	 Patates   	 	 3.20 TL
			02	 Biber     	 	 1.50 TL
			03	 So�an      	 2.30 TL
			04	 Havu�     	   	 3.10 TL
			05	 Elma      	   	 1.20 TL
			06	 Muz     	 	 1.90 TL
			07	 �ilek 	 		 6.10 TL
			08	 Kavun      	 4.30 TL
			09	 �z�m      	 	 2.70 TL
			10	 Limon     	 	 0.50 TL

 * 2. Ad�m: Kullan�c�n�n �r�n nosuna g�re listeden �r�n se�mesini isteyiniz.
 * 3. Ad�m: Ka� kg sat�n almak istedi�ini sorunuz.
 * 4. Ad�m: Al�nacak bu �r�n� sepete ekleyiniz ve Sepeti yazd�r�n�z.
 * 5. Ba�ka bir �r�n al�p almak istemedi�ini sorunuz.
 * 6. E�er devam etmek istiyorsa yeniden �r�n se�me k�sm�na y�nlendiriniz.
 * 7. E�er bitirmek istiyorsa �deme k�sm�na ge�iniz ve �deme sonras�nda program� bitiriniz
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
