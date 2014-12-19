package me.giantcrack.dt;

import org.bukkit.event.inventory.*;
import org.bukkit.entity.*;
import org.bukkit.command.*;
import org.bukkit.event.*;
import java.io.*;
import org.bukkit.configuration.file.*;
import org.bukkit.inventory.*;
import org.bukkit.*;
import java.util.*;
import org.bukkit.inventory.meta.*;

public class Gui implements Listener
{
    @EventHandler
    public void onInvClick(final InventoryClickEvent e) {
        if (e.getCurrentItem() != null && e.getCurrentItem().getItemMeta() != null) {
            final Player p = (Player)e.getWhoClicked();
            final Inventory inv = e.getInventory();
            if (inv.getTitle().equals(ChatColor.RED + "Token Shop")) {
                if (e.getRawSlot() == 0) {
                    if (API.getTokens(p) < this.getPrice(1)) {
                        e.setCancelled(true);
                        p.closeInventory();
                        p.sendMessage(ChatColor.RED + "Not Enough Tokens.");
                        return;
                    }
                    API.delTokens(p, this.getPrice(1));
                    Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), this.getItemCommand(p, 1));
                    e.setCancelled(true);
                    p.closeInventory();
                }
                else if (inv.getTitle().equals(ChatColor.RED + "Token Shop")) {
                    if (e.getRawSlot() == 1) {
                        if (API.getTokens(p) < this.getPrice(2)) {
                            e.setCancelled(true);
                            p.closeInventory();
                            p.sendMessage(ChatColor.RED + "Not Enough Tokens.");
                            return;
                        }
                        API.delTokens(p, this.getPrice(2));
                        Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), this.getItemCommand(p, 2));
                        e.setCancelled(true);
                        p.closeInventory();
                    }
                    else if (inv.getTitle().equals(ChatColor.RED + "Token Shop")) {
                        if (e.getRawSlot() == 2) {
                            if (API.getTokens(p) < this.getPrice(3)) {
                                e.setCancelled(true);
                                p.closeInventory();
                                p.sendMessage(ChatColor.RED + "Not Enough Tokens.");
                                return;
                            }
                            API.delTokens(p, this.getPrice(3));
                            Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), this.getItemCommand(p, 3));
                            e.setCancelled(true);
                            p.closeInventory();
                        }
                        else if (inv.getTitle().equals(ChatColor.RED + "Token Shop")) {
                            if (e.getRawSlot() == 3) {
                                if (API.getTokens(p) < this.getPrice(4)) {
                                    e.setCancelled(true);
                                    p.closeInventory();
                                    p.sendMessage(ChatColor.RED + "Not Enough Tokens.");
                                    return;
                                }
                                API.delTokens(p, this.getPrice(4));
                                Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), this.getItemCommand(p, 4));
                                e.setCancelled(true);
                                p.closeInventory();
                            }
                            else if (inv.getTitle().equals(ChatColor.RED + "Token Shop")) {
                                if (e.getRawSlot() == 4) {
                                    if (API.getTokens(p) < this.getPrice(5)) {
                                        e.setCancelled(true);
                                        p.closeInventory();
                                        p.sendMessage(ChatColor.RED + "Not Enough Tokens.");
                                        return;
                                    }
                                    API.delTokens(p, this.getPrice(5));
                                    Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), this.getItemCommand(p, 5));
                                    e.setCancelled(true);
                                    p.closeInventory();
                                }
                                else if (inv.getTitle().equals(ChatColor.RED + "Token Shop")) {
                                    if (e.getRawSlot() == 5) {
                                        if (API.getTokens(p) < this.getPrice(6)) {
                                            e.setCancelled(true);
                                            p.closeInventory();
                                            p.sendMessage(ChatColor.RED + "Not Enough Tokens.");
                                            return;
                                        }
                                        API.delTokens(p, this.getPrice(6));
                                        Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), this.getItemCommand(p, 6));
                                        e.setCancelled(true);
                                        p.closeInventory();
                                    }
                                    else if (inv.getTitle().equals(ChatColor.RED + "Token Shop")) {
                                        if (e.getRawSlot() == 6) {
                                            if (API.getTokens(p) < this.getPrice(7)) {
                                                e.setCancelled(true);
                                                p.closeInventory();
                                                p.sendMessage(ChatColor.RED + "Not Enough Tokens.");
                                                return;
                                            }
                                            API.delTokens(p, this.getPrice(7));
                                            Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), this.getItemCommand(p, 7));
                                            e.setCancelled(true);
                                            p.closeInventory();
                                        }
                                        else if (inv.getTitle().equals(ChatColor.RED + "Token Shop")) {
                                            if (e.getRawSlot() == 7) {
                                                if (API.getTokens(p) < this.getPrice(8)) {
                                                    e.setCancelled(true);
                                                    p.closeInventory();
                                                    p.sendMessage(ChatColor.RED + "Not Enough Tokens.");
                                                    return;
                                                }
                                                API.delTokens(p, this.getPrice(8));
                                                Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), this.getItemCommand(p, 8));
                                                e.setCancelled(true);
                                                p.closeInventory();
                                            }
                                            else if (inv.getTitle().equals(ChatColor.RED + "Token Shop")) {
                                                if (e.getRawSlot() == 8) {
                                                    API.delTokens(p, this.getPrice(9));
                                                    Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), this.getItemCommand(p, 9));
                                                    e.setCancelled(true);
                                                    p.closeInventory();
                                                    return;
                                                }
                                                if (inv.getTitle().equals(ChatColor.RED + "Token Shop")) {
                                                    if (e.getRawSlot() == 9) {
                                                        if (API.getTokens(p) < this.getPrice(10)) {
                                                            e.setCancelled(true);
                                                            p.closeInventory();
                                                            p.sendMessage(ChatColor.RED + "Not Enough Tokens.");
                                                            return;
                                                        }
                                                        API.delTokens(p, this.getPrice(10));
                                                        Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), this.getItemCommand(p, 10));
                                                        e.setCancelled(true);
                                                        p.closeInventory();
                                                    }
                                                    else if (inv.getTitle().equals(ChatColor.RED + "Token Shop")) {
                                                        if (e.getRawSlot() == 10) {
                                                            if (API.getTokens(p) < this.getPrice(11)) {
                                                                e.setCancelled(true);
                                                                p.closeInventory();
                                                                p.sendMessage(ChatColor.RED + "Not Enough Tokens.");
                                                                return;
                                                            }
                                                            API.delTokens(p, this.getPrice(11));
                                                            Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), this.getItemCommand(p, 11));
                                                            e.setCancelled(true);
                                                            p.closeInventory();
                                                        }
                                                        else if (inv.getTitle().equals(ChatColor.RED + "Token Shop")) {
                                                            if (e.getRawSlot() == 11) {
                                                                if (API.getTokens(p) < this.getPrice(12)) {
                                                                    e.setCancelled(true);
                                                                    p.closeInventory();
                                                                    p.sendMessage(ChatColor.RED + "Not Enough Tokens.");
                                                                    return;
                                                                }
                                                                API.delTokens(p, this.getPrice(12));
                                                                Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), this.getItemCommand(p, 12));
                                                                e.setCancelled(true);
                                                                p.closeInventory();
                                                            }
                                                            else if (inv.getTitle().equals(ChatColor.RED + "Token Shop")) {
                                                                if (e.getRawSlot() == 12) {
                                                                    if (API.getTokens(p) < this.getPrice(13)) {
                                                                        e.setCancelled(true);
                                                                        p.closeInventory();
                                                                        p.sendMessage(ChatColor.RED + "Not Enough Tokens.");
                                                                        return;
                                                                    }
                                                                    API.delTokens(p, this.getPrice(13));
                                                                    Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), this.getItemCommand(p, 13));
                                                                    e.setCancelled(true);
                                                                    p.closeInventory();
                                                                }
                                                                else if (inv.getTitle().equals(ChatColor.RED + "Token Shop")) {
                                                                    if (e.getRawSlot() == 13) {
                                                                        if (API.getTokens(p) < this.getPrice(14)) {
                                                                            e.setCancelled(true);
                                                                            p.closeInventory();
                                                                            p.sendMessage(ChatColor.RED + "Not Enough Tokens.");
                                                                            return;
                                                                        }
                                                                        API.delTokens(p, this.getPrice(14));
                                                                        Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), this.getItemCommand(p, 14));
                                                                        e.setCancelled(true);
                                                                        p.closeInventory();
                                                                    }
                                                                    else if (inv.getTitle().equals(ChatColor.RED + "Token Shop")) {
                                                                        if (e.getRawSlot() == 14) {
                                                                            if (API.getTokens(p) < this.getPrice(15)) {
                                                                                e.setCancelled(true);
                                                                                p.closeInventory();
                                                                                p.sendMessage(ChatColor.RED + "Not Enough Tokens.");
                                                                                return;
                                                                            }
                                                                            API.delTokens(p, this.getPrice(15));
                                                                            Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), this.getItemCommand(p, 15));
                                                                            e.setCancelled(true);
                                                                            p.closeInventory();
                                                                        }
                                                                        else if (inv.getTitle().equals(ChatColor.RED + "Token Shop")) {
                                                                            if (e.getRawSlot() == 15) {
                                                                                if (API.getTokens(p) < this.getPrice(16)) {
                                                                                    e.setCancelled(true);
                                                                                    p.closeInventory();
                                                                                    p.sendMessage(ChatColor.RED + "Not Enough Tokens.");
                                                                                    return;
                                                                                }
                                                                                API.delTokens(p, this.getPrice(16));
                                                                                Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), this.getItemCommand(p, 16));
                                                                                e.setCancelled(true);
                                                                                p.closeInventory();
                                                                            }
                                                                            else if (inv.getTitle().equals(ChatColor.RED + "Token Shop")) {
                                                                                if (e.getRawSlot() == 16) {
                                                                                    if (API.getTokens(p) < this.getPrice(17)) {
                                                                                        e.setCancelled(true);
                                                                                        p.closeInventory();
                                                                                        p.sendMessage(ChatColor.RED + "Not Enough Tokens.");
                                                                                        return;
                                                                                    }
                                                                                    API.delTokens(p, this.getPrice(17));
                                                                                    Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), this.getItemCommand(p, 17));
                                                                                    e.setCancelled(true);
                                                                                    p.closeInventory();
                                                                                }
                                                                                else if (inv.getTitle().equals(ChatColor.RED + "Token Shop")) {
                                                                                    if (e.getRawSlot() == 17) {
                                                                                        if (API.getTokens(p) < this.getPrice(18)) {
                                                                                            e.setCancelled(true);
                                                                                            p.closeInventory();
                                                                                            p.sendMessage(ChatColor.RED + "Not Enough Tokens.");
                                                                                            return;
                                                                                        }
                                                                                        API.delTokens(p, this.getPrice(18));
                                                                                        Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), this.getItemCommand(p, 18));
                                                                                        e.setCancelled(true);
                                                                                        p.closeInventory();
                                                                                    }
                                                                                    else if (inv.getTitle().equals(ChatColor.RED + "Token Shop")) {
                                                                                        if (e.getRawSlot() == 18) {
                                                                                            if (API.getTokens(p) < this.getPrice(19)) {
                                                                                                e.setCancelled(true);
                                                                                                p.closeInventory();
                                                                                                p.sendMessage(ChatColor.RED + "Not Enough Tokens.");
                                                                                                return;
                                                                                            }
                                                                                            API.delTokens(p, this.getPrice(19));
                                                                                            Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), this.getItemCommand(p, 19));
                                                                                            e.setCancelled(true);
                                                                                            p.closeInventory();
                                                                                        }
                                                                                        else if (inv.getTitle().equals(ChatColor.RED + "Token Shop")) {
                                                                                            if (e.getRawSlot() == 19) {
                                                                                                if (API.getTokens(p) < this.getPrice(20)) {
                                                                                                    e.setCancelled(true);
                                                                                                    p.closeInventory();
                                                                                                    p.sendMessage(ChatColor.RED + "Not Enough Tokens.");
                                                                                                    return;
                                                                                                }
                                                                                                API.delTokens(p, this.getPrice(20));
                                                                                                Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), this.getItemCommand(p, 20));
                                                                                                e.setCancelled(true);
                                                                                                p.closeInventory();
                                                                                            }
                                                                                            else if (inv.getTitle().equals(ChatColor.RED + "Token Shop")) {
                                                                                                if (e.getRawSlot() == 20) {
                                                                                                    if (API.getTokens(p) < this.getPrice(21)) {
                                                                                                        e.setCancelled(true);
                                                                                                        p.closeInventory();
                                                                                                        p.sendMessage(ChatColor.RED + "Not Enough Tokens.");
                                                                                                        return;
                                                                                                    }
                                                                                                    API.delTokens(p, this.getPrice(21));
                                                                                                    Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), this.getItemCommand(p, 21));
                                                                                                    e.setCancelled(true);
                                                                                                    p.closeInventory();
                                                                                                }
                                                                                                else if (inv.getTitle().equals(ChatColor.RED + "Token Shop")) {
                                                                                                    if (e.getRawSlot() == 21) {
                                                                                                        if (API.getTokens(p) < this.getPrice(22)) {
                                                                                                            e.setCancelled(true);
                                                                                                            p.closeInventory();
                                                                                                            p.sendMessage(ChatColor.RED + "Not Enough Tokens.");
                                                                                                            return;
                                                                                                        }
                                                                                                        API.delTokens(p, this.getPrice(22));
                                                                                                        Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), this.getItemCommand(p, 22));
                                                                                                        e.setCancelled(true);
                                                                                                        p.closeInventory();
                                                                                                    }
                                                                                                    else if (inv.getTitle().equals(ChatColor.RED + "Token Shop")) {
                                                                                                        if (e.getRawSlot() == 22) {
                                                                                                            if (API.getTokens(p) < this.getPrice(23)) {
                                                                                                                e.setCancelled(true);
                                                                                                                p.closeInventory();
                                                                                                                p.sendMessage(ChatColor.RED + "Not Enough Tokens.");
                                                                                                                return;
                                                                                                            }
                                                                                                            API.delTokens(p, this.getPrice(23));
                                                                                                            Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), this.getItemCommand(p, 23));
                                                                                                            e.setCancelled(true);
                                                                                                            p.closeInventory();
                                                                                                        }
                                                                                                        else if (inv.getTitle().equals(ChatColor.RED + "Token Shop")) {
                                                                                                            if (e.getRawSlot() == 23) {
                                                                                                                if (API.getTokens(p) < this.getPrice(24)) {
                                                                                                                    e.setCancelled(true);
                                                                                                                    p.closeInventory();
                                                                                                                    p.sendMessage(ChatColor.RED + "Not Enough Tokens.");
                                                                                                                    return;
                                                                                                                }
                                                                                                                API.delTokens(p, this.getPrice(24));
                                                                                                                Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), this.getItemCommand(p, 24));
                                                                                                                e.setCancelled(true);
                                                                                                                p.closeInventory();
                                                                                                            }
                                                                                                            else if (inv.getTitle().equals(ChatColor.RED + "Token Shop")) {
                                                                                                                if (e.getRawSlot() == 24) {
                                                                                                                    if (API.getTokens(p) < this.getPrice(25)) {
                                                                                                                        e.setCancelled(true);
                                                                                                                        p.closeInventory();
                                                                                                                        p.sendMessage(ChatColor.RED + "Not Enough Tokens.");
                                                                                                                        return;
                                                                                                                    }
                                                                                                                    API.delTokens(p, this.getPrice(25));
                                                                                                                    Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), this.getItemCommand(p, 25));
                                                                                                                    e.setCancelled(true);
                                                                                                                    p.closeInventory();
                                                                                                                }
                                                                                                                else if (inv.getTitle().equals(ChatColor.RED + "Token Shop")) {
                                                                                                                    if (e.getRawSlot() == 25) {
                                                                                                                        if (API.getTokens(p) < this.getPrice(26)) {
                                                                                                                            e.setCancelled(true);
                                                                                                                            p.closeInventory();
                                                                                                                            p.sendMessage(ChatColor.RED + "Not Enough Tokens.");
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        API.delTokens(p, this.getPrice(26));
                                                                                                                        Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), this.getItemCommand(p, 26));
                                                                                                                        e.setCancelled(true);
                                                                                                                        p.closeInventory();
                                                                                                                    }
                                                                                                                    else if (inv.getTitle().equals(ChatColor.RED + "Token Shop") && e.getRawSlot() == 26) {
                                                                                                                        if (API.getTokens(p) < this.getPrice(27)) {
                                                                                                                            e.setCancelled(true);
                                                                                                                            p.closeInventory();
                                                                                                                            p.sendMessage(ChatColor.RED + "Not Enough Tokens.");
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        API.delTokens(p, this.getPrice(27));
                                                                                                                        Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), this.getItemCommand(p, 27));
                                                                                                                        e.setCancelled(true);
                                                                                                                        p.closeInventory();
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
            }
        }
    }
    
    public static void openDonatorMenu(final Player p) {
        final Inventory inv = Bukkit.createInventory((InventoryHolder)null, 27, ChatColor.RED + "Token Shop");
        inv.setItem(0, getSlot(1));
        inv.setItem(1, getSlot(2));
        inv.setItem(2, getSlot(3));
        inv.setItem(3, getSlot(4));
        inv.setItem(4, getSlot(5));
        inv.setItem(5, getSlot(6));
        inv.setItem(6, getSlot(7));
        inv.setItem(7, getSlot(8));
        inv.setItem(8, getSlot(9));
        inv.setItem(9, getSlot(10));
        inv.setItem(10, getSlot(11));
        inv.setItem(11, getSlot(12));
        inv.setItem(12, getSlot(13));
        inv.setItem(13, getSlot(14));
        inv.setItem(14, getSlot(15));
        inv.setItem(15, getSlot(16));
        inv.setItem(16, getSlot(17));
        inv.setItem(17, getSlot(18));
        inv.setItem(18, getSlot(19));
        inv.setItem(19, getSlot(20));
        inv.setItem(20, getSlot(21));
        inv.setItem(21, getSlot(22));
        inv.setItem(22, getSlot(23));
        inv.setItem(23, getSlot(24));
        inv.setItem(24, getSlot(25));
        inv.setItem(25, getSlot(26));
        inv.setItem(26, getSlot(27));
        p.openInventory(inv);
    }
    
    public static void addDefaultForDonatorKits() {
        final File items = new File(Main.getInstance().getDataFolder(), "items.yml");
        final FileConfiguration cfg = (FileConfiguration)YamlConfiguration.loadConfiguration(items);
        cfg.set("Shop.1.ItemID", (Object)276);
        cfg.set("Shop.1.Amount", (Object)1);
        cfg.set("Shop.1.SubID", (Object)0);
        cfg.set("Shop.1.ItemName", (Object)"&8Diamond Sword");
        cfg.set("Shop.1.ItemLore", (Object)"&bPrice: &f100");
        cfg.set("Shop.1.Price", (Object)100);
        cfg.set("Shop.1.ItemCommand", (Object)"give %p 276 1");
        try {
            cfg.save(items);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public int getPrice(final int num) {
        final File items = new File(Main.getInstance().getDataFolder(), "items.yml");
        final FileConfiguration cfg = (FileConfiguration)YamlConfiguration.loadConfiguration(items);
        final int cmd = cfg.getInt("Shop." + num + ".Price");
        return cmd;
    }
    
    public String getItemCommand(final Player p, final int num) {
        final File items = new File(Main.getInstance().getDataFolder(), "items.yml");
        final FileConfiguration cfg = (FileConfiguration)YamlConfiguration.loadConfiguration(items);
        final String cmd = cfg.getString("Shop." + num + ".ItemCommand").replaceAll("%p", p.getName());
        return cmd;
    }
    
    public static ItemStack getSlot(final int num) {
        final File items = new File(Main.getInstance().getDataFolder(), "items.yml");
        final FileConfiguration cfg = (FileConfiguration)YamlConfiguration.loadConfiguration(items);
        ItemStack i = null;
        try {
            i = new ItemStack(Material.getMaterial(cfg.getInt("Shop." + num + ".ItemID")));
        }
        catch (NullPointerException ex) {
            i = new ItemStack(Material.AIR, 1);
        }
        if (i.getType() == Material.AIR) {
            return i;
        }
        final ItemMeta meta = i.getItemMeta();
        meta.setDisplayName(cfg.getString("Shop." + num + ".ItemName").replaceAll("&", "§"));
        final List<String> lore = new ArrayList<String>();
        lore.add(cfg.getString("Shop." + num + ".ItemLore").replaceAll("&", "§"));
        i.setAmount(cfg.getInt("Shop." + num + ".Amount"));
        i.setDurability((short)cfg.getInt("Shop." + num + ".SubID"));
        meta.setLore((List)lore);
        i.setItemMeta(meta);
        return i;
    }
}
