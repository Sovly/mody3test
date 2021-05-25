
package net.mcreator.nowemody.painting;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.entity.item.PaintingType;

import net.mcreator.nowemody.NowemodyModElements;

@NowemodyModElements.ModElement.Tag
public class Obraz32Painting extends NowemodyModElements.ModElement {
	public Obraz32Painting(NowemodyModElements instance) {
		super(instance, 86);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@SubscribeEvent
	public void registerPaintingType(RegistryEvent.Register<PaintingType> event) {
		event.getRegistry().register(new PaintingType(32, 32).setRegistryName("obraz_32"));
	}
}
