package ga.strikepractice.fights.party.partyfights;

import java.util.HashMap;
import java.util.HashSet;

import ga.strikepractice.fights.Fight;
import ga.strikepractice.npc.CitizensNPC;
import ga.strikepractice.npc.CitizensNPC.Difficulty;

public interface PartyVsBots extends Fight {

    HashMap<CitizensNPC, Boolean> getBotsTeam();

    HashSet<String> getPlayersTeam();

    HashSet<String> getPlayersAlive();

    HashSet<CitizensNPC> getBotsAlive();

    Difficulty getDifficulty();

}