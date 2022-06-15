package Main;

import java.awt.Color;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class SlashCommands extends ListenerAdapter implements Command_1 {
	@Override
	public void onMessageReceived(MessageReceivedEvent event) {
		String [] args = event.getMessage().getContentRaw().split(" ");
		String prefix = "\\" ;
			//Will print out an embed with all the function
			if(args[0].equalsIgnoreCase(prefix + "commands")) {
				EmbedBuilder embed = new EmbedBuilder();
				embed.setTitle("List of Commands", "");
				embed.setDescription("Use the prefix \\ (backslash)");
				embed.addField("testing", "will reply to you", false);
				embed.addField("ahsan", "will greet", false);
				embed.addField("adrian", "will greet", false);
				embed.addField("edi", "will greet", false);
				embed.setColor(Color.PINK);
				embed.setFooter("This BOT is created by <Alfin>", event.getGuild().getOwner().getUser().getAvatarUrl());
				event.getChannel().sendMessage(embed.build()).queue();
				embed.clear();
				}
			//Will Reply with bot is online
			if(args[0].equalsIgnoreCase(prefix + "testing")) {
				event.getMessage().reply("this bot is online!").queue();}
			
			//Will reply with Teehee
			if(args[0].equalsIgnoreCase(prefix + "ahsan")) {
				event.getChannel().sendMessage("Teehee").queue();
				}
			//Will reply with Wassup
			if(args[0].equalsIgnoreCase(prefix + "adrian")) {
				event.getChannel().sendMessage("Wassup").queue();
				}
			//Say hello
			if(args[0].equalsIgnoreCase(prefix + "edi")) {
				event.getChannel().sendMessage("SHAP!").queue();
				}
	}
       
    
}