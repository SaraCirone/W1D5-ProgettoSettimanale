import Interface.Luminosita;
import Interface.Volume;

public class Video extends ElementoMultimediale implements Volume, Luminosita {
	
	public Video(String titolo, int durata) {
		
		super(titolo, durata);
		
	}

	@Override
	public int alzaVolume() {
		
		if (volume < 10) {
			return volume++;
		} else {
			System.out.println( "Il volume è al massimo!" );
		}
		
		return volume;

	}

	@Override
	public int abbassaVolume() {
		
		if (volume > 0) {
			return volume--;
		} else {
			System.out.println( "Il volume è al minimo!" );
		}
		
		return volume;
		
	}
	
	@Override
	public int aumentaLuminosita() {
		
		if (luminosita < 10) {
			return luminosita++;
		} else {
			System.out.println( "La luminosità è al massimo!" );
		}
		
		return luminosita;
		
	}

	@Override
	public int diminuisciLuminosita() {
		
		if (luminosita > 0) {
			return luminosita--;
		} else {
			System.out.println( "Il volume è al minimo!" );
		}
		
		return luminosita;
		
	}
	
	@Override
	public String toString() {
		
		return "VIDEO - " + "Titolo: " + this.titolo + " Durata: " + this.durata;
		
	}
	
}