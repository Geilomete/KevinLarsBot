package main;

import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.OnlineStatus;
import net.dv8tion.jda.core.entities.Game;

import javax.security.auth.login.LoginException;

public class Main {
    public static JDABuilder builder;

    public main() {
    }

    public static void main(String[] Args) {
        JDABuilder builder = new JDABuilder(AccountType.BOT);
        builder.setGame(Game.playing("-help | v.1.3.0"));
        builder.setToken(SECRETS.TOKEN);
        builder.setAutoReconnect(true);
        builder.setStatus(OnlineStatus.ONLINE);
        {
        }
        builder.setStatus(OnlineStatus.ONLINE);
        ///Listener

        builder.addEventListener(new Object[]{new commandListener()});
        builder.addEventListener(new Object[]{new voiceListener()});
        builder.addEventListener(new Object[] {new readyListener()});
        builder.addEventListener(new Object[]{new NachrichtenLog()});
        builder.addEventListener(new Object[]{new SelfMentionListener()});
        builder.addEventListener(new Object[]{new WebSchutz()});
        ///Commands
        commandHandler.commands.put("ping", new cmdPing());
        commandHandler.commands.put("help", new cmdHilfe());
        commandHandler.commands.put("m", new Music());
        commandHandler.commands.put("music", new Music());
        commandHandler.commands.put("clear", new Clear());
        commandHandler.commands.put("rechtschreibung", new Role());
        commandHandler.commands.put("hellobot", new HelloBot());
        commandHandler.commands.put("Marco", new Marco());
        commandHandler.commands.put("marco", new Marco());
        commandHandler.commands.put("say", new Say());
        commandHandler.commands.put("info", new Info());
        commandHandler.commands.put("loop", new loop());
        commandHandler.commands.put("alarm", new Alarm());
        commandHandler.commands.put("teilschenbeschleuniger", new Teilschenbeschleuniger());
        commandHandler.commands.put("game", new commands.Game());
        commandHandler.commands.put("bewerbung", new bewerbung());



        try {
            JDA var2 = builder.buildBlocking();
        } catch (LoginException var3) {
            var3.printStackTrace();
        } catch (InterruptedException var4) {
            var4.printStackTrace();

        }

    }
}
