# 🎮 Minecraft Plugins Pack

![Java](https://img.shields.io/badge/Java-17%2B-ed8b00?style=for-the-badge&logo=openjdk)
![Platform](https://img.shields.io/badge/Platform-Paper%20%2F%20Spigot-gray?style=for-the-badge&logo=spigotmc)
![Status](https://img.shields.io/badge/Status-Active%20Dev-green?style=for-the-badge)
![License](https://img.shields.io/badge/License-Educational-blue?style=for-the-badge)

## 📌 Overview

This project is a collection of custom Minecraft server plugins written in **Java**, designed for **Paper/Spigot-compatible servers**.
The main goal of the project is to experiment with server-side logic, command handling, and gameplay enhancements.

---

## ✨ Gameplay Mechanics

### 🐾 Petting Animals
You can now show love to the creatures in your world!
* **How it works:** Press **Shift + Left Click** (or Right Click) on any animal or mob.
* **Effect:** The mob will show heart particles or happy effects to indicate it's pleased.
* **Safety:** While sneaking (Shift), your clicks **will not deal damage** to the animal, making it safe to interact with them without accidental harm.

---

## ✅ Available Commands

| Command | Description |
| :--- | :--- |
| `/cat` 🐱 | Spawns **10 cats** at the player’s current location. |
| `/heal_all` ❤️ | Fully restores the player’s **health** and **hunger** level. |

---

## 🗂 Project Structure

* `commands/` — directory containing implementations of server commands.
* `Main.java` — the main plugin entry point. Responsible for initialization and registration.
* `plugin.yml` — file with settings and command descriptions.

---

## 🚧 Planned Features

The following features are currently under development:

- [ ] **/new_home** 🏠 — automatically builds a small box-shaped house with a bed and a chest inside.
- [ ] **/born** 🧪 — simulates a pregnancy mechanic with special effects.
- [ ] **/kit** 🎒 — gives a starter kit (tools, armor, and food).
- [ ] **/run** ⚡ — grants a speed boost effect for 3 minutes.

---

## 🛠 Requirements

* Minecraft server running **Paper** or **Spigot**.
* **Java 17+** (recommended for modern Minecraft versions).

---

## 📦 Installation

1. Compile the plugin into a `.jar` file.
2. Move the generated file into the server’s `plugins/` directory.
3. Restart the server.

---

## 📈 Project Status

> **🚀 Active development**
> This project is created for **educational and experimental purposes**. It is not recommended to use it on large public servers without proper testing.