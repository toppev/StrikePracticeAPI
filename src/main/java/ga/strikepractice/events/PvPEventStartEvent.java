package ga.strikepractice.events;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import ga.strikepractice.hostedevents.PvPEvent;

public class PvPEventStartEvent extends Event implements Cancellable {

    private static final HandlerList handlers = new HandlerList();
    private boolean cancelled;
    private PvPEvent event;

    public PvPEventStartEvent(PvPEvent event) {
        this.event = event;
    }

    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    public String getPvPEventName() {
        return this.event != null ? this.event.getClass().getSimpleName() : null;
    }

    public void setEvent(PvPEvent event) {
        this.event = event;
    }

    public PvPEvent getEvent() {
        return this.event;
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
