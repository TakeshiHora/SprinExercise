package jp.ac.aiit.pbl.disaster.tsunami;

import jp.ac.aiit.pbl.disaster.DisasterParser;
import jp.ac.aiit.pbl.disaster.earthquakeearlywarning.Notification;
import jp.ac.aiit.pbl.disaster.prefix.PrefixParser;

import java.util.ArrayList;
import java.util.List;

/**
 * This class parses binary number of signals of Tsunami from QZSS.
 * Each parameter is defined by the specified number of bits.
 * This class provides parse methods.
 */

public class TsunamiParser implements DisasterParser{
    
    public Tsunami parse(String qzMessage){
        Tsunami tsunami = new Tsunami();
        PrefixParser prefixParser = new PrefixParser();
        tsunami.setPrefix(prefixParser.parse(qzMessage));
        
        List<Notification> notifications = new ArrayList<>();
        notifications.add(Notification.getNotificationContent(Integer.parseInt(qzMessage.substring(53, 62),2)));
        notifications.add(Notification.getNotificationContent(Integer.parseInt(qzMessage.substring(62, 71),2)));
        notifications.add(Notification.getNotificationContent(Integer.parseInt(qzMessage.substring(71, 80),2)));
        tsunami.setNotifications(notifications);
        
        tsunami.setWarningCode(WarningCode.getTsunamiAlarmType(Integer.parseInt(qzMessage.substring(80, 84),2)));
        
        List<TsunamiRegion> tsunamiRegions = new ArrayList<>();
        
        tsunamiRegions.add(new TsunamiRegion(
                tsunami.getPrefix().getReportTime(), //reportDate
                Integer.parseInt(qzMessage.substring(84, 85), 2), //day
                Integer.parseInt(qzMessage.substring(85, 90),2),  //hour
                Integer.parseInt(qzMessage.substring(90, 96), 2), //minute
                Integer.parseInt(qzMessage.substring(96, 100), 2),
                Integer.parseInt(qzMessage.substring(100, 110),2)));
        
        tsunamiRegions.add(new TsunamiRegion(
                tsunami.getPrefix().getReportTime(), //reportDate
                Integer.parseInt(qzMessage.substring(110, 111), 2), //day
                Integer.parseInt(qzMessage.substring(111, 116),2),  //hour
                Integer.parseInt(qzMessage.substring(116, 122), 2), //minute
                Integer.parseInt(qzMessage.substring(122, 126), 2),
                Integer.parseInt(qzMessage.substring(126, 136),2)));
        
        tsunamiRegions.add(new TsunamiRegion(
                tsunami.getPrefix().getReportTime(), //reportDate
                Integer.parseInt(qzMessage.substring(136, 137), 2), //day
                Integer.parseInt(qzMessage.substring(137, 142),2),  //hour
                Integer.parseInt(qzMessage.substring(142, 148), 2), //minute
                Integer.parseInt(qzMessage.substring(148, 152), 2),
                Integer.parseInt(qzMessage.substring(152, 162),2)));
        
        tsunamiRegions.add(new TsunamiRegion(
                tsunami.getPrefix().getReportTime(), //reportDate
                Integer.parseInt(qzMessage.substring(162, 163), 2), //day
                Integer.parseInt(qzMessage.substring(163, 168),2),  //hour
                Integer.parseInt(qzMessage.substring(168, 174), 2), //minute
                Integer.parseInt(qzMessage.substring(174, 178), 2),
                Integer.parseInt(qzMessage.substring(178, 188),2)));
        
        tsunamiRegions.add(new TsunamiRegion(
                tsunami.getPrefix().getReportTime(), //reportDate
                Integer.parseInt(qzMessage.substring(188, 189), 2), //day
                Integer.parseInt(qzMessage.substring(189, 194),2),  //hour
                Integer.parseInt(qzMessage.substring(194, 200), 2), //minute
                Integer.parseInt(qzMessage.substring(200, 204), 2),
                Integer.parseInt(qzMessage.substring(204, 214),2)));
        tsunami.setTsunamiRegions(tsunamiRegions);
        
        return tsunami;
    }
}
