package me.filipzocktan.fcicrafting;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import me.filipzocktan.fcicrafting.Commands.FCICRCommand;
import me.filipzocktan.fcicrafting.Commands.FCICRCommand_in_Dev;
import me.filipzocktan.fcicrafting.Commands.GetEffectSwordCommand;

public class FCICrafting extends JavaPlugin {
	
	public void onEnable(){
		PluginManager pm = this.getServer().getPluginManager();
		pm.registerEvents(new PluginEnabeListener(), this);
		FCICRCommand cFcicrCommand = new FCICRCommand();
		this.getCommand("fcicr").setExecutor(cFcicrCommand);
		this.getCommand("fcicrafting").setExecutor(cFcicrCommand);
		this.getCommand("fortresscombat1crafting").setExecutor(cFcicrCommand);
		GetEffectSwordCommand cGetEffectSwordCommand = new GetEffectSwordCommand();
		this.getCommand("gefs").setExecutor(cGetEffectSwordCommand);
		this.getCommand("geteffectsword").setExecutor(cGetEffectSwordCommand);
		FCICRCommand_in_Dev cFcicrCommand_in_Dev = new FCICRCommand_in_Dev();
		this.getCommand("fcicrdev").setExecutor(cFcicrCommand_in_Dev);
		
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
