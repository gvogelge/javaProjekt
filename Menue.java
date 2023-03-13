package georg.vogelgesang.werte;

// final class menue wird im hauptprogramm benutzt
public final class Menue
{
	// methods
	
	// Hauptmenue() gibt das Hauptmenü aus
	public static void Hauptmenue()
	{
		System.out.println("------------------------------------------");
		System.out.println("[ Hauptmenue ]");
		System.out.println("1 |_. [Apps]");
		System.out.println("2 |_. [Standards]");
		System.out.println("0 |_. Exit");
		System.out.println("Eingabe [1,2,0]:");
	}
	
	// Apps() gibt das Untermenü Apps aus
	public static void Apps()
	{
		System.out.println("------------------------------------------");
		System.out.println("[ Hauptmenue ]");
		System.out.println("|_. [Apps]");
		System.out.println("1 |_. Lottozahlen Generator");
		System.out.println("2 |_. Calculator");
		System.out.println("3 |_. Multiplication Table");
		System.out.println("4 |_. Pattern Art");
		System.out.println("5 |_. Schnittstelle Farben");
		System.out.println("0 |_. zurück zum Hauptmenue");
		System.out.println("|_. [Standards]");
		System.out.println("Eingabe [1,2,3,4,5,0]:");
	}
	
	// Standards() gibt das Untermenü Standards aus
	public static void Standards()
	{
		System.out.println("------------------------------------------");
		System.out.println("[ Hauptmenue ]");
		System.out.println("|_. [Apps]");
		System.out.println("|_. [Standards]");
		System.out.println("1 |_. Java Data Types / MIN_MAX_VALUE");
		System.out.println("2 |_. Overload");
		System.out.println("3 |_. Abstract / Inheritance / Interface");
		System.out.println("4 |_. Type Casting / Encapsulation");
		System.out.println("5 |_. Stringbuilder");
		System.out.println("0 |_. zurück zum Hauptmenue");
		System.out.println("Eingabe [1,2,3,4,0]:");
	}

}