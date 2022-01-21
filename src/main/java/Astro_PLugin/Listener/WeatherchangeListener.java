package Astro_PLugin.Listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.weather.WeatherChangeEvent;

public class WeatherchangeListener implements Listener {
    @EventHandler
    public void OnWeather(WeatherChangeEvent event){
        event.getWorld().setStorm(false);
        event.getWorld().setThundering(false);
        event.getWorld().setTime(18000);
    }




}
