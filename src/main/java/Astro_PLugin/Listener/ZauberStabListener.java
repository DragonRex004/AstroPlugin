package Astro_PLugin.Listener;

import Astro_PLugin.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

import java.util.ArrayList;

public class ZauberStabListener implements Listener {
    @EventHandler
    public void OnClickEntity(EntityDamageByEntityEvent event){
        Player player = (Player) event.getDamager();
        Player player1 = (Player) event.getEntity();
        ArrayList<String> used = new ArrayList<String>();
        if(player.getInventory().getItemInMainHand().equals(Material.STICK)){
            if(!used.contains(player.getName())) {
                used.add(player.getName());
                player1.getWorld().spawnParticle(Particle.HEART, player1.getLocation(), 5);
                player1.setHealth(20);
                Bukkit.getScheduler().scheduleAsyncDelayedTask(Main.getInstance(), new Runnable() {
                    @Override
                    public void run() {
                        used.remove(player.getName());
                    }
                }, 600);
            } else {
                player.sendMessage("Du kannst diesen Stab nur alle 30 Sekunden ausführen");
            }
        }
    }
}
