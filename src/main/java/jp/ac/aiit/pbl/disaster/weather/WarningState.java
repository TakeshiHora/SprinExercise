package jp.ac.aiit.pbl.disaster.weather;

public enum WarningState {
    ISSUE(1, "発表"),
    CANCEL(2, "解除");

    private  int id;
    private  String warningStateName;

    WarningState(int id,  String warningStateName) {
        this.id = id;
        this.warningStateName = warningStateName;
    }

    public int getId() {
        return id;
    }

    public String getValue() {
        return warningStateName;
    }

    public static WarningState getById(int id) {
        if(id == 1) {
            return ISSUE;
        } else {
            return CANCEL;
        }
    }
}
