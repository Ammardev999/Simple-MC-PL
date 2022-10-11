package me.ammar.simple;

import me.ammar.simple.Listener.JoinListener;
import me.ammar.simple.commands.*;
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.plugin.Plugin;

import java.io.File;

public final class Simple extends Plugin {
    @Override
    public void onEnable() {
        // Register Commands
        getLogger().info(ChatColor.RED + "Registering Commands");
        getProxy().getPluginManager().registerCommand(this, new soceketadress());
        getLogger().info(ChatColor.GREEN + "Registered SoceketAdress");
        getProxy().getPluginManager().registerCommand(this, new DisplayName());
        getLogger().info(ChatColor.GREEN + "Registered DisplayName");
        getProxy().getPluginManager().registerCommand(this, new UniqueID());
        getLogger().info(ChatColor.GREEN + "Registered UniqueID");
        getProxy().getPluginManager().registerCommand(this, new Ping());
        getLogger().info(ChatColor.GREEN + "Registered Ping");
        getProxy().getPluginManager().registerCommand(this, new Country());
        getLogger().info(ChatColor.GREEN + "Registered Country");
        getProxy().getPluginManager().registerCommand(this, new Help());
        getLogger().info(ChatColor.GREEN + "Registered Help");

        // Register Listener
        getLogger().info(ChatColor.RED + "Registering Listener");
        getProxy().getPluginManager().registerListener(this, new JoinListener());
        getLogger().info(ChatColor.GREEN + "Registered JoinListener");
    }

    @Override
    public void onDisable() {
        getLogger().info(ChatColor.GREEN + "Saved");
    }
}
