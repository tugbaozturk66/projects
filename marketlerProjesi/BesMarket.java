package marketlerProjesi;

public class BesMarket extends Abstract01 {

	@Override
	public double ekmekAl(int adet) {
		
		return 1.75*adet;
	}

	@Override
	public double cikolataAl(int adet) {
		
		return 3.50*adet;
	}

	@Override
	public double cipsAl(int adet) {
	
		return 2.50*adet;
	}

	@Override
	public double kolaAl(int adet) {
		
		return 3.50*adet;
	}

	@Override
	public double dondurmaAl(int adet) {
		
		return 1.30*adet;
	}

}
