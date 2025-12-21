package ua.anna;

import org.bukkit.plugin.java.JavaPlugin;
import ua.anna.commands.CatCommand;
import ua.anna.commands.healCommand;

public class Main extends JavaPlugin{

    @Override
    public void onEnable(){
        getLogger().info("Plugin has load successful");
        getCommand("cat").setExecutor(new CatCommand());
        getCommand("heal_all").setExecutor(new healCommand());
    }

    @Override
    public void onDisable(){
        getLogger().info("Plugin is disabled...:(");
    }
}