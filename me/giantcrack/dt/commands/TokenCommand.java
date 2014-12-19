package me.giantcrack.dt.commands;

import org.bukkit.command.*;
import org.bukkit.entity.*;
import org.bukkit.*;
import me.giantcrack.dt.*;

public class TokenCommand implements CommandExecutor
{
    public boolean onCommand(final CommandSender sender, final Command cmd, final String commandLabel, final String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("You cannot execute this command.");
            return true;
        }
        final Player p = (Player)sender;
        if (cmd.getName().equalsIgnoreCase("tokens")) {
            p.sendMessage(ChatColor.BLUE + "Tokens: " + ChatColor.RED + API.getTokens(p));
            return true;
        }
        return false;
    }
}
