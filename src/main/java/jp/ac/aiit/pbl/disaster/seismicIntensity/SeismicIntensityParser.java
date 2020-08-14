package jp.ac.aiit.pbl.disaster.seismicIntensity;

import jp.ac.aiit.pbl.disaster.DisasterParser;
import jp.ac.aiit.pbl.disaster.prefix.PrefixParser;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * This class parses binary number of signals of SeismicIntensity from QZSS.
 * Each parameter is defined by the specified number of bits.
 * This class provides parse methods.
 */

public class SeismicIntensityParser implements DisasterParser {
    
    public SeismicIntensity parse(String qzMessage){
        SeismicIntensity seismicIntensity = new SeismicIntensity();

        PrefixParser prefixParser = new PrefixParser();
        seismicIntensity.setPrefix(prefixParser.parse(qzMessage));
    
        seismicIntensity.setOccurrenceTime(toOccurrenceTime(qzMessage.substring(53, 69)));
    
        List<SeismicIntensityRegion> seismicIntensityRegions = new ArrayList<>();
        seismicIntensityRegions.add(new SeismicIntensityRegion (
                Integer.parseInt(qzMessage.substring(69, 72), 2),
                Integer.parseInt(qzMessage.substring(72, 78), 2)));
        seismicIntensityRegions.add(new SeismicIntensityRegion (
                Integer.parseInt(qzMessage.substring(78, 81), 2),
                Integer.parseInt(qzMessage.substring(81, 87), 2)));
        seismicIntensityRegions.add(new SeismicIntensityRegion (
                Integer.parseInt(qzMessage.substring(87, 90), 2),
                Integer.parseInt(qzMessage.substring(90, 96), 2)));
        seismicIntensityRegions.add(new SeismicIntensityRegion (
                Integer.parseInt(qzMessage.substring(96, 99), 2),
                Integer.parseInt(qzMessage.substring(99, 105), 2)));
        seismicIntensityRegions.add(new SeismicIntensityRegion (
                Integer.parseInt(qzMessage.substring(105, 108), 2),
                Integer.parseInt(qzMessage.substring(108, 114), 2)));
        seismicIntensityRegions.add(new SeismicIntensityRegion (
                Integer.parseInt(qzMessage.substring(114, 117), 2),
                Integer.parseInt(qzMessage.substring(117, 123), 2)));
        seismicIntensityRegions.add(new SeismicIntensityRegion (
                Integer.parseInt(qzMessage.substring(123, 126), 2),
                Integer.parseInt(qzMessage.substring(126, 132), 2)));
        seismicIntensityRegions.add(new SeismicIntensityRegion (
                Integer.parseInt(qzMessage.substring(132, 135), 2),
                Integer.parseInt(qzMessage.substring(135, 141), 2)));
        seismicIntensityRegions.add(new SeismicIntensityRegion (
                Integer.parseInt(qzMessage.substring(141, 144), 2),
                Integer.parseInt(qzMessage.substring(144, 150), 2)));
        seismicIntensityRegions.add(new SeismicIntensityRegion (
                Integer.parseInt(qzMessage.substring(150, 153), 2),
                Integer.parseInt(qzMessage.substring(153, 159), 2)));
        seismicIntensityRegions.add(new SeismicIntensityRegion (
                Integer.parseInt(qzMessage.substring(159, 162), 2),
                Integer.parseInt(qzMessage.substring(162, 168), 2)));
        seismicIntensityRegions.add(new SeismicIntensityRegion (
                Integer.parseInt(qzMessage.substring(168, 171), 2),
                Integer.parseInt(qzMessage.substring(171, 177), 2)));
        seismicIntensityRegions.add(new SeismicIntensityRegion (
                Integer.parseInt(qzMessage.substring(177, 180), 2),
                Integer.parseInt(qzMessage.substring(180, 186), 2)));
        seismicIntensityRegions.add(new SeismicIntensityRegion (
                Integer.parseInt(qzMessage.substring(186, 189), 2),
                Integer.parseInt(qzMessage.substring(189, 195), 2)));
        seismicIntensityRegions.add(new SeismicIntensityRegion (
                Integer.parseInt(qzMessage.substring(195, 198), 2),
                Integer.parseInt(qzMessage.substring(198, 204), 2)));
        seismicIntensityRegions.add(new SeismicIntensityRegion (
                Integer.parseInt(qzMessage.substring(204, 207), 2),
                Integer.parseInt(qzMessage.substring(207, 213), 2)));
        seismicIntensity.setRegions(seismicIntensityRegions);

        return seismicIntensity;
    }
    
    private LocalDateTime toOccurrenceTime(String message){
        int day = Integer.parseInt(message.substring(0, 4),2);
        int hour = Integer.parseInt(message.substring(4, 9),2);
        int minute  = Integer.parseInt(message.substring(9, 15),2);
        return LocalDateTime.of(LocalDateTime.now().getYear(),LocalDateTime.now().getMonth(),day,hour,minute);
    }
    
}
