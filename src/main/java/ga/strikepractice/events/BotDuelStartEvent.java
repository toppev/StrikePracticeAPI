package ga.strikepractice.events;

import org.bukkit.entity.Player;

import ga.strikepractice.fights.botduel.BotDuel;
import ga.strikepractice.npc.CitizensNPC;
import net.citizensnpcs.api.npc.NPC;

public class BotDuelStartEvent extends FightStartEvent {

    private final Player player;
    private final CitizensNPC bot;

    public BotDuelStartEvent(BotDuel fight, Player player, CitizensNPC bot) {
        super(fight);
        this.player = player;
        this.bot = bot;
    }

    public NPC getBot() {
        return this.bot.getNPC();
    }

    public Player getPlayer() {
        return this.player;
    }

    @Override
    public BotDuel getFight() {
        return (BotDuel) super.getFight();
    }

}
