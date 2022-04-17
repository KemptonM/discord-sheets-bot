// gonna use Discord4J
// Kempton Maillett

import discord4j.core.DiscordClientBuilder;     // build the client itself
import discord4j.core.GatewayDiscordClient;     // connect and show as online
import discord4j.core.event.domain.lifecycle.ReadyEvent;
import discord4j.core.event.domain.message.MessageCreateEvent;
import discord4j.core.object.entity.Message;
import discord4j.core.object.entity.User;


public class Bot{
    public static void main(String[] args) {
        // Construct the client
        DiscordClientBuilder bldr = DiscordClientBuilder.create("TOKEN HERE");        

        // Create a bot and show that it's online
        GatewayDiscordClient client = DiscordClientBuilder.create("TOKEN HERE")
            .build()
            .login()
            .block();

        // Listen to the ReadyEvent which tells us when we first connect
        client.getEventDispatcher().on(ReadyEvent.class).subscribe(event -> {
            // This will execute when ReadyEvent fires
            User self = event.getSelf();
            System.out.println(String.format(
                "Logged in as %s#%s"
                , self.getUsername()
                , self.getDiscriminator()
            ));
        });

        // !ping pong!
        client.getEventDispatcher().on(MessageCreateEvent.class)
            .map(MessageCreateEvent::getMessage)
            .filter(message -> message.getAuthor().map(
                user -> !user.isBot()
            ).orElse(false))
            .filter(message -> message.getContent().equalsIgnoreCase("!ping"))
            .flatMap(Message::getChannel)
            .flatMap(channel -> channel.createMessage("Pong!"))
            .subscribe();


        client.onDisconnect().block();
    }
}

// def main agreed():    // check if user agreed
    // if today's date == timeStamp:
        // if clearance == "Yes":
            // return True

// def getRealName(discordTag):
    // email = user's email from sheet
    // email.split('@', 1) // cut off after '@'
    // email.split('.')    // split first and last
    // return email

// def checkName(discordTag):   // check if user's nickname matches realName
    // realName = getRealName(discordTag)
    // try:
    //     nickName = // nickname found in server
    // except ValueError:  // if user not found in server:
        // shade the cell red
        // ERROR: User not found
    // nickName.split(' ')
    // if nickName[0] == realName[0]:   // first name match
    //     // give user membership
    // elif nickName[1] == realName[1]: // last name match
    //     // possible match
    //     // shade username yello

    // if agreed(discordTag) == True:
        // if today's date == timeStamp:
            // if Discord tag exists in server:
                // checkName(discordTag)
