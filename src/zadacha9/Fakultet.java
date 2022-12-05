package zadacha9;

public class Fakultet {
	private String ime;
	private int brNaSmerovi;
	private int brNaStudenti;
	Fakultet (String Ime, int BrNaSmerovi, int BrNaStudenti){
		this.ime = Ime;
		this.brNaSmerovi = BrNaSmerovi;
		this.brNaStudenti = BrNaStudenti;
	}
	public String getIme() {
		return ime;
	}
	public int getBrNaSmerovi() {
		return brNaSmerovi;
	}
	public int getBrNaStudenti() {
		return brNaStudenti;
	}
}
