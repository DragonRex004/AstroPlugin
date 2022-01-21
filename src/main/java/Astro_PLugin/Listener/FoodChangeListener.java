package Astro_PLugin.Listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;

public class FoodChangeListener implements Listener {
    @EventHandler
    public void OnFood(FoodLevelChangeEvent event){
        event.setFoodLevel(20);
    }




}
