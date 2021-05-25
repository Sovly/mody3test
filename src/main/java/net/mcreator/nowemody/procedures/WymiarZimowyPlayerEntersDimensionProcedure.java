package net.mcreator.nowemody.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector2f;
import net.minecraft.command.ICommandSource;
import net.minecraft.command.CommandSource;

import net.mcreator.nowemody.NowemodyModElements;
import net.mcreator.nowemody.NowemodyMod;

import java.util.Map;

@NowemodyModElements.ModElement.Tag
public class WymiarZimowyPlayerEntersDimensionProcedure extends NowemodyModElements.ModElement {
	public WymiarZimowyPlayerEntersDimensionProcedure(NowemodyModElements instance) {
		super(instance, 4);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NowemodyMod.LOGGER.warn("Failed to load dependency x for procedure WymiarZimowyPlayerEntersDimension!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NowemodyMod.LOGGER.warn("Failed to load dependency y for procedure WymiarZimowyPlayerEntersDimension!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NowemodyMod.LOGGER.warn("Failed to load dependency z for procedure WymiarZimowyPlayerEntersDimension!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NowemodyMod.LOGGER.warn("Failed to load dependency world for procedure WymiarZimowyPlayerEntersDimension!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (world instanceof ServerWorld) {
			((World) world).getServer().getCommandManager().handleCommand(new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z),
					Vector2f.ZERO, (ServerWorld) world, 4, "", new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
					"weather rain");
		}
	}
}
