package Astro_PLugin.Listener;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class FlowerPodChangeListener implements Listener {
    @EventHandler
    public void OnFlowerChange(PlayerInteractEvent event){
        if(event.getClickedBlock() != null &&
                event.getClickedBlock().getType().equals(Material.FLOWER_POT) &&
                event.getAction().equals(Action.RIGHT_CLICK_BLOCK)){

            event.setCancelled(true);
        }
    }
}
