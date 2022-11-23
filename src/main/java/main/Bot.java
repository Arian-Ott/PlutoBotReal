package main;

import configurations.Config;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Bot extends ListenerAdapter {


        public static void main(String[] arguments) throws Exception
        {
            Config config = new Config();

            JDA api = JDABuilder.createDefault(config.getToken()).build();
            JDA.addEventListeners(new MyListener());


        }
    }
