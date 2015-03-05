package gravity;

import GLOOP.GLLicht;
import GLOOP.GLSchwenkkamera;
import GLOOP.GLVektor;

public class Main 
{
	public static void main(String[] args)
	{
		new GLSchwenkkamera();
		new GLLicht();
		Elektron e = new Elektron(new GLVektor(0,0,0));
		e.setSpeed(new GLVektor(1,0,0));
		e.setScale(1);
		
		Global.electricField.add(new Field() {
			public GLVektor getVector(GLVektor pos) {
				
				return new GLVektor(0,0,0);
			}
			
		});Global.magneticField.add(new Field() {
			public GLVektor getVector(GLVektor pos) {
				
				return new GLVektor(0,0,0.03);
			}
			
		});
		new RenderUpdateThread(0.000_0001).start();
	}
}
