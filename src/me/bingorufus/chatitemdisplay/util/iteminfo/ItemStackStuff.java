package me.bingorufus.chatitemdisplay.util.iteminfo;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import javax.imageio.ImageIO;

import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;
import org.bukkit.inventory.meta.CrossbowMeta;
import org.bukkit.inventory.meta.SkullMeta;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.ComponentBuilder.FormatRetention;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.chat.TranslatableComponent;

public class ItemStackStuff {

	public String makeStringPretty(String s) {

		String out = null;
		String[] Nameparts = s.toLowerCase().split("_");
		for (String part : Nameparts) {
			part = part.substring(0, 1).toUpperCase() + part.substring(1);
			if (out == null) {
				out = part;
				continue;
			}

			out += " ";
			out += part;
		}

		return out;

	}

	private String getItemKey(ItemStack item) {
		String itemKey = item.getType().getKey().getKey().toLowerCase();
		if (item.getType().name().equalsIgnoreCase("CROSSBOW")) {
			CrossbowMeta cm = (CrossbowMeta) item.getItemMeta();
			if (!cm.hasChargedProjectiles())
				return itemKey += "_standby";

			return itemKey += "_" + cm.getChargedProjectiles().get(0).getType().getKey().getKey().toLowerCase()
					.replace("firework_rocket", "firework");
		}
		return itemKey;

	}

	public BufferedImage getImage(ItemStack item, int... size) {
		return null;


	}

	private BufferedImage resizeImage(BufferedImage bi, int[] size) {
		BufferedImage resizeImage = new BufferedImage(size[0], size[1], BufferedImage.TYPE_INT_ARGB);
		Graphics2D g2D = resizeImage.createGraphics();
		g2D.drawImage(bi, 0, 0, size[0], size[1], null);
		g2D.dispose();
		return resizeImage;
	}

	public String itemName(ItemStack item) {

		String out = "";
		ItemRarity r = ItemRarity.getRarity(item);
		out += r.getColor();

		if (item.getItemMeta().hasDisplayName()) {
			out += item.getItemMeta().getDisplayName();
			return out;

		}
		return out + makeStringPretty(item.getType().name());

	}

	public BaseComponent getName(ItemStack item, String color, boolean forceColor) {
		ItemRarity rarity = ItemRarity.getRarity(item);
		String colorPrefix = color + rarity.getColor();
		BaseComponent legacy = TextComponent.fromLegacyText(forceColor ? color : colorPrefix)[0];
		if (item.getItemMeta().hasDisplayName()) {
			colorPrefix += ChatColor.ITALIC;
			TextComponent itemName = new TextComponent(colorPrefix + item.getItemMeta().getDisplayName());
			if (forceColor) {
				itemName = new TextComponent(color + ChatColor.stripColor(item.getItemMeta().getDisplayName()));
				itemName.copyFormatting(legacy, FormatRetention.FORMATTING, true);

			}
			return itemName;
		}

		if (item.getItemMeta() instanceof SkullMeta) {
			SkullMeta sm = (SkullMeta) item.getItemMeta();
			if (sm.hasOwner() && sm.getOwningPlayer() != null && sm.getOwningPlayer().getName() != null) {
				TranslatableComponent translatable = new TranslatableComponent("block.minecraft.player_head.named");
				translatable.addWith(new TextComponent(sm.getOwningPlayer().getName()));
				translatable.setColor(TextComponent.fromLegacyText(colorPrefix)[0].getColor());
				if (forceColor) {
					translatable.copyFormatting(legacy, FormatRetention.FORMATTING, true);

				}
				return translatable;
			}
		}

		if (item.getItemMeta() instanceof BookMeta) {
			BookMeta bm = (BookMeta) item.getItemMeta();
			if (bm.hasTitle()) {
				TextComponent book = new TextComponent(colorPrefix + bm.getTitle());
				book.copyFormatting(legacy, FormatRetention.FORMATTING, false);

				if (forceColor) {
					book.copyFormatting(legacy, FormatRetention.FORMATTING, true);
				}
				return book;
			}
		}

		TranslatableComponent tr = new TranslatableComponent(new ItemStackReflection().translateItemStack(item));
		tr.copyFormatting(legacy, FormatRetention.FORMATTING, false);

		if (forceColor) {
			tr.copyFormatting(legacy, FormatRetention.FORMATTING, true);

		}
		return tr;

	}

}
