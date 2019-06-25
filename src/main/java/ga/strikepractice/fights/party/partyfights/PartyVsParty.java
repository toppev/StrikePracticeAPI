package ga.strikepractice.fights.party.partyfights;

import java.util.HashSet;

import ga.strikepractice.fights.Fight;
import ga.strikepractice.party.Party;

public interface PartyVsParty extends Fight {

    /**
     * @return the party1
     */
    Party getParty1();

    /**
     * @return the party2
     */
    Party getParty2();

    /**
     * @return the partyAlive1
     */
    HashSet<String> getPartyAlive1();

    /**
     * @return the partyAlive2
     */
    HashSet<String> getPartyAlive2();

}