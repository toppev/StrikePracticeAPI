package ga.strikepractice.events;

import org.bukkit.entity.Player;

import ga.strikepractice.fights.botduel.BotDuel;
import ga.strikepractice.npc.CitizensNPC;
import net.citizensnpcs.api.npc.NPC;

public class BotDuelEndEvent extends FightEndEvent {

    private final Player player;
    private final CitizensNPC bot;
    private final String winner;

    public BotDuelEndEvent(BotDuel fight, Player player, CitizensNPC bot, String winner) {
        super(fight);
        this.player = player;
        this.bot = bot;
        this.winner = winner;
    }

    public NPC getBot() {
        return this.bot.getNPC();
    }

    public Player getPlayer() {
        return this.player;
    }

    public String getWinner() {
        return this.winner;
    }

    @Override
    public BotDuel getFight() {
        return (BotDuel) super.getFight();
    }
}
