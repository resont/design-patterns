
public class PodatekNiemcy implements ObliczPodatek {

	@Override
	public double kwotaPodatku(double cena) {
		return cena + VAT_GER;
	}

}
