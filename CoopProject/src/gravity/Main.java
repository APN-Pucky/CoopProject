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
		new MoveableMass(new GLVektor(40,10,5),PeriodMaterial.Uuq,100);
		new MoveableMass(new GLVektor(100,-60,24),PeriodMaterial.H,1000);
		new MoveableMass(new GLVektor(0,17,5),PeriodMaterial.H,1000);
		new RenderUpdateThread().start();
	}
}
