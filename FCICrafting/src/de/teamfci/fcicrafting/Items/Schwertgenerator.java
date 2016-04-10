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
		meta.setDisplayName("ßbBlendendes Schwert Tier 1");
		Lores.add("ßaFortressß8-ßaCombatß8-ßaItem");
		Lores.add("ß9ßm------------------------------");
		Lores.add("ß625%-ige Chance deinen Gegner erblinden zu lassen.");
		Lores.add("ß9ßm------------------------------");
		Lores.add("ßaBesitzer: ße{USER}".replace("{USER}", p.getName()));
		meta.setLore(Lores);
		item.setItemMeta(meta);
		Lores.clear();
		return item;
	}

	public static ItemStack getBlendT2(Player p) {
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("ßbBlendendes Schwert Tier 2");
		Lores.add("ßaFortressß8-ßaCombatß8-ßaItem");
		Lores.add("ß9ßm------------------------------");
		Lores.add("ß650%-ige Chance deinen Gegner erblinden zu lassen.");
		Lores.add("ß9ßm------------------------------");
		Lores.add("ßaBesitzer: ße{USER}".replace("{USER}", p.getName()));
		meta.setLore(Lores);
		item.setItemMeta(meta);
		Lores.clear();
		return item;
	}

	public static ItemStack getUebelT1(Player p) {
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("ßb‹belkeitsschwert Tier 1");
		Lores.add("ßaFortressß8-ßaCombatß8-ßaItem");
		Lores.add("ß9ßm------------------------------");
		Lores.add("ß625%-ige Chance, dass deinem Gegner schlecht wird.");
		Lores.add("ß9ßm------------------------------");
		Lores.add("ßaBesitzer: ße{USER}".replace("{USER}", p.getName()));
		meta.setLore(Lores);
		item.setItemMeta(meta);
		Lores.clear();
		return item;
	}

	public static ItemStack getUebelT2(Player p) {
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("ßb‹belkeitsschwert Tier 2");
		Lores.add("ßaFortressß8-ßaCombatß8-ßaItem");
		Lores.add("ß9ßm------------------------------");
		Lores.add("ß650%-ige Chance, dass deinem Gegner schlecht wird.");
		Lores.add("ß9ßm------------------------------");
		Lores.add("ßaBesitzer: ße{USER}".replace("{USER}", p.getName()));
		meta.setLore(Lores);
		item.setItemMeta(meta);
		Lores.clear();
		return item;
	}

	public static ItemStack getGiftT1(Player p) {
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("ßbVergiftungsschwert Tier 1");
		Lores.add("ßaFortressß8-ßaCombatß8-ßaItem");
		Lores.add("ß9ßm------------------------------");
		Lores.add("ß625%-ige Chance, dass dein Gegner vergiftet wird.");
		Lores.add("ß9ßm------------------------------");
		Lores.add("ßaBesitzer: ße{USER}".replace("{USER}", p.getName()));
		meta.setLore(Lores);
		item.setItemMeta(meta);
		Lores.clear();
		return item;
	}

	public static ItemStack getGiftT2(Player p) {
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("ßbVergiftungsschwert Tier 2");
		Lores.add("ßaFortressß8-ßaCombatß8-ßaItem");
		Lores.add("ß9ßm------------------------------");
		Lores.add("ß650%-ige Chance, dass dein Gegner vergiftet wird.");
		Lores.add("ß9ßm------------------------------");
		Lores.add("ßaBesitzer: ße{USER}".replace("{USER}", p.getName()));
		meta.setLore(Lores);
		item.setItemMeta(meta);
		Lores.clear();
		return item;
	}

	public static ItemStack getSlowT1(Player p) {
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("ßbVerlansamungsschwert Tier 1");
		Lores.add("ßaFortressß8-ßaCombatß8-ßaItem");
		Lores.add("ß9ßm------------------------------");
		Lores.add("ß625%-ige Chance, dass dein Gegner verlangsamt wird.");
		Lores.add("ß9ßm------------------------------");
		Lores.add("ßaBesitzer: ße{USER}".replace("{USER}", p.getName()));
		meta.setLore(Lores);
		item.setItemMeta(meta);
		Lores.clear();
		return item;
	}

	public static ItemStack getSlowT2(Player p) {

		ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("ßbVerlansamungsschwert Tier 2");
		Lores.add("ßaFortressß8-ßaCombatß8-ßaItem");
		Lores.add("ß9ßm------------------------------");
		Lores.add("ß650%-ige Chance, dass dein Gegner verlangsamt wird.");
		Lores.add("ß9ßm------------------------------");
		Lores.add("ßaBesitzer: ße{USER}".replace("{USER}", p.getName()));
		meta.setLore(Lores);
		item.setItemMeta(meta);
		Lores.clear();
		return item;
	}

	public static ItemStack getWitherT1(Player p) {
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("ßbWitherschwert Tier 1");
		Lores.add("ßaFortressß8-ßaCombatß8-ßaItem");
		Lores.add("ß9ßm------------------------------");
		Lores.add("ß625%-ige Chance, dass dein Gegner den Wither-Effekt bekommt.");
		Lores.add("ß9ßm------------------------------");
		Lores.add("ßaBesitzer: ße{USER}".replace("{USER}", p.getName()));
		meta.setLore(Lores);
		item.setItemMeta(meta);
		Lores.clear();
		return item;
	}

	public static ItemStack getWitherT2(Player p) {
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("ßbWitherschwert Tier 2");
		Lores.add("ßaFortressß8-ßaCombatß8-ßaItem");
		Lores.add("ß9ßm------------------------------");
		Lores.add("ß650%-ige Chance, dass dein Gegner den Wither-Effekt bekommt.");
		Lores.add("ß9ßm------------------------------");
		Lores.add("ßaBesitzer: ße{USER}".replace("{USER}", p.getName()));
		meta.setLore(Lores);
		item.setItemMeta(meta);
		Lores.clear();
		return item;
	}
	
	public static ItemStack getSchwachT1(Player p){
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("ßbSchw‰cheschwert Tier 1");
		Lores.add("ßaFortressß8-ßaCombatß8-ßaItem");
		Lores.add("ß9ßm------------------------------");
		Lores.add("ß625%-ige Chance, dass dein Gegner geschw‰cht wird.");
		Lores.add("ß9ßm------------------------------");
		Lores.add("ßaBesitzer: ße{USER}".replace("{USER}", p.getName()));
		meta.setLore(Lores);
		item.setItemMeta(meta);
		Lores.clear();
		return item;
	}
	
	public static ItemStack getSchwachT2(Player p){
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("ßbSchw‰cheschwert Tier 2");
		Lores.add("ßaFortressß8-ßaCombatß8-ßaItem");
		Lores.add("ß9ßm------------------------------");
		Lores.add("ß650%-ige Chance, dass dein Gegner geschw‰cht wird.");
		Lores.add("ß9ßm------------------------------");
		Lores.add("ßaBesitzer: ße{USER}".replace("{USER}", p.getName()));
		meta.setLore(Lores);
		item.setItemMeta(meta);
		Lores.clear();
		return item;
	}

}
