package kalender.main;

public class Veranstaltung {
	private Termin[] termine;
	private String titel;
	private int note;
	private String dozentname;
	public Termin[] getTermine() {
		return termine;
	}
	public void setTermine(Termin[] termine) {
		this.termine = termine;
	}
	public String getTitel() {
		return titel;
	}
	public void setTitel(String titel) {
		this.titel = titel;
	}
	public int getNote() {
		return note;
	}
	public void setNote(int note) {
		this.note = note;
	}
	public String getDozentname() {
		return dozentname;
	}
	public void setDozentname(String dozentname) {
		this.dozentname = dozentname;
	}
}
