package lab5;

public class Alien {
	int eyeNr = 0;
	String eyeColor = "blue";
	String hairColor = "red";
	int armNr = 0;
	int legNr = 0;
	String bodyColor = "green";
	
	public Alien(int eyeNr, String eyeColor, String hairColor, int armNr, int legNr,
			String bodyColor) {
		this.eyeNr = eyeNr;
		this.eyeColor = eyeColor;
		this.hairColor = hairColor;
		this.armNr = armNr;
		this.legNr = legNr;
		this.bodyColor = bodyColor;
	}

	public int getEyeNr() {
		return eyeNr;
	}

	public void setEyeNr(int eyeNr) {
		this.eyeNr = eyeNr;
	}

	public String getEyeColor() {
		return eyeColor;
	}

	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}

	public String getHairColor() {
		return hairColor;
	}

	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}

	public int getArmNr() {
		return armNr;
	}

	public void setArmNr(int armNr) {
		this.armNr = armNr;
	}

	public int getLegNr() {
		return legNr;
	}

	public void setLegNr(int legNr) {
		this.legNr = legNr;
	}

	public String getBodyColor() {
		return bodyColor;
	}

	public void setBodyColor(String bodyColor) {
		this.bodyColor = bodyColor;
	}
	
	public String toString() {
		return "Eye number" + ": " + eyeNr + ". Eye color" + ": " + eyeColor +
				". Hair color" + ": " + hairColor + ". Arm number" + ": " +
				armNr + ". Leg number" + ": " + legNr + ".";
 	}
	
}
