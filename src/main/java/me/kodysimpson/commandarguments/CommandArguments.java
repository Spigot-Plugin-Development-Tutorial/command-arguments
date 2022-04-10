package me.kodysimpson.commandarguments;

import me.kodysimpson.commandarguments.commands.FartCommand;
import me.kodysimpson.commandarguments.commands.RepeatCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class CommandArguments extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        getCommand("repeat").setExecutor(new RepeatCommand());
        getCommand("fart").setExecutor(new FartCommand());

    }
}
