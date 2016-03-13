package de.teamfci.fcicrafting.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.teamfci.fcicrafting.Items.Schwertgenerator;

public class GetEffectSwordCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (sender instanceof Player) {
			Player p = (Player) sender;
			if (p.hasPermission("fci.fci")) {
				if (args.length == 0) {
					p.performCommand("fcicr");
				}
				
				
				if (args.length == 1) {
					int num = 20;
					try {
						num = Integer.parseInt(args[0]);
					} catch (Exception ex) {
						p.performCommand("fcicr");
						return true;
					}
					if (num >= 11) {
						p.performCommand("fcicr");
						return true;
					}
					if (num == 0) {
						p.performCommand("fcicr");
						return true;
					}
					switch (num) {
					case 1:
						p.getInventory().addItem(Schwertgenerator.getBlendT1(p));
						break;
					case 2:
						p.getInventory().addItem(Schwertgenerator.getBlendT2(p));
						break;
					case 3:
						p.getInventory().addItem(Schwertgenerator.getUebelT1(p));
						break;
					case 4:
						p.getInventory().addItem(Schwertgenerator.getUebelT2(p));
						break;
					case 5:
						p.getInventory().addItem(Schwertgenerator.getGiftT1(p));
						break;
					case 6:
						p.getInventory().addItem(Schwertgenerator.getGiftT2(p));
						break;
					case 7:
						p.getInventory().addItem(Schwertgenerator.getSlowT1(p));
						break;
					case 8:
						p.getInventory().addItem(Schwertgenerator.getSlowT2(p));
						break;
					case 9:
						p.getInventory().addItem(Schwertgenerator.getWitherT1(p));
						break;
					case 10:
						p.getInventory().addItem(Schwertgenerator.getWitherT2(p));
						break;
					}
				} else {
					p.performCommand("fcicr");
				}
			} else {
				p.sendMessage("§cFehler: Du hast nicht die Permission dazu!");
			}
		} else {
			sender.sendMessage("Du musst ein Spieler sein um dies auszuführen.");
		}
		return true;
	}

}
