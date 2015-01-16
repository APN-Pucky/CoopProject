package gravity;

import GLOOP.GLKugel;
import GLOOP.GLTextur;
import GLOOP.GLVektor;

public class MoveableMass extends GLKugel {
	GLVektor speed, force;
	public MoveableMass(GLVektor pPosition, double pRadius) {
		super(pPosition, pRadius);
	}

	public MoveableMass(GLVektor pPosition, double pRadius, GLTextur pTextur) {
		super(pPosition, pRadius, pTextur);
	}

	public MoveableMass(GLVektor pPosition, double pRadius, String pTextur) {
		super(pPosition, pRadius, pTextur);
	}

	public MoveableMass(double pX, double pY, double pZ, double pRadius) {
		super(pX, pY, pZ, pRadius);
	}

	public MoveableMass(double pX, double pY, double pZ, double pRadius,
			GLTextur pT) {
		super(pX, pY, pZ, pRadius, pT);
	}

	public MoveableMass(double pX, double pY, double pZ, double pRadius,
			String pTextur) {
		super(pX, pY, pZ, pRadius, pTextur);
	}

}
