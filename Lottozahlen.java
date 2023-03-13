package georg.vogelgesang.apps;

// package import
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lottozahlen implements iBannerApps
{
	// Initialisierungsblock führt method showBanner() aus sobald eine instanz initialisiert wird
	{
		this.showBanner();
	}
	
	// fields
	private static final String version = "Version 1.0";
	private static final String name = "Lottozahlen Generator";
	
	// methods
	
	// showBanner gibt einen Banner mit name und version aus
	public void showBanner()
	{
		System.out.println("------------------------------------------");
		System.out.println(Lottozahlen.name + " " + Lottozahlen.version);
		System.out.println("------------------------------------------");
	}
	
	// lottozahlen6(int x)
	// generiert 6 unterschiedliche zahlen zwischen 1 und 49
	// und gibt diese in einer ArrayList<Integer> zurück
	public ArrayList<Integer> lottozahlen6(int x)
	{
		ArrayList<Integer> zahlen = new ArrayList<>(); // ArrayList<Integer> wird initialisiert
		int zahl; // variabel wird erstellt
		
		for (int i = 0; i < 6 ; i++) // beginn der forschleife solange zähler kleiner ist als 6
		{
			zahl = (int) (Math.random() * 49 * 1); // eine zufällige zahl wird in der variabel zahl gespeichert
			
			if(zahlen.contains(zahl)) // falls die zahl in der ArrayList zahlen vorhanden ist
			{
				i--; // wird der zähler der schleife um eins zurückgesetzt
			}
			else // andernfalls
			{
				zahlen.add(zahl); // wird der wet der variabel zahl in der ArrayList zahlen gespeichert
			}
		}
		// Collections.sort(zahlen);
		
		return zahlen; // rückgabe der befüllten ArrayList zahlen
	}
	
	// lottozahlen6() überschreibt die methode, da keine parameter
	public void lottozahlen6()
	{
		ArrayList<Integer> zahlen = new ArrayList<>(); // ArrayList<Integer> wird initialisiert
		int zahl; // variabel wird erstellt
		
		for (int i = 0; i < 6 ; i++) // beginn der forschleife solange zähler kleiner ist als 6
		{
			zahl = (int) (Math.random() * 49 * 1); // eine zufällige zahl wird in der variabel zahl gespeichert
			
			if(zahlen.contains(zahl)) // falls die zahl in der ArrayList zahlen vorhanden ist
			{
				i--; // wird der zähler der schleife um eins zurückgesetzt
			}
			else // andernfalls
			{
				zahlen.add(zahl);  // wird der wet der variabel zahl in der ArrayList zahlen gespeichert
			}
		}
		Collections.sort(zahlen); // die ArrayList zahlen wird durch die methode sort() aus dem Collections package sortiert
		
		for(int zahl1 : zahlen) // for each schleife gibt jede zahl aus
		{
			System.out.print(zahl1 + " | ");
		}
	}
	
	// superzahl() generiert eine zahl zwischen 1 und 9
	public void superzahl()
	{
		int zahl;

		zahl = (int) (Math.random() * 9 * 1);
			
		System.out.print(zahl + " |");
	}
	
	// main methode der klasse Lottozahlen
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in); // instanz der klasse scanner wird initialisiert
		Lottozahlen obj = new Lottozahlen(); // instanz der klasse Lottozahlen wird initialisiert
		int onOff = 1; // variabel für benutzung do while schleifen wird initialisiet
		
		do	// start der do while schleife
		{
			System.out.println("");
			System.out.print("Wie viele Tipps sollen generiert werden?");
			System.out.println("");
			System.out.println("Eingabe [1 - 12]:");
			int anzahl = input.nextInt(); // eingabe wird in einer variabel gespeichert
		
			if(anzahl > 0 && anzahl <= 12) // falls die eingabe zwischen 1 und 12 liegt
			{
				for (int i = 0; i < anzahl; i++) // wird schleife ausgeführt, solange zähler < ist als eingabe 
				{
					System.out.println("TIPP NUMMER " + (i+1));
					System.out.println("******************************************");
					System.out.println("Lottozahlen 6 aus 49");
					System.out.println("------------------------------------------");
					obj.lottozahlen6(); // methode lottozahlen6() der instanz obj wird ausgeführt gibt die lottozahlen aus
					System.out.println("\n");
					System.out.println("Superzahl 1 aus 9 ");
					System.out.println("------------------------------------------");
					obj.superzahl(); // methode superzahl() der instanz obj wird ausgeführt
					System.out.println("\n");
				}
				onOff = 0; // abbruchbedingung der do while schleife wird erfüllt
			}
			else // falls eingabe nicht zwischen 1 und 12 war
			{
				System.out.println("");
				System.out.println("Sie möchten " + anzahl + " Tipps generieren!");
				System.out.println("Leider können in der aktuellen " + obj.version + " nur maximal 12 Tipps generiert werden.");
			}
		}
		while(onOff != 0); // abbruchbedingung der do while schleife
	}
}