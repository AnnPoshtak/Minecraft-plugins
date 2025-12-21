# 🎮 Minecraft Plugins Pack

![Java](https://img.shields.io/badge/Java-17%2B-ed8b00?style=for-the-badge&logo=openjdk)
![Platform](https://img.shields.io/badge/Platform-Paper%20%2F%20Spigot-gray?style=for-the-badge&logo=spigotmc)
![Status](https://img.shields.io/badge/Status-Active%20Dev-green?style=for-the-badge)
![License](https://img.shields.io/badge/License-Educational-blue?style=for-the-badge)

## 📌 Overview

This project is a collection of custom Minecraft server plugins written in **Java**, designed for **Paper/Spigot-compatible servers**.
The main goal of the project is to experiment with server-side logic, command handling, and Bukkit/Paper API features.

---

## 🗂 Project Structure

* `commands/` — directory containing implementations of server commands.
* `Main.java` — the main plugin entry point. Responsible for initialization and command registration.
* `plugin.yml` - file with settings and command descriptions for correct configuration

---

## ✅ Available Commands

| Command | Description |
| :--- | :--- |
| `/cat` 🐱 | Spawns **10 cats** at the player’s current location. |
| `/heal_all` ❤️ | Fully restores the player’s **health** and **hunger** level. |

---

## 🚧 Planned Features

The following commands are currently under development and will be available in future releases:

- [ ] **/new_home** 🏠 — automatically builds a small box-shaped house with a bed and a chest inside.
- [ ] **/born** 🧪 — simulates a pregnancy mechanic with special effects (slowness, increased hunger loss). After completion, a "child" entity appears (villager, cat, or dog).
- [ ] **/kit** 🎒 — gives a starter kit: stone pickaxe, stone sword, 64 carrots, and a full set of iron armor.
- [ ] **/run** ⚡ — grants a speed boost effect for 3 minutes.

---

## 🛠 Requirements

* Minecraft server running **Paper** or **Spigot**.
* **Java 17+** (recommended for modern Minecraft versions).
* Proper permissions configuration on the server side.

---

## 📦 Installation

1. Compile the plugin into a `.jar` file.
2. Move the generated file into the server’s `plugins/` directory.
3. Restart the server (hot reload is not recommended for production environments).

---

## 🔐 Configuration & Permissions

At the moment, the plugin does not include a dedicated configuration file. Planned improvements include:

* Fine-grained permissions for each command.
* Enabling or disabling individual plugin modules.
* Customizable command parameters (mob count, effect duration, etc.).

---

## 📈 Project Status

> **🚀 Active development**
> This project is primarily intended for learning and experimentation with plugin architecture, server performance, and API usage. Breaking changes may occur between versions.

### ⚠ Notes

This project is created for **educational and experimental purposes**. It is not recommended to use it on large public servers without proper testing.
