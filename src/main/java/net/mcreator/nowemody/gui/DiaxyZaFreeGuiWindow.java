
package net.mcreator.nowemody.gui;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.client.Minecraft;

import net.mcreator.nowemody.NowemodyMod;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class DiaxyZaFreeGuiWindow extends ContainerScreen<DiaxyZaFreeGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	TextFieldWidget nick;
	public DiaxyZaFreeGuiWindow(DiaxyZaFreeGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 176;
		this.ySize = 60;
	}
	private static final ResourceLocation texture = new ResourceLocation("nowemody:textures/diaxy_za_free.png");
	@Override
	public void render(MatrixStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderHoveredTooltip(ms, mouseX, mouseY);
		nick.render(ms, mouseX, mouseY, partialTicks);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(MatrixStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.color4f(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		Minecraft.getInstance().getTextureManager().bindTexture(texture);
		int k = (this.width - this.xSize) / 2;
		int l = (this.height - this.ySize) / 2;
		this.blit(ms, k, l, 0, 0, this.xSize, this.ySize, this.xSize, this.ySize);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeScreen();
			return true;
		}
		if (nick.isFocused())
			return nick.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void tick() {
		super.tick();
		nick.tick();
	}

	@Override
	protected void drawGuiContainerForegroundLayer(MatrixStack ms, int mouseX, int mouseY) {
		this.font.drawString(ms, "DIAMOND GENERATOR", 5, 40, -16724788);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardListener.enableRepeatEvents(false);
	}

	@Override
	public void init(Minecraft minecraft, int width, int height) {
		super.init(minecraft, width, height);
		minecraft.keyboardListener.enableRepeatEvents(true);
		this.addButton(new Button(this.guiLeft + 92, this.guiTop + 35, 75, 20, new StringTextComponent("Daj Diaxa!"), e -> {
			if (true) {
				NowemodyMod.PACKET_HANDLER.sendToServer(new DiaxyZaFreeGui.ButtonPressedMessage(0, x, y, z));
				DiaxyZaFreeGui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		nick = new TextFieldWidget(this.font, this.guiLeft + 27, this.guiTop + 10, 120, 20, new StringTextComponent("Wpisz tutaj sw�j nick")) {
			{
				setSuggestion("Wpisz tutaj sw�j nick");
			}
			@Override
			public void writeText(String text) {
				super.writeText(text);
				if (getText().isEmpty())
					setSuggestion("Wpisz tutaj sw�j nick");
				else
					setSuggestion(null);
			}

			@Override
			public void setCursorPosition(int pos) {
				super.setCursorPosition(pos);
				if (getText().isEmpty())
					setSuggestion("Wpisz tutaj sw�j nick");
				else
					setSuggestion(null);
			}
		};
		DiaxyZaFreeGui.guistate.put("text:nick", nick);
		nick.setMaxStringLength(32767);
		this.children.add(this.nick);
	}
}
