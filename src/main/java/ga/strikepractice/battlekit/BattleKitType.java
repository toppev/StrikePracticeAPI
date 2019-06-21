package ga.strikepractice.battlekit;

public enum BattleKitType {

    ANY, DUEL, BOT_FIGHT, QUEUE, PARTY_VS_PARTY, PARTY_FFA, PARTY_SPLIT, PREMIUM_QUEUE;

    /**
     * Converts user input-like String to a BattleKitType. Only checks if the given
     * String contains a word related to specific type (e.g. "bot" or "split")
     * 
     * @return the {@link BattleKitType} or null
     */
    public static BattleKitType byName(String str) {
        if (str.contains("any")) {
            return BattleKitType.ANY;
        }
        if (str.contains("ffa")) {
            return BattleKitType.PARTY_FFA;
        }
        if (str.contains("split")) {
            return BattleKitType.PARTY_SPLIT;
        }
        if (str.contains("party")) {
            return BattleKitType.PARTY_VS_PARTY;
        }
        if (str.contains("duel")) {
            return BattleKitType.DUEL;
        }
        if (str.contains("bot")) {
            return BattleKitType.BOT_FIGHT;
        }
        if (str.contains("queue")) {
            return BattleKitType.QUEUE;
        }
        if (str.contains("premium")) {
            return BattleKitType.PREMIUM_QUEUE;
        }
        return null;
    }
}
