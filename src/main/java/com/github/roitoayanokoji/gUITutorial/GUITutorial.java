package com.github.roitoayanokoji.gUITutorial;

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
}
