package refactoringExercices.exerice2;

/**
 * Created by ubu on 08/12/16.
 */
public class LigneDeStat {
    private Number groupAvg;
    private Number previousGroupAvg;

    public void setGroupAvg(Number groupAvg) {
        this.groupAvg = groupAvg;
    }

    public void setPreviousGroupAvg(Number previousGroupAvg) {
        this.previousGroupAvg = previousGroupAvg;
    }

    public Number getGroupAvg() {
        return groupAvg;
    }

    public Number getPreviousGroupAvg() {
        return previousGroupAvg;
    }
}
