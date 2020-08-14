package jp.ac.aiit.pbl.disaster;

import jp.ac.aiit.pbl.disaster.Disaster;

public interface DisasterParser {

    public Disaster parse(String qzMessage);
}
