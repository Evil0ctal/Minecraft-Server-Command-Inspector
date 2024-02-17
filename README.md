# Minecraft-Server-Command-Inspector (CommandInspector) 🔍

README Language: [English](./README.md) | [简体中文](./README-CN.md)

## What is this? 🤔

Imagine your server is running on the Paper server platform, and you have installed a multitude of server plugins. This situation could lead to a consequence: the same command might be registered and listened to by multiple plugins. 🤹

For instance, when the CMI plugin is installed alongside EssentialsX or the AdvancedTeleport plugin, entering the `/spawn` command might result in it being executed by one of these plugins due to the order in which plugins are loaded. However, since plugins do not output any logs for this, determining which plugin executed the command becomes a challenging task. You would need to use a process of elimination to find the actual plugin responsible. **CommandInspector** helps you by listing all registered plugin commands along with their handler class names, aiding you in efficiently debugging large Minecraft servers. 🚀

## Features ✨

* **Comprehensive Detection**: Quickly lists all registered commands and their corresponding handler classes.
* **Permission Control**: Only players or admins with the`CommandInspector.use` permission can use this command, ensuring server security.
* **Ease of Use**: With a simple command, you can obtain comprehensive information about plugin commands.

## Download plugin 📦

Github: [https://github.com/Evil0ctal/Minecraft-Server-Command-Inspector/releases](https://github.com/Evil0ctal/Minecraft-Server-Command-Inspector/releases)
Spigotmc: [https://www.spigotmc.org/resources/minecraft-server-command-inspector-commandinspector.115121/](https://www.spigotmc.org/resources/minecraft-server-command-inspector-commandinspector.115121/)

## Installation Guide 🛠️

1. Ensure your server is running on**Paper** as the server backend.
2. Place the**CommandInspector** plugin's`.jar` file into your server's`plugins` directory.
3. Restart the server.

## How to Use 📚

* **In-Game Usage**: Enter`/commandinspector listall` to invoke.
* **Console Usage**: Directly enter`listall` to invoke.

## Permission Settings 🔐

* **`CommandInspector.use`**: This permission allows a player or admin to execute the`listall` command, typically granted to server admins.

## Screenshots 📸

> Insufficient Permissions

![](https://github.com/Evil0ctal/Minecraft-Server-Command-Inspector/blob/master/screenshot/2024-02-17_04-39-31.png?raw=true)

> In-Game Invocation

![](https://github.com/Evil0ctal/Minecraft-Server-Command-Inspector/blob/master/screenshot/2024-02-17_04-40-55.png?raw=true)

> Console Invocation

![](https://github.com/Evil0ctal/Minecraft-Server-Command-Inspector/blob/master/screenshot/2024-02-17_04-42-00.png?raw=true)

## FAQ ❓

* **Q: What if the plugin command does not respond?**
  * A: First, ensure that the player or executor has been correctly assigned the`CommandInspector.use` permission. Next, verify that the plugin has been correctly loaded (this can be checked through the server startup logs).
* **Q: How can I check if the plugin has successfully loaded?**
  * A: Search for the phrase`CommandInspector is enabled` in the server startup logs. If it appears, it indicates that the plugin has been successfully loaded.

## Contact & Support 📢

* **GitHub**:[https://github.com/Evil0ctal/Minecraft-Server-Command-Inspector](https://github.com/Evil0ctal/Minecraft-Server-Command-Inspector)

Feedback and suggestions are welcome! If you like this plugin, consider giving it a ⭐️ to show your support!
