package popravnitest;

import java.util.Scanner;

public class Sastojak {
	private String naziv;
	private double kolicina;
	private String jedinicaMere;
	private static String[] dozvSastojci = { "jaje", "brasno", "secer", "puter" };

	public Sastojak() {

	}

	public static boolean dozvoljenSastojak(String naziv) {
		for (int i = 0; i < dozvSastojci.length; i++) {
			if (naziv.equals(dozvSastojci[i])) {
				return true;
			}
		}
		System.out.println("Pogresan unos");
		return false;

	}

	public void setNaziv() {
		Scanner sc = new Scanner(System.in);
		this.naziv = sc.nextLine();
	}

	public void setKolicina() {
		Scanner sc = new Scanner(System.in);
		this.kolicina = sc.nextDouble();
	}

	public void setJedinicaMere() {
		Scanner sc = new Scanner(System.in);
		this.jedinicaMere = sc.nextLine();
	}

	public String getNaziv() {
		return naziv;
	}

	public double getKolicina() {
		return kolicina;
	}

	public String getJedinicaMere() {
		return jedinicaMere;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.naziv + " (kolicina: " + this.kolicina + " " + this.jedinicaMere + ")");
		return sb.toString();
	}

}
