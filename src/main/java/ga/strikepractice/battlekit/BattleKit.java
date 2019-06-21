package ga.strikepractice.battlekit;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.metadata.Metadatable;
import org.bukkit.potion.PotionEffect;

/**
 * This interface was added later, therefore it's not that well implemented and
 * many things should've been refactored
 *
 */
public interface BattleKit {

    /**
     * Save this BattleKit so StrikePractice can use it. This BattleKit will be
     * saved to the kits.yml file when the plugin gets unloaded and the BattleKit
     * will be loaded back when the plugin gets loaded again.
     */
    void saveForStrikePractice();

    /**
     * Remove this BattleKit from StrikePractice so it won't be used by
     * StrikePractice anymore
     * 
     * @return true if the BattleKit was known by StrikePractice, false if it wasn't
     *         saved for StrikePractice
     */
    boolean removeFromStrikePractice();

    boolean isStrikePracticeKit();

    void giveKitMeta(Metadatable metadatable);

    /**
     * Gives the player this BattleKit. It will call the KitSelectEvent and if it is
     * cancelled the player won't get the kit.
     * 
     * @param p
     *            player to give the BattleKit.
     */
    void giveKit(Player p);

    HashSet<Material> getBlocks();

    void fillEmptySlotsWithAir();

    /**
     * After giving a player this kit the player can not attack other players with
     * swords, fists etc.
     * 
     * @param onlyBow
     *            true for an only bow kit, otherwise false.
     */
    void setOnlyBow(boolean onlyBow);

    /**
     * Sets the boots of this kit.
     * 
     * @param boots
     *            an itemStack that will be used as the boots.
     */
    void setBoots(ItemStack boots);

    HashSet<BattleKitType> getTypes();

    void setTypes(HashSet<BattleKitType> types);

    /**
     * Sets the chestplate of this kit.
     * 
     * @param chestplate
     *            the itemStack that will be used as the chestplate.
     */
    void setChestplate(ItemStack chestplate);

    /**
     * Sets the chesplate of this kit.
     * 
     * @param helmet
     *            the itemStack that will be used as the helmet.
     */
    void setHelmet(ItemStack helmet);

    /**
     * Sets the leggings of this kit.
     * 
     * @param leggings
     *            the itemStack that will be used as the leggings.
     */
    void setLeggings(ItemStack leggings);

    /**
     * @return the chestAccess
     */
    boolean isChestAccess();

    /**
     * @param chestAccess
     *            the chestAccess to set
     */
    void setChestAccess(boolean chestAccess);

    /**
     * @return the mergedEditor
     */
    String getMergedEditor();

    /**
     * @param mergedEditor
     *            the mergedEditor to set
     */
    void setMergedEditor(String mergedEditor);

    /**
     * Sets the inventory contents of this kit. ItemStacks that will be gotten when
     * giving the kit.
     * 
     * @param inventory
     *            the list of items that will be used as inventory contents in the
     *            kit.
     */
    void setInventory(List<ItemStack> inventory);

    void setBestOf(int bestOf);

    int getBestOf();

    /**
     * @return the editable
     */
    boolean isEditable();

    /**
     * @param editable
     *            the editable to set
     */
    void setEditable(boolean editable);

    /**
     * Sets the collection of potion effects of this kit.
     * 
     * @param potions
     *            the collection of potion effects that will be applied when giving
     *            a player the kit.
     */
    void setPotions(Collection<PotionEffect> potions);

    /**
     * Usually fights will get a build arena if the BattleKit is a build BattleKit.
     * 
     * @param build
     *            true for a build BattleKit, false for not a build BattleKit.
     */
    void setBuild(boolean build);

    /**
     * Sets this BattleKit's name. Many BattleKit searches will be handled through
     * names. It might not be a good idea to have multiple BattleKits with the same
     * name.
     * 
     * @param name
     *            the name to set.
     */
    void setName(String name);

    /**
     * Gets the boots of this BattleKit.
     * 
     * @return the boots itemstack of this kit.
     */
    ItemStack getBoots();

