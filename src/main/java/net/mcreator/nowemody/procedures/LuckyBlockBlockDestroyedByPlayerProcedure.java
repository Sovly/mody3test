package net.mcreator.nowemody.procedures;

import net.minecraftforge.fml.server.ServerLifecycleHooks;

import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.Util;
import net.minecraft.server.MinecraftServer;

import net.mcreator.nowemody.NowemodyModElements;
import net.mcreator.nowemody.NowemodyMod;

import java.util.Map;

@NowemodyModElements.ModElement.Tag
public class LuckyBlockBlockDestroyedByPlayerProcedure extends NowemodyModElements.ModElement {
	public LuckyBlockBlockDestroyedByPlayerProcedure(NowemodyModElements instance) {
		super(instance, 1);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NowemodyMod.LOGGER.warn("Failed to load dependency world for procedure LuckyBlockBlockDestroyedByPlayer!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double Lucky = 0;
		Lucky = (double) Math.round((Math.random() * 3));
		if (((Lucky) == 1)) {
			if (!world.isRemote()) {
				MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
				if (mcserv != null)
					mcserv.getPlayerList().func_232641_a_(new StringTextComponent("A"), ChatType.SYSTEM, Util.DUMMY_UUID);
			}
		}
		if (((Lucky) == 2)) {
			if (!world.isRemote()) {
				MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
				if (mcserv != null)
					mcserv.getPlayerList().func_232641_a_(new StringTextComponent("B"), ChatType.SYSTEM, Util.DUMMY_UUID);
			}
		}
		if (((Lucky) == 3)) {
			if (!world.isRemote()) {
				MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
				if (mcserv != null)
					mcserv.getPlayerList().func_232641_a_(new StringTextComponent("C"), ChatType.SYSTEM, Util.DUMMY_UUID);
			}
		}
	}
}
