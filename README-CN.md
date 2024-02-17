# Minecraft-Server-Command-Inspector（CommandInspector）🔍

自述文档语言: [English](./README.md) | [简体中文](./README-CN.md)

## 这是什么? 🤔

假设你的服务器运行在Paper服务端，并且你安装了大量的服务器插件，这会导致一个后果：同一个指令可能被多个插件注册并且监听。🤹

比如CMI插件与EssentialsX插件或者AdvancedTeleport插件在一起时，你输入`/spawn`指令，由于插件启动顺序不同，指令会被其中一个插件所执行。但是由于插件并没有输出任何日志，这个时候判断指令调用的插件就成为了一个很痛苦的事情。你需要使用排除法去找出真正的插件。使用**CommandInspector**则可以帮助你获取到所有的插件指令以及他们的注册类名，帮助你高效地debug大型Minecraft服务器。🚀

## 功能特色 ✨

* **全面检测**：快速列出所有已注册的指令及其对应的处理类。
* **权限控制**：只有拥有`CommandInspector.use`权限的玩家或管理员才能使用此指令，保障服务器安全。
* **简单易用**：通过简单的命令，即可获取全面的插件指令信息。

## 下载插件 📦

Github: [https://github.com/Evil0ctal/Minecraft-Server-Command-Inspector/releases](https://github.com/Evil0ctal/Minecraft-Server-Command-Inspector/releases)

## 安装指南 🛠️

1. 确保您的服务器运行在**Paper**作为服务器后端。
2. 将**CommandInspector**插件的`.jar`文件放入您的服务器的`plugins`目录下。
3. 重启服务器。

## 使用教程 📚

* **游戏内使用**：输入`/commandinspector listall`可进行调用。
* **控制台使用**：直接输入`listall`即可进行调用。

## 权限设置 🔐

* **`CommandInspector.use`**：此权限允许玩家或管理员执行`listall`命令，通常赋予服务器管理员。

## 截图 📸

> 权限不足无法调用

![](https://github.com/Evil0ctal/Minecraft-Server-Command-Inspector/blob/master/screenshot/2024-02-17_04-39-31.png?raw=true)

> 游戏内调用

![](https://github.com/Evil0ctal/Minecraft-Server-Command-Inspector/blob/master/screenshot/2024-02-17_04-40-55.png?raw=true)

> 控制台调用

![](https://github.com/Evil0ctal/Minecraft-Server-Command-Inspector/blob/master/screenshot/2024-02-17_04-42-00.png?raw=true)

## 常见问题 FAQ ❓

* **Q: 插件指令没有反应怎么办？**
  * A: 请首先检查玩家或执行者是否被正确赋予了`CommandInspector.use`权限。其次，确保插件已正确加载（可通过服务器启动日志验证）。
* **Q: 如何查看插件是否成功加载？**
  * A: 在服务器启动日志中搜索`CommandInspector is enabled`字样，若出现，则表示插件已成功加载。

## 联系方式 & 支持 📢

* **GitHub**：[https://github.com/Evil0ctal/Minecraft-Server-Command-Inspector](https://github.com/Evil0ctal/Minecraft-Server-Command-Inspector)

欢迎提供反馈和建议！如果你喜欢这个插件，不妨给个⭐️支持一下吧！
