
package net.mcreator.nowemody.fuel;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.item.ItemStack;

import net.mcreator.nowemody.block.CzekoladaBlock;
import net.mcreator.nowemody.NowemodyModElements;

@NowemodyModElements.ModElement.Tag
public class CzekoladowepaliwoFuel extends NowemodyModElements.ModElement {
	public CzekoladowepaliwoFuel(NowemodyModElements instance) {
		super(instance, 47);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == new ItemStack(CzekoladaBlock.block, (int) (1)).getItem())
			event.setBurnTime(5000);
	}
}
