package me.filipzocktan.fcicrafting;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FCICRCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (sender instanceof Player) {
			Player p = (Player) sender;
			if (args.length == 1) {
				if (args[0].equalsIgnoreCase("1")) {
					p.sendMessage("�a�l *-* Craftingrezept Nr. 1 *-*");
					p.sendMessage("�f[�FCICrafing�f] Blendendes Schwert Tier 1");
					p.sendMessage("D = Diamantschwert");
					p.sendMessage("T = Tintensack");
					p.sendMessage("S = Schleimball");
					p.sendMessage("N = Nichts");
					p.sendMessage("N T N");
					p.sendMessage("S D S");
					p.sendMessage("N T N");
					p.sendMessage("�a�l *-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
				} else {
					if (args[0].equalsIgnoreCase("2")) {
						p.sendMessage("�a�l *-* Craftingrezept Nr. 2 *-*");
						p.sendMessage("�f[�FCICrafing�f] Blendendes Schwert Tier 2");
						p.sendMessage("D = Diamantschwert");
						p.sendMessage("T = Tintensack");
						p.sendMessage("S = Schleimball");
						p.sendMessage("T S T");
						p.sendMessage("S D S");
						p.sendMessage("T S T");
						p.sendMessage("�a�l *-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
					} else {
						if (args[0].equalsIgnoreCase("3")) {
							p.sendMessage("�a�l *-* Craftingrezept Nr. 3 *-*");
							p.sendMessage("�f[�FCICrafing�f]  �belkeitsschwert Tier 1");
							p.sendMessage("D = Diamantschwert");
							p.sendMessage("K = Kugelfisch");
							p.sendMessage("N = Nichts");
							p.sendMessage("N K N");
							p.sendMessage("K D K");
							p.sendMessage("N K N");
							p.sendMessage("�a�l *-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
						} else {
							if (args[0].equalsIgnoreCase("4")) {
								p.sendMessage("�a�l *-* Craftingrezept Nr. 4 *-*");
								p.sendMessage("�f[�FCICrafing�f]  �belkeitsschwert Tier 2");
								p.sendMessage("D = Diamantschwert");
								p.sendMessage("K = Kugelfisch");
								p.sendMessage("K K K");
								p.sendMessage("K D K");
								p.sendMessage("K K K");
								p.sendMessage("�a�l *-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
							} else {
								if (args[0].equalsIgnoreCase("5")) {
									p.sendMessage("�a�l *-* Craftingrezept Nr. 5 *-*");
									p.sendMessage("�f[�FCICrafing�f]  Veriftungsschwert Tier 1");
									p.sendMessage("D = Diamantschwert");
									p.sendMessage("F = Fermentiertes Spinnenauge");
									p.sendMessage("N = Nichts");
									p.sendMessage("N F N");
									p.sendMessage("F D F");
									p.sendMessage("N F N");
									p.sendMessage("�a�l *-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
								} else {
									if (args[0].equalsIgnoreCase("6")) {
										p.sendMessage("�a�l *-* Craftingrezept Nr. 6 *-*");
										p.sendMessage("�f[�FCICrafing�f]  Veriftungsschwert Tier 2");
										p.sendMessage("D = Diamantschwert");
										p.sendMessage("F = Fermentiertes Spinnenauge");
										p.sendMessage("F F F");
										p.sendMessage("F D F");
										p.sendMessage("F F F");
										p.sendMessage("�a�l *-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
									} else {
										if (args[0].equalsIgnoreCase("7")) {
											p.sendMessage("�a�l *-* Craftingrezept Nr. 7 *-*");
											p.sendMessage("�f[�FCICrafing�f]  Verlangsamungsschwert Tier 1");
											p.sendMessage("D = Diamantschwert");
											p.sendMessage("F = Fermentiertes Spinnenauge");
											p.sendMessage("W = Netherwarze");
											p.sendMessage("N = Nichts");
											p.sendMessage("N F N");
											p.sendMessage("W D W");
											p.sendMessage("N F N");
											p.sendMessage("�a�l *-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
										} else {
											if (args[0].equalsIgnoreCase("8")) {
												p.sendMessage("�a�l *-* Craftingrezept Nr. 8 *-*");
												p.sendMessage("�f[�FCICrafing�f]  Verlangsamungsschwert Tier 2");
												p.sendMessage("D = Diamantschwert");
												p.sendMessage("F = Fermentiertes Spinnenauge");
												p.sendMessage("W = Netherwarze");
												p.sendMessage("F W F");
												p.sendMessage("W D W");
												p.sendMessage("F W F");
												p.sendMessage("�a�l *-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
											} else {
												if (args[0].equalsIgnoreCase("9")) {
													p.sendMessage("�a�l *-* Craftingrezept Nr. 9 *-*");
													p.sendMessage("�f[�FCICrafing�f]  Witherschwert Tier 1");
													p.sendMessage("D = Diamantschwert");
													p.sendMessage("W = Witherkopf");
													p.sendMessage("N = Nichts");
													p.sendMessage("N W N");
													p.sendMessage("W D W");
													p.sendMessage("N W N");
													p.sendMessage("�a�l *-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
												} else {
													if (args[0].equalsIgnoreCase("10")) {
														p.sendMessage("�a�l *-* Craftingrezept Nr. 10 *-*");
														p.sendMessage("�f[�FCICrafing�f]  Witherschwert Tier 1");
														p.sendMessage("D = Diamantschwert");
														p.sendMessage("W = Witherkopf");
														p.sendMessage("W W W");
														p.sendMessage("W D W");
														p.sendMessage("W W W");
														p.sendMessage("�a�l *-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
													} else {
														p.sendMessage("�a�l *-*-*-*-*-*-*-*-*-*-*-*");
														p.sendMessage(
																"�f[�FCICrafing�f] Durch dieses Plugin kannst du neue Waffen craften.");
														p.sendMessage(
																"�f[�FCICrafing�f] Ein Craftingtabel ist folgend aufgebaut");
														p.sendMessage("1 2 3");
														p.sendMessage("4 5 6");
														p.sendMessage("7 8 9");
														p.sendMessage("�a�l *-*-*-*-*-*-*-*-*-*-*-*");
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
				p.sendMessage("�a�l *-*-*-*-*-*-*-*-*-*-*-*");
				p.sendMessage("�bPlugin von �aFilip Zocktan & HappyHappyBoy");
				p.sendMessage("�bAuftrag von �aTNT_Creepy");
				p.sendMessage("�f[�FCICrafing�f] Durch dieses Plugin kannst du neue Waffen craften.");
				p.sendMessage("�f[�FCICrafing�f] /fcicr <Seite> zum Anzeigen der Craftingrezepte");
				if (p.hasPermission("fci.fci")) {
					p.sendMessage("/gefs <Seite> um ein Schwert zu bekommen");
				}
				p.sendMessage("�f[�FCICrafing�f] Inhaltsverzeichnis:");
				p.sendMessage("�f[�FCICrafing�f] Seite 1: Blendendes Schwert Tier 1");
				p.sendMessage("�f[�FCICrafing�f] Seite 2: Blendendes Schwert Tier 2");
				p.sendMessage("�f[�FCICrafing�f] Seite 3: �belkeitsschwert Tier 1");
				p.sendMessage("�f[�FCICrafing�f] Seite 4: �belkeitsschwert Tier 2");
				p.sendMessage("�f[�FCICrafing�f] Seite 5: Vergiftungsschwert Tier 1");
				p.sendMessage("�f[�FCICrafing�f] Seite 6: Vergiftungsschwert Tier 2");
				p.sendMessage("�f[�FCICrafing�f] Seite 7: Verlangsamungsschwert Tier 1");
				p.sendMessage("�f[�FCICrafing�f] Seite 8: Verlangsamungsschwert Tier 2");
				p.sendMessage("�f[�FCICrafing�f] Seite 9: Witherschwert Tier 1");
				p.sendMessage("�f[�FCICrafing�f] Seite 10: Witherschwert Tier 2");
				p.sendMessage("�a�l *-*-*-*-*-*-*-*-*-*-*-*");
			}

		} else {
			sender.sendMessage("Du musst ein Spieler sein um dies auszuf�hren.");
		}
		return false;
	}

}
