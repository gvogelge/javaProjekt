import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

// imports static
import georg.vogelgesang.werte.Menue;
import georg.vogelgesang.werte.Message;
import georg.vogelgesang.apps.MessageApps;
import georg.vogelgesang.vererbung.MessageVererbung;
import georg.vogelgesang.standards.MessageStandards;
import georg.vogelgesang.werte.Values;

// imports abstract, intefaces, vererbung
import georg.vogelgesang.vererbung.iBannerVererbung;
import georg.vogelgesang.vererbung.Instrument; // ausgeführt in untermenü standards
import georg.vogelgesang.vererbung.iUse; // ausgeführt in untermenü standards
import georg.vogelgesang.vererbung.Synthesizer; // ausgeführt in untermenü standards
import georg.vogelgesang.vererbung.Table; // ausgeführt in untermenü apps
import georg.vogelgesang.vererbung.SubTable; // ausgeführt in untermenü apps
import georg.vogelgesang.vererbung.MultiplicationTable; // ausgeführt in untermenü apps

// imports classes apps
import georg.vogelgesang.apps.iBannerApps;
import georg.vogelgesang.apps.Login;
import georg.vogelgesang.apps.Lottozahlen;
import georg.vogelgesang.apps.Calculator;
import georg.vogelgesang.apps.Pattern;
import georg.vogelgesang.apps.SchnittstelleFarben;

// imports public classes standards
import georg.vogelgesang.standards.iBannerStandards;
import georg.vogelgesang.standards.DataTypes;
import georg.vogelgesang.standards.JavaOverload;
import georg.vogelgesang.standards.TypeCasting;
import georg.vogelgesang.standards.StringConstruction;

