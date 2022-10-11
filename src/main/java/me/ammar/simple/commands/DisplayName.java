package me.ammar.simple.commands;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class DisplayName extends Command {
    public DisplayName() {
        super("displayname");
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        if (sender instanceof ProxiedPlayer) {
            ProxiedPlayer player = (ProxiedPlayer) sender;
            player.sendMessage(new TextComponent(ChatColor.GREEN + "Your Display name is " + ChatColor.RED + player.getDisplayName()));
        }
    }
}
