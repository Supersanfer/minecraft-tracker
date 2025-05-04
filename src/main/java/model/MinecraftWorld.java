package model;

import enums.WorldType;
import repository.CoordinatesRepository;

import java.time.LocalDate;
import java.util.List;

public class MinecraftWorld {
	private String name;
	private String version;
	private WorldType worldType;
	private String seed;
	private String description;
	private LocalDate creationDate;
	private List<Coordinate> coordinateList;

	public MinecraftWorld(String name, String version, WorldType worldType, String seed, String description, LocalDate creationDate, CoordinatesRepository coordinatesRepository) {
		this.name = name;
		this.version = version;
		this.worldType = worldType;
		this.seed = seed;
		this.description = description;
		this.creationDate = creationDate;
		this.coordinateList = coordinatesRepository.getAll();
	}
}
