package net.mcreator.nowemody.procedures;

import net.minecraft.world.IWorld;

import net.mcreator.nowemody.particle.CosDziwnegoParticle;
import net.mcreator.nowemody.NowemodyModElements;
import net.mcreator.nowemody.NowemodyMod;

import java.util.Map;

@NowemodyModElements.ModElement.Tag
public class DziwnyBlokClientDisplayRandomTickProcedure extends NowemodyModElements.ModElement {
	public DziwnyBlokClientDisplayRandomTickProcedure(NowemodyModElements instance) {
		super(instance, 89);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NowemodyMod.LOGGER.warn("Failed to load dependency x for procedure DziwnyBlokClientDisplayRandomTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NowemodyMod.LOGGER.warn("Failed to load dependency y for procedure DziwnyBlokClientDisplayRandomTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NowemodyMod.LOGGER.warn("Failed to load dependency z for procedure DziwnyBlokClientDisplayRandomTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NowemodyMod.LOGGER.warn("Failed to load dependency world for procedure DziwnyBlokClientDisplayRandomTick!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		world.addParticle(CosDziwnegoParticle.particle, x, y, z, 0, 1, 0);
	}
}
