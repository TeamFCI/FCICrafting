package me.filipzocktan.fcicrafting.Items;

import java.util.LinkedList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Schwertgenerator {
	static List<String> Lores = new LinkedList<String>();
	
	public static ItemStack getBlendT1(Player p){
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("Blendendes Schwert Tier 1");
		Lores.add("§aFortress§8-§aCombat§8-§aItem");
		Lores.add("§9§m------------------------------");
		Lores.add("§a25%-ige Chance deinen Gegner erblinden zu lassen.");
		Lores.add("§9§m------------------------------");
		Lores.add("§aBesitzer: §e{USER}".replace("{USER}", p.getName()));
		meta.setLore(Lores);
		item.setItemMeta(meta);
		Lores.clear();
		return item;
	}

}
