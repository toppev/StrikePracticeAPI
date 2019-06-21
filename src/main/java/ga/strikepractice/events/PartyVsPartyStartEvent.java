package ga.strikepractice.events;

import ga.strikepractice.fights.party.partyfights.PartyVsParty;
import ga.strikepractice.party.Party;

public class PartyVsPartyStartEvent extends FightStartEvent {

    private final Party challangerParty;
    private final Party enemyParty;

    public PartyVsPartyStartEvent(PartyVsParty fight, Party challengerParty, Party enemyParty) {
        super(fight);
        this.challangerParty = challengerParty;
        this.enemyParty = enemyParty;
    }

    public Party getChallangerParty() {
        return this.challangerParty;
    }

    public Party getEnemyParty() {
        return this.enemyParty;
    }

    @Override
    public PartyVsParty getFight() {
        return (PartyVsParty) super.getFight();
    }

}
