package net.mcreator.nowemody.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;

import net.mcreator.nowemody.block.LuckyBlockBlock;
import net.mcreator.nowemody.NowemodyModElements;
import net.mcreator.nowemody.NowemodyMod;

import java.util.Map;

@NowemodyModElements.ModElement.Tag
public class TestOnBlockRightClickedProcedure extends NowemodyModElements.ModElement {
	public TestOnBlockRightClickedProcedure(NowemodyModElements instance) {
		super(instance, 3);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NowemodyMod.LOGGER.warn("Failed to load dependency x for procedure TestOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NowemodyMod.LOGGER.warn("Failed to load dependency y for procedure TestOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NowemodyMod.LOGGER.warn("Failed to load dependency z for procedure TestOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NowemodyMod.LOGGER.warn("Failed to load dependency world for procedure TestOnBlockRightClicked!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		world.setBlockState(new BlockPos((int) x, (int) y, (int) z), LuckyBlockBlock.block.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), LuckyBlockBlock.block.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) x, (int) (y + 2), (int) z), LuckyBlockBlock.block.getDefaultState(), 3);
	}
}
