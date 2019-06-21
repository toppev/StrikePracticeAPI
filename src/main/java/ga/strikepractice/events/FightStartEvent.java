package ga.strikepractice.events;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import ga.strikepractice.fights.Fight;

public class FightStartEvent extends Event implements Cancellable {

    private static final HandlerList handlers = new HandlerList();
    private final Fight fight;
    private boolean cancelled;

    public FightStartEvent(Fight fight) {
        this.fight = fight;
    }

    public Fight getFight() {
        return this.fight;
    }

    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    @Override
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
