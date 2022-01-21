package Astro_PLugin.Listener;

import Astro_PLugin.utils.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Vector;


public class BlockBreakListener implements Listener {

    @EventHandler
    public void OnBreak(BlockBreakEvent event) {
        Player player = event.getPlayer();

        if (event.getBlock().getType().equals(Material.STONE)) {
            event.getBlock().setType(Material.AIR);
            event.getBlock().getLocation().getWorld().dropItem(event.getBlock().getLocation(), new ItemStack(Material.EMERALD)).setVelocity(new Vector(0.2, 0.2, 0.2));


            if (event.getBlock().getType().equals(Material.OBSERVER)) {
                event.getBlock().setType(Material.AIR);
                event.getBlock().getLocation().getWorld().dropItem(event.getBlock().getLocation(), new ItemBuilder(Material.OBSERVER).setName("§5Pc §f| §6Item-Shop").build()).setVelocity(new Vector(0.2, 0.2, 0.2));
            }
        }
    }
}