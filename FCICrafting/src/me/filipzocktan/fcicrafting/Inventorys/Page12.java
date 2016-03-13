package me.filipzocktan.fcicrafting.Inventorys;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Page12 {

	final private static ItemStack GLASSCHEIBE_GRAU = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 7);
	final private static ItemStack GLASSCHEIBE_PINK = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 11);
	final private static ItemStack PLACEHOLDER = new ItemStack(Material.STAINED_GLASS_PANE,0, (short) 8);
	public static Inventory inv = null;
	
	public static void open(Player p) {
		inv = Bukkit.createInventory(null, 27,"Advanced Enchanter");
		ItemMeta meta = GLASSCHEIBE_GRAU.getItemMeta();
		meta.setDisplayName(" ");
		GLASSCHEIBE_GRAU.setItemMeta(meta);
		ItemMeta meta2 = GLASSCHEIBE_PINK.getItemMeta();
		meta2.setDisplayName("ENCHANT!");
		GLASSCHEIBE_PINK.setItemMeta(meta2);
		ItemMeta meta3 = PLACEHOLDER.getItemMeta();
		meta3.setDisplayName("Hier Schwert einfügen");
		PLACEHOLDER.setItemMeta(meta3);
		for (int i = 0; i < 27; i++) {
			inv.setItem(i, GLASSCHEIBE_GRAU);
		}
		inv.setItem(16, GLASSCHEIBE_PINK);
		inv.setItem(11, PLACEHOLDER);
		meta3 = PLACEHOLDER.getItemMeta();
		meta3.setDisplayName("Hier Enchanting-Emerald einfügen");
		PLACEHOLDER.setItemMeta(meta3);
		inv.setItem(13, PLACEHOLDER);
		p.openInventory(inv);
	}
}