    /**
     * Gets the leggings of this BattleKit.
     * 
     * @return the leggings itemstack of this kit.
     */
    ItemStack getLeggings();

    /**
     * Gets the chestplate of this BattleKit.
     * 
     * @return the chestplate itemstack of this kit.
     */
    ItemStack getChestplate();

    /**
     * Gets the helmet of this BattleKit.
     * 
     * @return the helmet itemstack of this kit.
     */
    ItemStack getHelmet();

    /**
     * Gets the inventory contents of this kit.
     * 
     * @return the inventory contents of this kit.
     */
    List<ItemStack> getInventory();

    /**
     * Gets a copy of the inventory contents of this kit.
     * 
     * @return the inventory contents of this kit.
     */
    ItemStack[] getInv();

    /**
     * Gets the potion effects of this kit.
     * 
     * @return potion effects of this kit.
     */
    Collection<PotionEffect> getPotions();

    /**
     * Gets the icon itemstack of this kit. Many BattleKit searches will be handled
     * through icons.
     * 
     * @return the icon itemstack of this kit.
     */
    ItemStack getIcon();

    /**
     * @return true if the kit is protected by the anticheat system
     */
    boolean isAnticheatProtected();

    /**
     * @param anticheatProtected
     *            true if the kit should be protected by the anticheat system
     */
    void setAnticheatProtected(boolean anticheatProtected);

    /**
     * Sets the icon itemstack of this kit. Many BattleKit searches will be handled
     * through icons.
     * 
     * @param icon
     *            the itemstack that will be the icon.
     */
    void setIcon(ItemStack icon);

    /**
     * Gets the name of this kit. Many BattleKit searches will be handled through
     * names.
     * 
     * @return the name of this kit.
     */
    String getName();

    /**
     * Returns true if this kit is a only bow kit.
     * 
     * @return true if this kit is a only bow kit, false if it's not.
     */
    boolean isOnlyBow();

    /**
     * When giving a player a combo BattleKit the player's MaximumNoDamageTicks will
     * be set to 2.
     * 
     * @param combo
     *            true for a combo kit, false for not a combo kit.
     */
    void setCombo(boolean combo);

    /**
     * @param elo
     *            true for a elo kit, false for not a elo kit.
     */
    void setElo(boolean elo);

    /**
     * When giving a player a horse BattleKit he will be riding a horse.
     * 
     * @param horse
     *            true for a horse kit, false for not a horse kit.
     */
    void setHorse(boolean horse);

    /**
     * Returns true if the kit is a combo kit. When giving a player a combo
     * BattleKit the player's MaximumNoDamageTicks will be set to 2.
     * 
     * @return true if the BattleKit is a combo kit, false if it's not.
     */
    boolean isCombo();

    HashSet<Material> getRollbackExtraMaterials();

    void addExtraRollbackMaterial(Material material);

    void setRollbackExtraMaterials(HashSet<Material> rollbackExtraMaterials);

    /**
     * Returns true if the BattleKit is an elo kit. Usually only used for 1v1's. Elo
     * will be calculated and given after the 1v1 normally.
     * 
     * @return true if the BattleKit is a elo kit, false if it's not.
     */
    boolean isElo();

    /**
     * Returns true if the BattleKit is a horse kit. When giving a player a horse
     * BattleKit he will be riding a horse.
     * 
     * @return true if the BattleKit is a horse kit, false if it's not.
     */
    boolean isHorse();

    void setNoHunger(boolean noHunger);

    boolean isNoHunger();

    /**
     * Returns true if the BattleKit is a build kit.
     * 
     * @return true of the BattleKit is a build kit, false if it's not.
     */
    boolean isBuild();

    boolean isStickSpawn();

    boolean isBedwars();

    void setBedwars(boolean bedwars);

    boolean isParkour();

    void setParkour(boolean parkour);

    boolean isHealthbar();

    void setHealthbar(boolean healthbar);

    void setStickSpawn(boolean stickSpawn);

    void sendFightInfo(Player p);

    String getFancyName();

}