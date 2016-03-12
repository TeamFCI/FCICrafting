package me.filipzocktan.fcicrafting.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.filipzocktan.fcicrafting.Items.Schwertgenerator;

public class GetEffectSwordCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (sender instanceof Player) {
			Player p = (Player) sender;
			if (p.hasPermission("fci.fci")) {
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
					default:
						p.sendMessage("Comming soon");
					}
				} else {
					p.performCommand("fcicr");
				}
			}
		} else {
			sender.sendMessage("Du musst ein Spieler sein um dies auszuführen.");
		}
		return true;
	}

}
