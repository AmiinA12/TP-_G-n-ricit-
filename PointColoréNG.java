
public class PointColoréNG extends Point<Integer> {


	private String couleur;

	public PointColoréNG() {
		// TODO Auto-generated constructor stub
	}
	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public PointColoréNG(char nom, Integer abs, Integer ord, String couleur) {
		super(nom, abs, ord);
		this.couleur = couleur;
	}
	@Override
	public String toString() {
		return "PointColoréNG [couleur=" + couleur + ", toString()=" + super.toString() + "]";
	}

}
