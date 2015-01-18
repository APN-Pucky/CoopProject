package test;

import gravity.MoveableMass;
import gravity.RenderUpdateThread;
import gravity.material.Material;
import gravity.material.PeriodMaterial;
import GLOOP.GLKugel;
import GLOOP.GLLicht;
import GLOOP.GLMaterial;
import GLOOP.GLSchwenkkamera;
import GLOOP.GLVektor;

public class Test 
{
	public static void main(String[] args)
	{
		
		new GLSchwenkkamera();
		new GLLicht();
		new MoveableMass(new GLVektor(0,0,0),PeriodMaterial.Uuq,100000).setSpeed(new GLVektor(0,0.001,0));
		new MoveableMass(new GLVektor(10,0,0),PeriodMaterial.H,10).setSpeed(new GLVektor(0,0.002,0));
		new MoveableMass(new GLVektor(-10,0,0),PeriodMaterial.H,10).setSpeed(new GLVektor(0,-0.002,0));
		new MoveableMass(new GLVektor(0,10,0),PeriodMaterial.H,10).setSpeed(new GLVektor(-0.002,0,0));
		new MoveableMass(new GLVektor(0,-10,0),PeriodMaterial.H,10).setSpeed(new GLVektor(0.002,0,0));
		new MoveableMass(new GLVektor(0,0,-90),PeriodMaterial.Uuq,100000).setSpeed(new GLVektor(-0.001,0,0));
		new MoveableMass(new GLVektor(10,0,-90),PeriodMaterial.H,10).setSpeed(new GLVektor(0,0.002,0));
		new MoveableMass(new GLVektor(-10,0,-90),PeriodMaterial.H,10).setSpeed(new GLVektor(0,-0.002,0));
		new MoveableMass(new GLVektor(0,10,-90),PeriodMaterial.H,10).setSpeed(new GLVektor(-0.002,0,0));
		new MoveableMass(new GLVektor(0,-10,-90),PeriodMaterial.H,10).setSpeed(new GLVektor(0.002,0,0));
		new MoveableMass(new GLVektor(0,0,-50),PeriodMaterial.Uuq,100000).setSpeed(new GLVektor(0.001,0,0));
		new MoveableMass(new GLVektor(10,0,-50),PeriodMaterial.H,10).setSpeed(new GLVektor(0,0.002,0));
		new MoveableMass(new GLVektor(-10,0,-50),PeriodMaterial.H,10).setSpeed(new GLVektor(0,-0.002,0));
		new MoveableMass(new GLVektor(0,10,-50),PeriodMaterial.H,10).setSpeed(new GLVektor(-0.002,0,0));
		new MoveableMass(new GLVektor(0,-10,-50),PeriodMaterial.H,10).setSpeed(new GLVektor(0.002,0,0));
		new MoveableMass(new GLVektor(0,0,30),PeriodMaterial.Uuq,100000).setSpeed(new GLVektor(0,-0.001,0));
		new MoveableMass(new GLVektor(10,0,30),PeriodMaterial.H,10).setSpeed(new GLVektor(0,0.002,0));
		new MoveableMass(new GLVektor(-10,0,30),PeriodMaterial.H,10).setSpeed(new GLVektor(0,-0.002,0));
		new MoveableMass(new GLVektor(0,10,30),PeriodMaterial.H,10).setSpeed(new GLVektor(-0.002,0,0));
		new MoveableMass(new GLVektor(0,-10,30),PeriodMaterial.H,10).setSpeed(new GLVektor(0.002,0,0));
		
		new MoveableMass(new GLVektor(0,0,-110),PeriodMaterial.Fe,100000).setSpeed(new GLVektor(0,0.001,0));
		new MoveableMass(new GLVektor(10,0,-110),PeriodMaterial.Au,10).setSpeed(new GLVektor(0,0.002,0));
		new MoveableMass(new GLVektor(-10,0,-110),PeriodMaterial.Au,10).setSpeed(new GLVektor(0,-0.002,0));
		new MoveableMass(new GLVektor(0,10,-110),PeriodMaterial.Au,10).setSpeed(new GLVektor(-0.002,0,0));
		new MoveableMass(new GLVektor(0,-10,-110),PeriodMaterial.Au,10).setSpeed(new GLVektor(0.002,0,0));
		new MoveableMass(new GLVektor(0,0,1190),PeriodMaterial.Fe,100000).setSpeed(new GLVektor(-0.001,0,0));
		new MoveableMass(new GLVektor(10,0,1190),PeriodMaterial.Au,10).setSpeed(new GLVektor(0,0.002,0));
		new MoveableMass(new GLVektor(-10,0,1190),PeriodMaterial.Au,10).setSpeed(new GLVektor(0,-0.002,0));
		new MoveableMass(new GLVektor(0,10,1190),PeriodMaterial.Au,10).setSpeed(new GLVektor(-0.002,0,0));
		new MoveableMass(new GLVektor(0,-10,1190),PeriodMaterial.Au,10).setSpeed(new GLVektor(0.002,0,0));
		new MoveableMass(new GLVektor(0,0,1150),PeriodMaterial.Fe,100000).setSpeed(new GLVektor(0.001,0,0));
		new MoveableMass(new GLVektor(10,0,1150),PeriodMaterial.Au,10).setSpeed(new GLVektor(0,0.002,0));
		new MoveableMass(new GLVektor(-10,0,1150),PeriodMaterial.Au,10).setSpeed(new GLVektor(0,-0.002,0));
		new MoveableMass(new GLVektor(0,10,1150),PeriodMaterial.Au,10).setSpeed(new GLVektor(-0.002,0,0));
		new MoveableMass(new GLVektor(0,-10,1150),PeriodMaterial.Au,10).setSpeed(new GLVektor(0.002,0,0));
		new MoveableMass(new GLVektor(0,0,-1130),PeriodMaterial.Fe,100000).setSpeed(new GLVektor(0,-0.001,0));
		new MoveableMass(new GLVektor(10,0,-1130),PeriodMaterial.Au,10).setSpeed(new GLVektor(0,0.002,0));
		new MoveableMass(new GLVektor(-10,0,-1130),PeriodMaterial.Au,10).setSpeed(new GLVektor(0,-0.002,0));
		new MoveableMass(new GLVektor(0,10,-1130),PeriodMaterial.Au,10).setSpeed(new GLVektor(-0.002,0,0));
		new MoveableMass(new GLVektor(0,-10,-1130),PeriodMaterial.Au,10).setSpeed(new GLVektor(0.002,0,0));
		new RenderUpdateThread().start();
	}
}