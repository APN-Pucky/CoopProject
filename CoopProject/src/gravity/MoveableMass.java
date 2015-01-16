package gravity;

import GLOOP.GLKugel;
import GLOOP.GLVektor;


public class MoveableMass extends GLKugel {
	GLVektor speed, force;
	double mass;
	Material matter;
	
	public MoveableMass(GLVektor pPosition, Material matter, double mass) {
		super(pPosition, 1);
		initial();
	}
	public void initial() {
		speed = new GLVektor(0,0,0);
		force = new GLVektor(0,0,0);
	}
	public void setMass(double pMass) {
		this.mass = mass;
		this.setzeSkalierung(Math.pow((3/4) * mass / matter.getDichte() / Math.PI,1/3));
	}
	public void setRadius(double pRadius) {
		this.setzeSkalierung(pRadius);
		double volume = (4/3) * Math.PI * Math.pow(pRadius, 3);
		mass = volume * matter.getDichte();
	}
}