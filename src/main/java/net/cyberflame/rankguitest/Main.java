package net.cyberflame.rankguitest;

import net.cyberflame.rankguitest.commands.TestCommand;
import net.cyberflame.rankguitest.listeners.InventoryClickListener;
import net.cyberflame.rankguitest.ui.TestUI;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin
{
    @Override
    public void onEnable()
    {
        this.getCommand("testcommand").setExecutor(new TestCommand());
        Bukkit.getPluginManager().registerEvents(new InventoryClickListener(), this);
        TestUI.initialize();
    }
}
