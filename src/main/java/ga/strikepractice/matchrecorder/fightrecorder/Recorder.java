package ga.strikepractice.matchrecorder.fightrecorder;

import java.util.List;

import ga.strikepractice.fights.fightinventory.FightInventory;
import ga.strikepractice.matchrecorder.RecordedMatch;

public abstract class Recorder {

    protected RecordedMatch recordedMatch;

    public RecordedMatch getRecordedMatch() {
        return this.recordedMatch;
    }

    public void setRecordedMatch(RecordedMatch recordedMatch) {
        this.recordedMatch = recordedMatch;
    }

    public abstract void startRecording();

    public abstract RecordedMatch stopRecording(List<FightInventory> fightInventories);

}
