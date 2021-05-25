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
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bone.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}