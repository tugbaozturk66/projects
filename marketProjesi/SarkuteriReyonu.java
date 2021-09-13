package marketProjesiKendim;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SarkuteriReyonu {
	String secim;
	double alisverisTutari=0;
	
	
	List<String> urunler=new ArrayList<>(Arrays.asList("Peynir","Zeytin","Sucuk","Salam","Sosis"));
	List<Double> fiyatlar=new ArrayList<>(Arrays.asList(20.10,12.50,30.00,16.00,12.00));
	List<String> sepettekiUrunler=new ArrayList<>();
	List<Double> sepettekiKilo=new ArrayList<>();
	List<Double> sepettekiToplam=new ArrayList<>();
	
	public void sarkuteri(){
	
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
		System.out.println("sarkuteriye hosgeldiniz");
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
