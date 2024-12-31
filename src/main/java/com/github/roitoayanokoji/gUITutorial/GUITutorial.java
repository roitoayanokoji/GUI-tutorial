package com.github.roitoayanokoji.gUITutorial;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public final class GUITutorial extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("OnEnable");

        //register listener
        getServer().getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("OnDisable");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
        if (label.equalsIgnoreCase("gui")){
            if (sender instanceof Player){
                Player player  = (Player) sender;
                openGUI(player);
                return true;
            }
        }
        return false;
    }

    private void openGUI(Player player){
        Inventory gui = Bukkit.createInventory(null,27,"GUI");

        ItemStack item = new ItemStack(Material.STONE);
        gui.setItem(0, item);

        player.openInventory(gui);
    }

    @EventHandler
    public void  onInventoryClick(InventoryClickEvent event){
        if (event.getView().getTitle().equals("GUI")){
            event.setCancelled(true);
        }
    }
}
