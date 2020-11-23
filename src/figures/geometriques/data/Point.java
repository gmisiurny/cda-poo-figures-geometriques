package figures.geometriques.data;

import figurs.geometriques.interfaces.ITranslation;

public class Point implements ITranslation {
	private int x;
	private int y;
	
	public int getX() {
		return this.x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return this.y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public void translate(Point point) {
		// TODO Auto-generated method stub
	}
}
