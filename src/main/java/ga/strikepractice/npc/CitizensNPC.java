package ga.strikepractice.npc;

import java.util.List;
import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

import ga.strikepractice.fights.Fight;
import ga.strikepractice.matchrecorder.Damage;
import net.citizensnpcs.api.npc.NPC;

public interface CitizensNPC {

    boolean isSpawned();

    Player getBukkitEntity();

    void destroy(boolean fast);

    void destroy();

    void swingMainArm();

    NPC getNPC();

    void hurt(Damage damage);

    void setVelocity(Vector v);

    boolean teleport(Location loc);

    boolean isDestroyed();

    void startCombatTask(List<UUID> players, Fight fight, Difficulty difficulty);

    public enum Difficulty {
        EASY, NORMAL, HARD, HACKER
    }
}
