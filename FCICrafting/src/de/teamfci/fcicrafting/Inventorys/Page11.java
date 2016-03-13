package de.teamfci.fcicrafting.Inventorys;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Page11 {


	final private static ItemStack GLASSCHEIBE_GRAU = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 7);
	final public  static ItemStack PLACEHOLDER = new ItemStack(Material.STAINED_GLASS_PANE,0, (short) 8);
	final private static ItemStack GLASSCHEIBE_PINK = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 11);
	public static Inventory inv = null;
	
	public static void open(Player p){
		inv = Bukkit.getServer().createInventory(null, 27,
				"Advanced Crafting");
		ItemMeta meta = GLASSCHEIBE_GRAU.getItemMeta();
		meta.setDisplayName(" ");
		GLASSCHEIBE_GRAU.setItemMeta(meta);
		ItemMeta meta2 = GLASSCHEIBE_PINK.getItemMeta();
		meta2.setDisplayName("CRAFT!");
		GLASSCHEIBE_PINK.setItemMeta(meta2);
		ItemMeta meta3 = PLACEHOLDER.getItemMeta();
		meta3.setDisplayName("Hier Crafting-Items einfügen");
		PLACEHOLDER.setItemMeta(meta3);
		for (int i = 0; i < 27; i++) {
			inv.setItem(i, GLASSCHEIBE_GRAU);
		}

		/*
		 * 02 03 04 11 12 13 15
		 * 20 21 22
		 */
		inv.setItem(2, PLACEHOLDER);
		inv.setItem(3, PLACEHOLDER);
		inv.setItem(4, PLACEHOLDER);
		inv.setItem(20, PLACEHOLDER);
		inv.setItem(21, PLACEHOLDER);
		inv.setItem(22, PLACEHOLDER);
		inv.setItem(12, PLACEHOLDER);
		inv.setItem(11, PLACEHOLDER);
		inv.setItem(13, PLACEHOLDER);
		inv.setItem(15, GLASSCHEIBE_PINK);
		p.openInventory(inv);
		
	}
}
