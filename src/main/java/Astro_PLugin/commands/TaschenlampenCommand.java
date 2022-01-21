package Astro_PLugin.commands;


import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

import java.util.Collections;

public class TaschenlampenCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if(sender instanceof Player){
            Player player = (Player) sender;

            ItemStack taschenlampe = new ItemStack(Material.BLAZE_ROD);
            ItemMeta taschenlampenMeta = taschenlampe.getItemMeta();

            taschenlampenMeta.setDisplayName("§6Tachenlampe");
            taschenlampenMeta.setLore(Collections.singletonList("Drücke rechtsclick zum aktievieren"));
            taschenlampenMeta.setCustomModelData(2);
            taschenlampenMeta.setUnbreakable(true);
            taschenlampe.setItemMeta(taschenlampenMeta);

            player.getInventory().addItem(taschenlampe);

        }


        return false;
    }
}
