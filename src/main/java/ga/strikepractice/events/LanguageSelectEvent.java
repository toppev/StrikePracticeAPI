package ga.strikepractice.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class LanguageSelectEvent extends Event implements Cancellable {

    private static final HandlerList handlers = new HandlerList();
    private final Player player;
    private String language;
    private boolean cancelled;

    public LanguageSelectEvent(Player p, String language) {
        this.player = p;
        this.language = language;
    }

    public String getLanguage() {
        return this.language;
    }

    public Player getPlayer() {
        return this.player;
    }

    public void setLanguage(String language) {
        this.language = language;
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