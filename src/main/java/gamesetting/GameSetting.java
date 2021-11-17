package gamesetting;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

import org.bukkit.Bukkit;
import org.bukkit.command.PluginCommand;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitScheduler;

import static org.bukkit.Bukkit.getServer;

public class GameSetting extends JavaPlugin implements Listener {
    public int first_check_run1 = 0;
    public int first_check_run2 = 0;
    public int first_check_run3 = 0;
    private BukkitScheduler sc;

    public void onEnable() {
        super.onEnable();
        System.out.println("Setting plugin loaded");
        ((PluginCommand)Objects.<PluginCommand>requireNonNull(getCommand("setting"))).setExecutor(new SettingStart());
        this.sc = Bukkit.getScheduler();
        this.sc.scheduleSyncRepeatingTask((Plugin)this, this::fileCheck, 0L, 1L);
    }

    public void onDisable() {
        super.onDisable();
    }
    private void fileCheck() {
        File timeCheck1 = new File("C:\\Users\\Dasom\\Downloads\\run1_time_tagging.txt");
        File timeCheck2 = new File("C:\\Users\\Dasom\\Downloads\\run2_time_tagging.txt");
        File timeCheck3 = new File("C:\\Users\\Dasom\\Downloads\\run3_time_tagging.txt");
        if(timeCheck1.exists() && first_check_run1 == 0)
        {
            getServer().broadcastMessage("Run1 interaction game starts!");
            first_check_run1 += 1;
        }
        if(timeCheck2.exists() && first_check_run2 == 0)
        {
            getServer().broadcastMessage("Run2 interaction game starts!");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title @p subtitle {\"text\": \"광장으로 가서 은수를 찾으세요.\",\"color\":\"yellow\"}");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title @p title {\"text\": \"\"}");
            first_check_run2 += 1;
        }
        if(timeCheck3.exists() && first_check_run3 == 0)
        {
            getServer().broadcastMessage("Run3 interaction game starts!");
            first_check_run3 += 1;
        }
    }
}

