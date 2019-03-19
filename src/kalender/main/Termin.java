package kalender.main;

import java.util.Date;

public class Termin {
	private Date startzeit;
	private Date endzeit;
	private String raum;
	private Veranstaltung veranstaltung;
	public Date getStartzeit() {
		return startzeit;
	}
	public void setStartzeit(Date startzeit) {
		this.startzeit = startzeit;
	}
	public Date getEndzeit() {
		return endzeit;
	}
	public void setEndzeit(Date endzeit) {
		this.endzeit = endzeit;
	}
	public String getRaum() {
		return raum;
	}
	public void setRaum(String raum) {
		this.raum = raum;
	}
	public Veranstaltung getVeranstaltung() {
		return veranstaltung;
	}
	public void setVeranstaltung(Veranstaltung veranstaltung) {
		this.veranstaltung = veranstaltung;
	}
}
