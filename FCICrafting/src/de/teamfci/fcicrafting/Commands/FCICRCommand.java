package de.teamfci.fcicrafting.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.teamfci.fcicrafting.Inventorys.Page1;
import de.teamfci.fcicrafting.Inventorys.Page10;
import de.teamfci.fcicrafting.Inventorys.Page11;
import de.teamfci.fcicrafting.Inventorys.Page12;
import de.teamfci.fcicrafting.Inventorys.Page13;
import de.teamfci.fcicrafting.Inventorys.Page2;
import de.teamfci.fcicrafting.Inventorys.Page3;
import de.teamfci.fcicrafting.Inventorys.Page4;
import de.teamfci.fcicrafting.Inventorys.Page5;
import de.teamfci.fcicrafting.Inventorys.Page6;
import de.teamfci.fcicrafting.Inventorys.Page7;
import de.teamfci.fcicrafting.Inventorys.Page8;
import de.teamfci.fcicrafting.Inventorys.Page9;

public class FCICRCommand implements CommandExecutor {

	

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (sender instanceof Player) {
			Player p = (Player) sender;
			if (args.length == 1) {
				if (args[0].equalsIgnoreCase("1")) {
					Page1.open(p);
				} else {
					if (args[0].equalsIgnoreCase("2")) {
						Page2.open(p);
					} else {
						if (args[0].equalsIgnoreCase("3")) {
							Page3.open(p);
						} else {
							if (args[0].equalsIgnoreCase("4")) {
								Page4.open(p);
							} else {
								if (args[0].equalsIgnoreCase("5")) {
									Page5.open(p);
								} else {
									if (args[0].equalsIgnoreCase("6")) {
										Page6.open(p);
									} else {
										if (args[0].equalsIgnoreCase("7")) {
											Page7.open(p);
										} else {
											if (args[0].equalsIgnoreCase("8")) {
												Page8.open(p);
											} else {
												if (args[0].equalsIgnoreCase("9")) {
													Page9.open(p);
												} else {
													if (args[0].equalsIgnoreCase("10")) {
														Page10.open(p);
													} else {
														if(args[0].equalsIgnoreCase("11")){
														Page11.open(p);
														} else {
															if(args[0].equalsIgnoreCase("12")){
																Page12.open(p);
															} else{
																if(args[0].equalsIgnoreCase("13")){
																	Page13.open(p);
																} else {
																	p.performCommand("fcicr");
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

				}

			} else {
				p.sendMessage("§a§l *-*-*-*-*-*-*-*-*-*-*-*");
				p.sendMessage("§bPlugin von §aFilip Zocktan & HappyHappyBoy");
				p.sendMessage("§bAuftrag von §aTNT_Creepy");
				p.sendMessage("§f[§bFCIGrafting§f] §b Durch dieses Plugin kannst du neue Waffen craften.");
				p.sendMessage("§f[§bFCIGrafting§f] §b /fcicr <Seite> zum Anzeigen der Craftingrezepte");
				if (p.hasPermission("fci.fci")) {
					p.sendMessage("§f[§bFCIGrafting§f] §b /gefs <Seite> um ein Schwert zu bekommen");
				}
				p.sendMessage("§f[§bFCIGrafting§f] §b Inhaltsverzeichnis:");
				p.sendMessage("§f[§bFCIGrafting§f] §b Seite 1: Blendendes Schwert Tier 1");
				p.sendMessage("§f[§bFCIGrafting§f] §b Seite 2: Blendendes Schwert Tier 2");
				p.sendMessage("§f[§bFCIGrafting§f] §b Seite 3: Übelkeitsschwert Tier 1");
				p.sendMessage("§f[§bFCIGrafting§f] §b Seite 4: Übelkeitsschwert Tier 2");
				p.sendMessage("§f[§bFCIGrafting§f] §b Seite 5: Vergiftungsschwert Tier 1");
				p.sendMessage("§f[§bFCIGrafting§f] §b Seite 6: Vergiftungsschwert Tier 2");
				p.sendMessage("§f[§bFCIGrafting§f] §b Seite 7: Verlangsamungsschwert Tier 1");
				p.sendMessage("§f[§bFCIGrafting§f] §b Seite 8: Verlangsamungsschwert Tier 2");
				p.sendMessage("§f[§bFCIGrafting§f] §b Seite 9: Witherschwert Tier 1");
				p.sendMessage("§f[§bFCIGrafting§f] §b Seite 10: Witherschwert Tier 2");
				p.sendMessage("§f[§bFCIGrafting§f] §b Seite 11: Craftingtable für Schwerter");
				p.sendMessage("§f[§bFCIGrafting§f] §b Seite 12: Enchanter für Schwerter");
				p.sendMessage("§a§l *-*-*-*-*-*-*-*-*-*-*-*");
			}

		} else {
			sender.sendMessage("Du musst ein Spieler sein um dies auszuführen.");
		}
		return false;
	}

}
