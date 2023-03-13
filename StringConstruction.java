package georg.vogelgesang.standards;

import java.util.Scanner;

public class StringConstruction implements iBannerStandards
{
	// Initialisierungsblock führt method showBanner() aus sobald eine instanz initialisiert wird
	{
		this.showBanner();
	}
	
	// fields
	private static final String name = "Stringbuilder";
	private static final String version = "Version 1.0";
	public StringBuilder text;
	
	// methods
	
	// showBanner gibt einen Banner mit name und version aus
	public void showBanner()
	{
		System.out.println("------------------------------------------");
		System.out.println(StringConstruction.name + " " + StringConstruction.version);
		System.out.println("------------------------------------------");
	}
	
	// getText gibt den wert des fields text aus
	private void getText()
	{
		System.out.println("");
		System.out.println("Der Text lautet nun: ");
		System.out.println(this.text);
	}
	
	// input() nimmt einen text über scanner input und initialisiert damit field text
	public void input()
	{
		Scanner input = new Scanner(System.in); // Instanz der Klasse Scanner wird initialisiert
		int onOff = 1; // variabel onOff typ int wird initialisiert
		do // beginn do while Schleife
		{
			System.out.println("Bitte geben Sie einen Text ein:");
			System.out.println("Es sind maximal 50 Zeichen erlaubt.");
			System.out.println("Eingabe:");
			String inputText = input.nextLine(); // eingabe text wird in variabel inputText gespeichert
			inputText = inputText.toLowerCase(); // eingabe text wird zu lowercase formatiert
		
			if(inputText.length() < 1 || inputText.length() >= 50) // falls eingabe wert kleiner 1, größer 50
			{
				MessageStandards.inputError(); // gibt methode inputError() der klasse Message Fehlermeldung aus
				System.out.println("Der Text muss aus min. 1 - max 50. Zeichen lang sein!");
			}
			else // andernfalls
			{
				this.text = new StringBuilder(inputText); // wird field text mit eingabe wert initialisiert
				onOff = 0; // abbruchbedingung der do while schleife wird erfüllt
			}
		}
		while(onOff != 0); // abbruchbedingung der do while schleife
		this.getText(); // gibt den aktuellen wert des fields text aus
	}
	
	// reverseTxt() formartiert den wert des fields text und gibt diesen rückwärts aus
	public void reverseTxt()
	{
		System.out.println("");
		System.out.println("Nun wird der Text rueckwaerts ausgegeben!");
		System.out.println("");
		this.text = this.text.reverse(); // wert des fieds text, wird rückwärts ausgegeben
		this.getText(); // gibt den aktuellen wert des fields text aus
	}
	
	// replaceWord() nimmt ersezt eine beliebige text stelle durch andere zeichen
	public void replaceWord()
	{
		Scanner input = new Scanner(System.in); // instanz input der klasse scanner wird initialisiert
		int onOff = 1; // variabel onOff typ int wird mit dem wert 1 initialisiert
		int textLength = this.text.length(); // variabel textLenght wird mit dem rückgabewert von this.text.length() initialisiert
		int leftSpace; // variabel typ int wird erstellt
		int indexFirst; // variabel typ int wird erstellt
		int indexLast; // variabel typ int wird erstellt
		String wordOld; // variabel typ String wird erstellt
		String wordNew; // variabel typ String wird erstellt
		do // beginn der do while schleife
		{
			System.out.println("");
			System.out.println("Geben Sie das Wort ein, welches ersetzt werden soll.");
			System.out.println("Eingabe:");
			wordOld = input.next(); // eingabe zu ersetztendes wort wird in wordOld gespeichert
			wordOld = wordOld.toLowerCase(); // und in klein buchstaben formatiert
		
			indexFirst = this.text.indexOf(wordOld); // index des ersten buchstabens von wordOld wird gespeichert
			indexLast = indexFirst + wordOld.length(); // index des letzen buchstabens von wordOld wird gespeichert
			
			if(indexFirst == -1) // falls das eingegebene wort nicht im text enthalten war wurde -1 in indexFirst gespeichert
			{
				System.out.println("");
				System.out.println("Das Wort ist nicht in dem Text vorhanden.");
			}
			else // andernfalls
			{
				onOff = 0; // wird abbruchbedingung der do while schleife erfüllt
			}
		}
		while(onOff != 0); // abbruchbedingung der do while schleife
		
		leftSpace = 50 - textLength + wordOld.length(); // nachdem das wort aus text entfernt worden ist, werden die noch mögliche anzahl an zeichen berechnet
		
		do // beginn do while Schleife
		{
			System.out.println("");
			System.out.println("Geben Sie nun das Wort ein, welches eingefuegt werden soll.");
			System.out.println("Es sind noch " + leftSpace + " Zeichen erlaubt.");
			System.out.println("Eingabe:");
			wordNew = input.next(); // eingabe ersetzendes wort wird gespeichert
			wordNew = wordNew.toLowerCase(); // und in kleinbuchstaben formatiert
			
			if(wordNew.length() < 1 || wordNew.length() >= leftSpace) // falls die eingabe größer oder kleiner als erlaubt
			{
				System.out.println("");
				MessageStandards.inputError(); // gibt inputError() der klasse MessageStandards Fehlermeldung aus
				System.out.println("Das Wort muss min. 1 - max " + leftSpace + ". Zeichen lang sein!");
			}
			else // andernfalls
			{
				onOff = 1; // wird abbruchbedingung der do while Schleife erfüllt 
			}
		}
		while(onOff != 1); // abbruchbedingung der do while Schleife
		this.text.replace(indexFirst, indexLast, wordNew); // methode replace ersetzt altes durch neues wort
		this.getText(); // gibt den aktuellen wert des fields text aus
	}
	
	// deleteWord() löscht eine beliebige textstelle
	public void deleteWord()
	{
		Scanner input = new Scanner(System.in); // instanz input der klasse Scanner wird initialisiert
		int onOff = 1; // variabel onOff typ int wird mit dem wert 1 initialisiert
		int indexFirst; // variabel typ int wird erzeugt
		int indexLast; // variabel typ int wird erzeugt
		String word; // variabel typ String wird erzeugt
		
		do // beginn der do while Schleife
		{
			System.out.println("");
			System.out.println("Geben Sie das Wort ein, welches geloescht werden soll.");
			System.out.println("Eingabe:");
			word = input.next(); // eingabe zu löschendes wort wird in word gespeichert
			word = word.toLowerCase(); // und zu kleinbuchstaben formatiert
		
			indexFirst = this.text.indexOf(word); // der anfangsindex von word wird in indexFirst gespeichert
			indexLast = indexFirst + word.length(); // der endindex von word wird in indexLast gespeichert
		
			if(indexFirst == -1) // falls indexFirst durch rückgabewert -1 befüllt worden ist, ist die eingabe nicht in text vorhanden
			{
				System.out.println("");
				System.out.println("Das Wort \" " + word + " \" ist nicht in dem Text vorhanden.");
			}
			else // andernfalls
			{	
				this.text.delete(indexFirst, indexLast); // wird die textstelle ab indexFirst bis indexLast gelöscht
				System.out.println("");
				System.out.println("Das Wort \" " + word + " \" wurde erfolgreich geloescht!");
				onOff = 0; // und abbruchbedingung der do while Schleife wird erfüllt
			}
		}
		while(onOff != 0); // abbruchbedingung der do while Schleife
		this.getText(); // gibt den aktuellen wert des fields text aus
	}
}