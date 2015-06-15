public class CvorStabla {

	private int podatak;
	private String tekst;
	private CvorStabla levo;
	private CvorStabla desno;

	public CvorStabla(int p, String t, CvorStabla l, CvorStabla d) {

		podatak = p;
		tekst = t;
		levo = l;
		desno = d;
	}

	public int getPodatak() {
		return podatak;
	}

	public void setPodatak(int podatak) {
		this.podatak = podatak;
	}

	public String getTekst() {
		return tekst;
	}

	public void setTekst(String tekst) {
		this.tekst = tekst;
	}

	public CvorStabla getLevo() {
		return levo;
	}

	public void setLevo(CvorStabla levo) {
		this.levo = levo;
	}

	public CvorStabla getDesno() {
		return desno;
	}

	public void setDesno(CvorStabla desno) {
		this.desno = desno;
	}

}
