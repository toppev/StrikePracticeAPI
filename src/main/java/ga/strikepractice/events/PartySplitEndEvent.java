package ga.strikepractice.events;

import java.util.HashSet;

import ga.strikepractice.fights.party.partyfights.PartySplit;
import ga.strikepractice.party.Party;

public class PartySplitEndEvent extends FightEndEvent {

    private final Party party;
    private final HashSet<String> losers, winners;

    public PartySplitEndEvent(PartySplit fight, Party party, HashSet<String> winners, HashSet<String> losers) {
        super(fight);
        this.party = party;
        this.losers = losers;
        this.winners = winners;
    }

    public Party getParty() {
        return this.party;
    }

    public HashSet<String> getWinners() {
        return this.winners;
    }

    public HashSet<String> getLosers() {
        return this.losers;
    }

    @Override
    public PartySplit getFight() {
        return (PartySplit) super.getFight();
    }
}
