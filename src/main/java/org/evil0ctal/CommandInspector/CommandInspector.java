package org.evil0ctal.CommandInspector;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandMap;

import java.lang.reflect.Field;
import java.util.Map;

public final class CommandInspector extends JavaPlugin {

    @Override
    public void onEnable() {
        // 插件启用时的消息 / Message when plugin is enabled
        getLogger().info("Command_Inspector is enabled.");
        //注册命令 / Register command
//        Bukkit.getPluginCommand("listall").setExecutor(new List_Commands() {
//            @Override
//            public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
//                list_commands();
//                return true;
//            }
//        });
        // 输出所有已注册命令及其处理类 / List all registered commands and their handler classes
        list_commands();
    }

    @Override
    public void onDisable() {
        // 插件禁用时的消息 / Message when plugin is disabled
        getLogger().info("Command_Inspector is disabled.");
    }

    /**
     * 检查并输出所有已注册命令及其处理类。
     * Inspect and print all registered commands and their handler classes.
     */
    public void list_commands() {
        try {
            // 通过反射获取 Bukkit 的 CommandMap / Get the CommandMap of Bukkit via reflection
            Field commandMapField = Bukkit.getServer().getClass().getDeclaredField("commandMap");
            commandMapField.setAccessible(true);
            CommandMap commandMap = (CommandMap) commandMapField.get(Bukkit.getServer());

            // 获取并输出所有已注册命令及其处理类 / Get and print all registered commands and their handler classes
            Map<String, Command> knownCommands = commandMap.getKnownCommands();
            for (Map.Entry<String, Command> entry : knownCommands.entrySet()) {
                String commandName = entry.getKey();
                Command command = entry.getValue();
                String handlerClassName = command.getClass().getName();
                getLogger().info("Command: " + commandName + " -> Handler Class: " + handlerClassName);
            }
        } catch (NoSuchFieldException | IllegalAccessException e) {
            getLogger().warning("Failed to get CommandMap: " + e.getMessage());
        }
    }
}
