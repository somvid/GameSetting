package gamesetting;

import java.io.File;
import java.io.IOException;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.*;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitScheduler;
import java.util.logging.Logger;

import static org.bukkit.Bukkit.getServer;

public class SettingStart implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args[0].equals("tuto")){
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc select 245");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc hologram clear");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc hologram add &b&lO");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc hologram add &b&lOOO");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc hologram add &b&lO");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc assign --set tutorial");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc moveto 19 64 236");

            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc select 231");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc hologram clear");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc assign --set canttalk");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc moveto 13 64 235");

            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc select 232");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc hologram clear");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc assign --set canttalk");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc moveto 47 64 178");

            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc select 233");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc hologram clear");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc assign --set canttalk");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc moveto 64 65 222");

            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc select 234");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc hologram clear");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc assign --set canttalk");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc moveto 6 64 235");

            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc select 235");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc hologram clear");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc assign --set canttalk");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc moveto 46 64 173");

            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc select 236");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc hologram clear");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc assign --set canttalk");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc moveto 62 65 227");

            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp @p 19 64 241");
            getServer().broadcastMessage("Tutorial setting completed!");
        }

        else if (args[0].equals("run1")){
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "movie b1_movie_kor");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc select 230");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc hologram clear");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc moveto 78 65 183");

            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc select 231");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc hologram clear");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc assign --set canttalk");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc moveto 75 65 185");

            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc select 232");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc hologram clear");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc assign --set canttalk");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc moveto 75 65 182");

            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc select 233");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc hologram clear");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc assign --set canttalk");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc moveto 46 64 201");

            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc select 234");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc hologram clear");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc assign --set canttalk");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc moveto 28 64 218");

            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc select 235");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc hologram clear");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc assign --set Jinseo_run1");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc moveto 40 64 189");

            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc select 236");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc hologram clear");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc hologram add &b&lO");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc hologram add &b&lOOO");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc hologram add &b&lO");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc assign --set Haram_run1");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc moveto 55 64 189");

            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp @p 54 64 184");
            getServer().broadcastMessage("Run1 setting completed!");
        }
        else if (args[0].equals("run2_1")){
            // if player decided to go to the book club with Hayden and Finley.
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "movie b2_movie_kor");

            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc select 231");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc hologram clear");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc assign --set canttalk");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc moveto 21 63 212");

            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc select 232");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc hologram clear");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc assign --set canttalk");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc moveto 39 64 187");

            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc select 233");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc hologram clear");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc hologram add &b&lO");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc hologram add &b&lOOO");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc hologram add &b&lO");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc assign --set Eunsu_run2_dDE");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc moveto 33 64 205");

            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc select 234");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc hologram clear");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc assign --set canttalk");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc moveto 52 64 194");

            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc select 235");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc hologram clear");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc assign --set Jinseo_run2");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc moveto 46 64 172");

            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc select 236");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc hologram clear");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc assign --set canttalk");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc moveto 46 64 220");

            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp @p 32 64 195");
            getServer().broadcastMessage("Run2_1 setting completed!");
        }
        else if (args[0].equals("run2_2")){
            // if player decided to go to the downtown with Jackie and Shannon.
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "movie b2_movie_kor");

            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc select 231");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc hologram clear");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc assign --set canttalk");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc moveto 21 63 212");

            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc select 232");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc hologram clear");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc assign --set canttalk");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc moveto 39 64 187");

            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc select 233");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc hologram clear");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc hologram add &b&lO");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc hologram add &b&lOOO");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc hologram add &b&lO");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc assign --set Eunsu_run2_dJS");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc moveto 33 64 205");

            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc select 234");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc hologram clear");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc assign --set canttalk");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc moveto 52 64 194");

            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc select 235");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc hologram clear");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc assign --set Jinseo_run2");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc moveto 46 64 172");

            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc select 236");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc hologram clear");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc assign --set canttalk");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc moveto 46 64 220");

            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp @p 32 64 195");
            getServer().broadcastMessage("Run2_2 setting completed!");

        }
        else if (args[0].equals("run3_1")){
            // Finley, Shannon, Jackie, Hayden are my team.
            // Adrian is Quinn's team.
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "movie b3_movie_kor");

            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc select 231");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc hologram clear");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc assign --set canttalk");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc moveto 49 64 189");

            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc select 233");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc hologram clear");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc hologram add &b&lO");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc hologram add &b&lOOO");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc hologram add &b&lO");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc assign --set EvS_aD_run3");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc moveto 45 64 182");

            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc select 232");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc hologram clear");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc assign --set canttalk");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc moveto 39 64 188");

            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc select 234");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc hologram clear");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc assign --set canttalk");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc moveto 47 64 190");

            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc select 235");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc hologram clear");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc moveto 20 63 211");

            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc select 236");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc hologram clear");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc assign --set canttalk");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc moveto 30 64 214");

            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp @p 43 64 178");
            getServer().broadcastMessage("Run3_1 setting completed!");

        }
        else if (args[0].equals("run3_2")){
            // Finley, Shannon, Jackie, Adrian are my team.
            // Hayden is Quinn's team.
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "movie b3_movie_kor");

            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc select 231");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc hologram clear");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc assign --set canttalk");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc moveto 49 64 189");

            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc select 233");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc hologram clear");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc hologram add &b&lO");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc hologram add &b&lOOO");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc hologram add &b&lO");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc assign --set EvS_aH_run3");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc moveto 45 64 182");

            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc select 232");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc hologram clear");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc assign --set canttalk");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc moveto 39 64 188");

            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc select 234");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc hologram clear");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc assign --set canttalk");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc moveto 30 64 214");

            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc select 235");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc hologram clear");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc moveto 20 63 211");

            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc select 236");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc hologram clear");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc assign --set canttalk");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc moveto 47 64 190");

            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp @p 43 64 178");
            getServer().broadcastMessage("Run3_2 setting completed!");

        }
        else if (args[0].equals("run3_3")){
            // Finley, Adrian, Jackie, Hayden are my team.
            // Shannon is Quinn's team.
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "movie b3_movie_kor");

            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc select 231");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc hologram clear");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc assign --set canttalk");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc moveto 49 64 189");

            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc select 233");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc hologram clear");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc hologram add &b&lO");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc hologram add &b&lOOO");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc hologram add &b&lO");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc assign --set EvH_run3");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc moveto 45 64 182");

            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc select 232");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc hologram clear");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc assign --set canttalk");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc moveto 30 64 214");

            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc select 234");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc hologram clear");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc assign --set canttalk");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc moveto 47 64 190");

            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc select 235");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc hologram clear");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc moveto 20 63 211");

            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc select 236");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc hologram clear");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc assign --set canttalk");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "npc moveto 39 64 188");

            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp @p 43 64 178");
            getServer().broadcastMessage("Run3_3 setting completed!");

        }
        else {
            getServer().broadcastMessage("You should use only one of [tuto, run1, run2_1, run2_2, run3_1, run 3_2, run3_3].");
        }
        return true;
    }
}