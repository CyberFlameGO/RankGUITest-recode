package net.cyberflame.rankguitest.listeners;

import net.cyberflame.rankguitest.ui.TestUI;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class InventoryClickListener implements Listener
{

    @EventHandler
    public void onClick(InventoryClickEvent e) {
        String title = e.getInventory().getTitle();
        if (title.equals(TestUI.inventory_name))
            {

                e.setCancelled(true);
                if (e.getCurrentItem() == null)
                    {
                        return;
                    }

                if (title.equals(TestUI.inventory_name))
                    {
                        TestUI.clicked((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
                    }
            }
    }
}
