package ga.strikepractice.fights.duel;

import ga.strikepractice.fights.Fight;
import ga.strikepractice.matchrecorder.fightrecorder.DuelRecorder;

public interface Duel extends Fight {
    
    
    

    DuelRecorder getRecorder();

    /**
     * Gets the first player of this duel.
     * 
     * @return the first player of this duel.
     */
    String getP1();

    boolean isPremiumQueue();

    void setPremiumQueue(boolean premiumQueue);

    /**
     * Gets the second player of this duel.
     * 
     * @return the second player of this duel.
     */
    String getP2();

    BestOf getBestOf();

    void setBestOf(BestOf bestOf);

    /**
     * Whether to teleport the player back to spawn after this duel has been ended.
     * 
     * @param doNotTeleport
     *            if true the winner won't be teleported back to spawn, if false the
     *            winner will be teleported.
     */
    void setDoNotTeleport(boolean doNotTeleport);

    /**
     * Gets if this duel is a queue fight.
     * 
     * @return true if this duel is a queue fight, false if it's not.
     */
    boolean isQueue();

    /**
     * Sets if this duel is a queue fight.
     * 
     * @param queue
     *            true for a queue fight, false for not a queue duel.
     */
    void setQueue(boolean queue);

    /**
     * Gets if the duel won't teleport the winner after the fight.
     * 
     * @return true if the winner won't be teleproted after the fight, false if the
     *         winner will be teleported after the fight.
     */
    boolean isDoNotTeleport();
}
