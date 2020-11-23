package figures.geometriques.data;

import figurs.geometriques.interfaces.ITranslation;

public class Segment extends CouleurForme implements ITranslation {
	private Point a;
	private Point b;

	public Point getA() {
		return this.a;
	}
	public void setA(Point a) {
		this.a = a;
	}
	public Point getB() {
		return this.b;
	}
	public void setB(Point b) {
		this.b = b;
	}
	
	@Override
	public void translate(Point point) {
		// TODO Auto-generated method stub
	}
}
