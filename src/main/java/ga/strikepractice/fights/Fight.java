package ga.strikepractice.fights;

import java.util.HashMap;
import java.util.HashSet;
import java.util.UUID;

import org.bukkit.entity.Player;

import ga.strikepractice.arena.Arena;
import ga.strikepractice.arena.CachedBlockChange;
import ga.strikepractice.battlekit.BattleKit;

public interface Fight {

    /**
     * Starts the actual fight
     */
    void start();

    /**
     * Gets if specatting is allowed in the fight.
     * 
     * @return true if spectating is allowed in the fight, false if it's not.
     */
    boolean allowSpectating();

    /**
     * Gets the current arena of the fight.
     * 
     * @return an arena or null if the arena is invalid.
     */
    Arena getArena();

    void setArena(Arena arena);

    void setKit(BattleKit kit);

    FightStatistics getStatistics(UUID uuid);

    FightStatistics getStatistics(Player p);

    HashMap<UUID, FightStatistics> getStatistics();

    /**
     * Gets if the fight has ended, or is ending and player's are going to be
     * teleported soon. Block breaking and dropping items are also disabled when the
     * fight has been ended.
     * 
     * @return true if the fight has ended, false if it hasn't ended yet.
     */
    boolean hasEnded();

    /**
     * Gets if the fight can be started.
     * 
     * @return true if the fight can start.
     */
    boolean canStart();

    /**
     * This will be called when the player died
     * 
     * @param p
     *            player who died.
     */
    void handleDeath(Player p);

    void forceEnd(String reason);

    BattleKit getKit();

    long getStarted();

    long getEnded();

    void setStartedAfterCountdown();

    long getDuration();

    HashSet<CachedBlockChange> getBlockChanges();

    MatchDurationLimit getDurationLimit();

    /**
     * 
     * @param change
     * @return if the event should be cancelled because there's no guarantee the
     *         block will reset, mainly for performance reasons
     */
    boolean addBlockChange(CachedBlockChange change);

}