package me.bwfcwalshy.bukkitfreeze;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable(){
        saveDefaultConfig();
        
        getServer().getPluginManager().registerEvents(new Events(), this);
        
        getCommand("freeze").setExecutor(new FreezeCmd());
        getCommand("unfreeze").setExecutor(new UnFreezeCmd());
    }
}
