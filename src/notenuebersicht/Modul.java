package notenuebersicht;

import java.util.List;

import kalender.main.Veranstaltung;

public class Modul {
	private List<Veranstaltung> veranstaltungen;
	private double note;
	
	public List<Veranstaltung> getVeranstaltungen() {
		return veranstaltungen;
	}
	public void setVeranstaltungen(List<Veranstaltung> veranstaltungen) {
		this.veranstaltungen = veranstaltungen;
	}
	public double getNote() {
		return note;
	}
	public void setNote(double note) {
		this.note = note;
	}
}
