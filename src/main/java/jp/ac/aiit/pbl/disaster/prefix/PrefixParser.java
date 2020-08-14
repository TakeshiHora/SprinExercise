package jp.ac.aiit.pbl.disaster.prefix;

import jp.ac.aiit.pbl.disaster.DisasterCategory;

import java.time.LocalDateTime;

public class PrefixParser {


    public Prefix parse(String qzMessage){
        Prefix prefix = new Prefix();
        prefix.setPreamble(Preamble.getById(qzMessage.substring(0,8)));
        prefix.setMessageType(MessageType.getById(Integer.parseInt( qzMessage.substring(8,14),2)));
        prefix.setReportClassification(ReportClassification.getById(Integer.parseInt(qzMessage.substring(14,17),2)));
        prefix.setDisasterCategory(DisasterCategory.getById(Integer.parseInt(qzMessage.substring(17,21),2)));
        prefix.setReportTime(toLocalDateTime(qzMessage.substring(21,41)));
        prefix.setInformationType(InformationType.getById(Integer.parseInt(qzMessage.substring(41,43),2)));
        prefix.setSpare1(qzMessage.substring(43,53));
        return prefix;

    }

    private LocalDateTime toLocalDateTime(String message){
        int month = Integer.parseInt(message.substring(0,4),2);
        int day = Integer.parseInt(message.substring(4,9),2);
        int hour = Integer.parseInt(message.substring(9,14),2);
        int minute  = Integer.parseInt(message.substring(14,20),2);
        return LocalDateTime.of(LocalDateTime.now().getYear(),month,day,hour,minute);
    }
}
