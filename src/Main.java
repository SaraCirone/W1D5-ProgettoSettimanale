import java.util.Scanner;

public class Main {

	private static ElementoMultimediale[] array = new ElementoMultimediale[5];
	private static int counter = 0;
	
	public static void main(String[] args) {
		
		player();

	}
	
	public static void player() {
		
		System.out.println("---Benvenuto nel Media Player!---");
		
		Scanner in = new Scanner(System.in);
		System.out.println("1 - Avvia media");
		System.out.println("2 - Aggiungi media");
		System.out.println("Dove vuoi andare?");
		int select = in.nextInt();
		
		if(select == 2) {
			
			System.out.println("1 - Audio");
			System.out.println("2 - Immagine");
			System.out.println("3 - Video");
			System.out.println("Inserisci il tipo: ");
			int tipo = in.nextInt();
			System.out.println( "Hai scelto il tipo: " + tipo );

			if (tipo == 1) {
				
				Scanner in1 = new Scanner(System.in);
				System.out.println("Inserisci il titolo: ");
				String titolo = in1.nextLine();
				System.out.println("Inserisci durata: ");
				int durata = in1.nextInt();
				System.out.println(titolo + " " + durata);
				Audio a = new Audio(titolo, durata);
				array[counter] = a;
				counter++;
				
				player();
				
			} else if (tipo == 2) {
				Scanner in2 = new Scanner(System.in);
				System.out.println("Inserisci il titolo: ");
				String titolo = in2.nextLine();
				System.out.println(titolo);
				Immagine i = new Immagine(titolo);
				array[counter] = i;
				counter++;
				player();
			} else if(tipo == 3) {
				Scanner in3 = new Scanner(System.in);
				System.out.println("Inserisci il titolo: ");
				String titolo = in3.nextLine();
				System.out.println("Inserisci durata: ");
				int durata = in3.nextInt();
				System.out.println(titolo + " " + durata);
				Video v = new Video(titolo, durata);
				array[counter] = v;
				counter++;
				player();
			} else {
				System.out.println("Non esiste il tipo di media inserito! RIPROVA!");
				player();
			}
		} else if(select == 1) {
			Scanner in4 = new Scanner(System.in);
			int x = 0;
			for(int i = 0; i < counter; i++) {
				x++;
			    System.out.println(x + " " + array[i]);
			}

			System.out.println("Scegli un media:");
			int sceltaMedia = in4.nextInt();
			switch(sceltaMedia) {
				case(0):
					player();
					break;
				case(1):
					controllo(array[0]);
					break;
				case(2):
					controllo(array[1]);
					break;
				case(3):
					controllo(array[2]);
					break;
				case(4):
					controllo(array[3]);
					break;
				case(5):
					controllo(array[4]);
					break;
			}
			
		} else {
			System.out.println("Errore, non esiste il valore inserito! RIPROVA!");
			player();
		}
		
	}
	
	public static void controllo(ElementoMultimediale array) {
		
		if(array instanceof Audio) {
			
			Scanner in = new Scanner(System.in);
			System.out.println("1 - Riproduci");
			System.out.println("2 - Aumenta Volume");
			System.out.println("3 - Riduci Volume");
			System.out.println("Selezione: ");
			int select = in.nextInt();
			
			if(select == 1) {
				((Audio) array).play();
			} else if (select == 2) {
				((Audio) array).alzaVolume();
				System.out.println("Volume aumentato!");
				controllo(array);
				
			} else if(select == 3) {
				((Audio) array).abbassaVolume();
				System.out.println("Volume ridotto!");
				controllo(array);
			} else {
				System.out.println("Valore errato!");
				controllo(array);
			}
		} else if (array instanceof Video) {
			Scanner in = new Scanner(System.in);
			System.out.println("1 - Riproduci");
			System.out.println("2 - Aumenta Volume");
			System.out.println("3 - Aumenta Luminosità");
			System.out.println("4 - Riduci Volume");
			System.out.println("5 - Riduci Luminosità");
			System.out.println("Selezione: ");
			int select = in.nextInt();
			if(select == 1) {
				((Video) array).play();
			} else if (select == 2) {
				((Video) array).alzaVolume();
				System.out.println("Volume aumentato!");
				controllo(array);
				
			} else if (select == 3) {
				((Video) array).aumentaLuminosita();
				System.out.println("Luminosità aumentata!");
				controllo(array);
				
			} else if (select == 4) {
				((Video) array).abbassaVolume();
				System.out.println("Volume ridotto!");
				controllo(array);
			} else if (select == 5) {
				((Video) array).diminuisciLuminosita();
				System.out.println("Luminosità ridotta!");
				controllo(array);
			} else {
				System.out.println("Valore errato!");
				controllo(array);
			}
			
		} else if (array instanceof Immagine) {
			Scanner in = new Scanner(System.in);
			System.out.println("1 - Riproduci");
			System.out.println("2 - Aumenta Luminosita'");
			System.out.println("3 - Diminuisci Luminosita'");
			System.out.println("Selezione: ");
			int select = in.nextInt();
			if(select == 1) {
				((Immagine) array).show();
			} else if (select == 2) {
				((Immagine) array).aumentaLuminosita();
				System.out.println("Luminosità aumentata!");
				controllo(array);
			} else if(select == 3) {
				((Immagine) array).diminuisciLuminosita();
				System.out.println("Luminosità ridotta!");
				controllo(array);
			} else {
				System.out.println("Valore errato!");
				controllo(array);
			}
		}		
		
	}
	
}
