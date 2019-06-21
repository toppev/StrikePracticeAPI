package ga.strikepractice.stats;

import java.util.HashMap;

import ga.strikepractice.battlekit.BattleKit;

public interface PlayerStats {

    void checkMatchLimitUpdate(boolean rankeds, boolean unrankeds);

    void checkAndResetNow();

    int getRankedsLeft();

    int getUnrankedsLeft();

    long getLimitsUpdated();

    void setRankedsLeft(int rankedsLeft);

    void setUnrankedsLeft(int unrankedsLeft);

    boolean removeRanked();

    boolean removeUnranked();

    /**
     * @return the kills
     */
    int getKills();

    /**
     * @param kills
     *            the kills to set
     */
    void setKills(int kills);

    /**
     * @return the deaths
     */
    int getDeaths();

    /**
     * @param deaths
     *            the deaths to set
     */
    void setDeaths(int deaths);

    /**
     * @return the bracketsWins
     */
    int getBracketsWins();

    /**
     * @param bracketsWins
     *            the bracketsWins to set
     */
    void setBracketsWins(int bracketsWins);

    /**
     * @return the partyVsPartyWins
     */
    int getPartyVsPartyWins();

    /**
     * @param partyVsPartyWins
     *            the partyVsPartyWins to set
     */
    void setPartyVsPartyWins(int partyVsPartyWins);

    /**
     * @return the lMSWins
     */
    int getLMSWins();

    /**
     * @param lmsWins
     *            the lmsWins to set
     */
    void setLmsWins(int lmsWins);

    int getGlobalElo();

    int getPremiumMatches();

    void setPremiumMatches(int premiumMatches);

    /**
     * @return the elos
     */
    HashMap<String, Integer> getElos();

    /**
     * @param elos
     *            the elos to set
     */
    void setElos(HashMap<String, Integer> elos);

    boolean isOnCooldown(String tag);

    boolean isOnCooldown(String tag, boolean message);

    String getCooldownString(String tag);

    void putOnCooldown(String tag, long till);

    int getElo(String kit);

    int getElo(BattleKit kit);

    /**
     * Sync
     */
    void save();

    HashMap<String, Long> getCooldowns();

    void save(boolean async);

}