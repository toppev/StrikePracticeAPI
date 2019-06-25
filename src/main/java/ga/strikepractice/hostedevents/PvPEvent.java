package ga.strikepractice.hostedevents;

import java.util.List;

import org.bukkit.entity.Player;

/**
 * 
 * @author Toppe5
 * @since 0.1
 */
public interface PvPEvent {

    /**
     * Method to start the event.
     */
    public void start();

    /**
     * Method to force stop the event.
     */
    public void stop();

    /**
     * Check if the event has already started.
     * 
     * @return true if the event has started, false if it hasn't.
     */
    public boolean hasStarted();

    /**
     * 
     * @param p
     * @return
     */
    public static boolean isInEvent(Player p) {
        return false;
    }

    public static String getEventString(Player p) {
        return null;
    }

    public static PvPEvent getEvent(Player p) {
        return null;
    }

    public static List<PvPEvent> getCurrentPvPEvents() {
        return null;
    }
}
