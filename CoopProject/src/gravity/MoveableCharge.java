package gravity;

import gravity.material.Material;
import GLOOP.GLKugel;
import GLOOP.GLVektor;

public class MoveableCharge extends MoveableMass {
	double charge;
	public MoveableCharge(GLVektor pPosition, Material matter, double mass, double charge) {
		super(pPosition, matter, mass);
		this.charge = charge;
	}
	public void setCharge(double pCharge) {
		this.charge = pCharge;
	}
	public double getCharge() {
		return charge;
	}
	public void calcForce() {
		super.calcForce();
		
		GLVektor pForce = new GLVektor(0,0,0);
		for(Field f : Global.electricField) {
			GLVektor ppForce = f.getVector(this.gibPosition());
			ppForce.multipliziere(charge);
			
			pForce.addiere(ppForce);
		}
		for(Field f : Global.magneticField) {
			GLVektor ppForce = f.getVector(this.gibPosition());
			ppForce = ppForce.gibKreuzprodukt(speed);
			ppForce.multipliziere(charge);
			
			pForce.addiere(ppForce);
		}
		force.addiere(pForce);
	}
	public void update(double pTime) {
		super.update(pTime);
		System.out.println("X: "+gibX()+"\tY: "+gibY()+"\tForce: "+force.x+" -:- "+force.y+" -:- "+force.z);
		if (!(gibX()<Double.MAX_VALUE))
			try {
				Thread.sleep(100000000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	public void move(double time) {
		super.move(time);
		new GLKugel(this.gibPosition(),1);
	}
}