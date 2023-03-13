package georg.vogelgesang.vererbung;

import java.util.Scanner;

// subclass Synthesizer erweitert superclass Instruments und implementiert interfaces iUse und iBannerVererbung
public class Synthesizer extends Instrument implements iUse, iBannerVererbung
{
	// Initialisierungsblock führt method showBanner() aus sobald eine instanz initialisiert wird
	{
		this.showBanner();
	}
	
	// fields
	private static final String name = "Abstract / Inheritance / Interface";
	
	// methods
	
	// showBanner gibt einen Banner mit name aus
	public void showBanner()
	{
		System.out.println("------------------------------------------");
		System.out.println(Synthesizer.name);
		System.out.println("------------------------------------------");
	}
	
	// play() gibt die fields type, model, brand welche von der superclass vererbt worden sind
	public void play()
	{
		System.out.println("");
		System.out.println("Implementierte Methode play() von iUse sagt: ");
		System.out.println("");
		System.out.println("It plays the " + this.type + " " + this.model + " from " + this.brand);
	}
	
	// whoAmI() wurde von superclass Instrument geerbt und muss konkretisiert werden
	// gibt die werte der fields aus die von der superclass geerbt worden sind
	public void whoAmI()
	{
		System.out.println("Konkretisierte Methode whoAmi() aus der superclass Instrument sagt: ");
		System.out.println("");
		System.out.println("Synthesizer");
		System.out.println("******************************************");
		System.out.println("Brand : " + this.brand + " // vererbtes field brand");
		System.out.println("Type : " + this.type + " // vererbtes field type");
		System.out.println("Model : " + this.model + " // vererbtes field model");
	}
	
	// create() nimmt eingabe entgegen und speichert diese in den veerbten fields der superclass Instrument
	public void create()
	{
		Scanner input = new Scanner(System.in); // instanz input der klasse Scanner wird initialisiert
		
		System.out.println("Bitte Synthesizer Markenname eingeben: ");
		this.brand = input.nextLine(); // eingabe wert markenname initialisiert field brand
		
		System.out.println("Bitte Synthesizer Typ eingeben: ");
		this.type = input.nextLine(); // eingabe wert tyo initialisiert field type
		
		System.out.println("Bitte Model Namen eingeben: ");
		this.model = input.nextLine(); // eingabe wert model initialisiert field model
	}
}