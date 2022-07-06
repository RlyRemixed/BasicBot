package dev.remixed.basicbot.commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

import java.awt.*;

public class EmbedCommand extends ListenerAdapter {

    @Override
    public void onSlashCommandInteraction(@NotNull SlashCommandInteractionEvent event) {
        if (event.getName().equals("basicembed")) {

            EmbedBuilder BasicEmbed = new EmbedBuilder();

            BasicEmbed.setTitle("Basic Bot");
            BasicEmbed.setColor(Color.CYAN);
            BasicEmbed.addField("**Basic Bot Template**", "Made by **Remixed#3964**", false);

        }
    }
}
