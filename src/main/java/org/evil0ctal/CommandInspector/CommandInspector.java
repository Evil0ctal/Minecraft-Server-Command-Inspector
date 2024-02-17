package org.evil0ctal.CommandInspector;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandMap;
import org.bukkit.plugin.java.JavaPlugin;
import java.lang.reflect.Field;
import java.util.Map;

public final class CommandInspector extends JavaPlugin {

    @Override
    public void onEnable() {
        // 插件启用时的消息
        getLogger().info("CommandInspector is enabled.");
        // 注册命令
        registerCommand();
    }

    @Override
    public void onDisable() {
        // 插件禁用时的消息
        getLogger().info("CommandInspector is disabled.");
    }

    private void registerCommand() {
        try {
            final Field bukkitCommandMap = Bukkit.getServer().getClass().getDeclaredField("commandMap");
            bukkitCommandMap.setAccessible(true);
            CommandMap commandMap = (CommandMap) bukkitCommandMap.get(Bukkit.getServer());

            Command command = new Command("listall") {
                @Override
                public boolean execute(CommandSender sender, String label, String[] args) {
                    // 检查玩家是否有执行命令的权限
                    if (sender.hasPermission("CommandInspector.use")) {
                        ListAll(sender);
                        return true;
                    } else {
                        sender.sendMessage("You do not have permission to execute this command.");
                        return false;
                    }
                }
            };

            commandMap.register("CommandInspector", command);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            getLogger().warning("Failed to register commands: " + e.getMessage());
        }
    }

    public void ListAll(CommandSender sender) {
        try {
            Field commandMapField = Bukkit.getServer().getClass().getDeclaredField("commandMap");
            commandMapField.setAccessible(true);
            CommandMap commandMap = (CommandMap) commandMapField.get(Bukkit.getServer());

            Map<String, Command> knownCommands = commandMap.getKnownCommands();
            for (Map.Entry<String, Command> entry : knownCommands.entrySet()) {
                String commandName = entry.getKey();
                Command command = entry.getValue();
                String handlerClassName = command.getClass().getName();
                sender.sendMessage("Command: " + commandName + " -> Handler Class: " + handlerClassName);
            }
        } catch (NoSuchFieldException | IllegalAccessException e) {
            sender.sendMessage("Failed to get CommandMap: " + e.getMessage());
        }
    }
}
