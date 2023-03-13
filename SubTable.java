package georg.vogelgesang.vererbung;

public class SubTable extends Table // subclass SubTable erweitert superclass Table
{	
	// constructor der subclass SubTable 
	SubTable(int param1 , int param2)
	{
		super(param1, param2); // ruft constructor der superclass Table auf
	}
	
	// printTable() überschreibt die methode der superclass durch andere parameter
	// und gibt anhand zwei foreach Schleifen eine multiplikationstabelle aus
	public void printTable(int[] rows, int[] columns)
	{
		for(int row : rows) // for each schleife für jeden wert von rows[]
		{	
			System.out.println(""); // Zeilenumbruch
			for (int column : columns) // für jeden wert von columns[]
			{
				System.out.print("\t"); // tabulator
				System.out.print(row * column); // wird das produkt der werte row und column ausgegeben
			}
		}
		
		System.out.println("");
		System.out.println("------------------------");
		System.out.println("Die Tabelle wurde generiert von SubTable.printTable(int[] rows, int[] columns) // foreach loop + foreach loop");
		System.out.println("------------------------");
	}
}