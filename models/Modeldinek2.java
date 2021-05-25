// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class Modeldinek2 extends EntityModel<Entity> {
	private final ModelRenderer bone;

	public Modeldinek2() {
		textureWidth = 128;
		textureHeight = 128;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone.setTextureOffset(0, 0).addBox(-1.0F, -15.0F, -10.0F, 10.0F, 15.0F, 11.0F, 0.0F, false);
		bone.setTextureOffset(31, 15).addBox(-1.0F, -12.0F, -3.0F, 9.0F, 8.0F, 11.0F, 0.0F, false);
		bone.setTextureOffset(0, 26).addBox(5.0F, -20.0F, -16.0F, 9.0F, 8.0F, 11.0F, 0.0F, false);
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