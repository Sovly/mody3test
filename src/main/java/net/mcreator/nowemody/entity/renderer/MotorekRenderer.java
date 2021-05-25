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

import net.mcreator.nowemody.entity.MotorekEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class MotorekRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(MotorekEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelmotorek(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("nowemody:textures/motorek.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.8.4
	// Exported for Minecraft version 1.15 - 1.16
	// Paste this class into your mod and generate all required imports
	public static class Modelmotorek extends EntityModel<Entity> {
		private final ModelRenderer koo;
		private final ModelRenderer koo2;
		public Modelmotorek() {
			textureWidth = 64;
			textureHeight = 64;
			koo = new ModelRenderer(this);
			koo.setRotationPoint(0.0F, 24.0F, 0.0F);
			koo.setTextureOffset(0, 27).addBox(-1.0F, -5.0F, -4.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);
			koo.setTextureOffset(10, 27).addBox(-1.0F, -1.0F, -4.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);
			koo.setTextureOffset(22, 0).addBox(-1.0F, -4.0F, -5.0F, 2.0F, 3.0F, 5.0F, 0.0F, false);
			koo2 = new ModelRenderer(this);
			koo2.setRotationPoint(0.0F, 24.0F, 14.0F);
			koo2.setTextureOffset(23, 24).addBox(-1.0F, -5.0F, -4.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);
			koo2.setTextureOffset(22, 10).addBox(-1.0F, -1.0F, -4.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);
			koo2.setTextureOffset(0, 0).addBox(-1.0F, -4.0F, -5.0F, 2.0F, 3.0F, 5.0F, 0.0F, false);
			koo2.setTextureOffset(0, 0).addBox(-2.0F, -6.0F, -16.0F, 4.0F, 2.0F, 14.0F, 0.0F, false);
			koo2.setTextureOffset(0, 16).addBox(-2.0F, -4.0F, -11.0F, 4.0F, 2.0F, 9.0F, 0.0F, false);
			koo2.setTextureOffset(0, 8).addBox(-2.0F, -7.0F, -17.0F, 4.0F, 5.0F, 1.0F, 0.0F, false);
			koo2.setTextureOffset(22, 8).addBox(-4.0F, -8.0F, -17.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
			koo2.setTextureOffset(17, 16).addBox(-2.0F, -7.0F, -11.0F, 4.0F, 1.0F, 6.0F, 0.0F, false);
		}

		@Override
		public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			// previously the render function, render code was moved to a method below
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			koo.render(matrixStack, buffer, packedLight, packedOverlay);
			koo2.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}
	}
}
