package me.giantcrack.dt.commands;

import org.bukkit.command.*;
import org.bukkit.*;
import me.giantcrack.dt.*;
import java.io.*;
import org.bukkit.entity.*;
import org.bukkit.configuration.file.*;

public class DTConsole implements CommandExecutor
{
    public boolean onCommand(final CommandSender sender, final Command cmd, final String commandLabel, final String[] args) {
        if (!(sender instanceof ConsoleCommandSender)) {
            sender.sendMessage("You cannot execute this command.");
            return true;
        }
        if (cmd.getName().equalsIgnoreCase("dtc") && args.length == 0) {
            sender.sendMessage(ChatColor.RED + "Invalid Arguments: /dtc help");
            return true;
        }
        if (args.length == 1 && args[0].equalsIgnoreCase("help")) {
            sender.sendMessage(new StringBuilder().append(ChatColor.GRAY).append(ChatColor.STRIKETHROUGH).append("---[").append(ChatColor.GOLD).append("Daedric").append(ChatColor.AQUA).append("Tokens").append(ChatColor.GRAY).append(ChatColor.STRIKETHROUGH).append("]---").toString());
            sender.sendMessage(ChatColor.BLUE + "/dt > Opens the gui");
            sender.sendMessage(ChatColor.BLUE + "/dt give <playerName> <amount> > Add tokens to a players account");
            sender.sendMessage(ChatColor.BLUE + "/dt amount <playerName> > Get the tokens from a players account");
            sender.sendMessage(ChatColor.BLUE + "/dt remove <playerName> <amount> > Remove tokens from a players account");
            return true;
        }
        if (args.length > 2 && args[0].equalsIgnoreCase("amount")) {
            sender.sendMessage(ChatColor.BLUE + "/dt amount <playerName> > Get the tokens from a players account");
            return true;
        }
        if (args.length > 3 || args.length == 1 || (args.length == 2 && args[0].equalsIgnoreCase("give"))) {
            sender.sendMessage(ChatColor.BLUE + "/dt give <playerName> > Add tokens to a players account");
            return true;
        }
        if (args.length > 3 || args.length == 1 || (args.length == 2 && args[0].equalsIgnoreCase("remove"))) {
            sender.sendMessage(ChatColor.BLUE + "/dt remove <playerName> <amount> > Remove tokens from a players account");
            return true;
        }
        if (args.length == 2 && args[0].equalsIgnoreCase("amount")) {
            final Player target = Bukkit.getPlayer(args[1]);
            if (target == null) {
                sender.sendMessage(String.valueOf(args[1]) + " was not found!");
                return true;
            }
            sender.sendMessage(ChatColor.BLUE + "Tokens: " + ChatColor.RED + API.getTokens(target));
            return true;
        }
        else if (args.length == 3 && args[0].equalsIgnoreCase("remove")) {
            final File items = new File(Main.getInstance().getDataFolder(), "items.yml");
            final FileConfiguration cfg = (FileConfiguration)YamlConfiguration.loadConfiguration(items);
            final Player target2 = Bukkit.getPlayer(args[1]);
            if (target2 == null) {
                sender.sendMessage(String.valueOf(args[1]) + " could not be found!");
                return true;
            }
            int num = 1;
            try {
                num = Integer.parseInt(args[2]);
            }
            catch (NumberFormatException e2) {
                sender.sendMessage(ChatColor.RED + args[2] + " is not a number!");
                return true;
            }
            if (num == 0) {
                sender.sendMessage(ChatColor.RED + "You cant add 0 tokens to a player!");
                return true;
            }
            cfg.set("Balance." + target2.getName(), (Object)(API.getTokens(target2) - num));
            target2.sendMessage(ChatColor.GREEN + "You have had: " + num + ChatColor.GREEN + " tokens remove from your balance!");
            target2.sendMessage(ChatColor.GOLD + "New Balance: " + ChatColor.RED + cfg.getInt("Balance." + target2.getName()));
            sender.sendMessage(ChatColor.AQUA + "You had removed: " + num + " tokens from " + target2.getName() + "'s" + ChatColor.WHITE + " Balance");
            try {
                cfg.save(items);
            }
            catch (IOException e) {
                e.printStackTrace();
                Bukkit.getLogger().severe(ChatColor.RED + "Could not save inventory!");
            }
            return true;
        }
        else {
            if (args.length != 3 || !args[0].equalsIgnoreCase("give")) {
                sender.sendMessage(ChatColor.RED + "Unknown Token Command.");
                return true;
            }
            final File items = new File(Main.getInstance().getDataFolder(), "items.yml");
            final FileConfiguration cfg = (FileConfiguration)YamlConfiguration.loadConfiguration(items);
            final Player target2 = Bukkit.getPlayer(args[1]);
            if (target2 == null) {
                sender.sendMessage(String.valueOf(args[1]) + " could not be found!");
                return true;
            }
            int num = 1;
            try {
                num = Integer.parseInt(args[2]);
            }
            catch (NumberFormatException e2) {
                sender.sendMessage(ChatColor.RED + args[2] + " is not a number!");
                return true;
            }
            if (num == 0) {
                sender.sendMessage(ChatColor.RED + "You cant add 0 tokens to a player!");
                return true;
            }
            cfg.set("Balance." + target2.getName(), (Object)(API.getTokens(target2) + num));
            target2.sendMessage(ChatColor.GREEN + "You have had: " + num + ChatColor.GREEN + " tokens added to your balance!");
            target2.sendMessage(ChatColor.GOLD + "New Balance: " + ChatColor.RED + cfg.getInt("Balance." + target2.getName()));
            sender.sendMessage(ChatColor.AQUA + "You had added: " + num + " tokens to " + target2.getName() + "'s" + ChatColor.WHITE + " Balance");
            try {
                cfg.save(items);
            }
            catch (IOException e) {
                e.printStackTrace();
                Bukkit.getLogger().severe(ChatColor.RED + "Could not save inventory!");
            }
            return true;
        }
    }
}
