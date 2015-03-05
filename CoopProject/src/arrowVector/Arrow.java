package arrowVector;

import GLOOP.GLPrismoid;
import GLOOP.GLVektor;

public class Arrow {
	Line body;
	GLPrismoid head;
	
	GLVektor arrow;
	GLVektor pos;
	public Arrow(GLVektor pPosition, GLVektor pArrow) {
		body = new Line();
		setPos(pPosition);
		setArrow(pArrow);
	}
}