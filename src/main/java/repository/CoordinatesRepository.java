package repository;

import interfaces.CRUDRepository;
import model.Coordinate;

import java.util.List;

public class CoordinatesRepository implements CRUDRepository<Coordinate> {
	public List<Coordinate> getAll() {
		return List.of(
			new Coordinate("overworld", "Home",10, 20, 30),
			new Coordinate("netherworld", "Home Portal", 10, 20, 40),
			new Coordinate("endworld", "Exp Farm", 300, 1, -500)
		);
	}

	@Override
	public boolean add(Coordinate coordinate) {
		return false;
	}

	@Override
	public boolean update(Coordinate coordinate) {
		return false;
	}

	@Override
	public boolean delete(Coordinate coordinate) {
		return false;
	}
}
