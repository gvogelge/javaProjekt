package georg.vogelgesang.standards;

public class DataTypes implements iBannerStandards
{	
	// Initialisierungsblock führt method showBanner() aus sobald eine instanz initialisiert wird
	{
		this.showBanner();
	}
	
	// fields
	private static final String name = "Java Data Types / MIN_MAX_VALUE";
	
	// methods
	
	// showBanner gibt einen Banner mit name aus
	public void showBanner()
	{
		System.out.println("------------------------------------------");
		System.out.println(DataTypes.name);
		System.out.println("------------------------------------------");
	}
	
	// showTypes gibt datentypen mit jeweiligen minimal und maximal werten aus
	public void showTypes()
	{
		System.out.println("Datatype: byte");
		System.out.println("------------------------------------------");
		System.out.println("Min Value: " + Byte.MIN_VALUE);
		System.out.println("Max Value: " + Byte.MAX_VALUE);
		System.out.println("\n\n");
		
		System.out.println("Datatype: short");
		System.out.println("------------------------------------------");
		System.out.println("Min Value: " + Short.MIN_VALUE);
		System.out.println("Max Value: " + Short.MAX_VALUE);
		System.out.println("\n\n");
		
		System.out.println("Datatype: int");
		System.out.println("------------------------------------------");
		System.out.println("Min Value: " + Integer.MIN_VALUE);
		System.out.println("Max Value: " + Integer.MAX_VALUE);
		System.out.println("\n\n");
		
		System.out.println("Datatype: long");
		System.out.println("------------------------------------------");
		System.out.println("Min Value: " + Long.MIN_VALUE);
		System.out.println("Max Value: " + Long.MAX_VALUE);
		System.out.println("\n\n");
		
		System.out.println("Datatype: char");
		System.out.println("------------------------------------------");
		System.out.println("Min Value: " + (int)Character.MIN_VALUE);
		System.out.println("Max Value: " + (int)Character.MAX_VALUE);
		System.out.println("\n\n");
		
		System.out.println("Datatype: float");
		System.out.println("------------------------------------------");
		System.out.println("Min Value: " + Float.MIN_VALUE);
		System.out.println("Max Value: " + Float.MAX_VALUE);
		System.out.println("\n\n");
		
		System.out.println("Datatype: double");
		System.out.println("------------------------------------------");
		System.out.println("Min Value: " + Double.MIN_VALUE);
		System.out.println("Max Value: " + Double.MAX_VALUE);
		System.out.println("\n\n");
		
		System.out.println("Datatype: boolean");
		System.out.println("------------------------------------------");
		System.out.println("VALUE: true or false");
	}
}