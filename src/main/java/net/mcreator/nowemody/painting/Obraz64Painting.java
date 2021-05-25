
package net.mcreator.nowemody.painting;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.entity.item.PaintingType;

import net.mcreator.nowemody.NowemodyModElements;

@NowemodyModElements.ModElement.Tag
public class Obraz64Painting extends NowemodyModElements.ModElement {
	public Obraz64Painting(NowemodyModElements instance) {
		super(instance, 87);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@SubscribeEvent
	public void registerPaintingType(RegistryEvent.Register<PaintingType> event) {
		event.getRegistry().register(new PaintingType(64, 64).setRegistryName("obraz_64"));
	}
}
