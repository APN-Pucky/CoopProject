package test;

import gravity.material.Material;
import gravity.material.PeriodMaterial;
import GLOOP.GLKugel;
import GLOOP.GLLicht;
import GLOOP.GLMaterial;
import GLOOP.GLSchwenkkamera;

public class Test 
{
	public static void main(String[] args)
	{
		
		Material m = PeriodMaterial.combineMaterial(new Material[]{PeriodMaterial.H,PeriodMaterial.Uuq,PeriodMaterial.H});
		System.out.println(m.getName());
		System.out.println(m.getPeriodName());
		System.out.println(m.getDensity());
		double d = System.nanoTime()/1000D;
		System.out.println(d);
	}
}