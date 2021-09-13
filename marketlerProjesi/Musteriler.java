package marketlerProjesi;

import java.util.Scanner;


public class Musteriler {
	Abstract01 fiyatlar;
	static int secim=0;
	static int toplamfiyat=0;
	static String devam;
	Scanner scan=new Scanner(System.in);
	public void alisveris() {
		
		System.out.println("Online markete hosgeldiniz");
		do{
		
		System.out.println("ne almak istediginiz seciniz \n1)ekmek\n2)cikolata\n3)cips\n4)kola\n5)dondurma\n6)ccikis");
	secim=scan.nextInt();
	if(secim==1) {
		System.out.println("ekmek hesaplamasi");
		System.out.println("kac ekmek almak istiyorsunuz");
		int x=scan.nextInt();
		System.out.println("ekmek fiyati: "+fiyatlar.ekmekAl(x)/x);
		System.out.println("toplam fiyat: "+fiyatlar.ekmekAl(x));
		toplamfiyat+=fiyatlar.ekmekAl(x);
	}else if(secim==2){
		System.out.println("cikolata hesaplamasi");
		System.out.println("kac cikolata almak istiyorsunuz");
		int x=scan.nextInt();
		System.out.println("cikolata fiyati: "+fiyatlar.cikolataAl(x)/x);
		System.out.println("toplam fiyat: "+fiyatlar.cikolataAl(x));
		toplamfiyat+=fiyatlar.cikolataAl(x);
	}else if(secim==3) {
		System.out.println("cips hesaplamasi");
		System.out.println("kac cips almak istiyorsunuz");
		int x=scan.nextInt();
		System.out.println("cips fiyati: "+fiyatlar.cipsAl(x)/x);
		System.out.println("toplam fiyat: "+fiyatlar.cipsAl(x));
		toplamfiyat+=fiyatlar.cipsAl(x);
	}else if(secim==4) {
		System.out.println("kola hesaplamasi");
		System.out.println("kac kutu kola almak istiyorsunuz");
		int x=scan.nextInt();
		System.out.println("kola fiyati: "+fiyatlar.kolaAl(x)/x);
		System.out.println("toplam fiyat: "+fiyatlar.kolaAl(x));
		toplamfiyat+=fiyatlar.kolaAl(x);
	}else if(secim==5) {
		System.out.println("dondurma hesaplamasi");
		System.out.println("kac kutu dondurma almak istiyorsunuz");
		int x=scan.nextInt();
		System.out.println("dondurma fiyati: "+fiyatlar.dondurmaAl(x)/x);
		System.out.println("toplam fiyat: "+fiyatlar.dondurmaAl(x));
		toplamfiyat+=fiyatlar.dondurmaAl(x);
		
	}else System.out.println();
	System.out.println("devam etmek istiyor musunuz(E/H)");
	devam=scan.next();
	}while(devam.equalsIgnoreCase("E"));
		System.out.println("odeyeceginiz toplam tutar: "+toplamfiyat);
		System.out.println("bizi tercih ettiginiz icin tesekkurler");
		
	}

}
