
public class CercleAvecRestriction<T2 extends Point>{
int rayon;
T2 centre;
	public CercleAvecRestriction() {
		// TODO Auto-generated constructor stub
	}
	public int getRayon() {
		return rayon;
	}
	public void setRayon(int rayon) {
		this.rayon = rayon;
	}
	public T2 getCentre() {
		return centre;
	}
	public void setCentre(T2 centre) {
		this.centre = centre;
	}
	public CercleAvecRestriction(int rayon, T2 centre) {
		super();
		this.rayon = rayon;
		this.centre = centre;
	}
	@Override
	public String toString() {
		return "CercleAvecRestriction [rayon=" + rayon + ", centre=" + centre + "]";
	}

}
