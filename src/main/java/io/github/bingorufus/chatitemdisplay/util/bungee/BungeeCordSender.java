package io.github.bingorufus.chatitemdisplay.util.bungee;


import io.github.bingorufus.chatitemdisplay.ChatItemDisplay;
import io.github.bingorufus.chatitemdisplay.Display;
import io.github.bingorufus.chatitemdisplay.api.display.Displayable;
import io.github.bingorufus.chatitemdisplay.util.logger.DebugLogger;
import org.bukkit.Bukkit;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class BungeeCordSender {

    final ChatItemDisplay m;

    public BungeeCordSender() {
        this.m = ChatItemDisplay.getInstance();
    }

    public void send(Displayable displayable, boolean isCmd) {
        Display dis = m.getDisplayedManager().getDisplay(displayable);
        String data = null;
        ByteArrayOutputStream b = new ByteArrayOutputStream();
        DataOutputStream out = new DataOutputStream(b);

        try {
            data = dis.serialize();
            out.writeUTF(data);
            out.writeBoolean(isCmd);


        } catch (IOException ignored) {
        }
        DebugLogger.log("Sent data: " + data);
        Bukkit.getServer().sendPluginMessage(m, "chatitemdisplay:out", b.toByteArray());
    }


}