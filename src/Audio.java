import Interface.Volume;

public class Audio extends ElementoMultimediale implements Volume{
	
	public Audio(String titolo, int durata) {
		
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
	public String toString() {
		
		return "AUDIO - " + "Titolo: " + this.titolo + " Durata: " + this.durata;
		
	}
	
}