package notenuebersicht;

import kalender.main.Veranstaltung;

public class Modul {
	private Veranstaltung[] veranstaltungen;
	private int note;
	public Veranstaltung[] getVeranstaltungen() {
		return veranstaltungen;
	}
	public void setVeranstaltungen(Veranstaltung[] veranstaltungen) {
		this.veranstaltungen = veranstaltungen;
	}
	public int getNote() {
		return note;
	}
	public void setNote(int note) {
		this.note = note;
	}
}
