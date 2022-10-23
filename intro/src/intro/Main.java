package intro;

public class Main {

	public static void main(String[] args) {

		System.out.println("Hello World!");

		// deðiþken isimlendirmeleri java'da camelCase yazýlýr
		String ortaMetin = "Ýlginizi çekebilir";
		String altMetin = "Vade süresi";

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
		String[] krediler = {"Hýzlý kredi","Maaþýný Halkbanktan","Mutlu Emekli"};
	
		for(int i = 0;i<krediler.length;i++) {
			System.out.println(krediler[i]);
			
		}
	}

}
