package ga.strikepractice.arena;

import java.util.HashSet;
import java.util.List;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;

import ga.strikepractice.fights.Fight;

/**
 * This interface was added later, therefore it's not that well implemented and
 * many things should've been refactored
 *
 */
public interface Arena {

    /**
     * Save the arena so StrikePractice can use it. The arena will be saved to the
     * arenas.yml file when the plugin gets unloaded and the arena will be loaded
     * back when the plugin gets loaded again.
     */
    void saveForStrikePractice();

    /**
     * Remove the arena from StrikePractice so it won't be used by StrikePractice
     * anymore
     * 
     * @return true if the arena was known by StrikePractice, false if it wasn't
     *         saved for StrikePractice
     */
    boolean removeFromStrikePractice();

    boolean canRollback();

    void rollbackArena(Fight fight);

    void quickRollback();

    void rollbackArena(HashSet<Material> materials);

    boolean removeWall(int blocksPerTick);

    boolean buildWall(Material material, int blocksPerTick);

    void rollbackArena(HashSet<Material> materials, boolean onlyFightMeta, boolean fastLiquid);

    /**
     * @param using
     *            true for using, false for not using.
     */
    void setUsing(boolean using, Fight fight);

    /**
     * Gets whether this arena is used or not.
     * 
     * @return true if the arena is used, false if it's not.
     */
    boolean isUsing();

    /**
     * Gets whether this arena is a build arena or not.
     * 
     * @return true if the arena is a build arena, false if it's not.
     */
    boolean isBuild();

    /**
     * @return the ffa
     */
    boolean isFFA();

    /**
     * @param ffa
     *            the ffa to set
     */
    void setFFA(boolean ffa);

    /**
     * Gets whether this arena needs to be restored or not. If this arena won't be
     * rolled back after a fight it might be destroyed.
     * 
     * @return true if this arena needs to be restored, false if it doesn't.
     */
    boolean needsRollback();

    /**
     * @param build
     *            true for build arena, false for not build arena.
     */
    void setBuild(boolean build);

    /**
     * Gets the first location of this arena.
     * 
     * @return location of the first spawn of this arena.
     */

    Location getLoc1();

    /**
     * Gets the second location of this arena.
     * 
     * @return location of the second spawn of this arena.
     */
    Location getLoc2();

    /**
     * Gets the center of this arena.
     * 
     * @return location of the center spawn of this arena.
     */
    Location getCenter();

    boolean hasWall();

    /**
     * @return the kits
     */
    List<String> getKits();

    void setUsing(boolean using);

    /**
     * @param kits
     *            the kits to set
     */
    void setKits(List<String> kits);

    /**
     * Gets the name of this arena.
     * 
     * @return name of this arena.
     */
    String getName();

    /**
     * @return the displayName
     */
    String getDisplayName();

    /**
     * @param displayName
     *            the displayName to set
     */
    void setDisplayName(String displayName);

    /**
     * Sets the first spawn of this arena. For example 1v1's use this location.
     * 
     * @param loc1
     *            Location that will be the first spawn.
     */
    void setLoc1(Location loc1);

    /**
     * Sets the second spawn of this arena. For example 1v1's use this location.
     * 
     * @param loc2
     *            Location that will be the second spawn.
     */
    void setLoc2(Location loc2);

    void setCorner1(Location corner1);

    void setCorner2(Location corner2);

    Location getCorner1();

    Location getCorner2();

    void setCurrentFight(Fight currentFight);

    /**
     * Sets the center spawn of this arena. For example Party FFA will use this
     * spawn.
     * 
     * @param center
     *            Location that will be the center spawn.
     */
    void setCenter(Location centre);

    /**
     * @return the currentFight
     */
    Fight getCurrentFight();

    int getCustomMaxChangesPerTick();

    void setCustomMaxChangesPerTick(int customMaxChangePerTick);

    void sendPossibleWrongWorldInfo(Player p);

    void removeItems();

}