package ga.strikepractice.events;

import org.bukkit.entity.Player;

import ga.strikepractice.fights.duel.Duel;

public class DuelEndEvent extends FightEndEvent {

    private final Player winner;
    private final Player loser;

    public DuelEndEvent(Duel fight, Player winner, Player loser) {
        super(fight);
        this.winner = winner;
        this.loser = loser;
    }

    public Player getLoser() {
        return this.loser;
    }

    public Player getWinner() {
        return this.winner;
    }

    @Override
    public Duel getFight() {
        return (Duel) super.getFight();
    }
}
