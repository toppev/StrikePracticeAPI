package ga.strikepractice.matchrecorder.playback;

import java.util.HashMap;
import java.util.HashSet;
import java.util.UUID;

import org.bukkit.entity.Player;

import ga.strikepractice.arena.Arena;
import ga.strikepractice.arena.CachedBlockChange;
import ga.strikepractice.battlekit.BattleKit;
import ga.strikepractice.fights.Fight;
import ga.strikepractice.fights.FightStatistics;
import ga.strikepractice.fights.MatchDurationLimit;

/**
 * Placeholder class
 *
 */
public class PlaybackFight implements Fight {

    @Override
    public void start() {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean allowSpectating() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Arena getArena() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setArena(Arena arena) {
        // TODO Auto-generated method stub

    }

    @Override
    public void setKit(BattleKit kit) {
        // TODO Auto-generated method stub

    }

    @Override
    public FightStatistics getStatistics(UUID uuid) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public FightStatistics getStatistics(Player p) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public HashMap<UUID, FightStatistics> getStatistics() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean hasEnded() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean canStart() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void handleDeath(Player p) {
        // TODO Auto-generated method stub

    }

    @Override
    public void forceEnd(String reason) {
        // TODO Auto-generated method stub

    }

    @Override
    public BattleKit getKit() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long getStarted() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public long getEnded() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void setStartedAfterCountdown() {
        // TODO Auto-generated method stub

    }

    @Override
    public long getDuration() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public HashSet<CachedBlockChange> getBlockChanges() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public MatchDurationLimit getDurationLimit() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean addBlockChange(CachedBlockChange change) {
        // TODO Auto-generated method stub
        return false;
    }

}
