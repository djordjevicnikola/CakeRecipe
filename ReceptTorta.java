package popravnitest;

import java.util.Scanner;

public class ReceptTorta {
	private static Sastojak[] sastojci;
	private int nivoTezine;
	private static double ukupnaMasa = 0;

	public ReceptTorta(Sastojak[] sastojci) {
		this.sastojci = sastojci;
//		if (nivoTezine < 1 || nivoTezine > 5) {
//			this.nivoTezine = 3;
//		} else {
//			this.nivoTezine = nivoTezine;
//		}
	}

	public void setNivoTezine() {
		Scanner sc = new Scanner(System.in);
		this.nivoTezine = sc.nextInt();
		if (nivoTezine < 1 || nivoTezine > 5) {
			this.nivoTezine = 3;
		}
	}

	public String tezinaRecepta() {
		if (nivoTezine == 1)
			return "1-lak";
		if (nivoTezine == 2)
			return "2-srednje lak";
		if (nivoTezine == 3)
			return "3-srednji";
		if (nivoTezine == 4)
			return "1-srednje tezak";
		else
			return "5-tezak";
	}

	public static double ukupnaMasaTorte() {

		for (int i = 0; i < sastojci.length; i++) {
			if (sastojci[i].getJedinicaMere().equals("g")) {
				ukupnaMasa += sastojci[i].getKolicina();
			}

		}
		return ukupnaMasa;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Lista sastojaka: ");
		for (int i = 0; i < sastojci.length; i++) {
			sb.append("\n" + (i + 1) + ". " + sastojci[i].toString());
		}
		return sb.toString();
	}

}
