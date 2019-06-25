package ga.strikepractice.api;

import java.util.List;
import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import ga.strikepractice.arena.Arena;
import ga.strikepractice.battlekit.BattleKit;
import ga.strikepractice.fights.Fight;
import ga.strikepractice.party.Party;
import ga.strikepractice.stats.PlayerStats;

/**
 * Get instance of this class with {@link StrikePractice#getAPI()}
 *
 * The API was moved here because the old API is still available in
 * ga.strikepractice.StrikePracticeAPI, which is now deprecated and you should
 * use this instead.
 */
public interface StrikePracticeAPI {

    /**
     * Get the uuid of the player's current fight
     * 
     * @param p
     *            the player
     * @return the uuid or null if the fight is not being recorded
     */
    UUID getCurrentFightsPlaybackUUID(Player p);

    /**
     * Finds a replay by the given uuid and starts it
     * 
     * @param p
     *            the player
     * @param playbackUUID
     *            the uuid of the replay, not null
     * @return true if the playback/replay was found and started
     */
    boolean startPlayback(Player p, UUID playbackUUID);

    /**
     * Get the party of the player
     * 
     * @param p
     *            the player
     * @return the party of the player or null if not in any party
     */
    Party getParty(Player p);

    /**
     * Manually spawn a bot
     * 
     * @param location
     *            the location where to spawn the bot
     * @param name
     *            the name of the bot
     * @param skin
     *            the skin name of the bot
     * @param targets
     *            the players the bot will target to
     * @param difficulty
     *            the difficulty of the bot as String. Available options: EASY,
     *            NORMAL, HARD, HACKER
     * @param fight
     */
    void spawnBot(Location location, String name, String skin, List<UUID> targets, String difficulty, Fight fight);

    /**
     * Make the player win their current fight
     * 
     * @param p
     *            the player who will win the fight
     */
    void forceWin(Player p);

    /**
     * Check whether a player is in kit editor
     * 
     * @param p
     *            the player
     * @return true if the player is editing a kit, otherwise false
     */
    boolean isEditingKit(Player p);

    /**
     * Get the kit player is currently editing
     * 
     * @param p
     *            the player
     * @return the kit, or null
     */
    BattleKit getEditingKit(Player p);

    /**
     * Make the player join a queue
     * 
     * @param p
     *            the player
     * @param kit
     *            the kit whose queue the player will join
     * @param premiumQueue
     *            whether the queue is premiumQueue
     */
    void joinQueue(Player p, BattleKit kit, boolean premiumQueue);

    /**
     * /** Make the player join a queue
     * 
     * @param p
     *            the player
     * @param kit
     *            the kit whose queue the player will join
     */
    void joinQueue(Player p, BattleKit kit);

    /**
     * Join a premium queue
     * 
     * @param p
     *            the player
     * @param kit
     *            the kit whose premium queue the player will join
     */
    void joinPremiumQueue(Player p, BattleKit kit);

    /**
     * Cancel the player's current fight
     * 
     * @param p
     *            the player
     * @param reason
     *            the reason that will be sent
     */
    void cancelFight(Player p, String reason);

    /**
     * Get statistics of the player
     * 
     * @param p
     *            the player
     * @return {@link PlayerStats} of the player
     */
    PlayerStats getPlayerStats(Player p);

    /**
     * Get statistics of a player (or offline player)
     * 
     * @param uuid
     *            the uuid of the player
     * @param create
     *            whether the stats should be created if not found
     * @param async
     *            whether the stats should be created asynchronously
     * @return {@link PlayerStats} of the player
     */
    PlayerStats getPlayerStats(UUID uuid, boolean create, boolean async);

    /**
     * Clear the player's inventory, effects, fire etc
     * 
     * @param p
     *            the player
     * @param lobby
     *            whether the player should be teleported to the lobby
     * @param deselect
     *            whether the player should deselect their current kit
     */
    void clear(Player p, boolean lobby, boolean deselect);

    /**
     * Get the lobby location
     * 
     * @return the lobby location
     */
    Location getSpawnLocation();

    /**
     * Get whether a player is a spectator
     * 
     * @param p
     *            the player
     * @return true if the player is a spectator
     */
    boolean isSpectator(Player p);

    /**
     * Add the given player as a spectator
     */
    void addSpectator(Player p);

    /**
     * Make the player spectate the given target's fight
     * 
     * @param p
     *            the player who will spectator
     * @param target
     *            whose fight the player will spectate
     */
    void addSpectator(Player p, Player target);

    /**
     * Remove the player from spectator mode
     * 
     * @param p
     *            the player
     * @param clearAndTeleport
     *            whether the player should be cleared and teleproted
     */
    void removeSpectator(Player p, boolean clearAndTeleport);

    /**
     * Get whether the player is in a fight
     * 
     * @param p
     *            the player
     * @return true if the player is in a fight otherwise false
     */
    boolean isInFight(Player p);

    /**
     * Get whether the player is in an event
     * 
     * @param p
     *            the player
     * @return true if the player is in an event, otherwise false
     */
    boolean isInEvent(Player p);

    /**
     * Get the language of the player
     * 
     * @param p
     *            the player
     * @return the language as a String
     */
    String getLanguage(Player p);

    /**
     * Get whether the player's current queue or fight is ranked
     * 
     * @param p
     *            the player
     * @return true if the player is in a queue or fight and it's ranked
     */
    boolean isRanked(Player p);

    /**
     * Get whether the player is in a queue
     * 
     * @param p
     *            the player
     * @return true if the player is in a queue, otherwise false
     */
    boolean isInQueue(Player p);

    /**
     * Set the language of the player
     * 
     * @param p
     *            the player
     * @param language
     *            the language as string as it's in the message.yml
     * @param message
     *            whether the player should be notified of the language change
     */
    void setLanguage(Player p, String language, boolean message);

    /**
     * Get the current fight of the player
     * 
     * @param p
     *            the player
     * @return the fight or null if not in any fight currently
     */
    Fight getFight(Player p);

    /**
     * Get the current kit the player is wearing
     * 
     * @param p
     *            the player
     * @return the current kit of the player or null if none
     */
    BattleKit getKit(Player p);

    /**
     * Get the player's opponent
     * 
     * @return the opponent of the @param p
     */
    Player getDuelOpponent(Player p);

    /**
     * Get arena by with given name
     * 
     * @return the arena or null if not found
     */
    Arena getArena(String name);

    /**
     * Get all arenas
     * 
     * @return all arenas registered in strikepractice
     */
    List<Arena> getArenas();

    /**
     * Get kit by the given name
     * 
     * @return the kit or null if not found
     */
    BattleKit getKit(String name);

    /**
     * Get kits by the icon
     * 
     * @param icon
     *            the icon item
     * @return the kits that have same icon or null if none found
     */
    List<BattleKit> getKits(ItemStack icon);

    /**
     * Get all kits
     * 
     * @return all kits registered in strikepractice
     */
    List<BattleKit> getKits();

    /**
     * Get the StrikePractice plugin
     * 
     * @return
     */
    JavaPlugin getStrikePractice();

}