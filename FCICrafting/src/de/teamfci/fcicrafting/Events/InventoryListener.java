package de.teamfci.fcicrafting.Events;

import java.util.LinkedList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import de.teamfci.fcicrafting.Inventorys.Page1;
import de.teamfci.fcicrafting.Inventorys.Page10;
import de.teamfci.fcicrafting.Inventorys.Page11;
import de.teamfci.fcicrafting.Inventorys.Page12;
import de.teamfci.fcicrafting.Inventorys.Page13;
import de.teamfci.fcicrafting.Inventorys.Page14;
import de.teamfci.fcicrafting.Inventorys.Page15;
import de.teamfci.fcicrafting.Inventorys.Page2;
import de.teamfci.fcicrafting.Inventorys.Page3;
import de.teamfci.fcicrafting.Inventorys.Page4;
import de.teamfci.fcicrafting.Inventorys.Page5;
import de.teamfci.fcicrafting.Inventorys.Page6;
import de.teamfci.fcicrafting.Inventorys.Page7;
import de.teamfci.fcicrafting.Inventorys.Page8;
import de.teamfci.fcicrafting.Inventorys.Page9;
import de.teamfci.fcicrafting.Items.Schwertgenerator;

public class InventoryListener implements Listener {

	private final static ItemStack INKSACK= new ItemStack(Material.INK_SACK);;
    private final static ItemStack DIASCHWERT = new ItemStack(Material.DIAMOND_SWORD);;
    private final static ItemStack SLIME = new ItemStack(Material.SLIME_BALL);;
    private final static ItemStack KUGELFISCH = new ItemStack(Material.RAW_FISH, 1, (short)3);;
    private final static ItemStack FERM = new ItemStack(Material.FERMENTED_SPIDER_EYE);
    @SuppressWarnings("deprecation")
	private final static ItemStack WART = new ItemStack(372);;
    @SuppressWarnings("deprecation")
	private final static ItemStack WITHER = new ItemStack(397, 1, (short)1);
    private boolean valid = false;
	private List<String> lore = new LinkedList<String>();
	
