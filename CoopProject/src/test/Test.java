package test;

import GLOOP.*;

public class Test 
{
	public static void main(String[] args)
	{
		new GLEntwicklerkamera();
		new GLLicht();
		
		new GLKugel(0,0,0, 10).setzeMaterial(GLMaterial.GUMMI);
	}
}
