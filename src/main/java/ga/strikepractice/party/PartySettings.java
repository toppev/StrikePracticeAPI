package ga.strikepractice.party;

import org.bukkit.inventory.Inventory;

public interface PartySettings {

    /**
     * @return the publicParty
     */
    boolean isPublicParty();

    /**
     * @param publicParty
     *            the publicParty to set
     */
    void setPublicParty(boolean publicParty);

    /**
     * @return the maxPlayerLimit
     */
    int getMaxPlayerLimit();

    /**
     * @param maxPlayerLimit
     *            the maxPlayerLimit to set
     */
    void setMaxPlayerLimit(int maxPlayerLimit);

    boolean isOpenParty();

    void setOpenParty(boolean openParty);

    void updateMenu();

    Inventory getSettingsMenu();

}