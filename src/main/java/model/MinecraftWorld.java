package model;

import enums.WorldType;
import repository.CoordinatesRepository;

import java.time.LocalDate;
import java.util.List;

/**
 * Represents a Minecraft world with all its relevant metadata and saved coordinates.
 * This class serves as the central model for managing individual Minecraft worlds,
 * including name, version, world type, seed, description, creation date, and important coordinates.
 *
 * It's designed to help organize player-created worlds independently of the game itself,
 * providing structured access to key locations and notes.
 */

public class MinecraftWorld {
	private static int nextWorldId = 1;
	private int worldId;
	private String name;
	private String version;
	private WorldType worldType;
	private String seed;
	private String description;
	private LocalDate creationDate;
	private List<Coordinate> coordinateList;


	// --- CONSTRUCTOR ---
	public MinecraftWorld(String name, String version, WorldType worldType, String seed, String description, LocalDate creationDate) {
		this.worldId = nextWorldId++;
		this.name = name;
		this.version = version;
		this.worldType = worldType;
		this.seed = seed;
		this.description = description;
		this.creationDate = creationDate;
		this.coordinateList = new CoordinatesRepository().getAll();
	}

	public int getWorldId() {
		return worldId;
	}

	public void setWorldId(int worldId) {
		this.worldId = worldId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public WorldType getWorldType() {
		return worldType;
	}

	public void setWorldType(WorldType worldType) {
		this.worldType = worldType;
	}

	public String getSeed() {
		return seed;
	}

	public void setSeed(String seed) {
		this.seed = seed;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}

	public List<Coordinate> getCoordinateList() {
		return coordinateList;
	}

	public void setCoordinateList(List<Coordinate> coordinateList) {
		this.coordinateList = coordinateList;
	}

	// --- METHODS ---
	public void addCoordinate(Coordinate coordinate) throws Exception{
		coordinateList.add(coordinate);
	}

	@Override
	public String toString() {
		return "MinecraftWorld{" +
				"worldId=" + worldId +
				", name='" + name + '\'' +
				", version='" + version + '\'' +
				", worldType=" + worldType +
				", seed='" + seed + '\'' +
				", description='" + description + '\'' +
				", creationDate=" + creationDate +
				", coordinateList=" + coordinateList +
				'}';
	}
}
