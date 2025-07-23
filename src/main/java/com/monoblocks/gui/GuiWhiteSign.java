package com.monoblocks.gui;

import com.monoblocks.Monoblocks;
import com.monoblocks.blocks.tileentity.TileEntityWhiteSign;
import com.monoblocks.utilities.SignDataPacket;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.ChatAllowedCharacters;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class GuiWhiteSign extends GuiScreen {
   private TileEntityWhiteSign sign;
   private float bgColR = 1.0F;
   private float bgColG = 1.0F;
   private float bgColB = 1.0F;
   private static ResourceLocation background = new ResourceLocation("monoblocks:textures/gui/guiwhitesign.png");
   private String[] text = new String[]{"", "", "", ""};
   int currentLine = 0;

   public GuiWhiteSign(TileEntityWhiteSign logic) {
      this.sign = logic;
   }

   public void initGui() {
      this.buttonList.clear();
      super.initGui();
      Keyboard.enableRepeatEvents(true);
      int k = (this.width - 100) / 2;
      int l = (this.height - 110) / 2;
      this.buttonList.add(new GuiButton(0, k, l + 100, 100, 20, "Finished"));
   }

   public void drawScreen(int mouseX, int mouseY, float something) {
      Tessellator t = Tessellator.instance;
      GL11.glColor4f(this.bgColR, this.bgColG, this.bgColB, 1.0F);
      this.mc.getTextureManager().bindTexture(background);
      int k = (this.width - 100) / 2;
      int l = (this.height - 103) / 2;
      this.drawTexturedModalRect(k, l, 0, 0, 100, 103);
      super.drawScreen(mouseX, mouseY, something);
      GL11.glPushMatrix();
      float lum = this.calcLuminance(this.bgColR, this.bgColG, this.bgColB);

      for(int i = 0; i < this.text.length; ++i) {
         this.fontRendererObj.drawString((lum >= 35.0F ? EnumChatFormatting.BLACK : (lum >= 31.0F ? EnumChatFormatting.GRAY : EnumChatFormatting.WHITE)) + (i == this.currentLine ? "> " : "") + this.text[i] + (i == this.currentLine ? " §r" + (lum >= 35.0F ? EnumChatFormatting.BLACK : (lum >= 31.0F ? EnumChatFormatting.GRAY : EnumChatFormatting.WHITE)) + "<" : ""), k - this.fontRendererObj.getStringWidth((i == this.currentLine ? "> " : "") + this.text[i] + (i == this.currentLine ? " <" : "")) / 2 + 51, l + 4 + 10 * i, 0);
      }

      GL11.glPopMatrix();
   }

   protected void keyTyped(char c, int i) {
      super.keyTyped(c, i);
      if (this.fontRendererObj.getStringWidth(this.text[this.currentLine]) < 90 && ChatAllowedCharacters.isAllowedCharacter(c)) {
         StringBuilder var10000;
         String[] var10002;
         int var10004;
         if (Keyboard.isKeyDown(56) && c == '0' && (this.text[this.currentLine].length() == 0 || this.text[this.currentLine].charAt(this.text[this.currentLine].length() - 1) != 167)) {
            var10000 = new StringBuilder();
            var10002 = this.text;
            var10004 = this.currentLine;
            var10002[var10004] = var10000.append(var10002[var10004]).append("§").toString();
         }

         if (Keyboard.isKeyDown(56) && c == '1' && (this.text[this.currentLine].length() == 0 || this.text[this.currentLine].charAt(this.text[this.currentLine].length() - 1) != 167)) {
            var10000 = new StringBuilder();
            var10002 = this.text;
            var10004 = this.currentLine;
            var10002[var10004] = var10000.append(var10002[var10004]).append("§").toString();
         }

         if (Keyboard.isKeyDown(56) && c == '2' && (this.text[this.currentLine].length() == 0 || this.text[this.currentLine].charAt(this.text[this.currentLine].length() - 1) != 167)) {
            var10000 = new StringBuilder();
            var10002 = this.text;
            var10004 = this.currentLine;
            var10002[var10004] = var10000.append(var10002[var10004]).append("§").toString();
         }

         if (Keyboard.isKeyDown(56) && c == '3' && (this.text[this.currentLine].length() == 0 || this.text[this.currentLine].charAt(this.text[this.currentLine].length() - 1) != 167)) {
            var10000 = new StringBuilder();
            var10002 = this.text;
            var10004 = this.currentLine;
            var10002[var10004] = var10000.append(var10002[var10004]).append("§").toString();
         }

         if (Keyboard.isKeyDown(56) && c == '4' && (this.text[this.currentLine].length() == 0 || this.text[this.currentLine].charAt(this.text[this.currentLine].length() - 1) != 167)) {
            var10000 = new StringBuilder();
            var10002 = this.text;
            var10004 = this.currentLine;
            var10002[var10004] = var10000.append(var10002[var10004]).append("§").toString();
         }

         if (Keyboard.isKeyDown(56) && c == '5' && (this.text[this.currentLine].length() == 0 || this.text[this.currentLine].charAt(this.text[this.currentLine].length() - 1) != 167)) {
            var10000 = new StringBuilder();
            var10002 = this.text;
            var10004 = this.currentLine;
            var10002[var10004] = var10000.append(var10002[var10004]).append("§").toString();
         }

         if (Keyboard.isKeyDown(56) && c == '6' && (this.text[this.currentLine].length() == 0 || this.text[this.currentLine].charAt(this.text[this.currentLine].length() - 1) != 167)) {
            var10000 = new StringBuilder();
            var10002 = this.text;
            var10004 = this.currentLine;
            var10002[var10004] = var10000.append(var10002[var10004]).append("§").toString();
         }

         if (Keyboard.isKeyDown(56) && c == '7' && (this.text[this.currentLine].length() == 0 || this.text[this.currentLine].charAt(this.text[this.currentLine].length() - 1) != 167)) {
            var10000 = new StringBuilder();
            var10002 = this.text;
            var10004 = this.currentLine;
            var10002[var10004] = var10000.append(var10002[var10004]).append("§").toString();
         }

         if (Keyboard.isKeyDown(56) && c == '8' && (this.text[this.currentLine].length() == 0 || this.text[this.currentLine].charAt(this.text[this.currentLine].length() - 1) != 167)) {
            var10000 = new StringBuilder();
            var10002 = this.text;
            var10004 = this.currentLine;
            var10002[var10004] = var10000.append(var10002[var10004]).append("§").toString();
         }

         if (Keyboard.isKeyDown(56) && c == '9' && (this.text[this.currentLine].length() == 0 || this.text[this.currentLine].charAt(this.text[this.currentLine].length() - 1) != 167)) {
            var10000 = new StringBuilder();
            var10002 = this.text;
            var10004 = this.currentLine;
            var10002[var10004] = var10000.append(var10002[var10004]).append("§").toString();
         }

         if (Keyboard.isKeyDown(56) && c == 'a' && (this.text[this.currentLine].length() == 0 || this.text[this.currentLine].charAt(this.text[this.currentLine].length() - 1) != 167)) {
            var10000 = new StringBuilder();
            var10002 = this.text;
            var10004 = this.currentLine;
            var10002[var10004] = var10000.append(var10002[var10004]).append("§").toString();
         }

         if (Keyboard.isKeyDown(56) && c == 'b' && (this.text[this.currentLine].length() == 0 || this.text[this.currentLine].charAt(this.text[this.currentLine].length() - 1) != 167)) {
            var10000 = new StringBuilder();
            var10002 = this.text;
            var10004 = this.currentLine;
            var10002[var10004] = var10000.append(var10002[var10004]).append("§").toString();
         }

         if (Keyboard.isKeyDown(56) && c == 'c' && (this.text[this.currentLine].length() == 0 || this.text[this.currentLine].charAt(this.text[this.currentLine].length() - 1) != 167)) {
            var10000 = new StringBuilder();
            var10002 = this.text;
            var10004 = this.currentLine;
            var10002[var10004] = var10000.append(var10002[var10004]).append("§").toString();
         }

         if (Keyboard.isKeyDown(56) && c == 'd' && (this.text[this.currentLine].length() == 0 || this.text[this.currentLine].charAt(this.text[this.currentLine].length() - 1) != 167)) {
            var10000 = new StringBuilder();
            var10002 = this.text;
            var10004 = this.currentLine;
            var10002[var10004] = var10000.append(var10002[var10004]).append("§").toString();
         }

         if (Keyboard.isKeyDown(56) && c == 'e' && (this.text[this.currentLine].length() == 0 || this.text[this.currentLine].charAt(this.text[this.currentLine].length() - 1) != 167)) {
            var10000 = new StringBuilder();
            var10002 = this.text;
            var10004 = this.currentLine;
            var10002[var10004] = var10000.append(var10002[var10004]).append("§").toString();
         }

         if (!Keyboard.isKeyDown(56) || c != 'f' || this.text[this.currentLine].length() != 0 && this.text[this.currentLine].charAt(this.text[this.currentLine].length() - 1) == 167) {
            var10000 = new StringBuilder();
            var10002 = this.text;
            var10004 = this.currentLine;
            var10002[var10004] = var10000.append(var10002[var10004]).append(c).toString();
         } else {
            var10000 = new StringBuilder();
            var10002 = this.text;
            var10004 = this.currentLine;
            var10002[var10004] = var10000.append(var10002[var10004]).append("§").toString();
         }
      } else {
         switch(i) {
         case 14:
            if (this.text[this.currentLine].length() > 0) {
               this.text[this.currentLine] = this.text[this.currentLine].substring(0, this.text[this.currentLine].length() - 1);
            }
            break;
         case 28:
            this.moveLine(1);
            break;
         case 200:
            this.moveLine(-1);
            break;
         case 208:
            this.moveLine(1);
         }
      }

   }

   private void moveLine(int i) {
      if (i < 0) {
         if (this.currentLine <= 0) {
            this.currentLine = this.text.length - 1;
         } else {
            --this.currentLine;
         }
      } else if (this.currentLine >= this.text.length - 1) {
         this.currentLine = 0;
      } else {
         ++this.currentLine;
      }

   }

   public void onGuiClosed() {
      super.onGuiClosed();
      Keyboard.enableRepeatEvents(false);
      Monoblocks.packetPipeline.sendToServer(new SignDataPacket(this.sign.getWorldObj().provider.dimensionId, this.sign.xCoord, this.sign.yCoord, this.sign.zCoord, this.text));
   }

   private float calcLuminance(float r, float g, float b) {
      return (r * 255.0F * 0.299F + g * 255.0F * 0.587F + b * 255.0F * 0.114F) / 3.0F;
   }

   protected void actionPerformed(GuiButton button) {
      if (button.id == 0) {
         this.mc.displayGuiScreen((GuiScreen)null);
         this.mc.setIngameFocus();
      }

   }
}
