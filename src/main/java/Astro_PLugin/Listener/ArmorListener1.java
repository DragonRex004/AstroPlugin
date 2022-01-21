package Astro_PLugin.Listener;



import Astro_PLugin.AstroPlugin;
import org.bukkit.Bukkit;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;


public class ArmorListener1 {

    private int taskID;

    public void start() {

        taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(AstroPlugin.getInstance(), new Runnable() {
            @Override
            public void run() {

                Bukkit.getOnlinePlayers().forEach(player -> {
                    if(player.getInventory().getItem(EquipmentSlot.CHEST) == null){
                       player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 99999, 3));
                    }else{
                        player.removePotionEffect(PotionEffectType.SLOW);
                    }




                });
            }
        }, 0 ,20);
    }

}
