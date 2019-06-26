package ga.strikepractice.fights.party.partyfights;

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
import ga.strikepractice.npc.CitizensNPC;
import ga.strikepractice.npc.CitizensNPC.Difficulty;

/**
 * Placeholder class since there's no interface
 *
 */
public class PartyVsBots implements Fight {

    public HashMap<CitizensNPC, Boolean> getBotsTeam() {
        return null;
    }

    public HashSet<String> getPlayersTeam() {
        return null;
    }

    public HashSet<String> getPlayersAlive() {
        return null;
    }

    public HashSet<CitizensNPC> getBotsAlive() {
        return null;
    }

    public Difficulty getDifficulty() {
        return null;
    }

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