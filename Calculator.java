package georg.vogelgesang.apps;

import java.util.Scanner; // Scanner package wird importiert

public class Calculator implements iBannerApps
{
	// Initialisierungsblock führt method showBanner() aus sobald eine instanz initialisiert wird
	{
		this.showBanner(); 
	}
	
	// fields
	private static final String version = "Version 1.02";
	private static final String name = "Calculator";
	
	// methods
	
	// showBanner gibt einen Banner mit name und version aus
	public void showBanner()
	{
		System.out.println("------------------------------------------");
		System.out.println(Calculator.name + " " + Calculator.version);
		System.out.println("------------------------------------------");
	}
	
	// calculate() führt die app calculator aus
	public void calculate()
	{	
		Scanner input = new Scanner(System.in); // instanz input der klasse scanner wird initialisiert
		
		System.out.println("Bitte erste zahl eingeben:");
		double zahl1 = input.nextDouble(); // eingabe der ersten zahl wird in variabel gespeichert
		
		System.out.println("Bitte zweite zahl eingeben:");
		double zahl2 = input.nextDouble(); // eingabe der zweiten zahl wird in variabel gespeichert

		int onOff = 1; // variabel onOff typ int wird mit dem wert 1 initialisiert
		do
		{
			Scanner ch = new Scanner(System.in); // instanz ch der klasse scanner wird initialisiert
		
			System.out.println("Bitte Operator eingeben:");
			String operator = ch.nextLine(); // Eingabe des operators wird in einer variabel gespeichert
		
			char operatorChar = operator.charAt(0); // der erste buchstabe der eingabe operator wird gespeichert
		
			if(operatorChar == '+') // falls operator +
			{
				double summe = zahl1 + zahl2; // input werte werden summiert
				System.out.println("Das Ergenis ist: " + Math.round(summe * 100)/100); // ergebnis output gerundet auf 2 stellen
				onOff = 0; // abbruchbedingung der do while Schleife wird erfüllt
			}
			else if(operatorChar == '-') // falls operator -
			{
				double summe = zahl1 - zahl2; // input werte werden subtrahiert
				System.out.println("Das Ergenis ist: " + Math.round(summe * 100)/100); // ergebnis output gerundet auf 2 stellen
				onOff = 0; // abbruchbedingung der do while Schleife wird erfüllt
			}
			else if(operatorChar == '*') // falls operator *
			{
				double summe = zahl1 * zahl2; // input werte werden multipliziert
				System.out.println("Das Ergenis ist: " + Math.round(summe * 100)/100); // ergebnis output gerundet auf 2 stellen
				onOff = 0; // abbruchbedingung der do while Schleife wird erfüllt
			}
			else if(operatorChar == '/') // falls operator /
			{
				double summe = zahl1 / zahl2; // input werte werden dividiert
				System.out.println("Das Ergenis ist: " + Math.round(summe * 100)/100); // ergebnis output gerundet auf 2 stellen
				onOff = 0; // abbruchbedingung der do while Schleife wird erfüllt
			}
			else // ungültige eingabe
			{
				MessageApps.inputError();
				System.out.println("Bitte einen der folgenden Operatoren eingeben: +, -, *, /");
			}
		}
		while(onOff != 0); // abbruchbedingung der do while Schleife		
	}
}