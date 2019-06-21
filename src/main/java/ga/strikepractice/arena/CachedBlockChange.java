package ga.strikepractice.arena;

import org.bukkit.Location;
import org.bukkit.Material;

public interface CachedBlockChange {

    void reset();

    Location getLocation();

    /**
     * @return the oldMaterial
     */
    Material getOldMaterial();

    /**
     * @return the oldData
     */
    short getOldData();

    /**
     * @return the x
     */
    int getX();

    /**
     * @return the y
     */
    int getY();

    /**
     * @return the z
     */
    int getZ();

    String toString();

}