package me.filipzocktan.fcicrafting.Commands;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import me.filipzocktan.fcicrafting.Items.Schwertgenerator;

public class FCICRCommand_in_Dev implements CommandExecutor {

	final private ItemStack INKSACK = new ItemStack(Material.INK_SACK);
	final private ItemStack DIASCHWERT = new ItemStack(Material.DIAMOND_SWORD);
	final private ItemStack GLASSCHEIBE_GRAU = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 7);
	final private ItemStack AIR = new ItemStack(Material.AIR, 1, (short) 7);
	final private ItemStack SLIME = new ItemStack(Material.SLIME_BALL);
	final private ItemStack KUGELFISCH = new ItemStack(Material.RAW_FISH,1,(short) 3);
	final private ItemStack FERM = new ItemStack(Material.FERMENTED_SPIDER_EYE);
	public static Inventory inv = null;

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (sender instanceof Player) {
			Player p = (Player) sender;
			if (args.length == 1) {
				if (args[0].equalsIgnoreCase("1")) {
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
					p.openInventory(inv);
				} else {
					if (args[0].equalsIgnoreCase("2")) {
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
						inv.setItem(2, INKSACK);
						inv.setItem(3, SLIME);
						inv.setItem(4, INKSACK);
						inv.setItem(20, INKSACK);
						inv.setItem(21, SLIME);
						inv.setItem(22, INKSACK);
						inv.setItem(12, DIASCHWERT);
						inv.setItem(11, SLIME);
						inv.setItem(13, SLIME);
						inv.setItem(15, Schwertgenerator.getBlendT2(p));
						p.openInventory(inv);
					} else {
						if (args[0].equalsIgnoreCase("3")) {
							inv = Bukkit.getServer().createInventory(null, 27, "Übelkeitsschwert Tier 2");
							ItemMeta meta = GLASSCHEIBE_GRAU.getItemMeta();
							meta.setDisplayName(" ");
							GLASSCHEIBE_GRAU.setItemMeta(meta);
							for (int i = 0; i < 27; i++) {
								inv.setItem(i, GLASSCHEIBE_GRAU);
							}

							/*
							 * 02 03 04 11 12 13 15 20 21 22
							 */
							inv.setItem(2, AIR);
							inv.setItem(3, KUGELFISCH);
							inv.setItem(4, AIR);
							inv.setItem(20, AIR);
							inv.setItem(21, KUGELFISCH);
							inv.setItem(22, AIR);
							inv.setItem(12, DIASCHWERT);
							inv.setItem(11, KUGELFISCH);
							inv.setItem(13, KUGELFISCH);
							inv.setItem(15, Schwertgenerator.getUebelT1(p));
							p.openInventory(inv);
						} else {
							if (args[0].equalsIgnoreCase("4")) {
								inv = Bukkit.getServer().createInventory(null, 27, "Übelkeitsschwert Tier 2");
								ItemMeta meta = GLASSCHEIBE_GRAU.getItemMeta();
								meta.setDisplayName(" ");
								GLASSCHEIBE_GRAU.setItemMeta(meta);
								for (int i = 0; i < 27; i++) {
									inv.setItem(i, GLASSCHEIBE_GRAU);
								}

								/*
								 * 02 03 04 11 12 13 15 20 21 22
								 */
								inv.setItem(2, KUGELFISCH);
								inv.setItem(3, KUGELFISCH);
								inv.setItem(4, KUGELFISCH);
								inv.setItem(20, KUGELFISCH);
								inv.setItem(21, KUGELFISCH);
								inv.setItem(22, KUGELFISCH);
								inv.setItem(12, DIASCHWERT);
								inv.setItem(11, KUGELFISCH);
								inv.setItem(13, KUGELFISCH);
								inv.setItem(15, Schwertgenerator.getUebelT2(p));
								p.openInventory(inv);
							} else {
								if (args[0].equalsIgnoreCase("5")) {
									inv = Bukkit.getServer().createInventory(null, 27, "Vergiftungsschwert Tier 1");
									ItemMeta meta = GLASSCHEIBE_GRAU.getItemMeta();
									meta.setDisplayName(" ");
									GLASSCHEIBE_GRAU.setItemMeta(meta);
									for (int i = 0; i < 27; i++) {
										inv.setItem(i, GLASSCHEIBE_GRAU);
									}

									/*
									 * 02 03 04 11 12 13 15 20 21 22
									 */
									inv.setItem(2, AIR);
									inv.setItem(3, FERM);
									inv.setItem(4, AIR);
									inv.setItem(20, AIR);
									inv.setItem(21, FERM);
									inv.setItem(22, AIR);
									inv.setItem(12, DIASCHWERT);
									inv.setItem(11, FERM);
									inv.setItem(13, FERM);
									inv.setItem(15, Schwertgenerator.getGiftT1(p));
									p.openInventory(inv);
								} else {
									if (args[0].equalsIgnoreCase("6")) {
										inv = Bukkit.getServer().createInventory(null, 27, "Vergiftungsschwert Tier 1");
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
										p.openInventory(inv);
										p.sendMessage("F F F");
										p.sendMessage("F D F");
										p.sendMessage("F F F");
									} else {
										if (args[0].equalsIgnoreCase("7")) {
											p.sendMessage("N F N");
											p.sendMessage("W D W");
											p.sendMessage("N F N");
										} else {
											if (args[0].equalsIgnoreCase("8")) {
												p.sendMessage("F W F");
												p.sendMessage("W D W");
												p.sendMessage("F W F");
											} else {
												if (args[0].equalsIgnoreCase("9")) {
													p.sendMessage("N W N");
													p.sendMessage("W D W");
													p.sendMessage("N W N");
												} else {
													if (args[0].equalsIgnoreCase("10")) {
														p.sendMessage("W W W");
														p.sendMessage("W D W");
														p.sendMessage("W W W");
													} else {
														p.sendMessage("§a§l *-*-*-*-*-*-*-*-*-*-*-*");
														p.sendMessage(
																"§f[§FCICrafing§f] Durch dieses Plugin kannst du neue Waffen craften.");
														p.sendMessage(
																"§f[§FCICrafing§f] Ein Craftingtabel ist folgend aufgebaut");
														p.sendMessage("1 2 3");
														p.sendMessage("4 5 6");
														p.sendMessage("7 8 9");
														p.sendMessage("§a§l *-*-*-*-*-*-*-*-*-*-*-*");
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

			} else {
				p.sendMessage("§a§l *-*-*-*-*-*-*-*-*-*-*-*");
				p.sendMessage("§bPlugin von §aFilip Zocktan & HappyHappyBoy");
				p.sendMessage("§bAuftrag von §aTNT_Creepy");
				p.sendMessage("§f[§FCICrafing§f] Durch dieses Plugin kannst du neue Waffen craften.");
				p.sendMessage("§f[§FCICrafing§f] /fcicr <Seite> zum Anzeigen der Craftingrezepte");
				if (p.hasPermission("fci.fci")) {
					p.sendMessage("/gefs <Seite> um ein Schwert zu bekommen");
				}
				p.sendMessage("§f[§FCICrafing§f] Inhaltsverzeichnis:");
				p.sendMessage("§f[§FCICrafing§f] Seite 1: Blendendes Schwert Tier 1");
				p.sendMessage("§f[§FCICrafing§f] Seite 2: Blendendes Schwert Tier 2");
				p.sendMessage("§f[§FCICrafing§f] Seite 3: Übelkeitsschwert Tier 1");
				p.sendMessage("§f[§FCICrafing§f] Seite 4: Übelkeitsschwert Tier 2");
				p.sendMessage("§f[§FCICrafing§f] Seite 5: Vergiftungsschwert Tier 1");
				p.sendMessage("§f[§FCICrafing§f] Seite 6: Vergiftungsschwert Tier 2");
				p.sendMessage("§f[§FCICrafing§f] Seite 7: Verlangsamungsschwert Tier 1");
				p.sendMessage("§f[§FCICrafing§f] Seite 8: Verlangsamungsschwert Tier 2");
				p.sendMessage("§f[§FCICrafing§f] Seite 9: Witherschwert Tier 1");
				p.sendMessage("§f[§FCICrafing§f] Seite 10: Witherschwert Tier 2");
				p.sendMessage("§a§l *-*-*-*-*-*-*-*-*-*-*-*");
			}

		} else {
			sender.sendMessage("Du musst ein Spieler sein um dies auszuführen.");
		}
		return false;
	}

}
