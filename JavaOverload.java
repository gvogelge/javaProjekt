package georg.vogelgesang.standards;

// klasse JavaOverload implementiert das interface iBannerStandards
public class JavaOverload implements iBannerStandards
{
	// fields
	private String anrede, vorname, nachname;
	private static final String name = "Overload";
	
	// showBanner() vom interface wird konkretisiert
	public void showBanner()
	{
		System.out.println("------------------------------------------");
		System.out.println(JavaOverload.name);
		System.out.println("------------------------------------------");
	}
	
	// erster constructor führt methode showBanner() aus
	public JavaOverload(String banner)
	{
		this.showBanner();
	}
	
	// contructor JavaOverload overloaded vorherigen constructor da ohne parameter
	public JavaOverload()
	{
		System.out.println("Hallo vom Constructor 1 // JavaOverload()");
	}
	
	// contructor JavaOverload(String param1, String param2, String param3) overloaded vorherigen constructor durch parameter
	public JavaOverload(String param1, String param2, String param3)
	{
		this.anrede = param1;
		this.vorname = param2;
		this.nachname = param3;
		System.out.println("Hallo vom Constructor 2 // JavaOverload(String param1, String param2, String param3)");
	}
	
	// contructor JavaOverload(String[] param1) overloaded vorherigen constructor durch andere parameter
	public JavaOverload(String[] param1)
	{
		this.anrede = param1[0];
		this.vorname = param1[1];
		this.nachname = param1[2];
		System.out.println("Hallo vom Constructor 3 // JavaOverload(String[] param1)");
	}
	
	// methode sagHallo
	public void sagHallo()
	{
		System.out.println("Hallo " + this.anrede + " " + this.vorname + " " + this.nachname + " // JavaOverload.sagHallo()");
	}
}