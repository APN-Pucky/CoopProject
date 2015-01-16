package test;

import GLOOP.GLKugel;
import GLOOP.GLLicht;
import GLOOP.GLMaterial;
import GLOOP.GLSchwenkkamera;

public class Test 
{
	public static void main(String[] args)
	{
		new GLSchwenkkamera();
		new GLLicht();
		
		new GLKugel(0,0,0, 10).setzeMaterial(GLMaterial.GUMMI);
	}
}