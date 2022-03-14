
public class CouleurRVB {
int rouge;
int vert;
int bleu;

	public CouleurRVB() {
		// TODO Auto-generated constructor stub
	}

	public int getRouge() {
		return rouge;
	}

	public void setRouge(int rouge) {
		this.rouge = rouge;
	}

	public int getVert() {
		return vert;
	}

	public void setVert(int vert) {
		this.vert = vert;
	}

	public int getBleu() {
		return bleu;
	}

	public void setBleu(int bleu) {
		this.bleu = bleu;
	}

	public CouleurRVB(int rouge, int vert, int bleu) {
		super();
		this.rouge = rouge;
		this.vert = vert;
		this.bleu = bleu;
	}

	@Override
	public String toString() {
		return "CouleurRVB [rouge=" + rouge + ", vert=" + vert + ", bleu=" + bleu + "]";
	}

}
