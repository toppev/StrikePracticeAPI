package ga.strikepractice.events;

import ga.strikepractice.fights.party.partyfights.PartyVsBots;
import ga.strikepractice.party.Party;

public class PartyVsBotsStartEvent extends FightStartEvent {

    private final Party party;

    public PartyVsBotsStartEvent(PartyVsBots fight, Party party) {
        super(fight);
        this.party = party;
    }

    public Party getParty() {
        return this.party;
    }

    @Override
    public PartyVsBots getFight() {
        return (PartyVsBots) super.getFight();
    }
}
