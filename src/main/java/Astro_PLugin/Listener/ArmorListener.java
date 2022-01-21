package Astro_PLugin.Listener;


import Astro_PLugin.AstroPlugin;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.inventory.EquipmentSlot;


public class ArmorListener {

    private int taskID;

    public void start() {

        taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(AstroPlugin.getInstance(), new Runnable() {
            @Override
            public void run() {

                Bukkit.getOnlinePlayers().forEach(player -> {
                    if(player.getInventory().getItem(EquipmentSlot.HEAD) == null){
                                player.sendMessage("§4WARNING §fDu erstickst!");
                                player.damage(2.5);
                                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_HURT, 1, 1);


                    }




                });
            }
        }, 0 ,20);
    }

}
