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

import net.mcreator.nowemody.entity.DinekEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class DinekRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(DinekEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modeldinek(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("nowemody:textures/teksturadinka.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.8.4
	// Exported for Minecraft version 1.15 - 1.16
	// Paste this class into your mod and generate all required imports
	public static class Modeldinek extends EntityModel<Entity> {
		private final ModelRenderer bone;
		public Modeldinek() {
			textureWidth = 32;
			textureHeight = 32;
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 24.0F, 0.0F);
			bone.setTextureOffset(12, 0).addBox(1.0F, -11.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			bone.setTextureOffset(0, 0).addBox(-1.0F, -10.0F, -1.0F, 4.0F, 10.0F, 4.0F, 0.0F, false);
			bone.setTextureOffset(0, 14).addBox(3.0F, -9.0F, 0.0F, 3.0F, 3.0F, 2.0F, 0.0F, false);
			bone.setTextureOffset(16, 7).addBox(-2.0F, -2.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			bone.setTextureOffset(16, 4).addBox(-2.0F, -4.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			bone.setTextureOffset(16, 1).addBox(-2.0F, -6.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			bone.setTextureOffset(14, 15).addBox(-2.0F, -8.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			bone.setTextureOffset(14, 12).addBox(-2.0F, -10.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			bone.setTextureOffset(10, 14).addBox(-1.0F, -11.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		}

		@Override
		public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			// previously the render function, render code was moved to a method below
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			bone.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}
	}
}
