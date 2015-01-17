package gravity.material;

/**
 * 
 * @author APN-Pucky
 *
 */
class MaterialClass implements Material
{
	private double density;
	private String pName;
	private String name;
	
	protected MaterialClass(String name,String pName, double density)
	{
		this.name = name;
		this.pName = pName;
		this.density = density;
	}
	
	void setDensity(double density) {
		this.density = density;
	}
	public double getDensity() {
		return density;
	}
	void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	void setPeriodName(String pName) {
		this.pName = pName;
	}
	public String getPeriodName() {
		return pName;
	}
}