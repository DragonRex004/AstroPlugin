package Astro_PLugin.Listener;


import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class TaschenlampenListener implements Listener {

    @EventHandler
    public void OnInteract(PlayerInteractEvent event){
        Player player = event.getPlayer();
        if(event.getAction() == Action.RIGHT_CLICK_AIR | event.getAction() == Action.RIGHT_CLICK_BLOCK ) {
            if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals("§6Taschenlampe")) {
                if (player.hasPotionEffect(PotionEffectType.NIGHT_VISION)) {
                    player.sendMessage("§4Die Taschenlampe wurde deaktiviert");
                    player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1, 1);
                    player.removePotionEffect(PotionEffectType.NIGHT_VISION);
                }


            }

        }

    }



}
