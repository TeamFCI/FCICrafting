package de.teamfci.fcicrafting.Events;

import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class DamageListener implements Listener {

	@EventHandler
	public void onDamage(EntityDamageByEntityEvent e){
		
		
		Entity p = e.getEntity();
		Entity d = e.getDamager();
		Random r = new Random();
		if(d instanceof Player){
			if(p instanceof Player){
				Player pp = (Player) p;
				Player dp = (Player) d;
			if(dp.getItemInHand().getItemMeta().getLore().get(2).contains("25%-ige Chance deinen Gegner erblinden zu lassen.")){
				int rndm = r.nextInt(4);
				switch (rndm) {
				case 1:
					pp.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 100, 1));
					break;
				default:
					break;
				}
			}
			if(dp.getItemInHand().getItemMeta().getLore().contains(ChatColor.GOLD + "50%-ige Chance deinen Gegner erblinden zu lassen.")){
				int rndm = r.nextInt(2);
				switch (rndm) {
				case 1:
					pp.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 300, 1));
					break;
				default:
					break;
				}
			}

			if(dp.getItemInHand().getItemMeta().getLore().contains(ChatColor.GOLD + "25%-ige Chance, dass deinem Gegner schlecht wird.")){
				int rndm = r.nextInt(4);
				switch (rndm) {
				case 1:
					pp.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 100, 1));
					break;
				default:
					break;
				}
			}
			if(dp.getItemInHand().getItemMeta().getLore().contains(ChatColor.GOLD + "50%-ige Chance, dass deinem Gegner schlecht wird.")){
				int rndm = r.nextInt(2);
				switch (rndm) {
				case 1:
					pp.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 300, 1));
					break;
				default:
					break;
				}
			}
			if(dp.getItemInHand().getItemMeta().getLore().contains(ChatColor.GOLD + "25%-ige Chance, dass dein Gegner vergiftet wird.")){
				int rndm = r.nextInt(4);
				switch (rndm) {
				case 1:
					pp.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 100, 1));
					break;
				default:
					break;
				}
			}
			if(dp.getItemInHand().getItemMeta().getLore().contains(ChatColor.GOLD + "50%-ige Chance, dass dein Gegner vergiftet wird.")){
				int rndm = r.nextInt(2);
				switch (rndm) {
				case 1:
					pp.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 300, 1));
					break;
				default:
					break;
				}
			}
			
			if(dp.getItemInHand().getItemMeta().getLore().contains(ChatColor.GOLD + "25%-ige Chance, dass dein Gegner verlangsamt wird.")){
				int rndm = r.nextInt(4);
				switch (rndm) {
				case 1:
					pp.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 100, 1));
					break;
				default:
					break;
				}
			}
			if(dp.getItemInHand().getItemMeta().getLore().contains(ChatColor.GOLD + "50%-ige Chance, dass dein Gegner verlangsamt wird.")){
				int rndm = r.nextInt(2);
				switch (rndm) {
				case 1:
					pp.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 300, 1));
					break;
				default:
					break;
				}
			}
			
			if(dp.getItemInHand().getItemMeta().getLore().contains(ChatColor.GOLD + "25%-ige Chance, dass dein Gegner den Wither-Effekt bekommt.")){
				int rndm = r.nextInt(4);
				switch (rndm) {
				case 1:
					pp.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 100, 1));
					break;
				default:
					break;
				}
			}
			if(dp.getItemInHand().getItemMeta().getLore().contains(ChatColor.GOLD + "50%-ige Chance, dass dein Gegner den Wither-Effekt bekommt.")){
				int rndm = r.nextInt(2);
				switch (rndm) {
				case 1:
					pp.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 300, 1));
					break;
				default:
					break;
				}
			}
			
			}
		
	}
	
}}
