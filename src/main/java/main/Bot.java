package main;

import configurations.Config;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class Bot {

public Bot() {
    
}
        public static void main(String[] arguments) throws Exception
        {
            Config config = new Config();

            JDA api = JDABuilder.createDefault(config.getToken()).build();
        }
    }
