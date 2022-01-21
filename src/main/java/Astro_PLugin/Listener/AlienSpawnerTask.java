package Astro_PLugin.Listener;

import Astro_PLugin.Main;
import Astro_PLugin.utils.ArmorItemBuilder;
import Astro_PLugin.utils.PlayerSkullApi;
import org.bukkit.*;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Zombie;

public class AlienSpawnerTask {

    private int taskID;

    public void alien() {

        taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getInstance(), new Runnable() {
            @Override
            public void run() {

                Bukkit.getOnlinePlayers().forEach(player -> {
                    FileConfiguration config = Main.getInstance().getConfig();
                    World world = Bukkit.getWorld(config.getString("Spawner1.World"));
                    double x = config.getDouble("Spawner1.X");
                    double y = config.getDouble("Spawner1.Y");
                    double z = config.getDouble("Spawner1.Z");
                    Location loc = new Location(world , x, y, z);
                    Zombie alien = (Zombie) player.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
                    alien.getEquipment().setBoots(new ArmorItemBuilder(Material.LEATHER_BOOTS).setColor(Color.LIME).setUnbreakable(true).build());
                    alien.getEquipment().setHelmet(PlayerSkullApi.getPlayerSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmViMjMxOWEzZDg4NDMxOGQ4MjkxMmI2OTEwMjZkZjZlNjYzNmMyZTI0MWQ0OWM1YTY5ZGI4MzBhYTdmNTEifX19"));
                    alien.getEquipment().setChestplate(new ArmorItemBuilder(Material.LEATHER_CHESTPLATE).setColor(Color.LIME).setUnbreakable(true).build());
                    alien.getEquipment().setLeggings(new ArmorItemBuilder(Material.LEATHER_LEGGINGS).setColor(Color.LIME).setUnbreakable(true).build());
                    alien.setCanPickupItems(false);
                    alien.setCustomName("§2Alien");
                    alien.setCustomNameVisible(true);


                });

            }
        },0, 600);
    }


    public void CancelSpawner() {

        Bukkit.getScheduler().cancelTask(taskID);
    }


    public void alien1() {

        taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getInstance(), new Runnable() {
            @Override
            public void run() {

                Bukkit.getOnlinePlayers().forEach(player -> {

                    FileConfiguration config1 = Main.getInstance().getConfig();
                    World world2 = Bukkit.getWorld(config1.getString("Spawner1.World"));
                    double x2 = config1.getDouble("Spawner2.X");
                    double y2 = config1.getDouble("Spawner2.Y");
                    double z2 = config1.getDouble("Spawner2.Z");
                    Location loc1 = new Location(world2, x2 , y2, z2);
                    Zombie alien1 = (Zombie) player.getWorld().spawnEntity(loc1, EntityType.ZOMBIE);
                    alien1.getEquipment().setBoots(new ArmorItemBuilder(Material.LEATHER_BOOTS).setColor(Color.LIME).setUnbreakable(true).build());
                    alien1.getEquipment().setHelmet(PlayerSkullApi.getPlayerSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmViMjMxOWEzZDg4NDMxOGQ4MjkxMmI2OTEwMjZkZjZlNjYzNmMyZTI0MWQ0OWM1YTY5ZGI4MzBhYTdmNTEifX19"));
                    alien1.getEquipment().setChestplate(new ArmorItemBuilder(Material.LEATHER_CHESTPLATE).setColor(Color.LIME).setUnbreakable(true).build());
                    alien1.getEquipment().setLeggings(new ArmorItemBuilder(Material.LEATHER_LEGGINGS).setColor(Color.LIME).setUnbreakable(true).build());
                    alien1.setCanPickupItems(false);
                    alien1.setCustomName("§2Alien");
                    alien1.setCustomNameVisible(true);

                });
            }
        },0, 1200);
    }


    public void CancelSpawner1() {

        Bukkit.getScheduler().cancelTask(taskID);
    }

    public void alien2() {

        taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getInstance(), new Runnable() {
            @Override
            public void run() {

                Bukkit.getOnlinePlayers().forEach(player -> {


                    FileConfiguration config2 = Main.getInstance().getConfig();
                    World world3 = Bukkit.getWorld(config2.getString("Spawner1.World"));
                    double x3 = config2.getDouble("Spawner3.X");
                    double y3 = config2.getDouble("Spawner3.Y");
                    double z3 = config2.getDouble("Spawner3.Z");
                    Location loc2 = new Location(world3, x3 , y3, z3);
                    Zombie alien2 = (Zombie) player.getWorld().spawnEntity(loc2, EntityType.ZOMBIE);
                    alien2.getEquipment().setBoots(new ArmorItemBuilder(Material.LEATHER_BOOTS).setColor(Color.LIME).setUnbreakable(true).build());
                    alien2.getEquipment().setHelmet(PlayerSkullApi.getPlayerSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmViMjMxOWEzZDg4NDMxOGQ4MjkxMmI2OTEwMjZkZjZlNjYzNmMyZTI0MWQ0OWM1YTY5ZGI4MzBhYTdmNTEifX19"));
                    alien2.getEquipment().setChestplate(new ArmorItemBuilder(Material.LEATHER_CHESTPLATE).setColor(Color.LIME).setUnbreakable(true).build());
                    alien2.getEquipment().setLeggings(new ArmorItemBuilder(Material.LEATHER_LEGGINGS).setColor(Color.LIME).setUnbreakable(true).build());
                    alien2.setCanPickupItems(false);
                    alien2.setCustomName("§2Alien");
                    alien2.setCustomNameVisible(true);
                });
            }
        },0, 1800);
    }


    public void CancelSpawner2() {

        Bukkit.getScheduler().cancelTask(taskID);
    }
}
