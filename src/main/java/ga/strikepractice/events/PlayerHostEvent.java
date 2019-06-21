package ga.strikepractice.events;

import org.bukkit.command.CommandSender;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class PlayerHostEvent extends Event implements Cancellable {

    private static final HandlerList handlers = new HandlerList();
    private final String event;
    private final CommandSender host;
    private boolean cancelled;

    public PlayerHostEvent(String event, CommandSender host) {
        this.event = event;
        this.host = host;
    }

    public String getPvPEventName() {
        return this.event;
    }

    public CommandSender getHost() {
        return this.host;
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
