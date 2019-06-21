package ga.strikepractice.fights;

public class FightStatistics {

    private int hits;
    private int currentCombo;
    private int longestCombo;
    private int potionsThrow;
    private int potionsMissed;
    private double potionIntensities;

    public int getHits() {
        return this.hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public int getCurrentCombo() {
        return this.currentCombo;
    }

    public void setCurrentCombo(int currentCombo) {
        this.currentCombo = currentCombo;
        if (currentCombo > this.longestCombo) {
            this.longestCombo = currentCombo;
        }
    }

    public int getLongestCombo() {
        return this.longestCombo;
    }

    public void setLongestCombo(int longestCombo) {
        this.longestCombo = longestCombo;
    }

    public int getPotionsThrow() {
        return this.potionsThrow;
    }

    public void setPotionsThrow(int potionsThrow) {
        this.potionsThrow = potionsThrow;
    }

    public int getPotionsMissed() {
        return this.potionsMissed;
    }

    public void setPotionsMissed(int potionsMissed) {
        this.potionsMissed = potionsMissed;
    }

    public void addIntensity(double intensity) {
        this.potionIntensities += intensity;
    }

    /**
     * 
     * @return 0-100
     */
    public int getAccuracy() {
        int x = this.potionsThrow;
        if (x == 0) {
            return 0;
        }
        return (int) Math.round(Math.ceil(this.potionIntensities / x * 100));
    }

}
