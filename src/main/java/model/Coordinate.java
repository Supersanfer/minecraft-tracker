package model;

public class Coordinate {
	private String tag;
	private String description;
	private int positionX;
	private int positionY;
	private int positionZ;

	public Coordinate(String tag, String description, int positionX, int positionY, int positionZ) {
		this.tag = tag;
		this.description = description;
		this.positionX = positionX;
		this.positionY = positionY;
		this.positionZ = positionZ;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPositionX() {
		return positionX;
	}

	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}

	public int getPositionY() {
		return positionY;
	}

	public void setPositionY(int positionY) {
		this.positionY = positionY;
	}

	public int getPositionZ() {
		return positionZ;
	}

	public void setPositionZ(int positionZ) {
		this.positionZ = positionZ;
	}

	@Override
	public String toString() {
		return "Coordinate{" +
				"tag='" + tag + '\'' +
				", description='" + description + '\'' +
				", position= " + positionX + " | "+ positionY + " | " + positionZ + " | "+
				'}';
	}
}
