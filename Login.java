package georg.vogelgesang.apps;

import java.util.Scanner; // Scanner package wird importiert

public class Login
{
	// fields
	private final String login = "admin";
	private final String password = "admin";
	
	// methods
	
	// main methode wird beim start des programms mmit Login.main(null) ausgeführt
	public static boolean main(String[] args)
	{
		Scanner input = new Scanner(System.in); // instanz der klasse scanner wird initialisiert
		int option; // variabel wird erstellt
		
		do
		{
			System.out.println("Bitte Loginname eingeben");
			String login = input.nextLine(); // eingabe des loginnamens wird in variabel login gespeichert
		
			System.out.println("Bitte Passwort eingeben");
			String password = input.nextLine(); // eingabe des passwords wird in variabel password gespeichert
			
			Login obj = new Login(); // instanz der klasse Login wird initialisiert
		
			if(login.equals(obj.login) && password.equals(obj.password)) // falls die eingabe korrekt ist
			{
				option = 0; // endbedingung der schleife wird erfüllt
				return true; // rückgabewert der main methode
			}
			else
			{
				MessageApps.loginError(); // methode loginError() der static klasse MessageApps gibt Fehlermeldung aus
				System.out.println("1 - Möchten Sie die Eingabe nochmal wiederholen?");
				System.out.println("0 - Exit");
				
				option = input.nextInt(); // eingabe der option
				input.nextLine(); // überspringt nach der eingabe den return damit das programm weiterläuft
				
				if(option == 0) // falls eingabe 0
				{
					return false; // wird der rückgabewert false der methode main zurückgegeben
				}
			}
		}
		while(option != 0); // abbruchbedingung der do while schleife
		
	return false; // rückgabewert der methode main
	}
}