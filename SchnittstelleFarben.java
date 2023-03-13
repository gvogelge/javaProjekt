package georg.vogelgesang.apps;

// package imports
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class SchnittstelleFarben implements iBannerApps
{
	// Initialisierungsblock führt method showBanner() aus sobald eine instanz initialisiert wird
	{
		this.showBanner();
	}
	
	// fields
	public ArrayList<String> farben = new ArrayList<>();
	public int onOff = 1;
	private static final String version = "Version 1.03";
	private static final String name = "Schnittstelle Farben";
	
	// showBanner gibt einen Banner mit name und version aus
	public void showBanner()
	{
		System.out.println("------------------------------------------");
		System.out.println(SchnittstelleFarben.name + " " + SchnittstelleFarben.version);
		System.out.println("------------------------------------------");
	}
	
	// menue() gibt das menue der app schnittstelle Farben aus
	private void menue()
	{
		System.out.println("\n");
		System.out.println("[Schnittstelle Farben]");
		System.out.println("1 - Farben zeigen");
		System.out.println("2 - Farben hinzufuegen");
		System.out.println("3 - Farbe loeschen");
		System.out.println("0 - Exit");
		System.out.println("Eingabe [1,2,3,0]:");
	}
	
	// exe() führt die app SchnittstelleFarben aus
	public void exe()
	{
		Scanner input = new Scanner(System.in); // instanz input der klasse Scanner wird initialisiert
		do
		{
			this.menue(); // methode menue() gibt das menü der app aus
			this.onOff = input.nextInt(); // eingabe menüauswahl wird in dem field onOff gespeichert
			
			switch(this.onOff) // switch auswahl abhängig von der eingabe menüauswahl
			{
				case 0: // exit
				break;
				
				case 1: // CASE 12 Farben anzeigen
				this.showColours(); // methode showColours() wird ausgeführt, zeigt alle vorhanden farben
				break;
				
				case 2: // CASE 2 Farben hinzufügen
				this.addColours(); // methode addColours() wird ausgeführt, ermöglicht das hinzufügen von farben
				break;
				
				case 3: // CASE 3 Farben löschen
				this.deleteColours(); // methode deleteColours() wird asugeführt, farben können gelöscht werden
				break;
				
				default: // Ungültige eingabe
				MessageApps.inputError(); // methode inputError() der klasse MessageApps gibt Fehlermeldung aus
			}
		}
		while(this.onOff != 0); // abbruchbedingung der do while Schleife
	}
	
	// removeAll()
	// löscht alle vorhandenen farben
	private void removeAll()
	{
		ArrayList<String> empty = new ArrayList<>(); // instanz empty der klasse ArrayList<String> wird initialisiert
		this.farben = empty; // field farben wird mit einer leeren ArrayList überschrieben
	}
	
	// showColours() gibt die Werte der ArrayList fields aus
	private void showColours()
	{
		if(this.farben.isEmpty()) // falls farben leer ist
		{
			System.out.println("Es sind noch keine Farben vorhanden!");
		}
		else // falls farben nicht leer ist
		{
			int size = this.farben.size(); // anzahl der gespeicherten farben wird in variabel size gespeichert
			System.out.println("Anzahl veruegbarer Farben: " + size);
			System.out.println("------------------------------------------");
			
			int nr = 1; // variabel nr typ int wird mit wert 1 initialisiert
			for(String farbe : this.farben) // for each loop für jede farbe in farben
			{	
				System.out.println("Farbe Nr." + nr + ": " + farbe);	
				nr++; // wert von nr wird um eins erhöht
			}
		}
	}
	
	// addColours() erlaubt es einzelne oder mehrere farben auf einmal einzufügen
	private void addColours()
	{
		Scanner input = new Scanner(System.in); // instanz input der klasse Scanner wird initialisiert
		int on = 1; // variabel on typ int wird mit wert 1 initialisiert
		
		do // beginn do while schleife
		{
			System.out.print("\n");
			System.out.println("Wie viele Farben moechten Sie hinzufuegen?");
			int amount = input.nextInt(); // eingabe wird in amount gespeichert
		
			if(amount < 1 || amount > 5) // falls amount wert kleiner 1, größer 5 ist
			{
				System.out.print("\n");
				System.out.println("Sie möchten " + amount + " Farben hinzufuegen!");
				System.out.println("Leider koennen in der aktuellen " + this.version + " nur min. 1 bis max. 5 Farben eingetragen werden.");
			}
			else // andernfalls
			{
				for(int i = 1; i < amount + 1; i++) // for Schleife solange zähler kleiner als amount wert + 1 ist
				{
					System.out.print("\n");
					System.out.println("Farbe Nr." + i);
					System.out.println("Bitte Namen der Farbe eingeben: ");
					String farbe = input.next(); // eingabe farbenname wird in farbe gespeichert
					farbe = farbe.toLowerCase(); // wert von farbe wird in kleine buchstaben umgewandelt
				
					if(this.farben.isEmpty()) // falls farben leer sind
					{
						this.farben.add(farbe); // wird der wert von farbe in farben gespeichert
					}
					else if(this.farben.contains(farbe)) // falls der wert von farbe bereits in farben vorhanden ist
					{
						System.out.print("\n");
						System.out.println("Die Farbe " + farbe + " ist bereits vorhanden!");
						i--; // wird zähler um eins reduziert
					}
					else // in allen anderen fällen
					{
						this.farben.add(farbe); // wird der wert von farbe in farben gespeichert
					}
				}
				// Ausgabe der eingetragenen Farben
				int size = this.farben.size(); // anzahl der werte in farben wird in variabel size gespeichert
			
				System.out.println("\n");
				System.out.println("Folgende Farben wurden hinzugefuegt: ");
				System.out.println("------------------------------------------");
		
				for (int i = 0; i < amount; i++) // for Schleife läuft solange zähler kleiner amount(anzahl der hinzugefügten farben)
				{
					String farbe = this.farben.get(size - amount + i); // speichert die zuletzt hinzugefügte farbe in farbe
					System.out.println(farbe); // gibt die zuletzt hinzugefügten farbe aus
				}
				on = 0; // abbruchbedingung der do while schleife wird erfüllt
			}
		}
		while(on != 0); // abbruchbedingung der do while schleife
	}
	
	// deleteColours()
	// führt den menüpunkt Farben löschen aus
	private void deleteColours()
	{
		Scanner input = new Scanner(System.in); // instanz input der klasse Scanner wird initialisiert
		if(this.farben.isEmpty()) // falls noch keine farben eingetragen worden sind
		{
			System.out.println("Es sind noch keine Farben vorhanden!");
		}
		else // andernfalls
		{
			int size = this.farben.size(); // anzahl der farben wird in size gespeichert
			
			System.out.println("Verfuegbare Farben: ");
			System.out.println("------------------------------------------");
			
			int nr = 1; // variabel nr typ int wird mit wert 1 initialisiert
			for(String farbe : this.farben) // for each Schleife gibt farben namen aus
			{	
				System.out.println("Farbe Nr. " + nr + " : " + farbe);	
				nr++; // wert von nr wird um eins erhöht
			}
			System.out.println("!!!!! Nr. 0 : ALLE FARBEN LÖSCHEN");
			System.out.println("------------------------------------------");
			int off = 0; // variabel off typ int wird mit dem wert 0 initialisiet
			
			do // beginn der do while schleife
			{
				System.out.println("Welche Farbe möchten Sie löschen?");
				System.out.println("Bitte Nummer eingeben:");
				nr = input.nextInt(); // eingabe nummer wird in variabel nr gespeichert
				
				if(nr < 0 || nr > size) // falls eingabe keiner gültigen nummer entspricht
				{
					MessageApps.inputError(); // gibt methode inputError() der klasse MessageApps gibt eine Fehlermeldung aus
				}
				else if(nr == 0) // falls eingabe gleich 0 ALLE FARBEN LÖSCHEN
				{
					System.out.println("Moechten sie wirklich alle Farben UNWIEDERRUFLICH LOESCHEN?");
					System.out.println("1 - LOESCHEN!");
					System.out.println("2 - NEIN");
					System.out.println("Eingabe [1,2]:");
					int answer = input.nextInt(); // eingabe loeschen
					
					if(answer < 1 || answer > 2) // falls eingabe wert nicht 1 oder 2
					{
						MessageApps.inputError(); // gibt methode inputError() der klasse MessageApps gibt eine Fehlermeldung aus
					}
					else if(answer == 1) // falls eingabe gleich 1
					{
						this.removeAll(); // löscht die methode alle vorhanden farben
						System.out.println("Alle Farben wurden erfolgreich geloescht!");
						off = 1; // abbruchbedingung der do while schleife wird erfüllt
					}
					else // falls eingabe gleich 0
					{
						off = 1; // abbruchbedingung der do while schleife wird erfüllt
					}
				}
				else // falls eine einzelne farbe gelöscht werden soll
				{
					String farbe = this.farben.get(nr -1); // wird der name der farbe aus farben in der variabel farbe gespeichert
					this.farben.remove(nr - 1); // methode remove der klasse ArrayList wird auf farben(nr -1) angewendet
					System.out.println("\t");
					System.out.println("Die Farbe " + farbe + " wurde erfolgreich geloescht");
					System.out.println("\t"); 
					off = 1; // abbruchbedingung der do while schleife wird erfüllt
				}
			}
			while(off != 1); // abbruchbedingung		
		}
	}
}