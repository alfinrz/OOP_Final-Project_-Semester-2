package Main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;
import net.dv8tion.jda.api.utils.ChunkingFilter;
import net.dv8tion.jda.api.utils.MemberCachePolicy;


public class BOTStart {
	public static void main(String[]args) throws LoginException, FileNotFoundException{
		File token = new File("C:\\Users\\alfin\\eclipse-workspace\\token.txt");
		Scanner read = new Scanner(token);
		
		JDABuilder jda = JDABuilder.createDefault(read.nextLine());
        jda.setActivity(Activity.watching("Everyone use . or \\"));
        jda.setStatus(OnlineStatus.ONLINE);
        
        jda.addEventListeners(new Commands());
        jda.addEventListeners(new SlashCommands());
        jda.setChunkingFilter(ChunkingFilter.ALL);
        jda.setMemberCachePolicy(MemberCachePolicy.ALL);
        jda.enableIntents(GatewayIntent.GUILD_MEMBERS);
        jda.build();
        read.close();
	}
}
