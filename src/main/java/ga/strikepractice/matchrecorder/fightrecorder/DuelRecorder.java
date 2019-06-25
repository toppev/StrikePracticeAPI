package ga.strikepractice.matchrecorder.fightrecorder;

import java.util.List;

import ga.strikepractice.fights.duel.Duel;
import ga.strikepractice.fights.fightinventory.FightInventory;
import ga.strikepractice.matchrecorder.RecordedMatch;

// I just removed everything from here hehe
public class DuelRecorder extends Recorder {

    public DuelRecorder(Duel duel) {
    }

    @Override
    public void startRecording() {
    }

    @Override
    public RecordedMatch stopRecording(List<FightInventory> fightInventories) {
        return null;
    }

    public boolean hasStartedRecording() {
        return false;
    }
}
