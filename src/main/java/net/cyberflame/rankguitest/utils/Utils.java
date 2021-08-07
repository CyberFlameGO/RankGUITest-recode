package net.cyberflame.rankguitest.utils;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;


public class Utils
{
    public static String chat(String s)
    {
        return ChatColor.translateAlternateColorCodes('&', s);
    }


    public static ItemStack createItem(Inventory inv, Material materialType, int amount, int invSlot,
                                       String displayName,
                                       String... loreString)
    {
        List<String> lore = new ArrayList<>();

        ItemStack item = new ItemStack(materialType, amount);

        return getItemStack(inv, invSlot, displayName, lore, item, loreString);
    }

    public static ItemStack getItemStack(Inventory inv, int invSlot, String displayName, List<String> lore,
                                         ItemStack item, String[] loreString)
    {
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(chat(displayName));
        for (String s : loreString)
            {
                lore.add(chat(s));
            }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot - 1, item);
        return item;
    }


    public static ItemStack createItemByte(Inventory inv, Material materialType, int byteId, int amount, int invSlot,
                                           String displayName, String... loreString)
    {
        List<String> lore = new ArrayList<>();

        ItemStack item = new ItemStack(materialType, amount, (short) byteId);

        return getItemStack(inv, invSlot, displayName, lore, item, loreString);
    }
}
