package marketlerProjesi;

public class YesMarket extends Abstract01{

	@Override
	public double ekmekAl(int adet) {
		
		return 2.10*adet;
	}

	@Override
	public double cikolataAl(int adet) {
		
		return 2.90*adet;
	}

	@Override
	public double cipsAl(int adet) {
		
		return 2.50*adet;
	}

	@Override
	public double kolaAl(int adet) {
		
		return 4*adet;
	}

	@Override
	public double dondurmaAl(int adet) {
		
		return 1.60*adet;
	}

}
