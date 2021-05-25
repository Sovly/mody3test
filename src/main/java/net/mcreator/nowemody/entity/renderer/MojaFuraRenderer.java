package net.mcreator.nowemody.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.nowemody.entity.MojaFuraEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class MojaFuraRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(MojaFuraEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelmojafura(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("nowemody:textures/mojafura.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.8.4
	// Exported for Minecraft version 1.15 - 1.16
	// Paste this class into your mod and generate all required imports
	public static class Modelmojafura extends EntityModel<Entity> {
		private final ModelRenderer bb_main;
		public Modelmojafura() {
			textureWidth = 128;
			textureHeight = 128;
			bb_main = new ModelRenderer(this);
			bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
			bb_main.setTextureOffset(0, 0).addBox(-11.0F, -5.0F, -6.0F, 24.0F, 4.0F, 12.0F, 0.0F, false);
			bb_main.setTextureOffset(0, 36).addBox(-10.0F, -3.0F, 5.0F, 5.0F, 4.0F, 2.0F, 0.0F, false);
			bb_main.setTextureOffset(0, 16).addBox(8.0F, -3.0F, 5.0F, 4.0F, 4.0F, 2.0F, 0.0F, false);
			bb_main.setTextureOffset(0, 6).addBox(8.0F, -3.0F, -7.0F, 4.0F, 4.0F, 2.0F, 0.0F, false);
			bb_main.setTextureOffset(0, 0).addBox(-10.0F, -3.0F, -7.0F, 4.0F, 4.0F, 2.0F, 0.0F, false);
			bb_main.setTextureOffset(0, 16).addBox(-11.0F, -13.01F, -6.0F, 15.0F, 8.0F, 12.0F, 0.0F, false);
		}

		@Override
		public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			// previously the render function, render code was moved to a method below
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}
	}
}
