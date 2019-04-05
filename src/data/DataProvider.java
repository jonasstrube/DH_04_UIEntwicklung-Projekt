package data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import kalender.main.Veranstaltung;
import notenuebersicht.Modul;
import startseite.Tile;

public class DataProvider {
	private static boolean dataIsInitialized = false;

	private static List<Modul> semester1;
	private static List<Modul> semester2;

	private static List<Modul> semester3;
	private static List<Modul> semester4;

	private static List<Modul> semester5;
	private static List<Modul> semester6;

	// Konstruktor
	// iniziiert die Daten

	public DataProvider() {
		if (!dataIsInitialized) {

			semester1 = new ArrayList();

			for (double i = 0; i < 4; i++) {
				Modul modul = new Modul();

				modul.setNote(1.0 + (i / 16));
				modul.setVeranstaltungen(this.getNewVeranstaltungen());

				semester1.add(modul);
			}

			semester2 = new ArrayList();

			for (double i = 0; i < 4; i++) {
				Modul modul = new Modul();

				modul.setNote(1.0 + (i / 13));
				modul.setVeranstaltungen(this.getNewVeranstaltungen());

				semester2.add(modul);
			}

			semester3 = new ArrayList();

			for (double i = 0; i < 4; i++) {
				Modul modul = new Modul();

				modul.setNote(1.0 + (i / 5));
				modul.setVeranstaltungen(this.getNewVeranstaltungen());

				semester3.add(modul);
			}

			semester4 = new ArrayList();

			for (double i = 0; i < 4; i++) {
				Modul modul = new Modul();

				modul.setNote(1.0 + (i / 5));
				modul.setVeranstaltungen(this.getNewVeranstaltungen());

				semester4.add(modul);
			}

			semester5 = new ArrayList();

			for (double i = 0; i < 4; i++) {
				Modul modul = new Modul();

				modul.setNote(1.0 + (i / 7));
				modul.setVeranstaltungen(this.getNewVeranstaltungen());

				semester5.add(modul);
			}

			semester6 = new ArrayList();

			for (double i = 0; i < 4; i++) {
				Modul modul = new Modul();

				modul.setNote(1.0 + (i / 7));
				modul.setVeranstaltungen(this.getNewVeranstaltungen());

				semester6.add(modul);
			}
			
			dataIsInitialized = true;
		}
	}

	// Methoden für die Notenübersicht

	public List<String> getSemesterTexte() {
		List<String> semesterTexte = new ArrayList();

		semesterTexte.add("Semester 1 & 2");
		semesterTexte.add("Semester 3 & 4");
		semesterTexte.add("Semester 5 & 6");

		return semesterTexte;
	}

	public List<Double> getSemesterNoten() {
		List<Double> noten = new ArrayList();

		// Schnitt berechnen von dem Jahr
		// Schnitt auf zwei Nachkommastellen abschneiden
		// Schnitt den Jahresnoten hinzufügen
		double jahr1note = this.calculateNotenschnitt(semester1, semester2);
		jahr1note = Math.floor(jahr1note * 100) / 100;
		noten.add(jahr1note);

		// Schnitt berechnen von dem Jahr
		// Schnitt auf zwei Nachkommastellen abschneiden
		// Schnitt den Jahresnoten hinzufügen
		double jahr2note = this.calculateNotenschnitt(semester3, semester4);
		jahr2note = Math.floor(jahr2note * 100) / 100;
		noten.add(jahr2note);

		// Schnitt berechnen von dem Jahr
		// Schnitt auf zwei Nachkommastellen abschneiden
		// Schnitt den Jahresnoten hinzufügen
		double jahr3note = this.calculateNotenschnitt(semester5, semester6);
		jahr3note = Math.floor(jahr3note * 100) / 100;
		noten.add(jahr3note);

		return noten;
	}
  
	// Methoden f�r Daten der �bersicht

	public ArrayList<Tile> getNews() {
		ArrayList<Tile> news = new ArrayList<Tile>();
		news.add(new Tile("Heute:", "Die Vorlesung Rechnungslegung fällt morgen aus!"));
		news.add(new Tile("18.02", "Die Vorlesung Verteilte Systeme fällt am 19.2 aus!"));
		news.add(new Tile("02.02", "Die Abgabefirst für die UI-DOku ist der 05.04!"));
		news.add(new Tile("28.01", "Die Vorlesung Datenbanken wird um 1h auf 15 Uhr verschoben!"));
		return news;
	}

	public ArrayList<Tile> getTiles() {
		ArrayList<Tile> tiles = new ArrayList<Tile>();
		tiles.add(new Tile("Notenübersicht", "Neuste Note: 1,3 in Statistik"));
		tiles.add(new Tile("Stundenplan", "Nächste Vorlesung: UI in 2h 34min"));
		return tiles;
	}

	// private Methoden

	private List<Veranstaltung> getNewVeranstaltungen() {
		List<Veranstaltung> veranstaltungen = new ArrayList();

		veranstaltungen.add(new Veranstaltung(null, "Statistik", 0, "Meyer"));
		veranstaltungen.add(new Veranstaltung(null, "Wirtschaftsinformatik", 0, "Müller"));
		veranstaltungen.add(new Veranstaltung(null, "Datenbankentwurf", 0, "Maier"));

		return veranstaltungen;
	}

	private double calculateNotenschnitt(List<Modul> semesterA, List<Modul> semesterB) {
		double notensumme = 0;
		int anzahldernoten = 0;

		for (Modul modul : semesterA) {
			notensumme += modul.getNote();
			anzahldernoten++;
		}

		for (Modul modul : semesterB) {
			notensumme += modul.getNote();
			anzahldernoten++;
		}

		double schnitt = notensumme / anzahldernoten;

		return schnitt;
	}
}
