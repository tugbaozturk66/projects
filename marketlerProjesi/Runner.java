package marketlerProjesi;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		int secim=0;
		String tercih;
		Musteriler musteri=new Musteriler();
		Scanner scan=new Scanner(System.in);
		do{
		System.out.println("hosgeldiniz");
		
		System.out.println("Hangi marketten alisveris yapmak istersiniz numarasini seciniz \n1)AsMarket"+
		"\n2)BesMarket\n3)CesMarket\n4)MesMarket\n5)YesMarket\n6)cikis");
		secim=scan.nextInt();
		
			if(secim==1) {
		
			musteri.fiyatlar=new AsMarket();
			musteri.alisveris();
		}else if(secim==2) {
			musteri.fiyatlar=new BesMarket();
			musteri.alisveris();
			
		}else if(secim==3) {
			musteri.fiyatlar=new CesMarket();
			musteri.alisveris();
		}else if(secim==4) {
			musteri.fiyatlar=new MesMarket();
			musteri.alisveris();
		}else if(secim==5) {
			musteri.fiyatlar=new YesMarket();
			musteri.alisveris();
		}
			System.out.println("baska market fiyatina bakmak ister misiniz E/H");
			tercih=scan.next();
		}while(tercih.equalsIgnoreCase("E"));
		}

	

}
