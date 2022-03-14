
public class Test {
int P1;
double P2;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Point <Integer>P1=new Point('a',6,3);
    Point<Double>P2=new Point('b',8,6);
    P1.toString();
    System.out.println(P1);
    P2.toString();
    System.out.println(P2);
	
	PointColoréNG pcng1=new PointColoréNG('c',2,4,"rouge");
	pcng1.toString();
    System.out.println(pcng1);
    PointColoré pc1=new PointColoré('d',5,8,"vert");
    pc1.toString();
    System.out.println(pc1);
    CouleurRVB couleur=new CouleurRVB(1,2,3);
    PointColoré pc2=new PointColoré('f',7,5,couleur);
    pc2.toString();
    System.out.println(pc2);
    Cercle c1 =new Cercle(50,P1);
    System.out.println(c1);
    CercleAvecRestriction car1=new CercleAvecRestriction(100,P2);
    car1.toString();
    System.out.println(car1);
    CercleAvecRestriction car2=new CercleAvecRestriction(30,pc2);
    car2.toString();
    System.out.println(car2);
	}
}
	
