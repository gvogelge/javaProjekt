package georg.vogelgesang.vererbung;

import java.util.Scanner; // Scanner package wird importiert

public class MultiplicationTable implements iBannerVererbung
{	
	// Initialisierungsblock führt method showBanner() aus sobald eine instanz initialisiert wird
	{
		this.showBanner();
	}
	
	// fields
	private static final String version = "Version 1.1";
	private static final String name = "Multiplication Table";
	
	// methods
	
	// showBanner gibt einen Banner mit name und version aus
	public void showBanner()
	{
		System.out.println("------------------------------------------");
		System.out.println(MultiplicationTable.name + " " + MultiplicationTable.version);
		System.out.println("------------------------------------------");
	}
	
	// public constructor führt direkt die app aus
	public MultiplicationTable()
	{
		Scanner input = new Scanner(System.in); // Instanz der Klasse Scanner
		
		// variablen werden erstellt
		int rowNumber = 0;
		int columnNumber = 0;
		int onOff = 1;
		
		do // beginn der do while schleife
		{
			System.out.println("Bitte anzahl der Reihen eingeben");
			rowNumber = input.nextInt(); // input typ int
			
			if(rowNumber <= 0 && rowNumber >= 15) // falls der user eine Zahl kleiner 1, größer 15 eingibt
			{
				System.out.println("In der aktuellen " + version + " sind nur maximal 20 Reihen möglich.");
			}
			else // falls eingabe korrekt wird die
			{
				onOff = 0; // endbedingung für do while Schleife erfüllt
			}
		}
		while(onOff != 0); // endbedingung der do while schleife
		
		do
		{
			System.out.println("Bitte anzahl der Spalten eingeben");
			columnNumber = input.nextInt(); // input typ int
			
			if(columnNumber <= 0 && columnNumber >= 15) // falls der user eine Zahl kleiner 1, größer 15 eingibt
			{
				System.out.println("In der aktuellen " + version + " sind nur maximal 20 Spalten möglich.");
			}
			else // falls eingabe korrekt wird die
			{
				onOff = 1; // endbedingung für do while
			}
		}
		while(onOff != 1); // endbedingung der do while schleife
		
		
		// Table und SubTable werden instanziiert, constructoren werden die inputwerte übergeben
		Table objTable = new Table(rowNumber, columnNumber); // instanz der klasse Table
		SubTable objSubTable = new SubTable(rowNumber, columnNumber); // instanz der klasse SubTable 
		
		// zwei Arrays mit der Größe abhängig von inputwerten werden erzeugt
		int[] rows = new int[rowNumber]; // int array größe abhängig von input1
		int[] columns = new int[columnNumber]; // int array grö0e abhängig von input2
		
		// die erezugten arrays werden mit werten abhängig von iputwerten befüllt
		for (int i = 0; i < rowNumber ; i++) 
		{
			rows[i] = (i + 1); // array rows wird mit Werten ab 1  bis rowNumber befüllt
		}
		
		for (int i = 0; i < columnNumber ; i++) 
		{
			columns[i] = (i + 1); // array columns wird mit Werten ab 1 bis columnNumber befüllt
		}
		
		System.out.println("Waehlen sie aus mit welcher Schleifenkombo die Multiplikationstabelle generiert werden soll.");
		System.out.println("1 - for loop + for loop");
		System.out.println("2 - foreach loop + for loop");
		System.out.println("3 - for loop + foreach loop");
		System.out.println("4 - foreach loop + foreach loop");
		System.out.println("Eingabe [1,2,3,4]:");
		
		do // do while Schleife wird gestartet
		{
			int loop = input.nextInt(); // input typ int Eingabe Loop auswahl

			switch(loop) // switch abhängig von eingabe variabel loop
			{
				case 1: // CASE 1 führt printTable() der instanz objTable der superklasse Table aus
				objTable.printTable();
				onOff = 0; // abbruchbedingung der do while Schleife wird erfüllt
				break;
			
				case 2: // CASE 2 führt printTable(int[] rows, int columnNumber) der instanz objTable der superklasse Table aus 
				objTable.printTable(rows, columnNumber);
				onOff = 0; // abbruchbedingung der do while Schleife wird erfüllt
				break;
			
				case 3: // CASE 3 führt printTable(int rowNumber, int[] columns) der instanz objTable der superklasse Table aus
				objTable.printTable(rowNumber, columns);
				onOff = 0; // abbruchbedingung der do while Schleife wird erfüllt
				break;
			
				case 4: // CASE 4 führt printTable(int[] rows, int[] columns) der instanz objSubTable der subklasse SubTable aus
				objSubTable.printTable(rows, columns);
				onOff = 0; // abbruchbedingung der do while Schleife wird erfüllt
				break;
			
				default:
				MessageVererbung.inputError(); // static methode der klasse MessageVererbung gibt eine Fehlermeldung aus 
			}
		}
		while(onOff != 0); // abbruchbedingung der do while Schleife
	}
}