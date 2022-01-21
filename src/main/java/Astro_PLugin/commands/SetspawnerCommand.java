package Astro_PLugin.commands;

import Astro_PLugin.AstroPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class SetspawnerCommand implements CommandExecutor , TabCompleter {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if(sender instanceof Player){
            Player player = (Player) sender;

            if(command.getName().equals("setspawner")){
             if(args[0].equalsIgnoreCase("1")){
                 FileConfiguration Spawnerconfig = AstroPlugin.getInstance().getConfig();
                 Spawnerconfig.set("Spawner1.World", player.getWorld().getName());
                 Spawnerconfig.set("Spawner1.X", player.getLocation().getX());
                 Spawnerconfig.set("Spawner1.Y", player.getLocation().getY());
                 Spawnerconfig.set("Spawner1.Z", player.getLocation().getZ());
                 AstroPlugin.getInstance().saveConfig();
                 player.sendMessage("§2Die Location für Spawner 1 wurde gesetzt");
             }else if(args[0].equalsIgnoreCase("2")){
                 FileConfiguration Spawnerconfig1 = AstroPlugin.getInstance().getConfig();
                 Spawnerconfig1.set("Spawner2.World", player.getWorld().getName());
                 Spawnerconfig1.set("Spawner2.X", player.getLocation().getX());
                 Spawnerconfig1.set("Spawner2.Y", player.getLocation().getY());
                 Spawnerconfig1.set("Spawner2.Z", player.getLocation().getZ());
                 AstroPlugin.getInstance().saveConfig();
                 player.sendMessage("§2Die Location für Spawner 2 wurde gesetzt");
             }else if(args[0].equalsIgnoreCase("3")){
                 FileConfiguration Spawnerconfig2 = AstroPlugin.getInstance().getConfig();
                 Spawnerconfig2.set("Spawner3.World", player.getWorld().getName());
                 Spawnerconfig2.set("Spawner3.X", player.getLocation().getX());
                 Spawnerconfig2.set("Spawner3.Y", player.getLocation().getY());
                 Spawnerconfig2.set("Spawner3.Z", player.getLocation().getZ());
                 AstroPlugin.getInstance().saveConfig();
                 player.sendMessage("§2Die Location für Spawner 3 wurde gesetzt");
             }
            }
        }
        return false;
    }

    @Override
    public @Nullable List<String> onTabComplete(@NotNull CommandSender sender, @NotNull Command command, @NotNull String alias, @NotNull String[] args) {
        List<String> tabcompleter = new ArrayList<>();
        if(args.length == 1){
            tabcompleter.add("1");
            tabcompleter.add("2");
            tabcompleter.add("3");
        }
        return tabcompleter;
    }
}
