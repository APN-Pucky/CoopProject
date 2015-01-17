package gravity.material;

/**
 * 
 * @author APN-Pucky
 *
 */

public enum PeriodMaterial implements Material
{
	Fe(new MaterialClass("Eisen","Fe", 55.85)),
	Au(new MaterialClass("Gold","Au",196.97)),
	H(new MaterialClass("Wasserstoff","H",1.008)),
	Uuq(new MaterialClass("Ununquadium","Uuq",289));
	
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
		name = (String) name.subSequence(0, name.length()-1);
		pName = (String) pName.subSequence(0, pName.length()-1);
		return (Material) new MaterialClass(name, pName, density);
	}

	@Override
	public String getName() {
		return mc.getName();
	}

	@Override
	public String getPeriodName() {
		return mc.getPeriodName();
	}

	@Override
	public double getDensity() {
		return mc.getDensity();
	}
}
