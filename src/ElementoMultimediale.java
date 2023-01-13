import java.util.Scanner;

abstract public class ElementoMultimediale {

	String titolo;
	int durata;
	int volume = 5;
	int luminosita = 3;
	
	public ElementoMultimediale(String titolo, int durata) {
		this.titolo = titolo;
		this.durata = durata;
	}
	
	public ElementoMultimediale(String titolo) {
		this.titolo = titolo;
	}
	
	public void play() {
		
		System.out.println("Riproduzione in corso...");
		if (ElementoMultimediale.this instanceof Audio) {
			for (int i = this.durata; i > 0; i--) {
				String volumeConv = "";
	            for(int v = this.volume; v > 0; v--) {
	                volumeConv += " !";
	            }
				System.out.println("Titolo Audio e volume: " + this.titolo.toUpperCase() + volumeConv);
				System.out.println("Durata Audio: " + i);
				
			}
			System.out.println("Riproduzione audio terminata!");
			System.out.println( "------------------------------------------" );
		} else if (ElementoMultimediale.this instanceof Video) {
			for (int i = this.durata; i > 0; i--) {
				String luminositaConv = "";
				String volumeConv = "";
	            for(int v = this.volume; v > 0; v--) {
	                volumeConv += " !";
	            }
	            for(int l = this.luminosita; l > 0; l--) {
	            	luminositaConv += " *";
	            }
				System.out.println("Titolo video, volume e luminosità: " + this.titolo.toUpperCase() + volumeConv + luminositaConv);
				System.out.println("Durata video: " + i);
			}
			System.out.println("Riproduzione video terminata!");
			System.out.println( "------------------------------------------" );
		} else {
			show();
			System.out.println( "------------------------------------------" );
		}
		
	}

	public void show() {
		
		String luminositaConv = "";
        for(int l = this.luminosita; l > 0; l--) {
            luminositaConv += " *";
        }
		System.out.println("Immagine visualizzata...");
		System.out.println("Titolo immagine e luminosità " + this.titolo + luminositaConv);
		System.out.println( "------------------------------------------" );
		
	}
	
}