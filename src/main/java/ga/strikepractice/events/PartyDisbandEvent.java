package ga.strikepractice.events;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import ga.strikepractice.party.Party;

public class PartyDisbandEvent extends Event {

    private static final HandlerList handlers = new HandlerList();
    private final Party party;

    public PartyDisbandEvent(Party party) {
        this.party = party;
    }

    public Party getParty() {
        return this.party;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
