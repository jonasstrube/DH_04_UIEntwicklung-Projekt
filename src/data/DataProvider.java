package data;

import java.util.ArrayList;
import java.util.List;

import kalender.main.Veranstaltung;
import notenuebersicht.Modul;

public class DataProvider {
	private static List<Modul> semester1;
	private static List<Modul> semester2;

	private static List<Modul> semester3;
	private static List<Modul> semester4;

	private static List<Modul> semester5;
	private static List<Modul> semester6;

	
	public DataProvider() {
		semester1 = new ArrayList();
		
		for (double i = 0; i < 4; i++) {
			Modul modul = new Modul();
			
			modul.setNote(1.0 + (i/10));
			modul.setVeranstaltungen(this.getNewVeranstaltungen());
			
			semester1.add(modul);
		}
	}


	private List<Veranstaltung> getNewVeranstaltungen() {
		List<Veranstaltung> veranstaltungen = new ArrayList();
		
		veranstaltungen.add(new Veranstaltung(null, "Statistik", 1.4, "Meyer"));
		veranstaltungen.add(new Veranstaltung(null, "Statistik", 1.4, "Meyer"));
		veranstaltungen.add(new Veranstaltung(null, "Statistik", 1.4, "Meyer"));
		
		
		return veranstaltungen;
	}


	public List<String> getSemesterTexte() {
		List<String> semesterTexte = new ArrayList();
		
		semesterTexte.add("Semester 1 & 2");
		semesterTexte.add("Semester 3 & 4");
		semesterTexte.add("Semester 5 & 6");
		
		return semesterTexte;
	}


	public List<Double> getSemesterNoten() {
		List<Double> noten = new ArrayList();
		
		// TODO get 3 noten from the semesters
		
		noten.add(1.0);
		noten.add(1.3);
		noten.add(1.2);
		
		return noten;
	}
	
}
