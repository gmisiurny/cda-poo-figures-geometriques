package figures.geometriques.data;

import figurs.geometriques.interfaces.ITranslation;

public class Cercle extends CouleurForme implements ITranslation {
	private Point a;
	private int r;
	
	Cercle(Point a, int r) {
		this.a = a;
		this.r = r;
	}

	
	public Point getA() {
		return this.a;
	}
	public void setA(Point a) {
		this.a = a;
	}
	public int getR() {
		return this.r;
	}
	public void setR(int r) {
		this.r = r;
	}
	
	@Override
	public void translate(Point point) {
		
	}
}
