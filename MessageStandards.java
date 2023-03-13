package georg.vogelgesang.standards;

// final class Message wird in mehreren standards benutzt
public final class MessageStandards
{
	// static methods
	
	// inputError() gibt Fehlermeldung bei falscher Eingabe aus
	public static void inputError()
	{
		System.out.println("------------------------------------------");
		System.out.print("UNGÜLTIGE EINGABE! Diese Nummer ist nicht vorhanden!\n");
		System.out.println("------------------------------------------");
	}
	
	// loginError() gibt Fehlermeldung bei falschem Login aus
	public static void loginError()
	{
		System.out.println("Die Daten sind falsch!");
	}
	
	// bye() gibt einen abschiedstext aus
	public static void bye()
	{
		System.out.println("Auf Wiedersehen!");
	}
	
	// showBanner() gibt den banner des hauptprogramms aus
	public static void showBanner()
	{
		System.out.println("[[[[[[[ Klausurprojekt JAV1 Georg ]]]]]]]");
		System.out.println("------------------------------------------");
	}
}