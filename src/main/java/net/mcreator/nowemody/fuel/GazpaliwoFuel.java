
package net.mcreator.nowemody.fuel;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.item.ItemStack;

import net.mcreator.nowemody.block.GazBlock;
import net.mcreator.nowemody.NowemodyModElements;

@NowemodyModElements.ModElement.Tag
public class GazpaliwoFuel extends NowemodyModElements.ModElement {
	public GazpaliwoFuel(NowemodyModElements instance) {
		super(instance, 45);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == new ItemStack(GazBlock.block, (int) (1)).getItem())
			event.setBurnTime(2000);
	}
}
