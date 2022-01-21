package Astro_PLugin.commands;

import Astro_PLugin.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class SetSpawnCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if(sender instanceof Player){
            Player player = (Player) sender;
            if (args.length == 0){

                FileConfiguration config = Main.getInstance().getConfig();
                config.set("Spawn.World", player.getWorld().getName());
                config.set("Spawn.X", player.getLocation().getX());
                config.set("Spawn.Y", player.getLocation().getY());
                config.set("Spawn.Z", player.getLocation().getZ());
                config.set("Spawn.Yaw", player.getLocation().getYaw());
                config.set("Spawn.Pitch", player.getLocation().getPitch());
                Main.getInstance().saveConfig();
                player.sendMessage("Du hast den Spawnpunkt umgesetzt");
            }else {
                player.sendMessage("Bitte benutze §5/setspawn");
            }


        }




        return false;
    }
}
