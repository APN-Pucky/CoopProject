package gravity;

public enum Material 
{
	Fe("Eisen", 55.85),Au("Gold",196.97),H("Wasserstoff",1.008),Uuq("Ununquadium",289);
	
	private double density;
	private String pName;
	private String name;
	
	private Material(String name, double density)
	{
		this("",name,density);
		setPeriodName(this.name());
	}
	private Material(String pName, String name, double density)
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
