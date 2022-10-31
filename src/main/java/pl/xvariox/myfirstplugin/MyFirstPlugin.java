package pl.xvariox.myfirstplugin;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class MyFirstPlugin extends JavaPlugin implements Listener {

	@Override
	public void onEnable() {
		// Plugin startup logic
		System.out.println("Plugin started");
		getServer().getPluginManager().registerEvents(this, this);
	}

	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		System.out.println("A player have joined the server");
		event.setJoinMessage("Player " + event.getPlayer().getDisplayName() + " join the server");
	}

	@Override
	public void onDisable() {
		// Plugin shutdown logic
		System.out.println("Plugin stopped");
	}
}
