package ga.strikepractice.events;

import org.bukkit.entity.Player;

import ga.strikepractice.fights.party.partyfights.PartyFFA;
import ga.strikepractice.party.Party;

public class PartyFFAEndEvent extends FightEndEvent {

    private final Player winner;
    private final Party party;

    public PartyFFAEndEvent(PartyFFA fight, Party party, Player winner) {
        super(fight);
        this.party = party;
        this.winner = winner;
    }

    public Party getParty() {
        return this.party;
    }

    public Player getWinner() {
        return this.winner;
    }

    @Override
    public PartyFFA getFight() {
        return (PartyFFA) super.getFight();
    }

}
