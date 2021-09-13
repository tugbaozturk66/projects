package marketlerProjesi;

public class AsMarket extends Abstract01 {

	@Override
	public double ekmekAl(int adet) {
		
		return adet*2;
	}

	@Override
	public double cikolataAl(int adet) {
		
		return adet*3;
	}

	@Override
	public double cipsAl(int adet) {
		
		return adet*4;
	}

	@Override
	public double kolaAl(int adet) {
		
		return adet*5;
	}

	@Override
	public double dondurmaAl(int adet) {
		
		return 2.5*adet;
	}

}
