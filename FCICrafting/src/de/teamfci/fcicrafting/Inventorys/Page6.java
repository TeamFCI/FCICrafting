package de.teamfci.fcicrafting.Inventorys;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import de.teamfci.fcicrafting.Items.Schwertgenerator;

public class Page6 {

	final private static ItemStack DIASCHWERT = new ItemStack(Material.DIAMOND_SWORD);
	final private static ItemStack GLASSCHEIBE_GRAU = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 7);
	final private static ItemStack GLASSCHEIBE_ROT = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 14);
	final private static ItemStack GLASSCHEIBE_GRUEN = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 5);
	final private static ItemStack FERM = new ItemStack(Material.FERMENTED_SPIDER_EYE);
	public static Inventory inv = null;
	
	public static void open(Player p){
		inv = Bukkit.getServer().createInventory(null, 27, "Vergiftungsschwert Tier 2");
		ItemMeta meta = GLASSCHEIBE_GRAU.getItemMeta();
		meta.setDisplayName(" ");
		GLASSCHEIBE_GRAU.setItemMeta(meta);
		for (int i = 0; i < 27; i++) {
			inv.setItem(i, GLASSCHEIBE_GRAU);
		}

		/*
		 * 02 03 04 11 12 13 15 20 21 22
		 */
		inv.setItem(2, FERM);
		inv.setItem(3, FERM);
		inv.setItem(4, FERM);
		inv.setItem(20, FERM);
		inv.setItem(21, FERM);
		inv.setItem(22, FERM);
		inv.setItem(12, DIASCHWERT);
		inv.setItem(11, FERM);
		inv.setItem(13, FERM);
		inv.setItem(15, Schwertgenerator.getGiftT2(p));
		inv.setItem(26, GLASSCHEIBE_GRUEN); inv.setItem(18, GLASSCHEIBE_ROT); p.openInventory(inv);
	}
}
