package net.cyberflame.rankguitest.ui;

import net.cyberflame.rankguitest.utils.Utils;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;


public class TestUI
{
    public static Inventory inv;
    public static String inventory_name;
    public static int inv_horizontal = 6;
    public static int rows = inv_horizontal * 9 - 1;

    public static void initialize() {
        inventory_name = Utils.chat("&b&lRank gui");

        inv = Bukkit.createInventory(null, inv_horizontal);
    }


    public static Inventory GUI(Player player) {
        Inventory toReturn = Bukkit.createInventory(null, inv_horizontal, inventory_name);

        if (player.hasPermission("abc.23"))
            {


                Utils.createItem(inv, Material.DIAMOND_BLOCK, 11, 11, "&b&lDiamond Block",
                                 "&7&lThis is a diamond block", "&c" +
                                                                "&lHi", "&dHello", "&4&l4!");

                Utils.createItem(inv, Material.DIAMOND, 11, 13, "&b&lDiamond",
                                 "&7&lThis is a diamond", "&c&lHi",
                                 "&dHello", "&4&l4!");

                Utils.createItemByte(inv, Material.STAINED_GLASS, 3, 5, 12, "&b&lBLUE STAINED GLASS",
                                     "&c&lHi", "&dHello",
                                     "&4" +
                                     "&l3!");
            }
        else if (player.hasPermission("abc.24"))
            {

                Utils.createItem(inv, Material.DIAMOND_BLOCK, 11, 11, "&b&lDiamond Block",
                                 "&7&lThis is a diamond block",
                                 "&c&lHi", "&dHello", "&4&l4!");
            }


        toReturn.setContents(inv.getContents());
        return toReturn;
    }


    public static void clicked(Player player, int slot, ItemStack clicked, Inventory inv) {
        if (clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&cTest item")))
            player.setDisplayName(Utils.chat(
                    "&b&lC&c&l4&d&ln&e&ld&a&ly&b&lCr4ft &c&lRanks &8\u2759&7 You have successfully made a GUI."));
    }
}
