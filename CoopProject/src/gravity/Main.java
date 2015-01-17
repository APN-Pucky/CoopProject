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
		new MoveableMass(new GLVektor(0,0,0),PeriodMaterial.Au,10);
		new MoveableMass(new GLVektor(0,10,0),PeriodMaterial.Uuq,10);
		new RenderUpdateThread().start();
	}
}
