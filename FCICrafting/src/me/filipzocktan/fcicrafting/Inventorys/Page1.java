package me.filipzocktan.fcicrafting.Inventorys;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import me.filipzocktan.fcicrafting.Items.Schwertgenerator;

public class Page1 {
	
	final private static ItemStack INKSACK = new ItemStack(Material.INK_SACK);
	final private static ItemStack DIASCHWERT = new ItemStack(Material.DIAMOND_SWORD);
	final private static ItemStack GLASSCHEIBE_GRAU = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 7);
	final private static ItemStack GLASSCHEIBE_GRUEN = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 5);
	final private static ItemStack AIR = new ItemStack(Material.AIR, 1, (short) 7);
	final private static ItemStack SLIME = new ItemStack(Material.SLIME_BALL);
	public static Inventory inv = null;
	
	public static void open(Player p){
		inv = Bukkit.getServer().createInventory(null, 27, "Blendendes Schwert Tier 1");
		ItemMeta meta = GLASSCHEIBE_GRAU.getItemMeta();
		meta.setDisplayName(" ");
		GLASSCHEIBE_GRAU.setItemMeta(meta);
		for (int i = 0; i < 27; i++) {
			inv.setItem(i, GLASSCHEIBE_GRAU);
		}
		inv.setItem(2, AIR);
		inv.setItem(3, INKSACK);
		inv.setItem(4, AIR);
		inv.setItem(20, AIR);
		inv.setItem(21, INKSACK);
		inv.setItem(22, AIR);
		inv.setItem(12, DIASCHWERT);
		inv.setItem(11, SLIME);
		inv.setItem(13, SLIME);
		inv.setItem(15, Schwertgenerator.getBlendT1(p));
		inv.setItem(26, GLASSCHEIBE_GRUEN); p.openInventory(inv);
	}

}
