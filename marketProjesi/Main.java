package marketProjesiKendim;

import java.util.Scanner;

public class Main {
static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		double toplamTutar=0;
		String tercih;
		
		System.out.println("online alisverise hosgeldiniz");
		do{
		System.out.println("hangi reyondan alisveris yapmak istiyorsunuz\n1- manav\n2- market\n3- sarkuteri");
		int secim=scan.nextInt();
		
		if(secim==1) {
		ManavBolumu mnv=new ManavBolumu();
		mnv.manav();
		System.out.println("manav reyonundaki alisveris tutariniz: "+mnv.alisverisTutari);
		toplamTutar+=mnv.alisverisTutari;
		}
		else if(secim==2) {
		MarketBolumu mrk=new MarketBolumu();
		mrk.market();
		System.out.println("market reyonundaki alisveris tutariniz: "+mrk.alisverisTutari);
		toplamTutar+=mrk.alisverisTutari;
		}
		else if(secim==3) {
		SarkuteriReyonu skr=new SarkuteriReyonu();
		skr.sarkuteri();
		System.out.println("sarkuteri reyonundaki alisveris tutariniz: "+skr.alisverisTutari);
		toplamTutar+=skr.alisverisTutari;
		}
		System.out.println("baska reyondan alisveris yapmak istiyor musunuz E/H olarak belirtiniz");
		tercih=scan.next();
		}while(tercih.equalsIgnoreCase("E"));
		odeme(toplamTutar);
		
	}

	public static void odeme(double toplamTutar) {
		double odenenPara=0;
		System.out.println("odemeniz gereken tutar: "+toplamTutar+" TL");
		do{
		System.out.println("lutfen para girisi yapiniz");
		odenenPara+=scan.nextDouble();
		if(odenenPara<toplamTutar) 
			System.out.println("eksik tutar girdiniz " +(toplamTutar-odenenPara)+ " kadar para ilave ediniz");
			
		
		
	}while(!(odenenPara>=toplamTutar));
		System.out.println(odenenPara-toplamTutar+ " kadar para ustunuz bulunmaktadir.");
		System.out.println("bizi tercih ettiginiz icin tesekkur ederiz");
		}
}
