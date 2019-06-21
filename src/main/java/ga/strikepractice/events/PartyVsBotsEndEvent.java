package ga.strikepractice.events;

import ga.strikepractice.fights.party.partyfights.PartyVsBots;
import ga.strikepractice.party.Party;

public class PartyVsBotsEndEvent extends FightEndEvent {

    private final Party party;
    private final Winners winners;

    public PartyVsBotsEndEvent(PartyVsBots fight, Party party, Winners winners) {
        super(fight);
        this.winners = winners;
        this.party = party;
    }

    public Party getParty() {
        return this.party;
    }

    public Winners getWinners() {
        return this.winners;
    }

    @Override
    public PartyVsBots getFight() {
        return (PartyVsBots) super.getFight();
    }

    public enum Winners {
        PLAYERS, BOTS, FORCE_END;
    }
}
