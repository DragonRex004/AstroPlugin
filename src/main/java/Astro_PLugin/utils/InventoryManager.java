package Astro_PLugin.utils;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class InventoryManager {

    private Inventory Pc = Bukkit.createInventory(null, 6*9, "§c§k00 §5Item Shop §c§k00");

    public void create(){

        Pc.setItem(0, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE).build());
        Pc.setItem(1, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE).build());
        Pc.setItem(2, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE).build());
        Pc.setItem(3, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE).build());
        Pc.setItem(4, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE).build());
        Pc.setItem(5, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE).build());
        Pc.setItem(6, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE).build());
        Pc.setItem(7, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE).build());
        Pc.setItem(8, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE).build());
        Pc.setItem(9, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE).build());
        Pc.setItem(17, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE).build());
        Pc.setItem(18, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE).build());
        Pc.setItem(26, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE).build());
        Pc.setItem(27, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE).build());
        Pc.setItem(35, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE).build());
        Pc.setItem(36, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE).build());
        Pc.setItem(44, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE).build());
        Pc.setItem(45, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE).build());
        Pc.setItem(46, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE).build());
        Pc.setItem(47, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE).build());
        Pc.setItem(48, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE).build());
        Pc.setItem(49, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE).build());
        Pc.setItem(50, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE).build());
        Pc.setItem(51, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE).build());
        Pc.setItem(52, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE).build());
        Pc.setItem(53, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE).build());

        Pc.setItem(20, new ItemBuilder(Material.IRON_BLOCK).setName("§7Luft dichte MetallBlöcke").setLore("Clicke um ein Stack davon zu kaufen", "Kosten §415 Steel").build());
        Pc.setItem(21, new ItemBuilder(Material.IRON_INGOT).setName("§4Steel Ingots").setLore("Clicke um 32 Ingots davon zu kaufen" , "Kosten §65 LavaCoal").build());
        Pc.setItem(22, new ItemBuilder(Material.COAL).setName("§6LavaCoal").setLore("Clicke um 15 davon zu kaufen" , "Kosten §25 Emeralds").build());
        Pc.setItem(41, new ItemBuilder(Material.DIAMOND_PICKAXE).setName("§cSpace Bohrer 3").setLore("Clicke um den Space Bohrer 3 zu kaufen", "Kosten §215 Emeralds").build());
        Pc.setItem(23, new ItemBuilder(Material.WOODEN_PICKAXE).setName("§2Space Bohrer 1").setLore("Clicke um den Space Bohrer 1 zu kaufen" , "Kosten §20 Emeralds").build());
        Pc.setItem(32, new ItemBuilder(Material.IRON_PICKAXE).setName("§6Space Bohrer 2").setLore("Clicke um den Space Bohrer 2 zu kaufen", "Kosten §25 Emeralds").build());
        Pc.setItem(29, new ItemBuilder(Material.BLAZE_ROD).setName("§6Taschenlampe").setLore("Clicke um die Taschenlampe zu kaufen", "Kosten §28 Emeralds").build());
        Pc.setItem(24, new ItemBuilder(Material.WOODEN_SWORD).setName("§2Space Sword 1").setLore("Clicke um den Space Sword 1 zu kaufen" , "Kosten §20 Emeralds").build());
        Pc.setItem(33, new ItemBuilder(Material.IRON_SWORD).setName("§6Space Sword 2").setLore("Clicke um den Space Sword 2 zu kaufen" , "Kosten §25 Emerald").build());
        Pc.setItem(42, new ItemBuilder(Material.DIAMOND_SWORD).setName("§cSpace Sword 3").setLore("Clicke um den Space Sword 3 zu kaufen" , "Kosten §215 Emerald").build());





    }

    public void Pc1(Player player){player.openInventory(Pc);}

    public Inventory getPc() {
        return Pc;
    }
}
