
package net.mcreator.nowemody.painting;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.entity.item.PaintingType;

import net.mcreator.nowemody.NowemodyModElements;

@NowemodyModElements.ModElement.Tag
public class ObrazPainting extends NowemodyModElements.ModElement {
	public ObrazPainting(NowemodyModElements instance) {
		super(instance, 85);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@SubscribeEvent
	public void registerPaintingType(RegistryEvent.Register<PaintingType> event) {
		event.getRegistry().register(new PaintingType(16, 16).setRegistryName("obraz"));
	}
}
