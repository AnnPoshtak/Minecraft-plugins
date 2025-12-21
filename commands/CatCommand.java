package ua.anna.commands;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public class CatCommand implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        if (!(sender instanceof Player)){
            sender.sendMessage("Only player can use this command!");
            return true;
        }

        Player player = (Player) sender;
        Location location =  player.getLocation();

        for (int i = 0; i < 10; i++){
            player.getWorld().spawnEntity(location, EntityType.CAT);
        }
        player.sendMessage("Here is your cats :)");
        return true;
    }
}
