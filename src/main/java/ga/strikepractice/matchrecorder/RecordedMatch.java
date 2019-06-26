package ga.strikepractice.matchrecorder;

import java.util.Map;

import org.bukkit.configuration.serialization.ConfigurationSerializable;

import ga.strikepractice.matchrecorder.playback.PlaybackFight;
import ga.strikepractice.matchrecorder.playback.PlaybackStarter;

public class RecordedMatch extends PlaybackStarter implements ConfigurationSerializable {

    @Override
    public Map<String, Object> serialize() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public PlaybackFight startPlayback(boolean overwatch) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void stopPlayback(PlaybackFight fight) {
        // TODO Auto-generated method stub

    }
}