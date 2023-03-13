package georg.vogelgesang.apps;

// package imports
import java.util.Scanner;
import java.util.ArrayList;

public class Pattern implements iBannerApps
{
	// Initialisierungsblock führt method showBanner() aus sobald eine instanz initialisiert wird
	{
		this.showBanner();
	}
	
	// public fields
	public int option;
	public int onOff = 1;
	
	// private static fields
	private static final String version = "Version 1.1";
	private static final String name = "Pattern Art";
	
	// showBanner gibt einen Banner mit name und version aus
	public void showBanner()
	{
		System.out.println("------------------------------------------");
		System.out.println(Pattern.name + " " + Pattern.version);
		System.out.println("------------------------------------------");
	}
	
	// methode exe() führt die app Patterns aus
	public void exe()
	{
		Scanner input = new Scanner(System.in); // Instanz der Klasse Scanner wird initialisiert
		
		do
		{
			System.out.println("\n");
			System.out.println("Waehlen sie ein Pattern.");
			System.out.println("1 - Big C");
			System.out.println("2 - Snails");
			System.out.println("3 - Lottozahlen Chaos");
			System.out.println("0 - Exit");
			System.out.println("Eingabe [1,2,3,0]:");
			
			this.option = input.nextInt(); // eingabewert wird in field option gespeichert
			
			switch(this.option) // switch auswahl abhängig von eingabewert
			{
				case 0: // CASE 0 Exit
				this.onOff = 0; // abbruchbedingung der do while Schleife wird erfüllt
				break;
				
				case 1: // CASE 1 führt methode bigC der klasse Pattern aus
				this.bigC(11, 7);
				break;
				
				case 2: // CASE 2 führt methode Snails der klasse Pattern aus
				this.snails(7, 3);
				break;
				
				case 3: // CASE 3 Lottozahlen Pattern
				Lottozahlen lotto = new Lottozahlen(); // instanz der klasse lottozahlen wird initalisiert
				ArrayList<Integer> zahlen = new ArrayList<>(); // instanz der klasse ArrayList<> wird initialisiert
				zahlen = lotto.lottozahlen6(1); // ArrayList zahlen wird mit der rückgabe der methode lottozahlen6(int x) befüllt
				this.patternRand(zahlen); // methode patternRand(ArrayList<Integer> zahlen) wird ausgeführt
				break;
				
				default: // Ungültige eingabe
				MessageApps.inputError(); // methode inputError() der klasse MessageApps gibt Fehlermeldung aus
			}
			
		}
		while(this.onOff != 0); // abbruchbedingung der do while Schleife
	}
	
	// patternRand(ArrayList<Integer> zahlen)
	// erzeugt chaos mit lottozahlen
	public void patternRand(ArrayList<Integer> zahlen)
	{
		for(int zahl : zahlen) // für jede zahl von zahlen
		{
			for(int i = 0; i < zahl; i++) // wird eine for Schleife ausgeführt, solange zähler kleiner ist als zahl 
			{
				if(i % 5 == 0) // falls zähler ganzheitlich durch 5 teilbar ist
				{
					System.out.println(" "); // wird eine leere zeile ausgegeben
				}
				else // andernfalls
				{
					System.out.print(zahl); // wird der wert der zahl ausgegeben
				}
			}
		}
	}
	
