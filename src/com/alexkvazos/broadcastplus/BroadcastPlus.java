package com.alexkvazos.broadcastplus;

import java.util.ArrayList;
import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public final class BroadcastPlus extends JavaPlugin{

	//Actions to perform when enabled/disabled
	public void onEnable(){}
	public void onDisable(){}
	
	
	
	//Command Handler
		public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
			if (cmd.getName().equalsIgnoreCase("bcplus") && sender.hasPermission("broadcastplus.use") && args.length >=2) {
					ArrayList<String> arguments = new ArrayList<String>(Arrays.asList(args));
					
					//Array Builder
					String text = "";
					for(int x = 1; x < arguments.size(); x++){
					text += " " + arguments.get(x);
					}
					text=text.replaceAll("&([a-z0-9])","§$1");
					Bukkit.broadcastMessage(ChatColor.GOLD+"["+ChatColor.GREEN+args[0]+ChatColor.GOLD+"] "+text);
				return true;
			}
		return false;
		}
}

