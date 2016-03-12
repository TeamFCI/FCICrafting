package me.filipzocktan.fcicrafting;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class FCICrafting extends JavaPlugin {
	
	public void onEnable(){
		PluginManager pm = this.getServer().getPluginManager();
		pm.registerEvents(new PluginEnabeListener(), this);
		FCICRCommand cFcicrCommand = new FCICRCommand();
		getCommand("fcfcr").setExecutor(cFcicrCommand);
		getCommand("fcicrafting").setExecutor(cFcicrCommand);
		getCommand("fortresscombat1crafting").setExecutor(cFcicrCommand);
		
		for(Player p : Bukkit.getOnlinePlayers()){
			p.sendMessage("§d§m----------------------------");
	        p.sendMessage("§bProject-Addons");
	        p.sendMessage("§bPlugin by §aFilip Zocktan");
	        p.sendMessage("§b/fcicr für weitere Infos");
	        p.sendMessage("§d§m----------------------------");
		}
	}
	
	public void onDisable(){
		System.out.println("FCI Crafting deaktiviert");
	}

}
