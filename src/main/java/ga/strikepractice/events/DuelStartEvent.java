package ga.strikepractice.events;

import org.bukkit.entity.Player;

import ga.strikepractice.battlekit.BattleKit;
import ga.strikepractice.fights.duel.Duel;

public class DuelStartEvent extends FightStartEvent {

    private final Player player1;
    private final Player player2;
    private BattleKit kit;

    public DuelStartEvent(Duel fight, Player player1, Player player2, BattleKit kit2) {
        super(fight);
        this.player1 = player1;
        this.player2 = player2;
        this.kit = kit2;
    }

    public Player getPlayer1() {
        return this.player1;
    }

    public Player getPlayer2() {
        return this.player2;
    }

    public BattleKit getKit() {
        return this.kit;
    }

    public void setKit(BattleKit kit) {
        this.kit = kit;
    }

    @Override
    public Duel getFight() {
        return (Duel) super.getFight();
    }

}
