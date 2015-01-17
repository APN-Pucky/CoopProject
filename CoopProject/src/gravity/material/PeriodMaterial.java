package gravity.material;

/**
 * 
 * @author APN-Pucky
 *
 */

public enum PeriodMaterial implements Material
{
	Fe(new MaterialClass("Fe","Eisen", 55.85)),
	Au(new MaterialClass("Au","Gold",196.97)),
	H(new MaterialClass("H","Wasserstoff",1.008)),
	Uuq(new MaterialClass("uuq","Ununquadium",289));
	
	private Material mc;
	
	private PeriodMaterial(MaterialClass mc)
	{
		this.mc = mc;
	}
	
	
	public static Material combineMaterial(Material[] ma)
	{
		String name = "";
		String pName = "";
		double density = 0;
		for(Material m : ma)
		{
			name += m.getName() + "+";
			pName += m.getPeriodName() + "-";
			density += m.getDensity();
		}
		name.subSequence(0, pName.length()-1);
		pName.subSequence(0, pName.length()-1);
		return (Material) new MaterialClass(name, pName, density);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPeriodName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getDensity() {
		// TODO Auto-generated method stub
		return 0;
	}
}
