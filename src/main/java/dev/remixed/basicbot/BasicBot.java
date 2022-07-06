package dev.remixed.basicbot;

import dev.remixed.basicbot.commands.AnnounceCommand;
import dev.remixed.basicbot.commands.BasicBotCommand;
import dev.remixed.basicbot.commands.EmbedCommand;
import dev.remixed.basicbot.utils.Config;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.entities.Guild;

import javax.security.auth.login.LoginException;

public class BasicBot {

    public static void main(String[] args) throws LoginException, InterruptedException {

        JDA basicbot = JDABuilder.createDefault(Config.Token)
                .setActivity(Activity.playing("with your mom"))
                .setStatus(OnlineStatus.DO_NOT_DISTURB)
                .addEventListeners(
                        new AnnounceCommand(),
                        new BasicBotCommand(),
                        new EmbedCommand(),
                        new BasicBotCommand()
                )
                .build().awaitReady();

        Guild guild = basicbot.getGuildById(Config.ServerID);

        if (guild != null) {
            guild.upsertCommand("basicbot", "Basic Bot Command!").queue();
            guild.upsertCommand("announce", "Announce Command!").queue();
            guild.upsertCommand("basicembed", "Basic Embed Command!").queue();
        }

    }
}
