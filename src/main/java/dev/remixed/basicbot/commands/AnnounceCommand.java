package dev.remixed.basicbot.commands;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.components.ActionRow;
import net.dv8tion.jda.api.interactions.components.Modal;
import net.dv8tion.jda.api.interactions.components.text.TextInput;
import net.dv8tion.jda.api.interactions.components.text.TextInputStyle;
import org.jetbrains.annotations.NotNull;

public class AnnounceCommand extends ListenerAdapter {

    @Override
    public void onSlashCommandInteraction(@NotNull SlashCommandInteractionEvent event) {

        if (event.getName().equals("announce")) {

               TextInput title = TextInput.create("announcement-title", "Announcement Title", TextInputStyle.SHORT)
                        .setRequired(true)
                        .setMinLength(1)
                        .setPlaceholder("Your announcement title!")
                        .build();

                TextInput announcement = TextInput.create("announcement-message", "Announcement Message", TextInputStyle.PARAGRAPH)
                        .setMinLength(10)
                        .setMaxLength(4000)
                        .setRequired(true)
                        .setPlaceholder("Your announcement message!")
                        .build();

                Modal announcementmodal = Modal.create("announcement-modal", "Announcement")
                        .addActionRows(ActionRow.of(title), ActionRow.of(announcement))
                        .build();


                event.replyModal(announcementmodal).queue();

        }
    }
}
