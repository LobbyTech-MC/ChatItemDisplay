package me.bingorufus.chatitemdisplay.displayables;

import me.bingorufus.chatitemdisplay.ChatItemDisplay;
import me.bingorufus.chatitemdisplay.util.display.DisplayableBroadcaster;
import me.bingorufus.chatitemdisplay.util.string.StringFormatter;
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.chat.TranslatableComponent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;

import java.util.UUID;

public class DisplayInventoryInfo implements DisplayInfo {
    private final DisplayInventory inv;
    private final ChatItemDisplay m = ChatItemDisplay.getInstance();

    public DisplayInventoryInfo(DisplayInventory inv) {
        this.inv = inv;
        m.invs.put(inv.getInventory(), inv.getUUID());

    }

    @Override
    public void cmdMsg() {
        String key;
        if (getInventory().getType() == InventoryType.ENDER_CHEST)
            key = "container.enderchest";
        else
            key = "container.inventory";
        String format = new StringFormatter()
                .format(m.getConfig().getString("display-messages.inventory-display-format"))
                .replaceAll("%player%",
                        m.getConfig().getBoolean("use-nicks-in-display-message")
                                ? m.getConfig().getBoolean("strip-nick-colors-message")
                                ? ChatColor.stripColor(inv.getDisplayName())
                                : inv.getDisplayName()
                                : inv.getPlayer());

        new DisplayableBroadcaster().broadcast(format(format, key));
    }

    @Override
    public Inventory getInventory() {
        return inv.getInventory();
    }

    private TextComponent format(String format, String key) {
        String[] parts = format.split("((?<=%type%)|(?=%type%))");
        TextComponent whole = new TextComponent();
        BaseComponent prev = null;
        for (int i = 0; i < parts.length; i++) {
            if (i > 0)
                prev = TextComponent.fromLegacyText(
                        org.bukkit.ChatColor.getLastColors(whole.getExtra().get(i - 1).toLegacyText()))[0];
            String part = parts[i];
            if (part.equalsIgnoreCase("%type%")) {
                TranslatableComponent type = new TranslatableComponent(key);
                if (i > 0) {
                    type.copyFormatting(prev);
                }
                whole.addExtra(type);
                continue;
            }

            TextComponent tc = new TextComponent(part);
            if (i > 0 && !part.startsWith("§r"))
                tc.copyFormatting(prev);

            whole.addExtra(tc);
        }
        UUID id = m.getDisplayedManager().getDisplay(inv).getId();
        whole.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/viewitem " + (id)));

        return whole;
    }

    @Override
    public TextComponent getHover() {
        String key;
        if (getInventory().getType() == InventoryType.ENDER_CHEST)
            key = "container.enderchest";
        else
            key = "container.inventory";
        String format = new StringFormatter()
                .format(m.getConfig().getString("display-messages.inchat-inventory-format"))
                .replaceAll("%player%", m.getConfig().getBoolean("use-nicks-in-display-message")
                        ? m.getConfig().getBoolean("strip-nick-colors-message")
                        ? ChatColor.stripColor(inv.getDisplayName())
                        : inv.getDisplayName()
                        : inv.getPlayer());
        return format(format, key);
    }

    @Override
    public String loggerMessage() {
        String type;
        if (getInventory().getType() == InventoryType.ENDER_CHEST)
            type = "container.enderchest";
        else
            type = "container.inventory";

        String format = m.getConfig().getString("display-messages.inchat-inventory-format")
                .replaceAll("%player%", m.getConfig().getBoolean("use-nicks-in-display-message")
                        ? m.getConfig().getBoolean("strip-nick-colors-message")
                        ? ChatColor.stripColor(inv.getDisplayName())
                        : inv.getDisplayName()
                        : inv.getPlayer());
        format = format.replaceAll("%type%", ChatItemDisplay.getInstance().getLang().get(type).getAsString());


        return ChatColor.stripColor(new StringFormatter().format(format));
    }

    @Override
    public Displayable getDisplayable() {
        return inv;
    }

}
