package ga.strikepractice.fights.duel;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.entity.Player;

public interface BestOf {

    /**
     * 
     * @param uuid
     * @return whether the match ends
     */
    boolean handleWin(UUID uuid);

    void message(Player p1, Player p2);

    void message(Player p1, UUID fakeBotUUIDForBestOf, String name2);

    int getRounds();

    int getCurrentRound();

    HashMap<UUID, Integer> getWins();

    int getWins(Player p);

    int getBotWins(Player p);

    boolean endsNow(UUID dead);

}
