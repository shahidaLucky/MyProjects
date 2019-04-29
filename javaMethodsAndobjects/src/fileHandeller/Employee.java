package fileHandeller;

public class Employee {

	private int eId;
	private String eName;
	private String eCity;

	public Employee(int eId, String eName, String eCity) {
		this.eId = eId;
		this.eName = eName;
		this.eCity = eCity;
	}

	/**
	 * @return the eId
	 */
	public int geteId() {
		return eId;
	}

	/**
	 * @param eId the eId to set
	 */
	public void seteId(int eId) {
		this.eId = eId;
	}

	/**
	 * @return the eName
	 */
	public String geteName() {
		return eName;
	}

	/**
	 * @param eName the eName to set
	 */
	public void seteName(String eName) {
		this.eName = eName;
	}

	/**
	 * @return the eCity
	 */
	public String geteCity() {
		return eCity;
	}

	/**
	 * @param eCity the eCity to set
	 */
	public void seteCity(String eCity) {
		this.eCity = eCity;
	}

	public String toString() {
		return this.eId + " " + this.eName + " " + this.eCity;
	}
	

}
