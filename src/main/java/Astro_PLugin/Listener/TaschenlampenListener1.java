package Astro_PLugin.Listener;


import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class TaschenlampenListener1 implements Listener {

    @EventHandler
    public void OnInteract(PlayerInteractEvent event){
        Player player = event.getPlayer();
        if(event.getAction() == Action.LEFT_CLICK_AIR | event.getAction() == Action.LEFT_CLICK_BLOCK ) {
            if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals("§6Taschenlampe")) {
                    player.sendMessage("§2Die Taschenlampe wurde aktiviert");
                    player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1, 1);
                    player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 99999, 1, true, false, false), true);
                }


            }

        }

    }




