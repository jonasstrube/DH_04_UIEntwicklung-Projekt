package data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import kalender.main.Veranstaltung;
import notenuebersicht.Modul;
import startseite.Tile;

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

	private static Collection<Tile> getNews() {
        Collection<Tile> news = new ArrayList<Tile>();
        news.add(new Tile("Heute:","Die Vorlesung Rechnungslegung fällt morgen aus!"));
        news.add(new Tile("18.02","Die Vorlesung Verteilte Systeme fällt am 19.2 aus!"));
        news.add(new Tile("02.02","Die Abgabefirst für die UI-DOku ist der 05.04!"));
        news.add(new Tile("28.01","Die Vorlesung Datenbanken wird um 1h auf 15 Uhr verschoben!"));
        return news;
    }
    private static Collection<Tile> getTiles(){
        Collection<Tile> tiles = new ArrayList<Tile>();
        tiles.add(new Tile("Notenübersicht","Neuste Note: 1,3 in Statistik"));
        tiles.add(new Tile("Stundenplan","Nächste Vorlesung: UI in 2h 34min"));
        return tiles;
    }
	
}
