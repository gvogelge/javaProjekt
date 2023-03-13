package georg.vogelgesang.vererbung;

public class Table
{
	// fields
	public int rowNumber; 
	public int columnNumber;
	
	// constructor
	Table(int param1, int param2)
	{
		this.rowNumber = param1;
		this.columnNumber = param2;
	}
	
	// methods
	
	// printTable() gibt eine Multiplikationstabelle mit zwei for Schleifen aus
	public void printTable()
	{
		for (int i = 1; i <= rowNumber; i++) // äußere for Schleife solange zähler kleiner gleich wert von field rowNumber
		{
			System.out.println(""); // zeilenumbruch
			
			for (int j = 1; j <= columnNumber; j++) // innere For Schleife solange zähler kleiner gleich wert von field columnNumber
			{
				System.out.print("\t"); // tabulator
				System.out.print(i * j); // wird das produkt von zähler i und zähler j ausgegeben
			}
		}
		System.out.println("");
		System.out.println("------------------------");
		System.out.println("Die Tabelle wurde generiert von Table.printTable() // for loop + for loop");
		System.out.println("------------------------");
		
	}
	
	// printTable(int[] rows, int columns) überschreibt methode printTable() 
	// gibt eine Multiplikationstabelle mit foreach + for Schleife aus
	public void printTable(int[] rows, int columns)
	{
		
		for(int row : rows) // aüßere for each Schleife
		{	
			System.out.println(""); // zeilenumbruch
			for (int i = 1; i <= columns; i++) // innere for Schleife, solange zähler kleiner als parameter columns[]
			{
				System.out.print("\t"); // tabulator
				System.out.print(row * i); // wird das produkt von wert von row und zähler i ausgegeben
			}
		}
		
		System.out.println("");
		System.out.println("------------------------");
		System.out.println("Die Tabelle wurde generiert von Table.printTable(int[] rows, int columns) // foreach loop + for loop");
		System.out.println("------------------------");
	}
	
	// printTable(int rows, int[] columns) überschreibt methode printTable() 
	// gibt eine Multiplikationstabelle mit for + foreach aus
	public void printTable(int rows, int[] columns)
	{
		for(int i = 1; i <= rows; i++) // äußere for Schleife solange zähler kleiner gleich wert von parameter rows[]
		{	
			System.out.println(""); // zeilenumbruch
			for (int column : columns) // innere foreach Schleife für jeden wert von parameter columns[]
			{
				System.out.print("\t"); // tabulator
				System.out.print(i * column); // wird das produkt von zähler i und wert von column ausgegeben
			}
		}
		
		System.out.println("");
		System.out.println("------------------------");
		System.out.println("Die Tabelle wurde generiert von Table.printTable(int rows, int[] columns) // for loop + foreach loop");
		System.out.println("------------------------");
	}
}