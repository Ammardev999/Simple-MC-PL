package me.ammar.simple.commands;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class Help extends Command {
    public Help() {
        super("simple");
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        if (sender instanceof ProxiedPlayer) {
            ProxiedPlayer player = (ProxiedPlayer) sender;
            player.sendMessage(new TextComponent(ChatColor.RED + "----COMMANDS----"));
            player.sendMessage(new TextComponent(ChatColor.YELLOW + "/country Displays your country name"));
            player.sendMessage(new TextComponent(ChatColor.YELLOW + "/ping Displays your live ping on the server"));
            player.sendMessage(new TextComponent(ChatColor.YELLOW + "/uid Displays your UniqueID"));
            player.sendMessage(new TextComponent(ChatColor.YELLOW + "/displayname Displays your name"));

        }
    }
}
