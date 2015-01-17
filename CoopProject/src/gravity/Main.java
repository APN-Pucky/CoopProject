package gravity;

import gravity.material.PeriodMaterial;
import GLOOP.GLLicht;
import GLOOP.GLSchwenkkamera;
import GLOOP.GLVektor;

public class Main 
{
	public static void main(String[] args)
	{
		new GLSchwenkkamera();
		new GLLicht();
		new MoveableMass(new GLVektor(0,0,0),PeriodMaterial.Au,5);
		new MoveableMass(new GLVektor(40,10,5),PeriodMaterial.Uuq,10);
		new MoveableMass(new GLVektor(100,10,5),PeriodMaterial.H,1000);
		new MoveableMass(new GLVektor(0,20,40),PeriodMaterial.Au,56);
		new MoveableMass(new GLVektor(0,10,5),PeriodMaterial.Uuq,10);
		new MoveableMass(new GLVektor(0,70,90),PeriodMaterial.Au,52);
		new MoveableMass(new GLVektor(6,10,5),PeriodMaterial.Uuq,10);
		new RenderUpdateThread().start();
	}
}
