package net.cyberflame.rankguitest.commands;

import net.cyberflame.rankguitest.ui.TestUI;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class RankCommand implements CommandExecutor
{
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {
        if (!(sender instanceof Player))
            {
                sender.sendMessage("You can't execute this from the console");
                return true;
            }

        Player player = (Player) sender;

        if (player.hasPermission("abc.23"))
            {
                player.openInventory(TestUI.GUI(player));
            }
        return false;
    }
}
