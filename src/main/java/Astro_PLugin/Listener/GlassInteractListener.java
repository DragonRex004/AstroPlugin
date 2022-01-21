package Astro_PLugin.Listener;

import Astro_PLugin.utils.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;

public class GlassInteractListener implements Listener {

    @EventHandler
    public void OnGlass(PlayerInteractEvent event) {
        Player player = event.getPlayer();

        if (player.getInventory().getItemInMainHand().getType().equals(Material.GLASS)) {
            if (player.getInventory().getItem(EquipmentSlot.HEAD) == null) {
                player.getInventory().remove(Material.GLASS);
                player.getInventory().setItem(EquipmentSlot.HEAD, new ItemBuilder(Material.GLASS).build());
            }
        }
    }
}