	@EventHandler
	public void onClick(InventoryClickEvent e) {
		Inventory inv = e.getClickedInventory();
		Player p = (Player) e.getWhoClicked();
		if (e.getSlot() == 26) {
			if (inv.equals(Page1.inv)) {
				Page2.open(p);
			}
			if (inv.equals(Page2.inv)) {
				Page3.open(p);
			}
			if (inv.equals(Page3.inv)) {
				Page4.open(p);
			}
			if (inv.equals(Page4.inv)) {
				Page5.open(p);
			}
			if (inv.equals(Page5.inv)) {
				Page6.open(p);
			}
			if (inv.equals(Page6.inv)) {
				Page7.open(p);
			}
			if (inv.equals(Page7.inv)) {
				Page8.open(p);
			}
			if (inv.equals(Page8.inv)) {
				Page9.open(p);
			}
			if (inv.equals(Page9.inv)) {
				Page10.open(p);
			}
			if(inv.equals(Page10.inv)){
				Page14.open(p);
			}
			if(inv.equals(Page14.inv)){
				Page15.open(p);
			}
		}
		if (e.getSlot() == 18) {
			if (inv.equals(Page2.inv)) {
				Page1.open(p);
			}
			if (inv.equals(Page3.inv)) {
				Page2.open(p);
			}
			if (inv.equals(Page4.inv)) {
				Page3.open(p);
			}
			if (inv.equals(Page5.inv)) {
				Page4.open(p);
			}
			if (inv.equals(Page6.inv)) {
				Page5.open(p);
			}
			if (inv.equals(Page7.inv)) {
				Page6.open(p);
			}
			if (inv.equals(Page8.inv)) {
				Page7.open(p);
			}
			if (inv.equals(Page9.inv)) {
				Page8.open(p);
			}
			if (inv.equals(Page10.inv)) {
				Page9.open(p);
			}
			if(inv.equals(Page14.inv)){
				Page10.open(p);
			}
			if(inv.equals(Page15.inv)){
				Page14.open(p);
			}
		}
		
		if(e.getSlot() == 11){
			if(e.getClickedInventory().equals(Page12.inv)){
				 return;
			 }
		}
		
		if(e.getSlot() == 13){
			if(e.getClickedInventory().equals(Page12.inv)){
				 return;
			 }
		}
		
		 if(e.getSlot() == 15){
			
			 
			 if(e.getClickedInventory().equals(Page11.inv)){

					
//					Blend 1
					if(inv.getItem(2).equals(Page11.PLACEHOLDER)){
						if(inv.getItem(3).equals(INKSACK)){
							if(inv.getItem(4).equals(Page11.PLACEHOLDER)){
								if(inv.getItem(11).equals(SLIME)){
									if(inv.getItem(12).equals(DIASCHWERT)){
										if(inv.getItem(13).equals(SLIME)){
											if(inv.getItem(20).equals(Page11.PLACEHOLDER)){
												if(inv.getItem(21).equals(INKSACK)){
													if(inv.getItem(22).equals(Page11.PLACEHOLDER)){
														p.getInventory().addItem(Schwertgenerator.getBlendT1(p));
														p.closeInventory();
														valid = true;
					}}}}}}}}}
//					Blend 2
					if(inv.getItem(2).equals(INKSACK)){
						if(inv.getItem(3).equals(SLIME)){
							if(inv.getItem(4).equals(INKSACK)){
								if(inv.getItem(11).equals(SLIME)){
									if(inv.getItem(12).equals(DIASCHWERT)){
										if(inv.getItem(13).equals(SLIME)){
											if(inv.getItem(20).equals(INKSACK)){
												if(inv.getItem(21).equals(SLIME)){
													if(inv.getItem(22).equals(INKSACK)){
														p.getInventory().addItem(Schwertgenerator.getBlendT2(p));
														p.closeInventory();
														valid = true;
					}}}}}}}}}
//					Übel 1
					if(inv.getItem(2).equals(Page11.PLACEHOLDER)){
						if(inv.getItem(3).equals(KUGELFISCH)){
							if(inv.getItem(4).equals(Page11.PLACEHOLDER)){
								if(inv.getItem(11).equals(KUGELFISCH)){
									if(inv.getItem(12).equals(DIASCHWERT)){
										if(inv.getItem(13).equals(KUGELFISCH)){
											if(inv.getItem(20).equals(Page11.PLACEHOLDER)){
												if(inv.getItem(21).equals(KUGELFISCH)){
													if(inv.getItem(22).equals(Page11.PLACEHOLDER)){
														p.getInventory().addItem(Schwertgenerator.getUebelT1(p));
														p.closeInventory();
														valid = true;
					}}}}}}}}}
//					Übel 2
					if(inv.getItem(2).equals(KUGELFISCH)){
						if(inv.getItem(3).equals(KUGELFISCH)){
							if(inv.getItem(4).equals(KUGELFISCH)){
								if(inv.getItem(11).equals(KUGELFISCH)){
									if(inv.getItem(12).equals(DIASCHWERT)){
										if(inv.getItem(13).equals(KUGELFISCH)){
											if(inv.getItem(20).equals(KUGELFISCH)){
												if(inv.getItem(21).equals(KUGELFISCH)){
													if(inv.getItem(22).equals(KUGELFISCH)){
														p.getInventory().addItem(Schwertgenerator.getUebelT2(p));
														p.closeInventory();
														valid = true;
					}}}}}}}}}
//					Gift 1
					if(inv.getItem(2).equals(Page11.PLACEHOLDER)){
						if(inv.getItem(3).equals(FERM)){
							if(inv.getItem(4).equals(Page11.PLACEHOLDER)){
								if(inv.getItem(11).equals(FERM)){
									if(inv.getItem(12).equals(DIASCHWERT)){
										if(inv.getItem(13).equals(FERM)){
											if(inv.getItem(20).equals(Page11.PLACEHOLDER)){
												if(inv.getItem(21).equals(FERM)){
													if(inv.getItem(22).equals(Page11.PLACEHOLDER)){
														p.getInventory().addItem(Schwertgenerator.getGiftT1(p));
														p.closeInventory();
														valid = true;
					}}}}}}}}}
//					Gift 2
					if(inv.getItem(2).equals(FERM)){
						if(inv.getItem(3).equals(FERM)){
							if(inv.getItem(4).equals(FERM)){
								if(inv.getItem(11).equals(FERM)){
									if(inv.getItem(12).equals(DIASCHWERT)){
										if(inv.getItem(13).equals(FERM)){
											if(inv.getItem(20).equals(FERM)){
												if(inv.getItem(21).equals(FERM)){
													if(inv.getItem(22).equals(FERM)){
														p.getInventory().addItem(Schwertgenerator.getGiftT2(p));
														p.closeInventory();
														valid = true;
					}}}}}}}}}
//					Slow 1
					if(inv.getItem(2).equals(Page11.PLACEHOLDER)){
						if(inv.getItem(3).equals(FERM)){
							if(inv.getItem(4).equals(Page11.PLACEHOLDER)){
								if(inv.getItem(11).equals(WART)){
									if(inv.getItem(12).equals(DIASCHWERT)){
										if(inv.getItem(13).equals(WART)){
											if(inv.getItem(20).equals(Page11.PLACEHOLDER)){
												if(inv.getItem(21).equals(FERM)){
													if(inv.getItem(22).equals(Page11.PLACEHOLDER)){
														p.getInventory().addItem(Schwertgenerator.getSlowT1(p));
														p.closeInventory();
														valid = true;
					}}}}}}}}}
//					Slow 2
					if(inv.getItem(2).equals(FERM)){
						if(inv.getItem(3).equals(WART)){
							if(inv.getItem(4).equals(FERM)){
								if(inv.getItem(11).equals(WART)){
									if(inv.getItem(12).equals(DIASCHWERT)){
										if(inv.getItem(13).equals(WART)){
											if(inv.getItem(20).equals(FERM)){
												if(inv.getItem(21).equals(WART)){
													if(inv.getItem(22).equals(FERM)){
														p.getInventory().addItem(Schwertgenerator.getSlowT2(p));
														p.closeInventory();
														valid = true;
					}}}}}}}}}
//					Wither 1
					if(inv.getItem(2).equals(Page11.PLACEHOLDER)){
						if(inv.getItem(3).equals(WITHER)){
							if(inv.getItem(4).equals(Page11.PLACEHOLDER)){
								if(inv.getItem(11).equals(WITHER)){
									if(inv.getItem(12).equals(DIASCHWERT)){
										if(inv.getItem(13).equals(WITHER)){
											if(inv.getItem(20).equals(Page11.PLACEHOLDER)){
												if(inv.getItem(21).equals(WITHER)){
													if(inv.getItem(22).equals(Page11.PLACEHOLDER)){
														p.getInventory().addItem(Schwertgenerator.getWitherT1(p));
														p.closeInventory();
														valid = true;
					}}}}}}}}}
//					Wither 2
					if(inv.getItem(2).equals(WITHER)){
						if(inv.getItem(3).equals(WITHER)){
							if(inv.getItem(4).equals(WITHER)){
								if(inv.getItem(11).equals(WITHER)){
									if(inv.getItem(12).equals(DIASCHWERT)){
										if(inv.getItem(13).equals(WITHER)){
											if(inv.getItem(20).equals(WITHER)){
												if(inv.getItem(21).equals(WITHER)){
													if(inv.getItem(22).equals(WITHER)){
														p.getInventory().addItem(Schwertgenerator.getWitherT2(p));
														p.closeInventory();
														valid = true;
					}}}}}}}}}
					if(valid == false){
						e.setCancelled(true);
					}
					valid = false;
				
			 }
		 }
		 
		 if(e.getSlot() == 16){
			 if(inv.equals(Page12.inv)){
				 if(inv.getItem(13).getType().equals(Material.EMERALD)){
					 if(inv.getItem(11).getItemMeta().getLore().get(0).equals("§aFortress§8-§aCombat§8-§aItem")){
						 if(inv.getItem(11).getItemMeta().getLore().get(2).contains("%")){
							 ItemStack ench = inv.getItem(11);
							 ItemStack emerald = inv.getItem(13);
							 ench.addEnchantments(emerald.getEnchantments());
							 p.closeInventory();
							 p.getInventory().addItem(ench);
						 } else {
							 p.sendMessage("Bitte lege ein Effektschwert in das 1. Feld.");
						 }
					 } else {
						 p.sendMessage("Bitte lege ein Effektschwert in das 1. Feld.");
					 }
				 } else {
					 p.sendMessage("Bitte lege einen Enchanting-Emerald in das 2. Feld.");
				 }
			 }
			 if(inv.equals(Page13.inv)){
				 if(inv.getItem(13).getType().equals(Material.ENCHANTED_BOOK)){
					 if(inv.getItem(11).getType().equals(Material.EMERALD)){
						 
							 ItemStack emerald = inv.getItem(11);
							 ItemStack enchbook = inv.getItem(13);
							 emerald.addEnchantments(enchbook.getEnchantments());
							 ItemMeta meta = emerald.getItemMeta();
							 meta.setDisplayName("Enchanting-Emerald");
							 lore.add("§aFortress§8-§aCombat§8-§aItem");
							 lore.add("§9§m------------------------------");
							 lore.add("§6Dieser Emerald wurde verzaubert und kann");
							 lore.add("§6im Advanced Enchanter weiterverwendet werden.");
							 lore.add("§9§m------------------------------");
							 lore.add("§aBesitzer: §e{USER}".replace("{USER}", p.getName()));
							 meta.setLore(lore);
							 emerald.setItemMeta(meta);
							 p.closeInventory();
							 p.getInventory().addItem(emerald);
					 } else {
						 p.sendMessage("Bitte lege einen Enchanting-Emerald in das 1. Feld.");
					 }
				 } else {
					 p.sendMessage("Bitte lege ein verzaubertes Buch in das 2. Feld.");
				 }
			 }
		 }
		 
		 if(inv.equals(Page12.inv)){
			 e.setCancelled(true);
		 }

		if (inv.equals(Page1.inv)) {
			e.setCancelled(true);
		}
		if (inv.equals(Page2.inv)) {
			e.setCancelled(true);

		}
		if (inv.equals(Page3.inv)) {
			e.setCancelled(true);

		}
		if (inv.equals(Page4.inv)) {
			e.setCancelled(true);

		}
		if (inv.equals(Page5.inv)) {
			e.setCancelled(true);

		}
		if (inv.equals(Page6.inv)) {
			e.setCancelled(true);

		}
		if (inv.equals(Page7.inv)) {
			e.setCancelled(true);

		}
		if (inv.equals(Page8.inv)) {
			e.setCancelled(true);

		}
		if (inv.equals(Page9.inv)) {
			e.setCancelled(true);

		}
		if (inv.equals(Page10.inv)) {
			e.setCancelled(true);

		}

		if (inv.equals(Page11.inv)) {
			if (e.getSlot() != 2) {
				if (e.getSlot() != 3) {
					if (e.getSlot() != 4) {
						if (e.getSlot() != 11) {
							if (e.getSlot() != 12) {
								if (e.getSlot() != 13) {
									if (e.getSlot() != 20) {
										if (e.getSlot() != 22) {
											if (e.getSlot() != 21) {
												if(e.getSlot() != 15){
												e.setCancelled(true);
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@EventHandler
	public void onDrop(PlayerDropItemEvent e) {
		Inventory inv = (Inventory) e.getPlayer().getOpenInventory();
		if (inv.equals(Page1.inv)) {
			e.setCancelled(true);
		}
		if (inv.equals(Page2.inv)) {
			e.setCancelled(true);

		}
		if (inv.equals(Page3.inv)) {
			e.setCancelled(true);

		}
		if (inv.equals(Page4.inv)) {
			e.setCancelled(true);

		}
		if (inv.equals(Page5.inv)) {
			e.setCancelled(true);

		}
		if (inv.equals(Page6.inv)) {
			e.setCancelled(true);

		}
		if (inv.equals(Page7.inv)) {
			e.setCancelled(true);

		}
		if (inv.equals(Page8.inv)) {
			e.setCancelled(true);

		}
		if (inv.equals(Page9.inv)) {
			e.setCancelled(true);

		}
		if (inv.equals(Page10.inv)) {
			e.setCancelled(true);

		}

		if (inv.equals(Page11.inv)) {

			e.setCancelled(true);
		}
	}
}
