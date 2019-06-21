package ga.strikepractice.events;

import ga.strikepractice.fights.party.partyfights.PartyVsParty;
import ga.strikepractice.party.Party;

public class PartyVsPartyEndEvent extends FightEndEvent {

    private final Party winner;
    private final Party loser;

    public PartyVsPartyEndEvent(PartyVsParty fight, Party winner, Party loser) {
        super(fight);
        this.winner = winner;
        this.loser = loser;
    }

    public Party getLoser() {
        return this.loser;
    }

    public Party getWinner() {
        return this.winner;
    }

    @Override
    public PartyVsParty getFight() {
        return (PartyVsParty) super.getFight();
    }

}
