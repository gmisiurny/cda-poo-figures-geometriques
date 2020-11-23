package figures.geometriques.data;

import figurs.geometriques.interfaces.IRotation;
import figurs.geometriques.interfaces.ITranslation;

public class Quadrilatere extends CouleurForme implements ITranslation, IRotation {
	private Point a;
	private Point b;
	private Point c;
	private Point d;
	
	Quadrilatere(Point a, Point b, Point c, Point d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	
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
	public Point getC() {
		return this.c;
	}
	public void setC(Point c) {
		this.c = c;
	}
	public Point getD() {
		return this.d;
	}
	public void setD(Point d) {
		this.d = d;
	}
	
	@Override
	public void translate(Point point) {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void rotate(int degres) {
		// TODO Auto-generated method stub
	}
}
