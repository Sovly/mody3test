package net.mcreator.nowemody.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.nowemody.NowemodyModElements;
import net.mcreator.nowemody.NowemodyMod;

import java.util.Map;

@NowemodyModElements.ModElement.Tag
public class DajDiaxaProcedure extends NowemodyModElements.ModElement {
	public DajDiaxaProcedure(NowemodyModElements instance) {
		super(instance, 53);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NowemodyMod.LOGGER.warn("Failed to load dependency entity for procedure DajDiaxa!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(Items.DIAMOND, (int) (1));
			_setstack.setCount((int) 1);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
	}
}
