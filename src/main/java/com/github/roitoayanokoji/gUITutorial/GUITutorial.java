package com.github.roitoayanokoji.gUITutorial;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.plugin.java.JavaPlugin;

public final class GUITutorial extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("OnEnable");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("OnDisable");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String args[]){
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
        Inventory gui = Bukkit.createInventory(null,27,"GUI-Tutorial");
        player.openInventory(gui);
    }
}
