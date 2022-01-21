package Astro_PLugin.tasks;
import Astro_PLugin.Main;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;


public class MessageManagertask {

    private int taskID;
    private int taskID1;
    private int taskID2;

    public void Tipp1() {

        taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getInstance(), new Runnable() {
            @Override
            public void run() {
                Bukkit.getOnlinePlayers().forEach(player -> {
                    sendActionBar(player,"§6Tipp §f» Hey §9Astronaut §fich gebe dir einen Tipp lass lieber den Helm auf, sonst könnte das schlimm enden");
                });
            }
        }, 0 , 36000);
    }

    public void stop1() {

        Bukkit.getScheduler().cancelTask(taskID);
    }


    public void Tipp2() {

        taskID1 = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getInstance(), new Runnable() {
            @Override
            public void run() {

                Bukkit.getOnlinePlayers().forEach(player -> {
                    sendActionBar(player, "§6Tipp §f» Hey §9Astronaut §fam besten behällst du auch deinen Astronauten anzug an");
                });
            }
        }, 0 , 24000);
    }

    public void stop2() {

        Bukkit.getScheduler().cancelTask(taskID1);
    }

    public void Tipp3() {

        taskID2 = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getInstance(), new Runnable() {
            @Override
            public void run() {

                Bukkit.getOnlinePlayers().forEach(player -> {
                    sendActionBar(player, "§6Tipp §f» Du kannst am §5PC §fden Item-Shop öffnen und dir Items kaufen");
                });
            }
        }, 0 , 12000);
    }

    public void stop3() {

        Bukkit.getScheduler().cancelTask(taskID2);
    }

    private void sendActionBar(Player player, String message) {

        player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(message));
    }

}
