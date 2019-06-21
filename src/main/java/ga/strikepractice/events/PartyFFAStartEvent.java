package ga.strikepractice.events;

import ga.strikepractice.fights.party.partyfights.PartyFFA;
import ga.strikepractice.party.Party;

public class PartyFFAStartEvent extends FightStartEvent {

    private final Party party;

    public PartyFFAStartEvent(PartyFFA fight, Party party) {
        super(fight);
        this.party = party;
    }

    public Party getParty() {
        return this.party;
    }

    @Override
    public PartyFFA getFight() {
        return (PartyFFA) super.getFight();
    }

}
