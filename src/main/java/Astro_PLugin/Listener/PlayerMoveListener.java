package Astro_PLugin.Listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class PlayerMoveListener implements Listener {

    @EventHandler

    public void OnMove(PlayerMoveEvent event){
        Player player = event.getPlayer();

        player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 99999, 2, false, false, false), true);
        player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_FALLING, 99999, 2, false, false, false), true);



    }



}