public class Programm
{
	public static void main(String[] args)
	{
		Message.showBanner(); // Banner wird ausgegeben
		if(Login.main(null)) // login/password input und validierung wird durchgeführt
		{
			int option; // variabel option wird erstellt
			Scanner input = new Scanner(System.in); // scanner instanz input wird erzeugt
			
			do // Beginn der do while Schleife des Hauptmenüs
			{
				Menue.Hauptmenue(); // Hauptmenü wird ausgegeben
				option = input.nextInt(); // Eingabe Menüauswahl 
			
				switch(option) // switch auswahl des Hauptmenüs
				{
					case 0: // CASE 0 (swich hauptmenü) Exit Programm Ende
					Message.bye();
					break;
				
					case 1: // CASE 1 (swich hauptmenü) Apps Menü
					int optionApps;
					
					do // Beginn der do while Schleife des Untermenüs Apps
					{
						Menue.Apps(); // Untermenü Apps wird ausgegeben
						optionApps = input.nextInt(); // Eingabe Menüauswahl 
						
						switch(optionApps) // switch auswahl des Untermenüs Apps
						{
							case 0: // CASE 0 (apps switch) Exit Zurück zum Hauptmenü
							break;
							
							case 1: // CASE 1 (apps switch) Lottozahlen Generator
							Lottozahlen.main(null); // main methode wird ausgeführt, initialisierungsblock gibt das banner aus
							break;
							
							case 2: // CASE 2 (apps switch) Calculator Scanner
							Calculator calc = new Calculator(); // instanz wird erzeugt, initialisierungsblock gibt das banner aus
							calc.calculate(); // Methode calculate der instanz calc, klasse calculator wird aufgerufen 
							break;
							
							case 3: // CASE 3 (apps switch) Multiplication Table
							MultiplicationTable multi = new MultiplicationTable(); // initialisierungsblock gibt das banner aus, constructor führt die app aus
							break;
							
							case 4: // CASE 4 (apps switch) Pattern Art
							Pattern patterns = new Pattern(); // instanz wird erzeugt, initialisierungsblock gibt das banner aus
							patterns.exe(); // methode exe wird aufgerufen und führt die App aus
							break;
							
							case 5: // CASE 5 (apps switch) Schnittstelle Farben
							SchnittstelleFarben farben = new SchnittstelleFarben(); // instanz wird erzeugt, initialisierungsblock gibt das banner aus
							farben.exe(); // die app wird über die methode exe() ausgeführt
							break;
							
							default: // Ungültige Eingabe
							Message.inputError(); // Fehlermeldung wird ausgegeben
						}
					}
					while (optionApps != 0); // Endbedingung der Schleife des Untermenüs Apps
					break;
					
					case 2: // Standards
					int optionStandards; // variabel für switch auswahl Untemenü Standards wird erzeugt
					
					do
					{
						Menue.Standards(); // Untermenü Standards wird ausgegeben 
						optionStandards = input.nextInt(); // Eingabe Menüauswahl
						switch(optionStandards) // switch auswahl des Untermenüs Standards
						{
							case 0: // CASE 0 (standards switch) Exit Zurück zum Hauptmenü
							break;
							
							case 1: // CASE 1 (standards switch) Data Types
							DataTypes types = new DataTypes(); // instanz wird erzeugt, initialisierungsblock gibt das banner aus
							types.showTypes(); // datentypen mit min und max werten werden ausgegeben
							break;
							
							case 2: // CASE 2 (standards switch) Overload
							JavaOverload banner = new JavaOverload("banner"); // Überschrift des Standards wird angezeigt
							JavaOverload obj = new JavaOverload(); // constructor 1 ohne parameter wird aufgerufen
							JavaOverload obj1 = new JavaOverload("Herr", "John", "Doe"); // constructor 2 mit 3 string paramatern wird aufgerufen
							String[] params = {"Herr", "John", "Doe"}; // string[] wird erstellt und mit werten initialisiert
							JavaOverload obj2 = new JavaOverload(params); // constructor 3 mit string[] parameter wird aufgerufen
							obj1.sagHallo(); // methode JavaOverload.sagHallo() wird ausgeführt
							break;
							
							case 3: // CASE 3 (standards switch) Abstract & Inheritance & Interface
							Synthesizer synth = new Synthesizer(); // instanz wird erzeugt, initialisierungsblock gibt das banner aus
							synth.create(); // methode Synthesizer.create() wird ausgeführt
							synth.whoAmI(); // vererbte überschriebene methode aus der abstract class wird in der klasse synthesizer ausgeführt
							synth.play(); // implementierte methode aus dem interface iUse wird ausgeführt
							break;
							
							case 4: // CASE 4 (standards switch) TypeCasting
							TypeCasting typecast = new TypeCasting(); // instanz wird erzeugt, initialisierungsblock gibt das banner aus
							int a_int = typecast.inputInt(); // rückgabe der methode inputInt wird in einer variabel gespeichert
							char b_char = typecast.inputChar(); // rückgabe der methode inputChar wird in einer variabel gespeichert
							double c_double = typecast.inputDouble(); // rückgabe der methode inputDouble wird in einer variabel gespeichert
		
							typecast.setInt(a_int); // field int_var wird mit einem integer initialisiert über setInt()
							typecast.setChar(b_char); // field char_var wird mit einem character initialisiert über setChar()
							typecast.setDouble(c_double); // field double_var wird mit einem double initialisiert über setDouble()
							typecast.showFields(); // methode showFields wird aufgerufen // fields ausgabe bevor typecast
							
							typecast.setInt(b_char); // wert von field int_var wird mit einem character überschrieben über setInt()
							typecast.setDouble(a_int); // wert von field char_var wird mit einem integer überschrieben über setChar()
							typecast.setChar((char)(c_double)); // wert von field double_var wird mit einem double überschrieben über setDouble()
							typecast.showFields(1); // methode showFields wird aufgerufen // fields ausgabe nach typecast
							break;
							
							case 5: // CASE 5(standards switch) Stringbuilder
							StringConstruction string = new StringConstruction(); // instanz wird erzeugt, initialisierungsblock gibt das banner aus
							string.input(); // eingabe eines textes, field text des instanz wird initialisiert
							string.replaceWord(); // methode replace der instanz string wird aufgerufen
							string.deleteWord(); // methode delete der instanz string wird aufgerufen
							string.reverseTxt(); // methode reverseTxt der instanz string wird aufgerufen
							break;
							
							default: // Ungültige Eingabe
							Message.inputError(); // Fehlermeldung wird ausgegeben
						}
					}
					while (optionStandards != 0); // abbruchbedingung der do while Schleife des Untermenüs Standards
					break;
				
					default: // Ungültige Eingabe
					Message.inputError(); // Fehlermeldung wird ausgegeben
				}
			}
			while (option != 0); // Abbruchbedingung der do while Schleife des Hauptmenüs
		}
		else // Falls Login Maske abgebrochen bzw. verlassen wird
		{
			Message.bye(); // Abschiedsmeldung wird ausgegeben
		}
	}
}