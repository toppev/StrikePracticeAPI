package ga.strikepractice.fights;

import org.bukkit.metadata.Metadatable;

import ga.strikepractice.npc.CitizensNPC.Difficulty;

public interface BotFight {

    Difficulty getDifficulty();

    void setDifficulty(Difficulty difficulty);

    void handleBotDeath(Metadatable ent);

}