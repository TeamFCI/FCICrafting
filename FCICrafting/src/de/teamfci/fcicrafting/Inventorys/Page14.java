package de.teamfci.fcicrafting.Inventorys;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import de.teamfci.fcicrafting.Items.Schwertgenerator;

public class Page14 {
	
	final private static ItemStack NETHER = new ItemStack(Material.NETHER_WARTS);
	final private static ItemStack POTION = new ItemStack(Material.POTION, 1, (byte) 8232);
	final private static ItemStack GLASSCHEIBE_GRAU = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 7);
	final private static ItemStack GLASSCHEIBE_ROT = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 14);
	public static Inventory inv = null;
	
	public static void open(Player p){
		inv = Bukkit.getServer().createInventory(null, 27, "Blendendes Schwert Tier 2");
		ItemMeta meta = GLASSCHEIBE_GRAU.getItemMeta();
		meta.setDisplayName(" ");
		GLASSCHEIBE_GRAU.setItemMeta(meta);
		for (int i = 0; i < 27; i++) {
			inv.setItem(i, GLASSCHEIBE_GRAU);
		}
		/*
		 * 02 03 04 11 12 13 15 20 21 22
		 */
		inv.setItem(2, NETHER);
		inv.setItem(4, NETHER);
		inv.setItem(20, NETHER);
		inv.setItem(22, NETHER);
		inv.setItem(11, POTION);
		inv.setItem(13, POTION);
		inv.setItem(3, POTION);
		inv.setItem(21, POTION);
		inv.setItem(12, new ItemStack(Material.DIAMOND_SWORD));
		inv.setItem(15, Schwertgenerator.getBlendT2(p)); inv.setItem(18, GLASSCHEIBE_ROT); p.openInventory(inv);
	}



}
