package popravnitest;

import java.util.Scanner;

public class TestTorta {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\tTest:");
		Sastojak s1 = new Sastojak();
		System.out.print("Naziv sastojka: ");
		s1.setNaziv();
		System.out.print("Kolicina: ");
		s1.setKolicina();
		System.out.print("Jedinica mere: ");
		s1.setJedinicaMere();
		System.out.println();
		Sastojak s2 = new Sastojak();
		System.out.print("Naziv sastojka: ");
		s2.setNaziv();
		System.out.print("Kolicina: ");
		s2.setKolicina();
		System.out.print("Jedinica mere: ");
		s2.setJedinicaMere();
		System.out.println();
		Sastojak s3 = new Sastojak();
		System.out.print("Naziv sastojka: ");
		s3.setNaziv();
		System.out.print("Kolicina: ");
		s3.setKolicina();
		System.out.print("Jedinica mere: ");
		s3.setJedinicaMere();
		System.out.println();
		Sastojak[] sastojci = { s1, s2, s3 };
		ReceptTorta t1 = new ReceptTorta(sastojci);
		System.out.println();
		System.out.print("Unesite tezinu recepta: ");
		t1.setNivoTezine();
		System.out.println(t1);
		System.out.println();
		System.out.println("\tMasa torte: " + ReceptTorta.ukupnaMasaTorte() + "g");
	}

}
