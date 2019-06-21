package ga.strikepractice.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import ga.strikepractice.hostedevents.PvPEvent;

public class PvPEventEndEvent extends Event {

    private static final HandlerList handlers = new HandlerList();
    private PvPEvent event;
    private final Player winner;

    public PvPEventEndEvent(PvPEvent event, Player winner) {
        this.event = event;
        this.winner = winner;
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

    public Player getWinner() {
        return this.winner;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

}
