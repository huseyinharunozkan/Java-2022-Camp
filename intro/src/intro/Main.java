package intro;

public class Main {

	public static void main(String[] args) {

		System.out.println("Hello World!");

		// de�i�ken isimlendirmeleri java'da camelCase yaz�l�r
		String ortaMetin = "�lginizi �ekebilir";
		String altMetin = "Vade s�resi";

		System.out.println(ortaMetin);

		// integer

		int vade = 12;

		double dolarDun = 18.25;
		double dolarBugun = 18.30;

		boolean dolarDustuMu = false;

		String okYonu = "";

		if (dolarBugun < dolarDun) { // true
			okYonu = "down.svg";
			System.out.println(okYonu);

		} else if (dolarBugun > dolarDun) {
			okYonu = "up.svg";
			System.out.println(okYonu);

		}

		else {
			okYonu = "equal.svg";
			System.out.println(okYonu);
		}
		String[] krediler = {"H�zl� kredi","Maa��n� Halkbanktan","Mutlu Emekli"};
	
		for(int i = 0;i<krediler.length;i++) {
			System.out.println(krediler[i]);
			
		}
	}

}
