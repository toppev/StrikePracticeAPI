package ga.strikepractice.fights.fightinventory;

import java.util.Collection;
import java.util.UUID;

import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;

public interface FightInventory {

    void save();

    /**
     * Building the actual inventory. It will rebuild and save the new inventory if
     * one already exists.
     * 
     * @param p
     *            the player viewing
     * @return the built inventory.
     */
    Inventory build(Player p);

    int getSlots();

    @Override
    String toString();

    int getPotionsLeft();

    /**
     * Gets the UUID of this FightInventory. Not the player's UUID.
     * 
     * @return UUID of this FightInventory.
     */
    UUID getUUID();

    /**
     * Gets the health that is stored in this FightInventory.
     * 
     * @return stored health in this FightInventory.
     */
    double getHealth();

    /**
     * Sets the health that is used in this FightInventory.
     * 
     * @param health
     *            stored health in this FightInventory.
     */
    void setHealth(double health);

    /**
     * Gets the potion effects of this FightInventory.
     * 
     * @return potion effects of this FightInventory.
     */
    Collection<PotionEffect> getEffects();

    /**
     * Gets the owner of this FightInventory.
     * 
     * @return the owner's name
     */
    String getOwner();

    /**
     * Gets the player's inventory contents when this FightInventory was saved.
     * 
     * @return an array of items in player's inventory when this FightInventory was
     *         saved
     */
    ItemStack[] getMainInv();

    /**
     * Gets if the player was dead when this FightInventory was saved.
     * 
     * @return true if the player was dead, otherwise false
     */
    boolean isDead();

    /**
     * Gets the player's food level when this FightInventory was saved.
     * 
     * @return the food level of the player when this FightInventory was saved.
     */
    int getFood();

    /**
     * Gets the helmet of the player when this FightInventory was saved.
     * 
     * @return the itemstack in the player's helmet slot when this FightInventory
     *         was saved.
     */
    ItemStack getHelmet();

    /**
     * Gets the chestplate of the player when this FightInventory was saved.
     * 
     * @return the itemstack in the player's chestplate slot when this
     *         FightInventory was saved.
     */
    ItemStack getChestplate();

    boolean createdLongTimeAgo();

    /**
     * Gets the leggings of the player when this FightInventory was saved.
     * 
     * @return the itemstack in the player's leggings slot when this FightInventory
     *         was saved.
     */
    ItemStack getLeggings();

    /**
     * Gets the boots of the player when this FightInventory was saved.
     * 
     * @return the itemstack in the player's boots slot when this FightInventory was
     *         saved.
     */
    ItemStack getBoots();

    /**
     * Sets the inventory contents that will be shown as the player's inventory
     * contents in the FightInventory.
     * 
     * @param mainInv
     *            the mainInv to set
     */
    void setMainInv(ItemStack[] mainInv);

    /**
     * Sets if the player should be shown as dead in the FightInventory. If true the
     * health won't be shown.
     * 
     * @param dead
     *            the dead to set
     */
    void setDead(boolean dead);

    /**
     * Sets the potion effects of this FightInventory.
     * 
     * @param effects
     *            the effects to set
     */
    void setEffects(Collection<PotionEffect> effects);

    /**
     * Sets the food level of this FightInventory.
     * 
     * @param food
     *            the food to set
     */
    void setFood(int food);

    /**
     * Sets the helmet of this FightInventory.
     * 
     * @param helmet
     *            the helmet to set
     */
    void setHelmet(ItemStack helmet);

    /**
     * Sets the chesplate of this FightInventory.
     * 
     * @param chestplate
     *            the chestplate to set
     */
    void setChestplate(ItemStack chestplate);

    /**
     * Sets the leggings of this FightInventory.
     * 
     * @param leggings
     *            the leggings to set
     */
    void setLeggings(ItemStack leggings);

    /**
     * Sets the boots of this FightInventory.
     * 
     * @param boots
     *            the boots to set
     */
    void setBoots(ItemStack boots);

    /**
     * @param uuid
     *            the uuid to set
     */
    void setUUID(UUID uuid);

    /**
     * @param owner
     *            the owner to set
     */
    void setOwner(String owner);

    /**
     * @return the ownerUUID
     */
    UUID getOwnerUUID();

    /**
     * @param ownerUUID
     *            the ownerUUID to set
     */
    void setOwnerUUID(UUID ownerUUID);

    void setNextInventory(FightInventory nextInventory);

    FightInventory getNextInventory();

}