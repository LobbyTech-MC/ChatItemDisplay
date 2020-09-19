package me.bingorufus.chatitemdisplay.util.bungee;


import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.messaging.PluginMessageListener;

import com.google.common.io.ByteArrayDataInput;
import com.google.common.io.ByteStreams;

import me.bingorufus.chatitemdisplay.ChatItemDisplay;
import me.bingorufus.chatitemdisplay.Display;


public class BungeeCordReceiver implements PluginMessageListener {
	ChatItemDisplay m;

	public BungeeCordReceiver(ChatItemDisplay m) {
		this.m = m;
	}




	@Override
	public void onPluginMessageReceived(String channel, Player player, byte[] bytes) {// Subchannel, Serialized display,
																						// Is command
		if (!channel.equalsIgnoreCase("chatitemdisplay:in"))
			return;
		ByteArrayDataInput in = ByteStreams.newDataInput(bytes);
		String subchannel = in.readUTF();

		String data = in.readUTF();
		if (m.getConfig().getBoolean("debug-mode")) {
			Bukkit.getLogger().info("Received info: " + data);
		}
		if (subchannel.equalsIgnoreCase("DisplayReceiver")) {
			receiveDisplay(data, in);
			return;
		}




	}

	public void receiveDisplay(String data, ByteArrayDataInput in) {
		Display display = Display.deserialize(data);
		m.getDisplayedManager().addDisplay(display);

		if (in.readBoolean()) {
			display.getDisplayable().getInfo().cmdMsg();
		}
	}


}
