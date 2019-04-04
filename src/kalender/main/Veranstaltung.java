package kalender.main;

import java.util.List;

public class Veranstaltung {
	private List<Termin> termine;
	private String titel;
	private double note;
	private String dozentname;
	
	public Veranstaltung(List<Termin> termine, String titel, double note, String dozentname) {
		super();
		this.termine = termine;
		this.titel = titel;
		this.note = note;
		this.dozentname = dozentname;
	}
	
	public List<Termin> getTermine() {
		return termine;
	}
	public void setTermine(List<Termin> termine) {
		this.termine = termine;
	}
	public String getTitel() {
		return titel;
	}
	public void setTitel(String titel) {
		this.titel = titel;
	}
	public double getNote() {
		return note;
	}
	public void setNote(double note) {
		this.note = note;
	}
	public String getDozentname() {
		return dozentname;
	}
	public void setDozentname(String dozentname) {
		this.dozentname = dozentname;
	}
}
