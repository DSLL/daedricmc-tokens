package me.giantcrack.dt;

import org.bukkit.entity.*;
import org.bukkit.configuration.file.*;
import java.io.*;

public class API
{
    public static void addTokens(final Player target, final int num) {
        final File items = new File(Main.getInstance().getDataFolder(), "items.yml");
        final FileConfiguration cfg = (FileConfiguration)YamlConfiguration.loadConfiguration(items);
        cfg.set("Balance." + target.getName(), (Object)(cfg.getInt("Balance." + target.getName()) + num));
    }
    
    public static void delTokens(final Player target, final int num) {
        final File items = new File(Main.getInstance().getDataFolder(), "items.yml");
        final FileConfiguration cfg = (FileConfiguration)YamlConfiguration.loadConfiguration(items);
        cfg.set("Balance." + target.getName(), (Object)(cfg.getInt("Balance." + target.getName()) - num));
        try {
            cfg.save(items);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static int getTokens(final Player p) {
        final File items = new File(Main.getInstance().getDataFolder(), "items.yml");
        final FileConfiguration cfg = (FileConfiguration)YamlConfiguration.loadConfiguration(items);
        final int bal = cfg.getInt("Balance." + p.getName());
        return bal;
    }
    
    public static void saveTokenFile() {
        final File items = new File(Main.getInstance().getDataFolder(), "items.yml");
        final FileConfiguration cfg = (FileConfiguration)YamlConfiguration.loadConfiguration(items);
        try {
            cfg.save(items);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
