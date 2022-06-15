package Main;

import java.awt.Color;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.Role;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;


public class Commands extends ListenerAdapter implements Command_1 {
	@Override
	public void onMessageReceived(MessageReceivedEvent event) {
		String [] accept_msg = event.getMessage().getContentRaw().split(" ");
		String prefix = ".";
		
		//Will Reply with Bot is online
		if(accept_msg[0].equalsIgnoreCase(prefix + "test")) {
			event.getMessage().reply("this bot is online!").queue();}
		
		//Will send a message
		if(accept_msg[0].equalsIgnoreCase(prefix + "hi")) {
			event.getChannel().sendMessage("Hello!").queue();
		}
		//Will print out an embed with all the function
		if(accept_msg[0].equalsIgnoreCase(prefix + "commands")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setTitle("List of Commands for Period", "");
			embed.setDescription("Use the prefix . (Period). Can be upper case or lower case");
			embed.addField("test", "Respond if bot is Online", false);
			embed.addField("reply", "Bot will reply", false);
			embed.addField("addrole", "will give role to users, simply @role @user", false);
			embed.addField("removerole", "will give role to users, simply @role @user", false);
			embed.setColor(Color.BLUE);
			embed.setFooter("The server owner", event.getGuild().getOwner().getUser().getAvatarUrl());
			event.getChannel().sendMessage(embed.build()).queue();
			embed.clear();
		}
		//Will give roles to a user
		if(accept_msg[0].equalsIgnoreCase(prefix + "addrole")) {
			if(event.getMessage().getMentionedRoles().toArray().length == 1) {
				if(event.getMessage().getMentionedUsers().toArray().length==1) {
					Member member = event.getGuild().getMember(event.getMessage().getMentionedUsers().get(0));
					Role Give_Role = event.getMessage().getMentionedRoles().get(0);
					event.getGuild().addRoleToMember(member, Give_Role).queue();
					event.getMessage().reply("The Role " + Give_Role.getAsMention() + " has been given to " + member.getAsMention()).queue();
				}else {
					event.getMessage().reply("Only 1 user at a time please").queue();
				}
			}else {
				event.getMessage().reply("1 role at a time please").queue();
			}
		}
		//Will remove roles from a user
		if(accept_msg[0].equalsIgnoreCase(prefix + "removerole")) {
			if(event.getMessage().getMentionedRoles().toArray().length == 1) {
				if(event.getMessage().getMentionedUsers().toArray().length==1) {
					Member member = event.getGuild().getMember(event.getMessage().getMentionedUsers().get(0));
					Role Remove_role = event.getMessage().getMentionedRoles().get(0);
					event.getGuild().removeRoleFromMember(member, Remove_role).queue();
					event.getMessage().reply("Role has been removed " + Remove_role.getAsMention() + " to " + member.getAsMention()).queue();
				}else {
					event.getMessage().reply("Please mention only 1 user").queue();
				}
			}else {
				event.getMessage().reply("Please mention only 1 role to give").queue();
			}
		}
			}

		
			
	}
		
	




