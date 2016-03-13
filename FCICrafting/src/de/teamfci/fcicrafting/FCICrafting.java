package de.teamfci.fcicrafting;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import de.teamfci.fcicrafting.Commands.FCICRCommand;
import de.teamfci.fcicrafting.Commands.GetEffectSwordCommand;
import de.teamfci.fcicrafting.Events.DamageListener;
import de.teamfci.fcicrafting.Events.InventoryListener;
import de.teamfci.fcicrafting.Events.PluginEnabeListener;

public class FCICrafting extends JavaPlugin {
	
	public void onEnable(){
		PluginManager pm = this.getServer().getPluginManager();
		pm.registerEvents(new PluginEnabeListener(), this);
		pm.registerEvents(new InventoryListener(), this);
		pm.registerEvents(new DamageListener(), this);
		FCICRCommand cFcicrCommand = new FCICRCommand();
		this.getCommand("fcicr").setExecutor(cFcicrCommand);
		this.getCommand("fcicrafting").setExecutor(cFcicrCommand);
		this.getCommand("fortresscombat1crafting").setExecutor(cFcicrCommand);
		GetEffectSwordCommand cGetEffectSwordCommand = new GetEffectSwordCommand();
		this.getCommand("gefs").setExecutor(cGetEffectSwordCommand);
		this.getCommand("geteffectsword").setExecutor(cGetEffectSwordCommand);
	}
	
	public void onDisable(){
		System.out.println("FCI Crafting deaktiviert");
	}

}
