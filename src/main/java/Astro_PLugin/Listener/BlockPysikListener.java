package Astro_PLugin.Listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPhysicsEvent;

public class BlockPysikListener implements Listener {
    @EventHandler
    public void OnBlockPysik(BlockPhysicsEvent event){
        event.setCancelled(true);
    }
}
