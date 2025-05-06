package repository;

import enums.WorldType;
import interfaces.CRUDRepository;
import model.MinecraftWorld;

import java.time.LocalDate;
import java.util.List;

public class MinecraftWorldRepository implements CRUDRepository<MinecraftWorld> {

	@Override
	public List<MinecraftWorld> getAll() {
		return List.of(
			new MinecraftWorld("Mundo 1 Ejemplo", "1.21.5", WorldType.SINGLEPLAYER, "-123456789", "", LocalDate.now()),
			new MinecraftWorld("Mundo 2 Ejemplo", "1.16", WorldType.MULTIPLAYER, "987654321", "", LocalDate.now())
		);
	}

	@Override
	public boolean add(MinecraftWorld minecraftWorld) {
		return false;
	}

	@Override
	public boolean update(MinecraftWorld minecraftWorld) {
		return false;
	}

	@Override
	public boolean delete(MinecraftWorld minecraftWorld) {
		return false;
	}
}
