
public class PointColor�NG extends Point<Integer> {


	private String couleur;

	public PointColor�NG() {
		// TODO Auto-generated constructor stub
	}
	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public PointColor�NG(char nom, Integer abs, Integer ord, String couleur) {
		super(nom, abs, ord);
		this.couleur = couleur;
	}
	@Override
	public String toString() {
		return "PointColor�NG [couleur=" + couleur + ", toString()=" + super.toString() + "]";
	}

}
