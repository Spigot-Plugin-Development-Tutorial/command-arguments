package me.kodysimpson.commandarguments.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FartCommand implements CommandExecutor {

    // /fart <playerName>

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        String args3[] = new String[3];

        if(sender instanceof Player p){

            if(args.length == 0){
                p.sendMessage("You are so nasty. You have just farted all over yourself. Get yourself together man.");
                p.setHealth(0.0);
            }else{

                String playerName = args[0];

                Player target = Bukkit.getServer().getPlayerExact(playerName);

                if(target == null){
                    p.sendMessage("This player is not online.");
                }else{

                    p.sendMessage("You successfully farted on " + target.getDisplayName());
                    target.sendMessage("You have just been farted on " + p.getDisplayName() + ". How does that make you feel?");
                    target.setHealth(0.0);

                }

            }

        }

        return true;
    }

}