	// bigC(int quantityY, int quantityX)
	// gibt ein Muster aus was einem großen C ähnelt
	public void bigC(int quantityY, int quantityX)
	{
		int[][] c; // 2d array mit wird erstellt
		c = new int[quantityY][quantityX]; // und mit den parametern initialisiert
		int yLength = quantityY; // yLenght variabel wird mit Wert des parameters quantityY initialisiert
		int xLength = quantityX; // xLenght variabel wird mit Wert des parameters quantityX initialisiert
		
		// for Schleife befüllt 2d array c mit wert 1 oder 0, anhänging davon ob zähler ganzheitlich durch 2 teilbar ist
		for (int y = 0; y < yLength; y++) 
		{
			for (int x = 0; x < xLength; x++) 
			{
				if(x % 2 == 0)
				{
					c[y][x] = 1;
				}
			}
		}

		int byteCount = 0; // variabel typ int bytecount wird mit 0 initialisiert und nach jeder zeichenausgabe um 1 erhöht
		
		// C print linke hälfte
		// for schleifen geben die obere hälfte des C musters aus
		for (int y = yLength-1; y >= 0; y--) 
		{
			System.out.print("\n");
			byteCount = byteCount + 1;
			
			for (int i = 0; i <= y; i++) 
			{
				System.out.print(" ");
				byteCount = byteCount + 1;
			}
			
			for (int x = xLength-1; x >= 0; x--) 
			{
				if(c[y][x] != 0)
				{
					for (int z = 0; z <= (y + x); z++) 
					{
						System.out.print("*");
						byteCount = byteCount + 1;
					}
				}
				else
				{
					System.out.print(" ");
					byteCount = byteCount + 1;
				}
			}
		}
		
		// C print rechte häfte
		// for schleifen geben die untere hälfte des C musters aus
		for (int y = 0; y < yLength; y++) 
		{
			System.out.print("\n");
			byteCount = byteCount + 1;
			
			for (int i = 0; i <= y; i++) 
			{
				System.out.print(" ");
				byteCount = byteCount + 1;
			}
			
			for (int x = 0; x < xLength ; x++) 
			{
				if(c[y][x] != 0)
				{
					for (int z = 0; z <= (y + x); z++) 
					{
						System.out.print("*");
						byteCount = byteCount + 1;
					}
				}
				else
				{
					System.out.print(" ");
					byteCount = byteCount + 1;
				}
			}
		}
	}
	
	// snails(int x, int quantity) gibt abhängig vom parametern schnecken bzw. @ ähnliche muster aus
	public void snails(int x, int quantity)
	{
		for (int k = 0 ; k < quantity; k++) 
		{
			int previous_i = 0;
		
			for (int i = 1; i <= x ; i++) 
			{
				if(i == 1 || i == x) // Reihe 1 oder letze Reihe
				{
					for (int j = 1; j <= x ; j++)
					{
						System.out.print("*"); // komplette Reihe besteht aus "*"
					}
				
					// abschluss der reihe
					previous_i = i; // nummer der Reihe wird gespeichert
					System.out.print("\n");
				
				}
				else if(i == 2) // Reihe 2
				{
					for (int j = 1; j <= (x - previous_i); j++) 
					{
						System.out.print(" ");
					}
					System.out.print("*");
				
					// abschluss der reihe
					previous_i = i; // nummer der Reihe wird gespeichert
					System.out.print("\n");
				}
				else if(i == 3) // Reihe 3
				{
					for (int j = 1; j <= (x - previous_i); j++) 
					{
						System.out.print("*");
					}
					System.out.print(" ");
					System.out.print("*");
				
					// abschluss der reihe
					previous_i = i; // nummer der Reihe wird gespeichert
					System.out.print("\n");
				}
				else if(i == 4) // Reihe 4
				{
					System.out.print("*");
					for (int j = 1; j <= previous_i; j++) 
					{
						System.out.print(" ");
					}
					System.out.print("*");
					System.out.print(" ");
					System.out.print("*");
				
					// abschluss der reihe
					previous_i = i; // nummer der Reihe wird gespeichert
					System.out.print("\n");
				}
				else if(i == 5) // Reihe 5
				{
					System.out.print("*");
					System.out.print(" ");
					for (int j = 1; j <= (x - previous_i); j++) 
					{
						System.out.print("*");
					}
					System.out.print(" ");
					System.out.print("*");
				
					// abschluss der reihe
					previous_i = i; // nummer der Reihe wird gespeichert
					System.out.print("\n");
				}
				else if(i == 6) // Reihe 6
				{
					System.out.print("*");
					for (int j = 1; j <= previous_i; j++) 
					{
						System.out.print(" ");
					}
					System.out.print("*");
				
					// abschluss der reihe
					previous_i = i; // nummer der Reihe wird gespeichert
					System.out.print("\n");
				}
			}
		}
	}
}