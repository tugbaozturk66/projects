package marketlerProjesi;

public class CesMarket extends Abstract01{

	@Override
	public double ekmekAl(int adet) {
		
		return 1.80*adet;
	}

	@Override
	public double cikolataAl(int adet) {
		
		return 2.50*adet;
	}

	@Override
	public double cipsAl(int adet) {
		
		return 3.25*adet;
	}

	@Override
	public double kolaAl(int adet) {
		
		return 3.25*adet;
	}

	@Override
	public double dondurmaAl(int adet) {
		
		return 1.85*adet;
	}

}
