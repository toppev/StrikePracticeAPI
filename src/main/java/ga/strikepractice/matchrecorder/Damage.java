package ga.strikepractice.matchrecorder;

public class Damage {

    private final boolean sharpness, critical, burn;

    public Damage(boolean sharpness, boolean critical, boolean burn) {
        this.sharpness = sharpness;
        this.critical = critical;
        this.burn = burn;
    }

    public boolean isBurn() {
        return this.burn;
    }

    public boolean isCritical() {
        return this.critical;
    }

    public boolean isSharpness() {
        return this.sharpness;
    }

    public static Damage fromString(String str) {
        String[] s = str.split(":");
        try {
            return new Damage(Boolean.parseBoolean(s[0]), Boolean.parseBoolean(s[1]), Boolean.parseBoolean(s[2]));
        } catch (Exception e) {
            return new Damage(false, false, false);
        }
    }

    @Override
    public String toString() {
        return this.sharpness + ":" + this.critical + ":" + this.burn;
    }
}
