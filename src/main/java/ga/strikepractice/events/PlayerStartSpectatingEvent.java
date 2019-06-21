package ga.strikepractice.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import ga.strikepractice.fights.Fight;

public class PlayerStartSpectatingEvent extends Event implements Cancellable {

    private static final HandlerList handlers = new HandlerList();
    private boolean cancelled;
    private final Player player;
    private final Fight fight;

    public PlayerStartSpectatingEvent(Player player, Fight fight) {
        this.player = player;
        this.fight = fight;
    }

    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    public Player getPlayer() {
        return this.player;
    }

    public Fight getFight() {
        return this.fight;
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
