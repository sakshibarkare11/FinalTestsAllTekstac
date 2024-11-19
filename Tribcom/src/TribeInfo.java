
public class TribeInfo {
	private String tribeName;
	private String location;
	private String language;
	private String socioEconomicStatus;
	private long population;
	public String getTribeName() {
		return tribeName;
	}
	public void setTribeName(String tribeName) {
		this.tribeName = tribeName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getSocioEconomicStatus() {
		return socioEconomicStatus;
	}
	public void setSocioEconomicStatus(String socioEconomicStatus) {
		this.socioEconomicStatus = socioEconomicStatus;
	}
	public long getPopulation() {
		return population;
	}
	public void setPopulation(long population) {
		this.population = population;
	}
	public TribeInfo() {
		super();
	}
	public TribeInfo(String tribeName, String location, String language, String socioEconomicStatus, long population) {
		super();
		this.tribeName = tribeName;
		this.location = location;
		this.language = language;
		this.socioEconomicStatus = socioEconomicStatus;
		this.population = population;
	}
	
	
}
