package de.teamfci.fcicrafting.Items;

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
		meta.setDisplayName("�bBlendendes Schwert Tier 1");
		Lores.add("�aFortress�8-�aCombat�8-�aItem");
		Lores.add("�9�m------------------------------");
		Lores.add("�625%-ige Chance deinen Gegner erblinden zu lassen.");
		Lores.add("�9�m------------------------------");
		Lores.add("�aBesitzer: �e{USER}".replace("{USER}", p.getName()));
		meta.setLore(Lores);
		item.setItemMeta(meta);
		Lores.clear();
		return item;
	}

	public static ItemStack getBlendT2(Player p) {
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("�bBlendendes Schwert Tier 2");
		Lores.add("�aFortress�8-�aCombat�8-�aItem");
		Lores.add("�9�m------------------------------");
		Lores.add("�650%-ige Chance deinen Gegner erblinden zu lassen.");
		Lores.add("�9�m------------------------------");
		Lores.add("�aBesitzer: �e{USER}".replace("{USER}", p.getName()));
		meta.setLore(Lores);
		item.setItemMeta(meta);
		Lores.clear();
		return item;
	}

	public static ItemStack getUebelT1(Player p) {
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("�b�belkeitsschwert Tier 1");
		Lores.add("�aFortress�8-�aCombat�8-�aItem");
		Lores.add("�9�m------------------------------");
		Lores.add("�625%-ige Chance, dass deinem Gegner schlecht wird.");
		Lores.add("�9�m------------------------------");
		Lores.add("�aBesitzer: �e{USER}".replace("{USER}", p.getName()));
		meta.setLore(Lores);
		item.setItemMeta(meta);
		Lores.clear();
		return item;
	}

	public static ItemStack getUebelT2(Player p) {
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("�b�belkeitsschwert Tier 2");
		Lores.add("�aFortress�8-�aCombat�8-�aItem");
		Lores.add("�9�m------------------------------");
		Lores.add("�650%-ige Chance, dass deinem Gegner schlecht wird.");
		Lores.add("�9�m------------------------------");
		Lores.add("�aBesitzer: �e{USER}".replace("{USER}", p.getName()));
		meta.setLore(Lores);
		item.setItemMeta(meta);
		Lores.clear();
		return item;
	}

	public static ItemStack getGiftT1(Player p) {
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("�bVergiftungsschwert Tier 1");
		Lores.add("�aFortress�8-�aCombat�8-�aItem");
		Lores.add("�9�m------------------------------");
		Lores.add("�625%-ige Chance, dass dein Gegner vergiftet wird.");
		Lores.add("�9�m------------------------------");
		Lores.add("�aBesitzer: �e{USER}".replace("{USER}", p.getName()));
		meta.setLore(Lores);
		item.setItemMeta(meta);
		Lores.clear();
		return item;
	}

	public static ItemStack getGiftT2(Player p) {
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("�bVergiftungsschwert Tier 2");
		Lores.add("�aFortress�8-�aCombat�8-�aItem");
		Lores.add("�9�m------------------------------");
		Lores.add("�650%-ige Chance, dass dein Gegner vergiftet wird.");
		Lores.add("�9�m------------------------------");
		Lores.add("�aBesitzer: �e{USER}".replace("{USER}", p.getName()));
		meta.setLore(Lores);
		item.setItemMeta(meta);
		Lores.clear();
		return item;
	}

	public static ItemStack getSlowT1(Player p) {
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("�bVerlansamungsschwert Tier 1");
		Lores.add("�aFortress�8-�aCombat�8-�aItem");
		Lores.add("�9�m------------------------------");
		Lores.add("�625%-ige Chance, dass dein Gegner verlangsamt wird.");
		Lores.add("�9�m------------------------------");
		Lores.add("�aBesitzer: �e{USER}".replace("{USER}", p.getName()));
		meta.setLore(Lores);
		item.setItemMeta(meta);
		Lores.clear();
		return item;
	}

	public static ItemStack getSlowT2(Player p) {

		ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("�bVerlansamungsschwert Tier 2");
		Lores.add("�aFortress�8-�aCombat�8-�aItem");
		Lores.add("�9�m------------------------------");
		Lores.add("�650%-ige Chance, dass dein Gegner verlangsamt wird.");
		Lores.add("�9�m------------------------------");
		Lores.add("�aBesitzer: �e{USER}".replace("{USER}", p.getName()));
		meta.setLore(Lores);
		item.setItemMeta(meta);
		Lores.clear();
		return item;
	}

	public static ItemStack getWitherT1(Player p) {
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("�bWitherschwert Tier 1");
		Lores.add("�aFortress�8-�aCombat�8-�aItem");
		Lores.add("�9�m------------------------------");
		Lores.add("�625%-ige Chance, dass dein Gegner den Wither-Effekt bekommt.");
		Lores.add("�9�m------------------------------");
		Lores.add("�aBesitzer: �e{USER}".replace("{USER}", p.getName()));
		meta.setLore(Lores);
		item.setItemMeta(meta);
		Lores.clear();
		return item;
	}

	public static ItemStack getWitherT2(Player p) {
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("�bWitherschwert Tier 2");
		Lores.add("�aFortress�8-�aCombat�8-�aItem");
		Lores.add("�9�m------------------------------");
		Lores.add("�650%-ige Chance, dass dein Gegner den Wither-Effekt bekommt.");
		Lores.add("�9�m------------------------------");
		Lores.add("�aBesitzer: �e{USER}".replace("{USER}", p.getName()));
		meta.setLore(Lores);
		item.setItemMeta(meta);
		Lores.clear();
		return item;
	}
	
	public static ItemStack getSchwachT1(Player p){
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("�bSchw�cheschwert Tier 1");
		Lores.add("�aFortress�8-�aCombat�8-�aItem");
		Lores.add("�9�m------------------------------");
		Lores.add("�625%-ige Chance, dass dein Gegner geschw�cht wird.");
		Lores.add("�9�m------------------------------");
		Lores.add("�aBesitzer: �e{USER}".replace("{USER}", p.getName()));
		meta.setLore(Lores);
		item.setItemMeta(meta);
		Lores.clear();
		return item;
	}
	
	public static ItemStack getSchwachT2(Player p){
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("�bSchw�cheschwert Tier 2");
		Lores.add("�aFortress�8-�aCombat�8-�aItem");
		Lores.add("�9�m------------------------------");
		Lores.add("�650%-ige Chance, dass dein Gegner geschw�cht wird.");
		Lores.add("�9�m------------------------------");
		Lores.add("�aBesitzer: �e{USER}".replace("{USER}", p.getName()));
		meta.setLore(Lores);
		item.setItemMeta(meta);
		Lores.clear();
		return item;
	}

}
