package georg.vogelgesang.vererbung;

import java.util.Scanner;

// abstract klasse wird von Synthesizer klasse erweitert
public abstract class Instrument
{
	// field die an subclass Synthesizer vererbt werden
	protected String brand;
	protected String type;
	protected String model;
	
	// abstract method
	abstract void whoAmI();
}
