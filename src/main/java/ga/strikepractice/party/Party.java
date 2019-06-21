package ga.strikepractice.party;

import java.util.HashSet;
import java.util.List;

import org.bukkit.entity.Player;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.metadata.Metadatable;
import org.bukkit.scheduler.BukkitTask;

import ga.strikepractice.arena.Arena;
import ga.strikepractice.battlekit.BattleKit;
import ga.strikepractice.fights.Fight;

public interface Party {

    Party getOpponent();

    void setOpponent(Party opponent);

    HashSet<String> getInvited();

    void setInvited(HashSet<String> invited);

    boolean isInFight();

    String getDiscord();

    void setFight(Fight fight);

    Fight getFight();

    String getOwner();

    HashSet<String> getMembers();

    void setMembers(HashSet<String> members);

    BattleKit getKit();

    Arena getArena();

    PartySettings getSettings();

    BukkitTask getBroadcastTask();

    void setBroadcastTask(BukkitTask task);

    void setOwner(String newOwner);

    void disbandParty();

    void saveParty(Metadatable p);

    List<Player> getPlayers();

    void partyMessage(String msg);

    static Party getParty(Player member) {
        // No implementation here to simplify the dependencies
        return null;
    }
}