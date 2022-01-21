package Astro_PLugin.Listener;

import Astro_PLugin.utils.ArmorItemBuilder;
import Astro_PLugin.utils.ItemBuilder;
import org.bukkit.Color;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;


public class PlayerRespawnListener implements Listener {

    @EventHandler
    public void OnDeath(PlayerRespawnEvent event){
        Player player = event.getPlayer();

        player.sendMessage("Hallo Du bist nun ein astronaut, also setzte deinen Helm Lieber niemals ab");
        player.getInventory().setItem(EquipmentSlot.HEAD, new ItemStack(Material.GLASS));
        player.getInventory().setItem(EquipmentSlot.CHEST,new ArmorItemBuilder(Material.LEATHER_CHESTPLATE).setName("Astronauten anzug").setColor(Color.WHITE).setCostomModelData(1).setUnbreakable(true).build());
        player.getInventory().setItem(8, new ItemBuilder(Material.OBSERVER).setName("§5Pc").build());
        player.setGameMode(GameMode.SURVIVAL);
    }



}
