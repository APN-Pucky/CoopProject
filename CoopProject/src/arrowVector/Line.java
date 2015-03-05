package arrowVector;

import GLOOP.GLTextur;
import GLOOP.GLVektor;
import GLOOP.GLZylinder;

public class Line {
	GLVektor pos1, pos2;
	GLZylinder obj;
	public Line(GLVektor pPosition, GLVektor qPosition, double pDicke) {		
		setLine(pPosition, qPosition);
	}

	public Line(GLVektor pPosition, GLVektor qPosition, double pDicke, GLTextur pT) {
		
	}
	
	public void pointIn(GLVektor pSight) {
		
	}
	public void setPos2(GLVektor pPos) {
		setLine(pos1, pPos);
	}
	public void setPos1(GLVektor pPos) {
		setLine(pPos, pos2);
	}
	public void setLine(GLVektor pPosition, GLVektor qPosition) {
		pos1 = pPosition;
		pos2 = qPosition;
		
		GLVektor middle = new GLVektor(pos1);
		middle.addiere(pos2);
		middle.multipliziere(0.5);
		
		GLVektor length = new GLVektor(pos2);
		length.subtrahiere(pos1);
		double lengthAbs = length.gibBetrag();
		
		obj = new GLZylinder(0,0,0, pDicke, 0);
	}
}