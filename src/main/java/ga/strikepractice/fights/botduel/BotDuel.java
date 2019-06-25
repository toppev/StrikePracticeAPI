package ga.strikepractice.fights.botduel;

import ga.strikepractice.fights.BotFight;
import ga.strikepractice.fights.Fight;
import ga.strikepractice.fights.duel.BestOf;
import ga.strikepractice.npc.CitizensNPC;

public interface BotDuel extends BotFight, Fight {

    /**
     * Gets the first player of this duel.
     * 
     * @return the first player of this duel.
     */
    String getP1();

    CitizensNPC getP2();

    BestOf getBestOf();

    void setBestOf(BestOf bestOf);

}