package gravity;

import gravity.material.Material;
import GLOOP.GLKugel;
import GLOOP.GLVektor;


public class MoveableMass extends GLKugel implements Updateable {
	GLVektor speed, force;
	double mass;
	Material matter;
	
	public MoveableMass(GLVektor pPosition, Material matter, double mass) {
		super(pPosition, 1);
		initial();
        setMaterial(matter);
        setMass(mass);
        Global.mma.add(this);
        Global.updates.add(this);
	}
	public void initial() {
		speed = new GLVektor(0,0,0);
		force = new GLVektor(0,0,0);
	}
    public void setMaterial(Material matter) {
        this.matter = matter;
    }
	public void setMass(double pMass) {
		this.mass = pMass;
		this.setzeSkalierung(Math.pow((3/4) * mass / matter.getDensity() / Math.PI,1/3));
	}
	public double getMass()  {
		return mass;
	}
	public void setRadius(double pRadius) {
		this.setzeSkalierung(pRadius);
		double volume = (4/3) * Math.PI * Math.pow(pRadius, 3);
		mass = volume * matter.getDensity();
	}
	synchronized public void setForce(GLVektor pForce) {
		synchronized(force) {
			this.force = pForce;
		}
	}
	public void calcSpeed(double time) {
		GLVektor pForce = new GLVektor(force);
		pForce.multipliziere(time/mass);
		speed.addiere(pForce);
	}
	public void move(double time) {
		GLVektor pSpeed = new GLVektor(speed);
		pSpeed.multipliziere(time);
		this.verschiebe(pSpeed);
	}
	public void calcForce() {
		GLVektor pForce = new GLVektor(0,0,0);
		for(MoveableMass p : Global.mma) {
			if(this != p) {
				GLVektor ppForce = new GLVektor(p.gibPosition());
				ppForce.subtrahiere(gibPosition());
				double distance = ppForce.gibBetrag();
				ppForce.normalisiere();
				
				ppForce.multipliziere(getMass()*p.getMass()/Math.pow(distance, 2));
				
				pForce.addiere(ppForce);
			}
		}
		setForce(pForce);
	}
	@Override
	public void update(double delta) {
		calcForce();
		calcSpeed(delta);
		move(delta);
	}
}
