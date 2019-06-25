package ga.strikepractice.fights.party.partyfights;

import java.util.HashSet;

import ga.strikepractice.fights.Fight;

public interface PartySplit extends Fight {

    /**
     * @return the alive
     */
    HashSet<String> getAlive1();

    /**
     * @return the alive2
     */
    HashSet<String> getAlive2();

    /**
     * @return the team
     */
    HashSet<String> getTeam1();

    /**
     * @return the team2
     */
    HashSet<String> getTeam2();

}