package ga.strikepractice.events;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import ga.strikepractice.fights.Fight;

public class FightEndEvent extends Event {

    private static final HandlerList handlers = new HandlerList();
    private final Fight fight;

    public FightEndEvent(Fight fight) {
        this.fight = fight;
    }

    public Fight getFight() {
        return this.fight;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}