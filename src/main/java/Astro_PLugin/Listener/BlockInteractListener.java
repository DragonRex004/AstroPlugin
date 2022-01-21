package Astro_PLugin.Listener;

import Astro_PLugin.AstroPlugin;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;


public class BlockInteractListener implements Listener {

    @EventHandler
    public void OnBlock(PlayerInteractEvent event){
        Player player = event.getPlayer();

        if(event.getAction() == Action.RIGHT_CLICK_BLOCK){
            if(event.getClickedBlock().getType().equals(Material.OBSERVER)){
                player.playSound(player.getLocation(), Sound.BLOCK_CHEST_OPEN, 1, 1);
               AstroPlugin.getInstance().getInventoryManager().Pc1(player);

            }

        }



    }



}
