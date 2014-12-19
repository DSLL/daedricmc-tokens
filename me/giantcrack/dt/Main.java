package me.giantcrack.dt;

import org.bukkit.plugin.java.*;
import org.bukkit.event.*;
import org.bukkit.*;
import java.io.*;
import org.bukkit.plugin.*;
import org.bukkit.command.*;
import me.giantcrack.dt.commands.*;
import org.bukkit.configuration.file.*;

public class Main extends JavaPlugin implements Listener
{
    File items;
    
    public Main() {
        super();
        this.items = new File(this.getDataFolder(), "items.yml");
    }
    
    public void onEnable() {
        if (!this.getDataFolder().exists()) {
            this.getDataFolder().mkdir();
        }
        if (!this.items.exists()) {
            try {
                this.items.createNewFile();
            }
            catch (IOException e) {
                Bukkit.getLogger().severe("Could not generate config file.");
                e.printStackTrace();
            }
        }
        final File items = new File(this.getDataFolder(), "items.yml");
        final FileConfiguration cfg = (FileConfiguration)YamlConfiguration.loadConfiguration(items);
        if (cfg.getConfigurationSection("Shop") == null) {
            Gui.addDefaultForDonatorKits();
        }
        Bukkit.getLogger().info("DaedricTokens are now enabled!");
        Bukkit.getPluginManager().registerEvents((Listener)new Gui(), (Plugin)this);
        this.getCommand("dt").setExecutor((CommandExecutor)new DT());
        this.getCommand("tokens").setExecutor((CommandExecutor)new TokenCommand());
        this.getCommand("dtc").setExecutor((CommandExecutor)new DTConsole());
    }
    
    public static Plugin getInstance() {
        return Bukkit.getPluginManager().getPlugin("DaedricTokens");
    }
}
