package Astro_PLugin.commands;

import Astro_PLugin.Main;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class SpawnCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if(sender instanceof Player){
            Player player = (Player)  sender;
            if(args.length == 0){

                FileConfiguration config = Main.getInstance().getConfig();
                World world = Bukkit.getWorld(config.getString("Spawn.World"));
                double x = config.getDouble("Spawn.X");
                double y = config.getDouble("Spawn.Y");
                double z = config.getDouble("Spawn.Z");
                float yaw = (float) config.getDouble("Spawn.Yaw");
                float pitch = (float) config.getDouble("Spawn.Pitch");
                Location location = new Location(world, x, y, z, yaw, pitch);
                player.teleport(location);


            }else
                player.sendMessage("Bitte benutze /Spawn");

        }


        return false;
    }
}
