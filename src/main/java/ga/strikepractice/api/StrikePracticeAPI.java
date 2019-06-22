package ga.strikepractice.api;

import java.util.List;
import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import ga.strikepractice.StrikePractice;
import ga.strikepractice.battlekit.BattleKit;
import ga.strikepractice.fights.Fight;
import ga.strikepractice.party.Party;
import ga.strikepractice.stats.PlayerStats;

/**
 * Get instance of this class with {@link StrikePractice#getAPI()}
 *
 */
public interface StrikePracticeAPI {

    UUID getCurrentFightsPlaybackUUID(Player p);

    boolean startPlayback(Player p, UUID playbackUUID);

    Party getParty(Player p);

    void spawnBot(Location location, String name, String skin, List<UUID> targets, String difficulty, Fight fight);

    void forceWin(Player p);

    boolean isEditingKit(Player p);

    BattleKit getEditingKit(Player p);

    void joinQueue(Player p, BattleKit kit, boolean premiumQueue);

    void joinQueue(Player p, BattleKit kit);

    void joinPremiumQueue(Player p, BattleKit kit);

    void cancelFight(Player p, String reason);

    PlayerStats getPlayerStats(Player p);

    PlayerStats getPlayerStats(UUID uuid, boolean create, boolean async);

    void clear(Player p, boolean lobby, boolean deselect);

    Location getSpawnLocation();

    boolean isSpectator(Player p);

    void addSpectator(Player p);

    void addSpectator(Player p, Player target);

    void removeSpectator(Player p, boolean clearAndTeleport);

    boolean isInFight(Player p);

    boolean isInEvent(Player p);

    String getLanguage(Player p);

    boolean isRanked(Player p);

    boolean isInQueue(Player p);

    void setLanguage(Player p, String language, boolean message);

    Fight getFight(Player p);

    BattleKit getKit(Player p);

    JavaPlugin getStrikePractice();

    Player getDuelOpponent(Player p);

}