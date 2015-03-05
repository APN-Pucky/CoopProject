package gravity;

import gravity.material.Material;
import gravity.material.PeriodMaterial;
import GLOOP.GLVektor;

public class Elektron extends MoveableCharge {

	public Elektron(GLVektor pPosition) {
		super(pPosition, PeriodMaterial.ELECTRON, 9.10938291e-31, -1.602176565e-19); 
//		this.setScale(1000000);
	}

}
