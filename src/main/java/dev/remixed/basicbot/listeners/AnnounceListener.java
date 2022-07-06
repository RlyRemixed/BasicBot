package dev.remixed.basicbot.listeners;

import net.dv8tion.jda.api.events.interaction.ModalInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class AnnounceListener extends ListenerAdapter {

    @Override
    public void onModalInteraction(@NotNull ModalInteractionEvent event) {

        if (event.getModalId().equals("announcement-modal")) {

            String title = event.getValue("announcement-title").getAsString();
            String message = event.getValue("announcement-message").getAsString();

            event.reply("**" + title + "**\n\n" + message).queue();
        }
    }
}