
public class PodatekPolska implements ObliczPodatek {

	@Override
	public double kwotaPodatku(double cena) {
		return cena + (cena * VAT_PL);
	}

}
