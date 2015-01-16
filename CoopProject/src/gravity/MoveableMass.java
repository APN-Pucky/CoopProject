package gravity;

import GLOOP.GLKugel;
import GLOOP.GLTextur;
import GLOOP.GLVektor;

public class MoveableMass extends GLKugel {
	GLVektor speed, force;
	public MoveableMass(GLVektor pPosition, double pRadius) {
		super(pPosition, pRadius);
		initial();
	}

	public MoveableMass(GLVektor pPosition, double pRadius, GLTextur pTextur) {
		super(pPosition, pRadius, pTextur);
		initial();
	}

	public MoveableMass(GLVektor pPosition, double pRadius, String pTextur) {
		super(pPosition, pRadius, pTextur);
		initial();
	}

	public MoveableMass(double pX, double pY, double pZ, double pRadius) {
		super(pX, pY, pZ, pRadius);
		initial();
	}

	public MoveableMass(double pX, double pY, double pZ, double pRadius,
			GLTextur pT) {
		super(pX, pY, pZ, pRadius, pT);
		initial();
	}

	public MoveableMass(double pX, double pY, double pZ, double pRadius,
			String pTextur) {
		super(pX, pY, pZ, pRadius, pTextur);
		initial();
	}
	public void initial() {
		speed = new GLVektor(0,0,0);
		force = new GLVektor(0,0,0);
	}
}