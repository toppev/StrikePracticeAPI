package ga.strikepractice.events;

import ga.strikepractice.fights.party.partyfights.PartySplit;
import ga.strikepractice.party.Party;

public class PartySplitStartEvent extends FightStartEvent {

    private final Party party;

    public PartySplitStartEvent(PartySplit fight, Party party) {
        super(fight);
        this.party = party;
    }

    public Party getParty() {
        return this.party;
    }

    @Override
    public PartySplit getFight() {
        return (PartySplit) super.getFight();
    }
}
