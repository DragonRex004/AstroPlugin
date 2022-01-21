package Astro_PLugin;


import Astro_PLugin.Listener.*;
import Astro_PLugin.commands.SetSpawnCommand;
import Astro_PLugin.commands.SetspawnerCommand;
import Astro_PLugin.commands.SpawnCommand;
import Astro_PLugin.commands.TaschenlampenCommand;
import Astro_PLugin.Listener.AlienSpawnerTask;
import Astro_PLugin.tasks.MessageManagertask;
import Astro_PLugin.utils.InventoryManager;
import Astro_PLugin.utils.RecipeLoader;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class AstroPlugin extends JavaPlugin {
    private static AstroPlugin instance;
    private InventoryManager inventoryManager;
    private ArmorListener armorListener;
    private ArmorListener1 armorListener1;
    private MessageManagertask messageManagertask;
    private AlienSpawnerTask alienSpawnerTask;



    @Override
    public void onEnable() {
        listenerregistration();
            instance = this;
        armorListener = new ArmorListener();
        armorListener.start();
        armorListener1 = new ArmorListener1();
        armorListener1.start();
        inventoryManager = new InventoryManager();
        inventoryManager.create();
        messageManagertask = new MessageManagertask();
        messageManagertask.Tipp1();
        messageManagertask.Tipp2();
        messageManagertask.Tipp3();
        alienSpawnerTask = new AlienSpawnerTask();
        alienSpawnerTask.alien();
        alienSpawnerTask.alien1();
        alienSpawnerTask.alien2();

        getCommand("setspawn").setExecutor(new SetSpawnCommand());
        getCommand("spawn").setExecutor(new SpawnCommand());
        getCommand("taschenlampe").setExecutor(new TaschenlampenCommand());
        getCommand("setspawner").setExecutor(new SetspawnerCommand());
        getCommand("setspawner").setTabCompleter(new SetspawnerCommand());


        new RecipeLoader().Taschenlampe();

    }

    @Override
    public void onDisable() {

    }



 public void listenerregistration() {
     PluginManager pluginManager = Bukkit.getPluginManager();
     pluginManager.registerEvents(new JoinListener(), this);
     pluginManager.registerEvents(new BlockBreakListener(), this);
     pluginManager.registerEvents(new PlayerRespawnListener(), this);
     pluginManager.registerEvents(new PlayerMoveListener(), this);
     pluginManager.registerEvents(new TaschenlampenListener(), this);
     pluginManager.registerEvents(new WeatherchangeListener(), this);
     pluginManager.registerEvents(new FoodChangeListener(), this);
     pluginManager.registerEvents(new BlockInteractListener(), this);
     pluginManager.registerEvents(new PcInventoryClickListener(), this);
     pluginManager.registerEvents(new TaschenlampenListener1(), this);
     pluginManager.registerEvents(new GlassInteractListener(), this);
     pluginManager.registerEvents(new ZauberStabListener(), this);
 }






    public static AstroPlugin getInstance() {
        return instance;
    }
    public ArmorListener getArmorListener() {
        return armorListener;
    }
    public ArmorListener1 getArmorListener1(){return armorListener1;}
    public InventoryManager getInventoryManager(){return inventoryManager;}
    public MessageManagertask getMessageManagertask(){return messageManagertask;}
    public AlienSpawnerTask getAlienSpawnerTask(){return alienSpawnerTask;}
}
