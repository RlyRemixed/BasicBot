package dev.remixed.basicbot.commands;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class BasicBotCommand extends ListenerAdapter {

    @Override
    public void onSlashCommandInteraction(@NotNull SlashCommandInteractionEvent event) {

        if (event.getName().equals("basicbot")) {

            event.getInteraction().deferReply();

            event.getHook().sendMessage("**Basic Bot Template**\n\nMade by **Remixed#3964**");


        }
    }
}
