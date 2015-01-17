package gravity;

import java.util.ArrayList;

import GLOOP.GLVektor;

public class UpdateThread extends ArrayList<MoveableMass> {
	private static final long serialVersionUID = 1584782928231004369L;
	long latestCheck;
	
	public UpdateThread() {
		super();
		latestCheck = System.nanoTime();
	}
	public UpdateThread(MoveableMass[] object) {
		this();
		this.addObjects(object);
	}
	public void addObjects(MoveableMass[] object) {
		for(MoveableMass o : object) {
			this.add(o);
		}
	}
	public void updatePos() {
		double time = (System.nanoTime() - latestCheck)*1.0 / 1_000_000_000;
		for(MoveableMass o : this) {
			o.calcSpeed(time);
			o.move(time);
		}
		latestCheck = System.nanoTime();
	}
	public void calcForce() {
		for(MoveableMass o : this) {
			GLVektor pForce = new GLVektor(0,0,0);
			for(MoveableMass p : this) {
				if(o != p) {
					GLVektor ppForce = new GLVektor(p.gibPosition());
					ppForce.subtrahiere(o.gibPosition());
					double distance = ppForce.gibBetrag();
					ppForce.normalisiere();
					
					ppForce.multipliziere(o.getMass()*p.getMass()/Math.pow(distance, 2));
					
					pForce.addiere(ppForce);
				}
			}
			o.setForce(pForce);
		}
	}
}