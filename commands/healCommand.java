package ua.anna.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class healCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        if (!(sender instanceof Player)){
            sender.sendMessage("Only player can use this command!");
            return true;
        }

        Player player = (Player) sender;
        player.setFoodLevel(20);
        player.setHealth(20);
        player.sendMessage("Ok!");
        return true;
    }
}
