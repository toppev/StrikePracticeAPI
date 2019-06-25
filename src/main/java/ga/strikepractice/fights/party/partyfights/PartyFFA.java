package ga.strikepractice.fights.party.partyfights;

import java.util.HashSet;

import ga.strikepractice.fights.Fight;
import ga.strikepractice.party.Party;

public interface PartyFFA extends Fight {

    /**
     * @return the party
     */
    Party getParty();

    /**
     * @return the alive
     */
    HashSet<String> getAlive();

}