package jp.ac.aiit.pbl.disaster.volcano;
import jp.ac.aiit.pbl.disaster.DisasterParser;
import jp.ac.aiit.pbl.disaster.prefix.PrefixParser;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Class for Marine parser.
 * The first,it returns Prefix.
 * The second,it returns Activity time, Warning Code and Volcano name.
 * The third,it returns 5 times of Local Government.
 */

public class VolcanoParser implements DisasterParser {

    public Volcano parse(String qzMessage){
        Volcano volcano = new Volcano();
        PrefixParser preParser = new PrefixParser();
        volcano.setPrefix(preParser.parse(qzMessage));
        volcano.setActivityTime(toActivityTime(qzMessage.substring(53,69)));
        volcano.setWarningCode(WarningCode.getById(Integer.parseInt(qzMessage.substring(69,76),2)));
        volcano.setVolcanoName(VolcanoName.getById(Integer.parseInt(qzMessage.substring(76,88),2)));

        List<LocalGovernment> governments = new ArrayList<>();

        governments.add(LocalGovernment.get(Integer.parseInt(qzMessage.substring(88,111),2)));
        governments.add(LocalGovernment.get(Integer.parseInt(qzMessage.substring(111,134),2)));
        governments.add(LocalGovernment.get(Integer.parseInt(qzMessage.substring(134,157),2)));
        governments.add(LocalGovernment.get(Integer.parseInt(qzMessage.substring(157,180),2)));
        governments.add(LocalGovernment.get(Integer.parseInt(qzMessage.substring(180,203),2)));
        volcano.setLocalGovernments(governments);
        return volcano;
    }

    private LocalDateTime toActivityTime(String message){
            int day = Integer.parseInt(message.substring(0,4),2);
            int hour = Integer.parseInt(message.substring(4,9),2);
            int minute  = Integer.parseInt(message.substring(9,15),2);
            return LocalDateTime.of(LocalDateTime.now().getYear(),LocalDateTime.now().getMonth(),day,hour,minute);
    }
}
