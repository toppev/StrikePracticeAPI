package ga.strikepractice.matchrecorder.playback;

import java.util.UUID;

public abstract class PlaybackStarter {

    protected UUID uuid;

    public abstract PlaybackFight startPlayback(boolean overwatch);

    public abstract void stopPlayback(PlaybackFight fight);

    public UUID getUUID() {
        if (this.uuid == null) {
            this.uuid = UUID.randomUUID();
        }
        return this.uuid;
    }

}
