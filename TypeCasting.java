package georg.vogelgesang.standards;

import java.util.Scanner;

public class TypeCasting implements iBannerStandards
{
	// Initialisierungsblock führt method showBanner() aus sobald eine instanz initialisiert wird
	{
		this.showBanner();
	}
	
	// fields
	private int int_var;
	private char char_var;
	private double double_var;
	private static final String name = "Type Casting / Encapsulation";
	
	// showBanner gibt einen Banner mit name und version aus
	public void showBanner()
	{
		System.out.println("------------------------------------------");
		System.out.println(TypeCasting.name);
		System.out.println("------------------------------------------");
	}
	
	// inputInt gibt einen eingegeben int wert zurück
	public int inputInt()
	{
		Scanner input = new Scanner(System.in); // instanz input der Klasse Scanner wird initialisiert
		System.out.println("Bitte eine Integer Zahl eingeben: ");
		return input.nextInt(); // integer input
	}
	
	// intputChar gibt einen eigegebenen character zurück
	public char inputChar()
	{
		Scanner input = new Scanner(System.in); // instanz input der Klasse Scanner wird initialisiert
		System.out.println("Bitte einen Character eingeben: ");
		return input.next().charAt(0); // char input, erster character des Input Strings
	}
	
	// inputDouble gibt einen eingegeben double wert zurück
	public double inputDouble()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Bitte eine Double Zahl eingeben: ");
		return input.nextDouble(); // double input
	}
	
	// setter methods für private fields #encapsulation
	public void setInt(int param)
	{
		this.int_var = param;
	}
	
	public void setChar(char param)
	{
		this.char_var = param;
	}
	
	public void setDouble(double param)
	{
		this.double_var = param;
	}
	
	// getter methods für private fields
	public int getInt()
	{
		return this.int_var;
	}
	
	public char getChar()
	{
		return this.char_var;
	}
	
	public double getDouble()
	{
		return this.double_var;
	}
	
	// showFields() gibt aktuell werte der fields aus
	// mit der bemerkung field before...
	public void showFields()
	{
		System.out.println("******************************************");
		System.out.println("Fields before widening and narrowing action");
		System.out.print("\n");
		System.out.println("private int int_var = " + this.int_var);
		System.out.print("\n");
		System.out.println("private char char_var = " + this.char_var);
		System.out.print("\n");
		System.out.println("private double double_var = " + this.double_var);
	}
	
	// showFields(int x) gibt aktuelle werte der fields aus
	// überschreibt die methode showFields()
	// mit der bemerkung field after...
	public void showFields(int x)
	{
		System.out.println("******************************************");
		System.out.println("Fields after widening and narrowing action");
		System.out.print("\n");
		System.out.println("private int int_var = " + this.int_var + " // i was a character, now im an int");
		System.out.print("\n");
		System.out.println("private char char_var = " + this.char_var + " // i was a double, now im a character");
		System.out.print("\n");
		System.out.println("private double double_var = " + this.double_var + " // i was an int, now im a double");
	}
}